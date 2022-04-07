package Client.Networking;

import java.io.IOException;
import java.net.Socket;

public class SocketClient
{
  public void start() throws IOException
  {
    Socket socket = new Socket("localhost", 1234);

    Handler handler = new Handler(socket, this);

    Thread thread = new Thread(handler);
    thread.setDaemon(true);
    thread.start();
  }
}
