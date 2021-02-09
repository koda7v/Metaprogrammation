package model.terme;

import java.util.function.BiFunction;

import model.expression.Expression;

public class Division extends Terme
{

  private static final char OP = '/';
  private static final BiFunction<Double, Double, Double> F = (i, j) -> i / j;

  public Division(Expression left, Expression right)
  {
    super(F, OP, left, right);
  }

}
