package Server.Networking;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPool
{
  private List<Handler> connections = new ArrayList<>();

  public void broadcastMessage(String message)
  {
    for (Handler handler :
                 connections)
    {
      handler.sentMessage(message);
    }
  }

  public void addHandler(Handler handler)
  {
    connections.add(handler);
  }
  public void removeHandler(Handler handler)
  {
    connections.remove(handler);
  }
}
