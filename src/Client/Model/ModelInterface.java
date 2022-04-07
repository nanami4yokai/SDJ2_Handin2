package Client.Model;

import Client.Networking.Client;

import java.beans.PropertyChangeListener;

public interface ModelInterface
{
  void setClient(Client client);
  void addListener(PropertyChangeListener listener);
}
