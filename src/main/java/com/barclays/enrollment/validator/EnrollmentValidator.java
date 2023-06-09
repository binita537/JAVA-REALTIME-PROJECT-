/*@CopyRight 2023 Citibank pvt ltd. All Rights are reserved. You shouldn't disclose
* the information outside, otherwise terms and conditions will apply.
*
*/
package com.barclays.enrollment.validator;

import org.springframework.stereotype.Component;

import com.barclays.enrollment.exception.EnrollmentRequestInvalidException;
import com.barclays.enrollment.model.EnrollmentRequest;

/**
 * @author Binita by May 19, 2023
 *
 */

@Component
public class EnrollmentValidator {

	/**
	 * @param enrollmentRequest
	 * @throws EnrollmentRequestInvalidException 
	 */
	public void validateRequest(EnrollmentRequest enrollmentRequest) throws EnrollmentRequestInvalidException {

		if(enrollmentRequest.getFirstname()==null || enrollmentRequest.getFirstname()==" "|| enrollmentRequest.getFirstname().length()<3)
		{
			throw new EnrollmentRequestInvalidException("ens001","firstname is invalid");
		}
		if(enrollmentRequest.getLastname()==null || enrollmentRequest.getLastname()==" "|| enrollmentRequest.getLastname().length()<3)
		{
			throw new EnrollmentRequestInvalidException("ens002","Last name is invalid");
		}
		if(enrollmentRequest.getEmailid()==null || enrollmentRequest.getEmailid()==" "|| enrollmentRequest.getEmailid().length()<3 || !enrollmentRequest.getEmailid().endsWith("@gmail.com"))
		{
			throw new EnrollmentRequestInvalidException("ens003","EmailId is invalid");
		}
		if(enrollmentRequest.getMobilename()==0)
		{
			throw new EnrollmentRequestInvalidException("ens004","mobile number invalid");
		}
		if(enrollmentRequest.getGender()==null || enrollmentRequest.getGender()==" "|| enrollmentRequest.getGender().length()<4)
		{
			throw new EnrollmentRequestInvalidException("ens005","Gender is invalid");
		}
		if(enrollmentRequest.getDob()==null || enrollmentRequest.getDob()==" "|| enrollmentRequest.getDob().length()<10)
		{
			throw new EnrollmentRequestInvalidException("ens006","DOB is invalid");
		}
		if(enrollmentRequest.getPincode()==0)
		{
			throw new EnrollmentRequestInvalidException("ens007","Pincode is invalid");
		}
	}
	
	

}
