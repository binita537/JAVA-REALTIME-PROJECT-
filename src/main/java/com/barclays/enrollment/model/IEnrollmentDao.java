/*@CopyRight 2023 Citibank pvt ltd. All Rights are reserved. You shouldn't disclose
* the information outside, otherwise terms and conditions will apply.
*
*/
package com.barclays.enrollment.model;

/**
 * @author Binita by May 19, 2023
 *
 */
public interface IEnrollmentDao {

	/**
	 * @param enrollmentDaoRequest
	 * @return
	 */
	EnrollmentDaoResponse enrollment(EnrollmentDaoRequest enrollmentDaoRequest);

}
