package Client.View.Chat;

import Client.Core.ViewHandler;
import Client.Core.ViewModelFactory;
import Client.View.ViewController;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import javax.swing.text.View;

public class ChatViewController implements ViewController
{
  @FXML Label username;
  @FXML TextArea messageArea;
  @FXML TextArea receivedArea;
  public void init(ViewHandler viewHandler, ViewModelFactory viewModelFactory)
  {
  }

  public void initPlus(ViewHandler viewHandler,ViewModelFactory viewModelFactory, String username)
  {
    this.username.setText(username);
  }

  public void onSendButton()
  {
    // NETWORKING BULLSHIT
  }

  public void update()
  {
    // UPDATE THE TextArea WITH INCOMMING MESSAGES
    // WE'LL CALL THIS METHOD EVERY TIME A LISTENER OR SOMETHING RECIEVES A NEW MESSAGE FROM THE SERVER
    // AND THEN WE ADD THE NEW MESSAGE TO THE TEXT AREA LIKE A LIST
  }
}
