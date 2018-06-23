package com.raj.pluralsight.calcengine;

/**
 * Created by Raj Rathore on 23-Jun-18
 */
public interface MathProcessing {

  String SEPARATOR = " ";

  String getKeyword();

  char getSymbol();

  double doCalculation(double leftVal, double rightVal);

}
