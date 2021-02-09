package model.terme;

import java.util.Map;
import java.util.function.BiFunction;

import model.expression.Expression;
import model.expression.Nombre;

public abstract class Terme extends Expression implements Cloneable
{
  protected Expression left;
  protected Expression right;
  protected char operateur;
  protected BiFunction<Double, Double, Double> functionOp;

  public Terme(BiFunction<Double, Double, Double> functionOp, char operateur, Expression left, Expression right)
  {
    this.left = left;
    this.right = right;
    this.operateur = operateur;
    this.functionOp = functionOp;
  }

  @Override
  public String toString()
  {
    return "(" + this.left + " " + this.operateur + " " + this.right + ")";
  }

  @Override
  public Expression eval(Map<Character, Expression> registre)
  {
    Expression rop1 = this.left.eval(registre);
    Expression rop2 = this.right.eval(registre);
    Expression res = null;
    if (rop1 instanceof Nombre && rop2 instanceof Nombre)
    {
      Nombre n1 = (Nombre) rop1;
      Nombre n2 = (Nombre) rop2;
      res = new Nombre(this.functionOp.apply(n1.valeur, n2.valeur));
    }
    else
    {
      try
      {
        Terme clone = (Terme) this.clone();
        clone.left = rop1;
        clone.right = rop2;
        res = clone;
      }
      catch (CloneNotSupportedException e)
      {
        e.printStackTrace();
      }
    }
    return res;
  }

}
