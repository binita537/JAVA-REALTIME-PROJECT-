/*@CopyRight 2023 Citibank pvt ltd. All Rights are reserved. You shouldn't disclose
* the information outside, otherwise terms and conditions will apply.
*
*/
package com.barclays.enrollment.serviceclient;

import com.barclays.enrollment.exception.BusinessException;
import com.barclays.enrollment.exception.SystemException;
import com.barclays.enrollment.model.EmiratesServiceRequest;
import com.barclays.enrollment.model.EmiratesServiceResponse;

/**
 * @author Binita by May 19, 2023
 *
 */
public interface EmiratesServiceClient {

	/**
	 * @param emiratesServiceRequest
	 * @return
	 * @throws BusinessException 
	 * @throws SystemException 
	 */
	EmiratesServiceResponse enrollment(EmiratesServiceRequest emiratesServiceRequest) throws BusinessException, SystemException;

}
