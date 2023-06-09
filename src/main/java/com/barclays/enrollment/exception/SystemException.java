/*@CopyRight 2023 Citibank pvt ltd. All Rights are reserved. You shouldn't disclose
* the information outside, otherwise terms and conditions will apply.
*
*/
package com.barclays.enrollment.exception;

/**
 * @author Binita by May 19, 2023
 *
 */
public class SystemException extends Exception {

	private String errorCode;
	private String errorMessage;

	/**
	 * @param errorCode
	 * @param errorMessage
	 */
	public SystemException(String errorCode, String errorMessage) {
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	/**
	 * @return the errorCode
	 */
	public String getErrorCode() {
		return errorCode;
	}

	/**
	 * @return the errorMessage
	 */
	public String getErrorMessage() {
		return errorMessage;
	}
}
