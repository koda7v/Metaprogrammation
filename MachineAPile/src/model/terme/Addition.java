package model.terme;

import java.util.function.BiFunction;

import model.expression.Expression;

public class Addition extends Terme
{

  private static final char OP = '+';
  private static final BiFunction<Double, Double, Double> F = (i, j) -> i + j;

  public Addition(Expression left, Expression right)
  {
    super(F, OP, left, right);
  }

}
