package Client.View;

import Client.Core.ViewHandler;
import Client.Core.ViewModelFactory;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public interface ViewController
{
  public void init(ViewHandler viewHandler, ViewModelFactory viewModelFactory);
}
