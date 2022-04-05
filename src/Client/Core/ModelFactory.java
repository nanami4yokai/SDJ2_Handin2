package Client.Core;

import Client.Model.ModelInterface;

public class ModelFactory
{
  private ModelInterface modelInterface;

  public ModelInterface getModelInterface()
  {
    if(modelInterface==null)
    {
      modelInterface = new ModelInterface(); // ADD STUFF
    }
    return modelInterface;
  }
}
