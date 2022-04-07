package TransferObjects;

import java.io.Serializable;

public class Message
{
  private String message, dateTimeSent, from;

  public Message(String message,String dateTimeSent, String from)
  {
    this.message = message;
    this.dateTimeSent = dateTimeSent;
    this.from = from;
  }

  public String getFrom()
  {
    return from;
  }

  public String getMessage()
  {
    return message;
  }
}
