package com.example.calculatorapi.models;

public class PostRequest {
	String operator;
	String firstValue;
	String secondValue;
	
	public String getOperator() {
		return operator;
	}
	public String getFirstValue() {
		return firstValue;
	}
	public String getSecondValue() {
		return secondValue;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}
	public void setFirstValue(String firstValue) {
		this.firstValue = firstValue;
	}
	public void setSecondValue(String secondValue) {
		this.secondValue = secondValue;
	}

}
