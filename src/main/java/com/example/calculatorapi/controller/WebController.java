package com.example.calculatorapi.controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.calculatorapi.models.PostRequest;
import com.example.calculatorapi.models.PostResponse;

@RestController
public class WebController {
	
	/**
	 * The Calculate Controller that takes in two operands and an operator, performs the calculation 
	 * and returns the response back to the client
	 * @param inputPayload
	 * @return The result of the arithmetic calculation result
	 */
	@RequestMapping(value = "/calculate", method = RequestMethod.POST)
	public PostResponse Calculator(@RequestBody PostRequest inputPayload) {
		PostResponse response = new PostResponse();
		long result;

		if(inputPayload.getOperator().equals("+")) {
			result = Integer.parseInt(inputPayload.getFirstValue()) + Integer.parseInt(inputPayload.getSecondValue());
			response.setId(200);
			response.setMessage(Long.toString(result));
		}
		else if(inputPayload.getOperator().equals("-")) {
			result = Integer.parseInt(inputPayload.getFirstValue()) - Integer.parseInt(inputPayload.getSecondValue());
			response.setId(200);
			response.setMessage(Long.toString(result));
		}
		else if(inputPayload.getOperator().equals("÷")) {
			result = Integer.parseInt(inputPayload.getFirstValue()) / Integer.parseInt(inputPayload.getSecondValue());
			response.setId(200);
			response.setMessage(Long.toString(result));
		}
		else if(inputPayload.getOperator().equals("x")) {
			result = Integer.parseInt(inputPayload.getFirstValue()) * Integer.parseInt(inputPayload.getSecondValue());
			response.setId(200);
			response.setMessage(Long.toString(result));
		}
		else {
			result = 0;
			response.setId(999);
			response.setMessage("Operator passsed in not valid");
		}
		return response;
	}
}