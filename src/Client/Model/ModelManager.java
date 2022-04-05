package Client.Model;

import java.util.ArrayList;

public class ModelManager implements ModelInterface
{
  private ArrayList<User> users;

  public ModelManager()
  {
    users = new ArrayList<>();
  }

  public ArrayList<User> getAllUsers()
  {
    return users;
  }

  public User getUser(String username)
  {
    for(int i=0;i<users.size();i++)
    {
      if(username.equals(users.get(i).getUsername())) return users.get(i);
    }
    return null;
  }

  public void addUser(User user)
  {
    users.add(user);
  }
}
