package model.instruction;

public class Push extends Instruction
{
  Object valeur;

  public Push(Character valeur)
  {
    this.valeur = valeur;
  }

  public Push(Double valeur)
  {
    this.valeur = valeur;
  }

  @Override
  public void run()
  {
    if (valeur instanceof Double)
    {
      this.machine.getPile().addFirst((Double) valeur);
    }
    else
    {
      this.machine.getPile().addFirst(machine.getRegistre().get(valeur));
    }

  }

  @Override
  public String toString()
  {
    StringBuilder res = new StringBuilder();
    res.append("PUSH ");
    if (valeur instanceof Double)
    {
      res.append(((Double) valeur).toString());
    }
    else
    {
      res.append(valeur);
    }
    return res.toString();
  }
}
