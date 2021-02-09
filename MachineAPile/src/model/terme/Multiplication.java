package model.terme;

import java.util.function.BiFunction;

import model.expression.Expression;

public class Multiplication extends Terme
{

  private static final char OP = 'x';
  private static final BiFunction<Double, Double, Double> F = (i, j) -> i * j;

  public Multiplication(Expression left, Expression right)
  {
    super(F, OP, left, right);
  }
}
