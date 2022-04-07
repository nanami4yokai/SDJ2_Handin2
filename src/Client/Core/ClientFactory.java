package Client.Core;

import Client.Networking.Client;
import Client.Networking.SocketClient;
import Client.View.Chat.ChatViewModel;

public class ClientFactory
{
  private static ClientFactory instance;
  private Client client;

  static{instance = new ClientFactory();}

  public static ClientFactory getInstance(){return instance;}

  private ClientFactory(){}

  public Client getClient(){
    if(client==null)client = new SocketClient(); // WILL FIX ON UPDATE
  }
}
