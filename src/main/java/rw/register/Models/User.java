package rw.register.Models;

public class User {
	private long id;
	private String firstName;
	private String lastName;
	private String mobilePhone;
	private String password;
	public User(){
	}
	public User(String mobilePhone){
		super();
		this.mobilePhone = mobilePhone;
	}
	public User(String firstName, String lastName, String mobilePhone, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobilePhone = mobilePhone;
		this.password = password;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMobilePhone() {
		return mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", mobilePhone=" + mobilePhone
				+ ", password=" + password + "]";
	}
}
