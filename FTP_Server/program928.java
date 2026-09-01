import java.io.*;
import java.net.*;

class program928
{
    public static int ClientCount = 0;

    public static void main (String A[])
    {   
        try
        {
            ServerSocket serversocket = new ServerSocket(9000);

            System.out.println("-----------------------------------");
            System.out.println("----Marvellous Server Started------");
            System.out.println("-----------------------------------");

            //Loop for multiple client requests
            while(true)
            {
                System.out.println("Server is waitng for client request");

                Socket clientsocket = serversocket.accept();
                
                System.out.println("Client connected successfully");

                //Thread gets created for client
                Thread t = new Thread(() -> HandleClientRequest(clientsocket)); //Arrow method

                t.start();

            }//End of while


        }
        catch(Exception e)
        {
            System.out.println("Exception occured : "+e);
        }
    }//End of main

    //Requets handler for each client requests
    public static void HandleClientRequest(Socket socket)
    {        
    
        ClientCount++;
        System.out.println("New thread gets created for client"+ClientCount);

        try
        {

            DataInputStream dis = new DataInputStream(socket.getInputStream());

            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

            dos.writeUTF("Connected to  Marvellous Server"); 

            while(true)
            {
                //Read command from client
                String command = dis.readUTF();
                System.out.println("Command received from client: "+command);

                String parts[] = command.split(" ");

                String operation = parts[0].toUpperCase();

                if(operation.equals("QUIT"))
                {
                     if(parts.length != 1)
                    {
                        dos.writeUTF("Usage: QUIT ");
                        continue;
                    }

                    dos.writeUTF("Disconnected from server");

                    ClientCount--;

                    break;
                }
                

                if(operation.equals("GET"))
                {
                    if(parts.length != 2)
                    {
                        dos.writeUTF("Usage: GET <FileName>");
                        continue;
                    }
                    
                }
                else if(operation.equals("PUT"))
                {
                    if(parts.length != 2)
                    {
                        dos.writeUTF("Usage: PUT <FileName>");
                        continue;
                    }
                }
                else if(operation.equals("INFO"))
                {
                    if(parts.length != 2)
                    {
                        dos.writeUTF("Usage: INFO <FileName>");
                        continue;
                    }
                    File file = new File(parts[1]);
                    if(file.exists())
                    {
                        String info = "";

                        info = info + "File Name: "+file.getName()+"\n";

                        info = info + "File size : "+file.length()+"\n";

                        info = info + "Readable : "+file.canRead()+"\n";

                        info = info + "Writable : "+file.canWrite()+"\n";

                        dos.writeUTF(info);
                    }
                    else
                    {
                        dos.writeUTF("File does not exist");
                    }
                }
                else if(operation.equals("SIZE"))
                {
                    if(parts.length != 2)
                    {
                        dos.writeUTF("Usage: SIZE <FileName>");
                        continue;
                    }

                    File file = new File(parts[1]);
                    if(file.exists() && file.isFile())
                    {
                        dos.writeUTF("File size is :"+file.length()+ " bytes");
                    }
                    else
                    {
                        dos.writeUTF("File does not exist");
                    }

                }
                else if(operation.equals("EXIST"))
                {
                    if(parts.length != 2)
                    {
                        dos.writeUTF("Usage: EXIST <FileName>");
                        continue;
                    }
                    File file = new File(parts[1]);
                    if(file.exists())
                    {
                        dos.writeUTF("File size is :"+file.length()+ " bytes");
                    }
                    else
                    {
                        dos.writeUTF("File does not exist");
                    }
                }
                else if(operation.equals("RENAME"))
                {
                    if(parts.length != 3)
                    {
                        dos.writeUTF("Usage: RENAME <OldFileName> <NewFileName>");
                        continue;
                    }

                }
                else if(operation.equals("DELETE"))
                {
                    if(parts.length != 2)
                    {
                        dos.writeUTF("Usage: DELETE <FileName>");
                        continue;
                    }

                }
                else if(operation.equals("LIST"))
                {
                    if(parts.length != 1)
                    {
                        dos.writeUTF("Usage: LIST ");
                        continue;
                    }
                    
                    File folder = new File(".");        //Created object of current dire

                    File files[] = folder.listFiles();

                    String result = "";

                    if(files != null)
                    {
                        for(File f: files)
                        {
                            if(f.isFile())
                            {
                                result = result + f.getName()+"\n";
                            }
                        }
                    }
                    
                    if(result.length() == 0)
                    {
                        result = "No files available";
                    }

                    dos.writeUTF(result);
                }
                else
                {
                    dos.writeUTF("Invalid Operation");
                }
            }//End of while

            socket.close();
            dis.close();
            dos.close();

            System.out.println("Client Disconnected");

        }//End of try
        catch(Exception e)
        {
            System.out.println("Exception occured : "+e);

        }

    }//End of HandleClientRequest() method


}//End of class