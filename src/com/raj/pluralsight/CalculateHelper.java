package com.raj.pluralsight;

/**
 * Created by Raj Rathore on 31-May-18
 */
public class CalculateHelper {

  private static final char ADD_SYMBOL = '+';
  private static final char SUB_SYMBOL = '-';
  private static final char MUL_SYMBOL = '*';
  private static final char DIV_SYMBOL = '/';

  private MathCommand mathCommand;
  private double leftValue;
  private double rightValue;
  private double result;


  void process(String statement) {
    String[] parts = statement.split(" ");
    String commandString = parts[0];
    leftValue = Double.parseDouble(parts[1]);
    rightValue = Double.parseDouble(parts[2]);
    setCommandFromString(commandString);

    CalculateBase calculateBase = new Multiplier();
    switch (mathCommand) {
      case Add:
        calculateBase = new Adder(leftValue, rightValue);
        break;
      case Subtract:
        calculateBase = new Subtractor(leftValue, rightValue);
        break;
      case Multiply:
        calculateBase = new Multiplier(leftValue, rightValue);
        break;
      case Divide:
        calculateBase = new Divider(leftValue, rightValue);
        break;
    }
    calculateBase.calculate();
    result = calculateBase.getResult();
  }

  private void setCommandFromString(String commandString) {
    if (commandString.equalsIgnoreCase(MathCommand.Add.toString())) {
      mathCommand = MathCommand.Add;
    } else if (commandString.equalsIgnoreCase(MathCommand.Subtract.toString())) {
      mathCommand = MathCommand.Subtract;
    } else if (commandString.equalsIgnoreCase(MathCommand.Multiply.toString())) {
      mathCommand = MathCommand.Multiply;
    } else if (commandString.equalsIgnoreCase(MathCommand.Divide.toString())) {
      mathCommand = MathCommand.Divide;
    }
  }

  @Override
  public String toString() {
    char symbol = ' ';
    switch (mathCommand) {
      case Add:
        symbol = ADD_SYMBOL;
        break;
      case Subtract:
        symbol = SUB_SYMBOL;
        break;
      case Multiply:
        symbol = MUL_SYMBOL;
        break;
      case Divide:
        symbol = DIV_SYMBOL;
        break;
    }
    return String.valueOf(leftValue) + " " + symbol + " " + rightValue + " = " + result;
  }
}