package Client.Networking;

import Client.Model.Message;
import Client.Model.ModelInterface;
import TransferObjects.Request;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class SocketClient implements Client
{
  private ModelInterface model;
  private Handler socketHandler;
  private PropertyChangeSupport support;

  public SocketClient(ModelInterface model)
  {
    this.model = model;
    model.setClient(this);

  }



  @Override public void startClient()
  {
    try{
      Socket socket = new Socket("localhost", 1236);
      socketHandler = new Handler(
          new ObjectOutputStream(socket.getOutputStream()),
          new ObjectInputStream(socket.getInputStream()), this);
      Thread th = new Thread(socketHandler);
      th.start();
    } catch (IOException e)
    {
      e.printStackTrace();
    }
  }

  public void listenToServer(ObjectOutputStream outToServer, ObjectInputStream inFromServer)
  {
    try
    {
      outToServer.writeObject(new Request("Listener", null));

      while (true)
      {
        Request request = (Request) inFromServer.readObject();
        support.firePropertyChange(request.getType(), null, request.getMessage());
      }
    }
    catch (IOException | ClassNotFoundException e)
    {
      e.printStackTrace();
    }
  }

  public void sendMessage()
  {
    try{
      Request
    } catch ()
    {

    }
  }

}
