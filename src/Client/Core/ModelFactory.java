package Client.Core;

import Client.Model.ModelInterface;
import Client.Model.ModelManager;

public class ModelFactory
{
  private ModelInterface modelInterface;

  public ModelInterface getModelInterface()
  {
    if(modelInterface==null)
    {
      modelInterface = new ModelManager();
    }
    return modelInterface;
  }
}
