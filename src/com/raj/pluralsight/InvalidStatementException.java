package com.raj.pluralsight;

/**
 * Created by Raj Rathore on 04-Jun-18
 */
class InvalidStatementException extends Exception {

  InvalidStatementException(String reason, String statement) {
    super(reason + " : " + statement);
  }

  InvalidStatementException(String reason, String statement, Throwable cause) {
    super(reason + " : " + statement, cause);
  }

}
