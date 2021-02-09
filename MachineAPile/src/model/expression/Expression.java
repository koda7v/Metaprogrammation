package model.expression;

import java.util.HashMap;
import java.util.Map;

public abstract class Expression
{
  public Expression eval()
  {
    return this.eval(new HashMap<>());
  }

  public Expression eval(Map<Character, Expression> registre)
  {
    return this;
  }
}
