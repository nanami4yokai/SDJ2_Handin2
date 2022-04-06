package Client.View.Chat;

import Client.Core.ModelFactory;
import Client.Model.Message;
import Client.Model.ModelInterface;

import java.util.GregorianCalendar;

public class ChatViewModel
{
  private ModelInterface modelInterface;
  private ChatViewController chatViewController;

  public ChatViewModel(ModelInterface modelInterface)
  {
    this.modelInterface=modelInterface;
  }

  public void sendMessage(String text, String user)
  {
    String dateTimeSent = GregorianCalendar.DATE+"/"+(GregorianCalendar.MONTH+1)+"/"+GregorianCalendar.YEAR+
        " "+GregorianCalendar.HOUR+":"+GregorianCalendar.MINUTE;

    Message message = new Message(text,dateTimeSent,user);
    // AND FROM HERE WE SEND IT TO THE SERVER... SOMEHOW

  }

  public void receiveMessage(Message message)
  {
    chatViewController.
  }
}
