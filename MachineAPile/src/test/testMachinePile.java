package test;

import org.junit.jupiter.api.Test;

import model.instruction.Add;
import model.instruction.Div;
import model.instruction.Push;
import model.machine.Machine;

public class testMachinePile
{
  @Test
  void test()
  {
    Machine m = new Machine();
    m.store('a', 1.5);
    m.input(new Push((double) 7));
    m.input(new Push((double) 2));
    m.input(new Div());
    m.input(new Push('a'));
    m.input(new Add());
    System.out.println(m);

    m.run();
    System.out.println(m);
  }
}
