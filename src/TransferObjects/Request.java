package TransferObjects;

import java.io.Serializable;

public class Request implements Serializable
{
  private String type;
  private Message message;

  public Request(String type, Message message)
  {
    this.type = type;
    this.message = message;
  }

  public Message getMessage()
  {
    return message;
  }

  public String getType()
  {
    return type;
  }
}
