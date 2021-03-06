package com.raj.pluralsight.calcengine;

/**
 * Created by Raj Rathore on 29-May-18
 */
public class Subtractor extends CalculateBase {

  public Subtractor() {
  }

  public Subtractor(double leftVal, double rightVal) {
    super(leftVal, rightVal);
  }

  @Override
  public void calculate() {
    setResult(getLeftVal() - getRightVal());
  }
}
