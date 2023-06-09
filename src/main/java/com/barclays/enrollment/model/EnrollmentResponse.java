/*@CopyRight 2023 Citibank pvt ltd. All Rights are reserved. You shouldn't disclose
* the information outside, otherwise terms and conditions will apply.
*
*/
package com.barclays.enrollment.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

/**
 * @author Binita by May 19, 2023
 *
 */
@Data
@JsonInclude(value=Include.NON_NULL)
public class EnrollmentResponse {
	
	private String responsecode;
	private String ffnumber;
	private String description;
	private String message; 
	
	
	/**
	 * @return the responsecode
	 */
	public String getResponsecode() {
		return responsecode;
	}
	/**
	 * @param responsecode the responsecode to set
	 */
	public void setResponsecode(String responsecode) {
		this.responsecode = responsecode;
	}
	/**
	 * @return the ffnumber
	 */
	public String getFfnumber() {
		return ffnumber;
	}
	/**
	 * @param ffnumber the ffnumber to set
	 */
	public void setFfnumber(String ffnumber) {
		this.ffnumber = ffnumber;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	

}
