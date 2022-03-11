package Final.VideoEx.Practice;

import Static.VideoEx.UsingStatic;

public class UsingFinal {

    private int sum;
    private final int Number;

  public UsingFinal (int x) {
      Number = x;

  }
  public void add() {
      sum += Number;
      //or
//      sum = sum + Number;
  }

  //needed to print out
  public String toString() {
      return String.format("Sum is: %s\n",sum);
  }

}
