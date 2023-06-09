/*@CopyRight 2023 Citibank pvt ltd. All Rights are reserved. You shouldn't disclose
* the information outside, otherwise terms and conditions will apply.
*
*/
package com.barclays.enrollment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.barclays.enrollment.exception.BusinessException;
import com.barclays.enrollment.exception.EnrollmentRequestInvalidException;
import com.barclays.enrollment.exception.SystemException;
import com.barclays.enrollment.model.EnrollmentRequest;
import com.barclays.enrollment.model.EnrollmentResponse;
import com.barclays.enrollment.service.EnrollmentService;
import com.barclays.enrollment.validator.EnrollmentValidator;

/**
 * @author Binita by May 19, 2023
 *
 */

@Component
@RequestMapping("/v1")
public class EnrollmentController {
	
	
	@Autowired
	private EnrollmentService enrollmentService;  //It holds EnrollmentServiceImpl (Added @componenet) object 
	
	@Autowired
	private EnrollmentValidator enrollmentValidator;
	
	@PostMapping("/enrollment")
	//@RequestBody  enrollmentRequest/json will convert java object
	//@ResponseBody enrollmentResponse/java object will convert in json
	
	
	@ResponseBody
	public EnrollmentResponse enrollment(@RequestBody EnrollmentRequest enrollmentRequest) throws EnrollmentRequestInvalidException, BusinessException, SystemException
	{
		
		// Validating the data from UI
		enrollmentValidator.validateRequest(enrollmentRequest);
		
		//we are prepraing the request for service layer 
		EnrollmentResponse enrollmentResponse=enrollmentService.enrollmenet(enrollmentRequest);
		
		
		
		
		
		return enrollmentResponse;
		
		
	}

}
