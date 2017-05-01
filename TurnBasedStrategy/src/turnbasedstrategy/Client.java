package turnbasedstrategy;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Client application to connect to the Skirym Servers
 * @author Nick Beliveau
 * @version 1.2 
 * 
 * 3/28/2017
 * 
 */
public class Client implements Runnable
{
    //Client Socket to connect to the server
    private static Socket clientSocket = null;
    
    //Input and output streams for the client
    private static ObjectOutputStream output;
    private static ObjectInputStream input;
    
    //Boolean variable to indicate if the socket is closed
    private static boolean closed = false;
    
    //Int to store the port number
    private static int portNumber = 2222;
        
    //String to hold the host name
    private static String host = "localhost";
    private static String username;
    private static String characterName;
    
    
    
    /**
     * Constructor for the Client class
     */
    public Client()
    {
        username="Paul";
        characterName="Archsassin";
        
    }
    public Client(String n, String c)
    {
        username=n;
        characterName=c;
        
    }
    
    public Action getAction()
    {
        Scanner scan = new Scanner(System.in);
        Action action = new Action("");
        
        System.out.print("Enter the action : ");
        action.setType(scan.nextLine());
        
        System.out.println("\nAction entered : " + action);
        
        return action;
    }
    
    public void sendAction(Action action)
    {
        try 
        {
            output.writeObject(action);
        } 
        catch (IOException ex) 
        {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void getFeedback()
    {
        try 
        {
            input.readObject();
        } 
        catch (IOException | ClassNotFoundException ex) 
        {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * 
     */
    public void communicate()
    {
        Player person = new Player(username, characterName);
        Action action = new Action("");
        
        try 
        {
            System.out.println("Person to write : \n" + person + "\n");
            output.writeObject(person);
            
            //Control for the loop in the communicate function
            boolean control = true;
            
            /**
            do
            {
                action = getAction();
                
                if(action.getType().equals("end"))
                {
                    control = false;
                }
                
                sendAction(action);
                
            }while(control == true);
            
            closeClient();
            */
            
        } 
        catch (IOException ex) 
        {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Close the client connection
     */
    public void closeClient()
    {
        
        try 
        {
            //Close the output, input and socket
            output.close();
            input.close();
            clientSocket.close();
        } 
        catch (IOException ex) 
        {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Function in instantiate the client thread
     */
    public void instantiateThread()
    {
        //If all variables have been instantiated, create a new thread for the client
        if(clientSocket != null && output != null && input != null)
        {
            //create the client side server
            new Thread(new Client(username,characterName)).start();
        }
    }
    
    /**
     * Function to instantiate the client socket, and the input and output streams
     */
    public void startConnection()
    {
        try
        {
            //Instantiate the socket, output and input streams
            clientSocket = new Socket(host, portNumber);
            output = new ObjectOutputStream(clientSocket.getOutputStream());
            input = new ObjectInputStream(clientSocket.getInputStream());
        }
        catch(IOException ex)
        {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    /**
     * Continue reading from the socket until receiving a signal to close
     */
    public void run() 
    {
        
        
        //Action to recieve from the server
        Action response;
        
        
        /**
        try 
        {          
            
            //While the response object is not null, continue running
            while(true)
            {
                //Output the response for troubleshooting
                System.out.println(response);
                
                //if the response is an end message, break the loop
                if(response.toString().equals("end")){
                    break;
                }
                if(response.toString().equals("Server has 2 players already"))
                    break;
            }
            
            
            closed = true;
        } 
        catch (IOException | ClassNotFoundException ex) 
        {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
    }
    
    public void connectToServer()
    {
        //Call the function to start the connection
        startConnection();
        
        instantiateThread();
        
        communicate();
    }
    
    public static void main(String[] args)
    {
        //Client client = new Client("Mr. Peanutbutter", "The Dog");
           
        
        
        //if (closed == true)
           // client.closeClient();
    }
}
