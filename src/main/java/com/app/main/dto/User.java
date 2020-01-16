package com.app.main.dto;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class User implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userId;

	    private String userName;
	    private String userEmail;
	    private long userPhoneNumber;
	    private String userAdddress;
	    private String userPassword;
	    private String userDob;
	    private String typeOfUser;
	    
	
	  @OneToOne(fetch=FetchType.EAGER,cascade=CascadeType.ALL,mappedBy = "userId")
	  private Order1 orderId;
	 
	    
		public User() {
			super();
		}
		public int getUserId() {
			return userId;
		}
		public void setUserId(int userId) {
			this.userId = userId;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getUserEmail() {
			return userEmail;
		}
		public void setUserEmail(String userEmail) {
			this.userEmail = userEmail;
		}
		public long getUserPhoneNumber() {
			return userPhoneNumber;
		}
		public void setUserPhoneNumber(long userPhoneNumber) {
			this.userPhoneNumber = userPhoneNumber;
		}
		public String getUserAdddress() {
			return userAdddress;
		}
		public void setUserAdddress(String userAdddress) {
			this.userAdddress = userAdddress;
		}
		public String getUserPassword() {
			return userPassword;
		}
		public void setUserPassword(String userPassword) {
			this.userPassword = userPassword;
		}
		public String getUserDob() {
			return userDob;
		}
		public void setUserDob(String userDob) {
			this.userDob = userDob;
		}
		public String getTypeOfUser() {
			return typeOfUser;
		}
		public void setTypeOfUser(String typeOfUser) {
			this.typeOfUser = typeOfUser;
		}
		@Override
		public String toString() {
			return "User [userId=" + userId + ", userName=" + userName + ", userEmail=" + userEmail
					+ ", userPhoneNumber=" + userPhoneNumber + ", userAdddress=" + userAdddress + ", userPassword="
					+ userPassword + ", userDob=" + userDob + ", typeOfUser=" + typeOfUser + "]";
		}
		
	
}
