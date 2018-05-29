package com.raj.pluralsight;

public class Main {

  public static void main(String[] args) {

    /*MathEquation mathEquation = new MathEquation();
    mathEquation.execute();
    System.out.println(mathEquation.getResult());*/

    MathEquation[] mathEquations = new MathEquation[4];
    mathEquations[0] = new MathEquation(100, 50, 'd');
    mathEquations[1] = new MathEquation(39, 18, 's');
    mathEquations[2] = new MathEquation(97, 35, 'a');
    mathEquations[3] = new MathEquation(11, 3, 'm');

    for (MathEquation mathEquation : mathEquations) {
      mathEquation.execute();
      System.out.println("Result = " + mathEquation.getResult());
    }

    double leftDouble = 99.0d;
    double rightDouble = 12.0d;
    int leftInt = 99;
    int rightInt = 12;

    MathEquation mathEquationOverload = new MathEquation('d');
    mathEquationOverload.execute(leftDouble, rightDouble);
    System.out.println(mathEquationOverload.getResult());

    MathEquation mathEquationOverload1 = new MathEquation('d');
    mathEquationOverload1.execute(leftInt, rightInt);
    System.out.println(mathEquationOverload1.getResult());

    MathEquation mathEquationOverload2 = new MathEquation('d');
    mathEquationOverload2.execute(leftDouble, rightInt);
    System.out.println(mathEquationOverload2.getResult());

  }
}
