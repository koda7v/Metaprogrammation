package test;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

import model.expression.Expression;
import model.expression.Nombre;
import model.expression.Variable;
import model.terme.Addition;
import model.terme.Division;

class testExpression
{

  @Test
  void test()
  {
    Expression e1 = new Division(new Nombre((double) 7), new Nombre((double) 2)); // (7 / 2)
    Expression e2 = new Addition(e1, new Variable('a')); // ((7 / 2) + a)
    System.out.println(e2);// affichage de "((7 / 2) + a)"

    Expression re1 = e1.eval(); // 3,5
    System.out.println(re1);
    Expression re2 = e2.eval(); // 3,5 + a
    System.out.println(re2);

    Map<Character, Expression> registre = new HashMap<>(); // registre d’éval.

    registre.put('a', new Nombre(1.5)); // a -> 1,5
    Expression re2bis = e2.eval(registre); // 5
    registre.put('a', new Variable('b')); // a -> b
    Expression re2ter = e2.eval(registre); // 3,5 + b

    System.out.println(re2bis);
    System.out.println(re2ter);

  }

}
