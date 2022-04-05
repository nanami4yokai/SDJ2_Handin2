package Client.View.Chat;

import Client.Core.ViewHandler;
import Client.Core.ViewModelFactory;
import Client.View.ViewController;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import javax.swing.text.View;

public class ChatViewController implements ViewController
{
  @FXML Label username;
  public void init(ViewHandler viewHandler, ViewModelFactory viewModelFactory)
  {
  }

  public void initPlus(ViewHandler viewHandler,ViewModelFactory viewModelFactory, String username)
  {
    this.username.setText(username);
  }


}
