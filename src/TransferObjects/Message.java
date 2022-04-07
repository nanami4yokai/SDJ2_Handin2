package TransferObjects;

public class Message
{
  private String text, dateTimeSent, from;

  public Message(String text,String dateTimeSent, String from)
  {
    this.text=text;
    this.dateTimeSent=dateTimeSent;
    this.from=from;
  }
}
