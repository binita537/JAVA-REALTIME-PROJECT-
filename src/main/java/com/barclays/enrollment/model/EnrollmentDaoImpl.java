/*@CopyRight 2023 Citibank pvt ltd. All Rights are reserved. You shouldn't disclose
* the information outside, otherwise terms and conditions will apply.
*
*/
package com.barclays.enrollment.model;

import org.springframework.stereotype.Component;

/**
 * @author Binita by May 19, 2023
 *
 */

@Component
public class EnrollmentDaoImpl implements IEnrollmentDao{

	@Override
	public EnrollmentDaoResponse enrollment(EnrollmentDaoRequest enrollmentDaoRequest) {
		
		EnrollmentDaoResponse enrollmentDaoResponse=new EnrollmentDaoResponse();
		
		
		enrollmentDaoResponse.setResponsecode("200");
		enrollmentDaoResponse.setFfnumber("1234567890");
		enrollmentDaoResponse.setDescription("Enrollment done successfully");
		enrollmentDaoResponse.setMessage("OK");
		return enrollmentDaoResponse;
	}

}
