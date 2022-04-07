package Client.Networking;

import java.io.IOException;

public class Client
{
  public static void main(String[] args) throws IOException
  {
    SocketClient socketClient = new SocketClient();
    socketClient.start();
  }
}
