package Client.Model;

import java.util.ArrayList;

public class User
{
  private String username;
  private ArrayList<Message> messages;

  public User(String username)
  {
    this.username=username;
    messages=new ArrayList<>();
  }

  public String getUsername()
  {
    return username;
  }

  public ArrayList<Message> getMessages()
  {
    return messages;
  }
  public String toString()
  {
    String rtrn=username+"\n\n";
    for(int i=0;i<messages.size();i++)
    {
      rtrn+=messages.get(i).getFrom().getUsername()+"\n";
      rtrn+=messages.get(i).getText()+"\n";
      rtrn+=messages.get(i).getDateTimeSent()+"\n\n";
    }
    return rtrn;
  }
}
