package springmvcsearch;

import org.springframework.format.annotation.DateTimeFormat;

public class Student {

	private String firstName;
	private String lastName;
	private String password;
	private String password1;
	private String gender;
	private Long phoneNumber;
	@DateTimeFormat(pattern="dd-mm-yyyy")
	private String date;
	private String height;
	private String weight;
	private String email;
	
	private Address address;
	
	
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword1() {
		return password1;
	}
	public void setPassword1(String password1) {
		this.password1 = password1;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhonNnumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", password=" + password + ", password1="
				+ password1 + ", gender=" + gender + ", phoneNumber=" + phoneNumber + ", date=" + date + ", height="
				+ height + ", weight=" + weight + ", email=" + email + "]";
	}
	
	
	
}
