package com.raj.pluralsight.calcengine;

/**
 * Created by Raj Rathore on 29-May-18
 */
public abstract class CalculateBase {

  private double leftVal;
  private double rightVal;
  private double result;

  CalculateBase() {
  }

  CalculateBase(double leftVal, double rightVal) {
    this.leftVal = leftVal;
    this.rightVal = rightVal;
  }

  public abstract void calculate();

  double getLeftVal() {
    return leftVal;
  }

  public void setLeftVal(double leftVal) {
    this.leftVal = leftVal;
  }

  double getRightVal() {
    return rightVal;
  }

  public void setRightVal(double rightVal) {
    this.rightVal = rightVal;
  }

  public double getResult() {
    return result;
  }

  void setResult(double result) {
    this.result = result;
  }

}
