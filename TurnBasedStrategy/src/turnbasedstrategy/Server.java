package turnbasedstrategy;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
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
    private ObjectOutputStream output;
    private Action response;
    private static ObjectInputStream input;
    private int clientnumber=0;
    
    //Declare thread variables
    private static final int maxClientCount = 2;
    private static final clientThread[] threads = new clientThread[maxClientCount];
    
    //Declare the port number
    private int portNumber = 2222;
    
    
    public Server()
    {
        System.out.println("Usage: java MultiThreadChatServerSync <portNumber>\n"
                + "Now using port number = " + portNumber);
        
        //Declare the server socket
        try
        {
            serverSocket = new ServerSocket(portNumber);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
        try {
            if (clientSocket!= null){
                input = new ObjectInputStream(clientSocket.getInputStream());}
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
        
//        while (true)
//        {
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
                    Action action = new Action("Server has 2 players already");
                    output = new ObjectOutputStream(clientSocket.getOutputStream());
                    output.writeObject(action);
                }                
            } 
            catch (IOException ex) 
            {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            }
//        }
        
    }

    /**
     * Inner class for threads in the server
     */
    class clientThread extends Thread
    {
        //Declare streams and socket
        private ObjectOutputStream output = null;
        private ObjectInputStream input = null;
        private Socket clientSocket = null;
        
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
                System.out.println("Action : " + action);
                    
                //Write the waiting action to the socket
                output.writeObject(action);
                Action action2 = new Action("Stab", "Physical", 9000);
                output.writeObject(action2);
//                Action action3 = new Action("end");
//                output.writeObject(action3); 
//                clientnumber--;
                try 
                {
                    //Read in the player from the client
                    player = (Player) input.readObject();
                    System.out.println(player.getName() + " the " + player.getPlayerClass() + " has connected");
                } 
                catch (ClassNotFoundException ex) 
                {
                    Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
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
