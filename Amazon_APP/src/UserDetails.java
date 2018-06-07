
public class UserDetails {
	
	private String userName;
	private String passWord;
	
	
	/**
	 * @param userName
	 * @param passWord
	 */
	public UserDetails(String userName, String passWord) {
		this.userName = userName;
		this.passWord = passWord;
	}
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the passWord
	 */
	public String getPassWord() {
		return passWord;
	}
	/**
	 * @param passWord the passWord to set
	 */
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	

}
