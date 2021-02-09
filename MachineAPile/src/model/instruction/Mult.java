package model.instruction;

public class Mult extends Instruction
{

  @Override
  public void run()
  {
    Double val2 = this.machine.getPile().poll();
    Double val1 = this.machine.getPile().poll();
    Double res = val1 * val2;
    machine.getPile().addFirst(res);

  }

  @Override
  public String toString()
  {
    return "MULT ";
  }

}
