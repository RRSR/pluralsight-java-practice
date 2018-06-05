package com.raj.pluralsight.calcengine;

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


  public void process(String statement) throws InvalidStatementException {
    String[] parts = statement.split(" ");
    if (parts.length != 3) {
      throw new InvalidStatementException("Incorrect number of fields", statement);
    }

    String commandString = parts[0];
    try {
      leftValue = Double.parseDouble(parts[1]);
      rightValue = Double.parseDouble(parts[2]);
    } catch (NumberFormatException e) {
      throw new InvalidStatementException("Non-numeric data", statement, e);
    }

    setCommandFromString(commandString);
    if (mathCommand == null) {
      throw new InvalidStatementException("Invalid command", statement);
    }

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