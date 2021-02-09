package model.instruction;

import model.machine.Machine;

public abstract class Instruction
{
  public Machine machine;

  public abstract void run();
}
