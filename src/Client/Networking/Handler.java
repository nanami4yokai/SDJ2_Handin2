package Client.Networking;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Handler implements Runnable
{
  private SocketClient socketClient;

  private ObjectOutputStream objectOutputStream;
  private ObjectInputStream objectInputStream;

  public Handler(ObjectOutputStream objectOutputStream,
      ObjectInputStream objectInputStream,
      SocketClient socketClient)
  {
    this.objectOutputStream = objectOutputStream;
    this.objectInputStream = objectInputStream;

    this.socketClient = socketClient;
  }

  @Override public void run()
  {

  }
}
