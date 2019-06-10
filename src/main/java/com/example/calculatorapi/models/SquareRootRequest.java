/**
 * Squareroot Request Class that maps the squareroot request from the client
 * @author Nihinlolamiwa Fajemilehin
 */

package com.example.calculatorapi.models;

public class SquareRootRequest {
	
	String squareRootOperand;
	
	/**
	 * Function that returns the squareroot operand
	 * @return The squareroot operand
	 */
	public String getOperand() {
		return squareRootOperand;
	}

	/**
	 * Function that sets the squareroot operand
	 * @param operator
	 */
	public void setOperator(String operator) {
		this.squareRootOperand = operator;
	}
}
