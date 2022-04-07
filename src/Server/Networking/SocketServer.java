package Server.Networking;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer
{
  public void start() throws IOException
  {
    ServerSocket serverSocket = new ServerSocket(1234);
    System.out.println("Server started.");

    ConnectionPool pool = new ConnectionPool();

    while (true)
    {
      Socket socket = serverSocket.accept();
      System.out.println("Connection established");

      Handler handler = new Handler(socket, pool);
      pool.addHandler(handler);
      new Thread(handler).start();
    }
  }
}
