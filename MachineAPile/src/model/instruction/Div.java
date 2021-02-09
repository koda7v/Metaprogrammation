package model.instruction;

public class Div extends Instruction
{

  @Override
  public void run()
  {
    Double val2 = machine.getPile().poll();
    Double val1 = machine.getPile().poll();
    Double res = val1 / val2;
    machine.getPile().addFirst(res);
  }

  @Override
  public String toString()
  {
    return "DIV ";
  }

}
