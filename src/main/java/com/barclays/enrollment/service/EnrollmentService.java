/*@CopyRight 2023 Citibank pvt ltd. All Rights are reserved. You shouldn't disclose
* the information outside, otherwise terms and conditions will apply.
*
*/
package com.barclays.enrollment.service;

import com.barclays.enrollment.exception.BusinessException;
import com.barclays.enrollment.exception.SystemException;
import com.barclays.enrollment.model.EnrollmentRequest;
import com.barclays.enrollment.model.EnrollmentResponse;

/**
 * @author Binita by May 19, 2023
 *
 */
public interface EnrollmentService {

	/**
	 * @param enrollmentRequest
	 * @return
	 * @throws BusinessException 
	 * @throws SystemException 
	 */
	EnrollmentResponse enrollmenet(EnrollmentRequest enrollmentRequest) throws BusinessException, SystemException;


}
