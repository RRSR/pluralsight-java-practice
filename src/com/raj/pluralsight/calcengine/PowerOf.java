package com.raj.pluralsight.calcengine;

/**
 * Created by Raj Rathore on 24-Jun-18
 */
public class PowerOf implements MathProcessing {

  @Override
  public String getKeyword() {
    return "power";
  }

  @Override
  public char getSymbol() {
    return '^';
  }

  @Override
  public double doCalculation(double leftVal, double rightVal) {
    return Math.pow(leftVal, rightVal);
  }
}
