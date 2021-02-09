package model.machine;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.instruction.Instruction;

public class Machine
{
  protected Deque<Double> pile;
  protected Map<Character, Double> registre;
  protected List<Instruction> instructions;

  public Machine()
  {
    this.pile = new ArrayDeque<>();
    this.registre = new HashMap<>();
    this.instructions = new ArrayList<>();
  }

  public void store(char variable, Double valeur)
  {
    this.registre.put(variable, valeur);
  }

  public void input(Instruction instruction)
  {
    this.instructions.add(instruction);
    instruction.machine = this;
  }

  public void run()
  {
    for (Instruction currentInstruction : instructions)
    {
      currentInstruction.run();
    }
    this.instructions = new ArrayList<>();

  }

  @Override
  public String toString()
  {
    return "PILE:" + pile + " REGISTRE:" + registre + " INSTRUCTION:" + instructions;
  }

  /**
   * Getter and Setter.
   */

  public Deque<Double> getPile()
  {
    return pile;
  }

  public void setPile(Deque<Double> pile)
  {
    this.pile = pile;
  }

  public Map<Character, Double> getRegistre()
  {
    return registre;
  }

  public void setRegistre(Map<Character, Double> registre)
  {
    this.registre = registre;
  }

}
