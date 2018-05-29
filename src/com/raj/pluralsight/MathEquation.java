package com.raj.pluralsight;

/**
 * Created by Raj Rathore on 26-May-18
 */
class MathEquation {

  private double leftVal;
  private double rightVal;
  private char opCode = 'a';
  private double result;

  public MathEquation() {
  }

  MathEquation(char opCode) {
    this.opCode = opCode;
  }

  MathEquation(double leftVal, double rightVal, char opCode) {
    this(opCode);
    this.leftVal = leftVal;
    this.rightVal = rightVal;
  }

  void setLeftVal(double leftVal) {
    this.leftVal = leftVal;
  }

  void setRightVal(double rightVal) {
    this.rightVal = rightVal;
  }

  void setOpCode(char opCode) {
    this.opCode = opCode;
  }

  double getResult() {
    return result;
  }

  void execute() {
    switch (opCode) {
      case 'a':
        result = leftVal + rightVal;
        break;
      case 's':
        result = leftVal - rightVal;
        break;
      case 'm':
        result = leftVal * rightVal;
        break;
      case 'd':
        result = rightVal != 0 ? leftVal / rightVal : 0.0d;
        break;
      default:
        System.out.println("Error - Invalid opCode!");
        break;
    }
  }

  void execute(double leftVal, double rightVal) {
    this.leftVal = leftVal;
    this.rightVal = rightVal;
    execute();
  }

  void execute(int leftVal, int rightVal) {
    this.leftVal = leftVal;
    this.rightVal = rightVal;
    execute();
    this.result = (int) this.result;
  }
}
