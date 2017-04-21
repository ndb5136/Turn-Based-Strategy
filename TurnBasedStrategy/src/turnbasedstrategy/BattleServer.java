package turnbasedstrategy;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ndb5136
 */
public class BattleServer
{
    
    //Declare the sockets
    private ServerSocket serverSocket = null;
    private Socket clientSocket;
    private ObjectOutputStream output;
    private ObjectInputStream input;
    
    private Action response;
    private boolean isFull;
    
    //Declare thread variables
    private static final int maxClientCount = 2;
    private static final clientThread[] threads = new clientThread[maxClientCount];
    
    
    //Declare the port number
    private int portNumber = 2222;
    
    public BattleServer()
    {
        this.connectSockets();
        
    }
    
    public void connectSockets()
    {
        System.out.println("Usage: java MultiThreadChatServerSync <portNumber>\n"
                + "Now using port number = " + portNumber);
        
        //Declare the server socket
        try
        {
            serverSocket = new ServerSocket(portNumber);
            
            //Declare the input and output stream
            if (clientSocket!= null)
            {
                input = new ObjectInputStream(clientSocket.getInputStream());
                output = new ObjectOutputStream(clientSocket.getOutputStream());
                
                //Connect to the client socket
                clientSocket = serverSocket.accept();
            }
            
            for(int i = 0; i < maxClientCount; i++)
            {
                if(threads[i] == null)
                {
                    
                }
            }
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
    
    class clientThread extends Thread
    {
        
    }
    
    public static void main(String args[])
    {
        BattleServer daServer = new BattleServer();
    }
    
    
}


