package model.expression;

public class Nombre extends Expression
{
  public final Double valeur;

  public Nombre(Double valeur)
  {
    this.valeur = valeur;
  }

  @Override
  public String toString()
  {
    return String.valueOf(this.valeur);
  }

}
