/*@CopyRight 2023 Citibank pvt ltd. All Rights are reserved. You shouldn't disclose
* the information outside, otherwise terms and conditions will apply.
*
*/
package com.barclays.enrollment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.barclays.enrollment.builder.EnrollmentRequestBuilder;
import com.barclays.enrollment.builder.EnrollmentResponseBuilder;
import com.barclays.enrollment.exception.BusinessException;
import com.barclays.enrollment.exception.SystemException;
import com.barclays.enrollment.model.Address;
import com.barclays.enrollment.model.EmiratesServiceRequest;
import com.barclays.enrollment.model.EmiratesServiceResponse;
import com.barclays.enrollment.model.EnrollmentDaoRequest;
import com.barclays.enrollment.model.EnrollmentDaoResponse;
import com.barclays.enrollment.model.EnrollmentRequest;
import com.barclays.enrollment.model.EnrollmentResponse;
import com.barclays.enrollment.model.IEnrollmentDao;
import com.barclays.enrollment.serviceclient.EmiratesServiceClient;

/**
 * @author Binita by May 19, 2023
 *
 */
//This is service layer and from here we need to call backend //service client // different call integration layer

@Component
public class EnrollmentServiceImpl implements EnrollmentService {

	@Autowired
	private EmiratesServiceClient emiratesServiceClient;

	@Autowired
	private IEnrollmentDao enrollmentDao;

	@Autowired
	private EnrollmentRequestBuilder enrollmentRequestBuilder;

	@Autowired
	private EnrollmentResponseBuilder enrollmentResponseBuilder;

	@Override
	public EnrollmentResponse enrollmenet(EnrollmentRequest enrollmentRequest)
			throws BusinessException, SystemException {

		EmiratesServiceRequest emiratesServiceRequest = enrollmentRequestBuilder
				.buildEmiratesServiceRequest(enrollmentRequest);

		EmiratesServiceResponse emiratesServiceResponse = emiratesServiceClient.enrollment(emiratesServiceRequest);

		EnrollmentDaoResponse enrollmentDaoResponse = null;

		// based on the response ,information will store in Database
		if (emiratesServiceResponse != null) {
			EnrollmentDaoRequest enrollmentDaoRequest = enrollmentRequestBuilder
					.buildEnrollmentDaoRequest(enrollmentRequest, emiratesServiceResponse);

			// We will set the repspoinse in DATABASE
			enrollmentDaoResponse = enrollmentDao.enrollment(enrollmentDaoRequest);

		}
		EnrollmentResponse enrollmentResponse = EnrollmentResponseBuilder
				.buildEnrollmentResponse(enrollmentDaoResponse);

		return enrollmentResponse;
	}

}
