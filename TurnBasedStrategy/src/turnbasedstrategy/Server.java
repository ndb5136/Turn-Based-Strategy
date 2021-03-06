package turnbasedstrategy;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * Server application to run the Skirym 411 game
 * @author Nick Beliveau
 * @version 1.2 
 * 
 * 3/28/2017
 */
public class Server 
{
    //Declare the sockets
    private ServerSocket serverSocket = null;
    private Socket clientSocket;
    private ObjectOutputStream serverOutput;
    private Action response;
    private static ObjectInputStream serverInput;
    private int clientnumber=0;
    private ArrayList<jpBattleground> battles;
    private static int totalInGames;
    private static int nextGameOpen;
    
    //Declare thread variables
    private static final int maxClientCount = 100;
    private static final clientThread[] threads = new clientThread[maxClientCount];
    
    //Declare the port number
    private int portNumber = 2222;
    
    
    public void instantiateSockets()
    {
        //Declare the server socket
        try
        {
            serverSocket = new ServerSocket(portNumber);
            
            if (clientSocket!= null)
            {
                serverInput = new ObjectInputStream(clientSocket.getInputStream());
                serverOutput = new ObjectOutputStream(clientSocket.getOutputStream());
            }
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
    
    public void stayConnected()
    {
        while (true)
        {
            try 
            {
                //Connect to the client socket
                clientSocket = serverSocket.accept();
                //Get the threads
                int i;
                for(i = clientnumber; i < maxClientCount; i++)
                {
                    threads[i] = null;
                    if(threads[i] == null)
                    {
                        (threads[i] = new clientThread(clientSocket, threads)).start();
                        clientnumber++;
                        System.out.println("client " +clientnumber);
                        break;
                    }
                }
                //if the room has 2 players, let the client know the room is full
                if(i >= maxClientCount)
                {
                    Action action = new Action("Server is currently full");
                    
                    serverOutput.writeObject(action);
                }                
            } 
            catch (IOException ex) 
            {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public Server()
    {
        System.out.println("Usage: java MultiThreadChatServerSync <portNumber>\n"
                + "Now using port number = " + portNumber);
        
        //Instantiate the battle rooms
        battles = new ArrayList<jpBattleground>();
        
        instantiateSockets();
        
        stayConnected();
        
        
        
        
    }

    /**
     * Inner class for threads in the server
     */
    class clientThread extends Thread
    {
        //Declare streams and socket
        protected ObjectOutputStream output = null;
        protected ObjectInputStream input = null;
        protected ObjectOutputStream inGameOutput = null;
        protected ObjectInputStream inGameInput = null;
        protected Socket clientSocket = null;
        protected Player player;
        
        private clientThread[] threads;
        private int maxClientsCount;

        
        
        /**
         * Constructor for the clientThread class
         * @param clientSocket  socket that the client is using
         * @param threads       array of the threads
         */
        public clientThread(Socket clientSocket, clientThread[] threads)
        {
            this.clientSocket = clientSocket;
            this.threads = threads;
            maxClientsCount = threads.length;
        }
                
        
        public void findGame()
        {            
            if(totalInGames % 2 == 0)
            {
                battles.add(new jpBattleground(this));
                totalInGames++;
            }
            else
            {
                battles.get(nextGameOpen).getPlayerTwo(this);
                totalInGames++;
                nextGameOpen++;
            }
            
        }
        
        public Player passPlayer()
        {
            return player;
        }
        
        public Player getPlayer()
        {
            try
            {
                player = (Player) input.readObject();
                return player;
            } 
            catch (ClassNotFoundException | IOException ex) 
            {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            return new Player("ERROR IN GET PLAYER","ERROR");
        }
        
        public void stayConnected()
        {
            Action action;
            
                boolean control = true;
                do
                {
                    System.out.println("Waiting for an action");
                    try 
                    {
                        action = (Action) input.readObject();
                        
                        System.out.println("Action recieved by the server :\n" + action);
                        
                        if (action.getType().equals("end"))
                            control = false;
                        
                        if(action.getType().equals("Find Game"))
                            findGame();
                        
                        System.out.println("\ntotalInGames : " + totalInGames + "\nnextGameOpen : " + nextGameOpen + " \n");
                        
                    } 
                    catch (ClassNotFoundException | IOException ex) 
                    {
                        //Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                        System.err.println("Client Disconnected");
                        break;
                    }
                }while(control);
        }

        public void run()
        {
            try 
            {
                //Instantiate the input and output variables to the client's input and output streams
                input = new ObjectInputStream(clientSocket.getInputStream());
                output = new ObjectOutputStream(clientSocket.getOutputStream());
                output.flush();
                Action action = new Action("Waiting for Player");
                
                Player player;
                
                
                //Sout for troubleshooting
                //System.out.println("Action : " + action);
                
                player = getPlayer();
                
                System.out.println("\nPlayer Connected : " + player + "\n");
                
                stayConnected();
              
                
                
            } 
            catch (IOException ex) 
            {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
    
    public static void main(String[] args)
    {
        Server daServer = new Server();
    }
}
