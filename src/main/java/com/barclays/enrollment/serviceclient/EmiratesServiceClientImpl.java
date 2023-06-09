/*@CopyRight 2023 Citibank pvt ltd. All Rights are reserved. You shouldn't disclose
* the information outside, otherwise terms and conditions will apply.
*
*/
package com.barclays.enrollment.serviceclient;

import org.springframework.stereotype.Component;

import com.barclays.enrollment.exception.BusinessException;
import com.barclays.enrollment.exception.SystemException;
import com.barclays.enrollment.model.EmiratesServiceRequest;
import com.barclays.enrollment.model.EmiratesServiceResponse;

/**
 * @author Binita by May 19, 2023
 *
 */

@Component
public class EmiratesServiceClientImpl implements EmiratesServiceClient {

	EmiratesServiceResponse emiratesServiceResponse;

	@Override
	public EmiratesServiceResponse enrollment(EmiratesServiceRequest emiratesServiceRequest) throws BusinessException, SystemException {

		String responseCode = "000";
		String responseMessgae = "Emr server is down";
		emiratesServiceResponse = new EmiratesServiceResponse();

		if ("0".equals(emiratesServiceResponse.getResponsecode())) {

			emiratesServiceResponse.setResponsecode(responseCode);
			emiratesServiceResponse.setFfnumber("1234567890");
			emiratesServiceResponse.setDescription("Enrollment done successfully");
			emiratesServiceResponse.setMessage(responseMessgae);

		}else if("emr001".equals(responseCode) || "emr002".equals(responseCode) || "emr003".equals(responseCode) || "emr004".equals(responseCode)
			|| "emr004".equals(responseCode) || "emr005".equals(responseCode) || "emr006".equals(responseCode)	)	
			{
			
			//If your request not properlt build or invalid data BusinessException
			throw new BusinessException(responseCode, responseMessgae);
			
		}else if("emr111".equals(responseCode) || "emr333".equals(responseCode) || "emr222".equals(responseCode))
		{
			//If server exception or environmenet /timeout exception/enrollmenet exception then System exception 
			
			throw new SystemException(responseCode, responseMessgae);
		}else
		{
			throw new SystemException("999", "UNKNOWN ERROR");
		}

		return emiratesServiceResponse;
	}

}
