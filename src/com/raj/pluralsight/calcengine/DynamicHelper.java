package com.raj.pluralsight.calcengine;

/**
 * Created by Raj Rathore on 23-Jun-18
 */
public class DynamicHelper {

  private MathProcessing[] handlers;

  public DynamicHelper(MathProcessing[] handlers) {
    this.handlers = handlers;
  }

  public String process(String statement) {

    String[] parts = statement.split(MathProcessing.SEPARATOR);
    String keyword = parts[0];

    MathProcessing theHandler = new Adder();

    for (MathProcessing handler : handlers) {
      if (keyword.equalsIgnoreCase(handler.getKeyword())) {
        theHandler = handler;
        break;
      }
    }

    double leftVal = Double.parseDouble(parts[1]);
    double rightVal = Double.parseDouble(parts[2]);

    double result = theHandler.doCalculation(leftVal, rightVal);

    return String.valueOf(leftVal) + " " + theHandler.getSymbol() + " " + rightVal + " = " + result;
  }
}
