package com.raj.pluralsight;

/**
 * Created by Raj Rathore on 29-May-18
 */
public class Divider extends CalculateBase {

  public Divider() {
  }

  Divider(double leftVal, double rightVal) {
    super(leftVal, rightVal);
  }

  @Override
  public void calculate() {
    setResult(getRightVal() != 0 ? getLeftVal() / getRightVal() : 0);
  }
}
