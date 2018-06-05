package com.raj.pluralsight.calcengine;

/**
 * Created by Raj Rathore on 04-Jun-18
 */
public class InvalidStatementException extends Exception {

  public InvalidStatementException(String reason, String statement) {
    super(reason + " : " + statement);
  }

  public InvalidStatementException(String reason, String statement, Throwable cause) {
    super(reason + " : " + statement, cause);
  }

}
