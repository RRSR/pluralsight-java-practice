package com.raj.pluralsight.calcengine;

/**
 * Created by Raj Rathore on 29-May-18
 */
public class Adder extends CalculateBase implements MathProcessing {

  public Adder() {
  }

  public Adder(double leftVal, double rightVal) {
    super(leftVal, rightVal);
  }

  @Override
  public void calculate() {
    setResult(getLeftVal() + getRightVal());
  }

  @Override
  public String getKeyword() {
    return "add";
  }

  @Override
  public char getSymbol() {
    return '+';
  }

  @Override
  public double doCalculation(double leftVal, double rightVal) {
    setLeftVal(leftVal);
    setRightVal(rightVal);
    calculate();
    return getResult();
  }
}
