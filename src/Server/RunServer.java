package Server;

import Server.Networking.SocketServer;

import java.io.IOException;

public class RunServer
{
  public static void main(String[] args) throws IOException
  {
    SocketServer server = new SocketServer();
    server.start();
  }
}
