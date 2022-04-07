package Client.Networking;

import Util.Subject;

import java.io.IOException;

public interface Client extends Subject
{
  void startClient();
  void requestMessage();
  void sendMessage();
}
