package Server.Networking;

import java.net.Socket;

public class Handler implements Runnable
{
  private Socket socket;
  private ConnectionPool pool;

  public Handler(Socket socket, ConnectionPool pool)
  {
    this.socket = socket;
    this.pool = pool;
  }

  @Override public void run()
  {

  }

  public void sentMessage(String message)
  {

  }
}
