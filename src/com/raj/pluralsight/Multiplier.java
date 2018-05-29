package com.raj.pluralsight;

/**
 * Created by Raj Rathore on 29-May-18
 */
public class Multiplier extends CalculateBase {

  public Multiplier() {
  }

  Multiplier(double leftVal, double rightVal) {
    super(leftVal, rightVal);
  }

  @Override
  public void calculate() {
    setResult(getLeftVal() * getRightVal());
  }
}
