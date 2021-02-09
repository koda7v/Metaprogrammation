package model.expression;

import java.util.Map;

public class Variable extends Expression
{
  public final char valeur;

  public Variable(char valeur)
  {
    this.valeur = valeur;
  }

  @Override
  public String toString()
  {
    return String.valueOf(this.valeur);
  }

  @Override
  public Expression eval(Map<Character, Expression> registre)
  {
    Expression res = registre.get(this.valeur);
    return (res == null) ? this : res;

  }

}
