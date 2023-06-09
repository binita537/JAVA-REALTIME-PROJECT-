/*@CopyRight 2023 Citibank pvt ltd. All Rights are reserved. You shouldn't disclose
* the information outside, otherwise terms and conditions will apply.
*
*/
package com.barclays.enrollment.builder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.barclays.enrollment.model.Address;
import com.barclays.enrollment.model.EmiratesServiceRequest;
import com.barclays.enrollment.model.EmiratesServiceResponse;
import com.barclays.enrollment.model.EnrollmentDaoRequest;
import com.barclays.enrollment.model.EnrollmentDaoResponse;
import com.barclays.enrollment.model.EnrollmentRequest;

/**
 * @author Binita by May 19, 2023
 *
 */

@Component
public class EnrollmentRequestBuilder {

	/**
	 * @param emiratesServiceRequest
	 * @return
	 */

	@Autowired
	EnrollmentRequest enrollmentRequest;

	public EmiratesServiceRequest buildEmiratesServiceRequest(EnrollmentRequest enrollmentRequest) {

		EmiratesServiceRequest emiratesServiceRequest = new EmiratesServiceRequest();
		Address address = buildAddress(enrollmentRequest);

		emiratesServiceRequest.setFirstname(enrollmentRequest.getFirstname());
		emiratesServiceRequest.setMiddlename(enrollmentRequest.getMiddlename());
		emiratesServiceRequest.setLastname(enrollmentRequest.getLastname());
		emiratesServiceRequest.setTitle(enrollmentRequest.getTitle());
		emiratesServiceRequest.setGender(enrollmentRequest.getGender());
		emiratesServiceRequest.setDob(enrollmentRequest.getDob());
		emiratesServiceRequest.setAddress(address);
		emiratesServiceRequest.setState(enrollmentRequest.getState());
		emiratesServiceRequest.setCity(enrollmentRequest.getCity());
		emiratesServiceRequest.setPincode(enrollmentRequest.getPincode());
		emiratesServiceRequest.setCountry(enrollmentRequest.getCountry());
		emiratesServiceRequest.setMobilename(enrollmentRequest.getMobilename());

		return emiratesServiceRequest;
	}

	/**
	 * @param emiratesServiceResponse
	 * @return
	 */
	public EnrollmentDaoRequest buildEnrollmentDaoRequest(EnrollmentRequest enrollmentRequest,
			EmiratesServiceResponse emiratesServiceResponse) {

		EnrollmentDaoRequest enrollmentDaoRequest=new EnrollmentDaoRequest();
		Address address = buildAddress(enrollmentRequest);

		enrollmentDaoRequest.setFirstname(enrollmentRequest.getFirstname());
		enrollmentDaoRequest.setMiddlename(enrollmentRequest.getMiddlename());
		enrollmentDaoRequest.setLastname(enrollmentRequest.getLastname());
		enrollmentDaoRequest.setTitle(enrollmentRequest.getTitle());
		enrollmentDaoRequest.setGender(enrollmentRequest.getGender());
		enrollmentDaoRequest.setDob(enrollmentRequest.getDob());
		enrollmentDaoRequest.setAddress(address);
		enrollmentDaoRequest.setState(enrollmentRequest.getState());
		enrollmentDaoRequest.setCity(enrollmentRequest.getCity());
		enrollmentDaoRequest.setPincode(enrollmentRequest.getPincode());
		enrollmentDaoRequest.setCountry(enrollmentRequest.getCountry());
		enrollmentDaoRequest.setMobilename(enrollmentRequest.getMobilename());

		enrollmentDaoRequest.setFfnumber(emiratesServiceResponse.getFfnumber());
		return enrollmentDaoRequest;
	}

	/**
	 * @param enrollmentRequest
	 * @return
	 */
	private Address buildAddress(EnrollmentRequest enrollmentRequest) {
		Address address = new Address();
		address.setCurrentaddress(enrollmentRequest.getAddress().getCurrentaddress());
		address.setHomeaddress(enrollmentRequest.getAddress().getHomeaddress());
		return address;
	}

}
