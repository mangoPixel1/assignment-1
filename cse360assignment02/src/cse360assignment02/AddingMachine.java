package cse360assignment02;

public class AddingMachine {
  private int total;
  private String history = "";
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
  }
  
  /**
   * @return total as an Integer
   */
  public int getTotal () {
    return total;
  }
  
  /**
   * @param value to add to the total
   */
  public void add (int value) {
	  total = total + value;
	  history = history + " + " + Integer.toString(value);
  }

  /** 
   * @param value to subtract from the total
   */
  public void subtract (int value) {
	  total = total - value;
	  history = history + " - " + Integer.toString(value);
  }
  
  /**
   * return history of transactions in a String
   */
  public String toString () {
	  return "0" + history;
  }

  public void clear() {
	  total = 0;
	  history = "";
  }
}
