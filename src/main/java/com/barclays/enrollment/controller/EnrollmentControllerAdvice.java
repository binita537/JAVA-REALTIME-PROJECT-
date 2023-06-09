/*@CopyRight 2023 Citibank pvt ltd. All Rights are reserved. You shouldn't disclose
* the information outside, otherwise terms and conditions will apply.
*
*/
package com.barclays.enrollment.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.barclays.enrollment.exception.BusinessException;
import com.barclays.enrollment.exception.EnrollmentRequestInvalidException;
import com.barclays.enrollment.exception.SystemException;
import com.barclays.enrollment.model.EnrollmentResponse;

import lombok.Value;

/**
 * @author Binita by May 19, 2023
 *
 */

//Global exception haldling // whatever exception you are trying to throw it will come here 

@ControllerAdvice
public class EnrollmentControllerAdvice {

	@ExceptionHandler(value = EnrollmentRequestInvalidException.class)
	@ResponseBody

	// Response entity contains the response body +response code (status
	// information)
	public ResponseEntity<EnrollmentResponse> handleInvalidRequestException(
			EnrollmentRequestInvalidException enrollmentRequestInvalidException) {
		EnrollmentResponse enrollmentResponse = new EnrollmentResponse();

		enrollmentResponse.setResponsecode(enrollmentRequestInvalidException.getErrorCode());
		enrollmentResponse.setMessage(enrollmentRequestInvalidException.getErrorMessage());
		return new ResponseEntity<>(enrollmentResponse, HttpStatus.BAD_REQUEST);

	}

	@ExceptionHandler(value = BusinessException.class)
	@ResponseBody
	public ResponseEntity<EnrollmentResponse> handleBusinessException(BusinessException businessException) {
		EnrollmentResponse enrollmentResponse = new EnrollmentResponse();
		enrollmentResponse.setResponsecode(businessException.getErrorCode());
		enrollmentResponse.setMessage(businessException.getErrorMessage());
		return new ResponseEntity<>(enrollmentResponse, HttpStatus.BAD_REQUEST);

	}
	
	@ExceptionHandler(value = SystemException.class)
	@ResponseBody
	public ResponseEntity<EnrollmentResponse> handleSystemException(SystemException systemException ) {
		EnrollmentResponse enrollmentResponse = new EnrollmentResponse();
		enrollmentResponse.setResponsecode(systemException.getErrorCode());
		enrollmentResponse.setMessage(systemException.getErrorMessage());
		return new ResponseEntity<>(enrollmentResponse, HttpStatus.BAD_REQUEST);

	}

}
