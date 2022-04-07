package Client.Networking;

import java.net.Socket;

public class Handler implements Runnable
{
  private SocketClient client;
  private Socket socket;

  public Handler(Socket socket, SocketClient client)
  {
    this.client = client;
    this.socket = socket;
  }

  @Override public void run()
  {

  }
}
