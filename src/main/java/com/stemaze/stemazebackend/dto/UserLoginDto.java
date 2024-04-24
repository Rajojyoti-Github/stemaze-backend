package com.stemaze.stemazebackend.dto;

public class UserLoginDto {
	
	private String emailAddress;
	
	private String password;
	
	private String loginMessage;

	/**
	 * @return the emailAddress
	 */
	public String getEmailAddress() {
		return emailAddress;
	}

	/**
	 * @param emailAddress the emailAddress to set
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * @return the loginMessage
	 */
	public String getLoginMessage() {
		return loginMessage;
	}

	/**
	 * @param loginMessage the loginMessage to set
	 */
	public void setLoginMessage(String loginMessage) {
		this.loginMessage = loginMessage;
	}

	/**
	 * @param emailAddress
	 * @param password
	 */
	public UserLoginDto(String emailAddress, String password, String loginMessage) {
		super();
		this.emailAddress = emailAddress;
		this.password = password;
		this.loginMessage = loginMessage;
	}

	/**
	 * 
	 */
	public UserLoginDto() {
		super();
	}

	@Override
	public String toString() {
		return "UserLoginDto [emailAddress=" + emailAddress + ", password=" + password + ", loginMessage="
				+ loginMessage + "]";
	}

	
	

}
