package Client.Model;

public class Message
{
  private String text, dateTimeSent;
  private User from;

  public Message(String text, String dateTimeSent, User from)
  {
    this.text=text;
    this.dateTimeSent=dateTimeSent;
    this.from=from;
  }

  public String getText()
  {
    return text;
  }

  public String getDateTimeSent()
  {
    return dateTimeSent;
  }

  public User getFrom()
  {
    return from;
  }
}
