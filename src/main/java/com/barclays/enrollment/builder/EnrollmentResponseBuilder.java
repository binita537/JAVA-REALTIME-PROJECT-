/*@CopyRight 2023 Citibank pvt ltd. All Rights are reserved. You shouldn't disclose
* the information outside, otherwise terms and conditions will apply.
*
*/
package com.barclays.enrollment.builder;

import org.springframework.stereotype.Component;

import com.barclays.enrollment.model.EnrollmentDaoResponse;
import com.barclays.enrollment.model.EnrollmentResponse;

/**
 * @author Binita by May 19, 2023
 *
 */

@Component
public class EnrollmentResponseBuilder {

	/**
	 * @param enrollmentDaoResponse
	 * @return
	 */
	public static EnrollmentResponse buildEnrollmentResponse(EnrollmentDaoResponse enrollmentDaoResponse) {
		 EnrollmentResponse enrollmentResponse = new EnrollmentResponse();
			enrollmentResponse.setResponsecode(enrollmentDaoResponse.getResponsecode());
			enrollmentResponse.setFfnumber(enrollmentDaoResponse.getFfnumber());
			enrollmentResponse.setMessage(enrollmentDaoResponse.getMessage());
			enrollmentResponse.setDescription(enrollmentDaoResponse.getDescription());

		return enrollmentResponse;
	}
	
	
	
	

}
