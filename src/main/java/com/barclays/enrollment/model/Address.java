/*@CopyRight 2023 Citibank pvt ltd. All Rights are reserved. You shouldn't disclose
* the information outside, otherwise terms and conditions will apply.
*
*/
package com.barclays.enrollment.model;

import lombok.Data;

/**
 * @author Binita by May 26, 2023
 *
 */
@Data
public class Address {
	
	private String homeaddress;
	private String currentaddress; 
	/**
	 * @return the homeaddress
	 */
	public String getHomeaddress() {
		return homeaddress;
	}
	/**
	 * @param homeaddress the homeaddress to set
	 */
	public void setHomeaddress(String homeaddress) {
		this.homeaddress = homeaddress;
	}
	/**
	 * @return the currentaddress
	 */
	public String getCurrentaddress() {
		return currentaddress;
	}
	/**
	 * @param currentaddress the currentaddress to set
	 */
	public void setCurrentaddress(String currentaddress) {
		this.currentaddress = currentaddress;
	}


}
