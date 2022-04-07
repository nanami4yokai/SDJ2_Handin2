package Client.Model;

import Client.Networking.Client;

import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

public class ModelManager implements ModelInterface
{
  private List<String> usernames = new ArrayList<>();
  private Client client;

  public ModelManager(Client client)
  {
     this.client = client;

  }

  @Override public void setClient(Client client)
  {
    this.client = client;
  }

  @Override public void addListener(PropertyChangeListener listener)
  {

  }
}
