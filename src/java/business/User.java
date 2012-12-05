package business;
import java.io.Serializable;

public class User implements Serializable{
	private String imagePath;
	private String firstName;
	private String lastName;
	private String expertise;
	private String emailAddress;
	private String schedule;

	public User() {
		imagePath = "";
		firstName = "";
		lastName = "";
		expertise = "";
		emailAddress = "";
		schedule = "";
	}
	
	public User(String imagePath, String firstName, String lastName, String expertise, String emailAddress, String schedule) {
		this.imagePath = imagePath;
		this.firstName = firstName;
		this.lastName = lastName;
		this.expertise = expertise;
		this.emailAddress = emailAddress;
		this.schedule = schedule;
	}
	
	public String getImagePath() {
		return imagePath;
	}
        
        public void setImagePath(String imagePath) {
            this.imagePath = imagePath;
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
	
	public String getExpertise() {
		return expertise;
	}
        
        public void setExpertise(String expertise) {
            this.expertise = expertise;
        }
	
	public String getEmailAddress() {
		return emailAddress;
	}
        
        public void setEmailAddress(String emailAddress){
            this.emailAddress = emailAddress;
        }
	
	public String getSchedule() {
		return schedule;
	}
        
        public void setSchedule(String schedule) {
            this.schedule = schedule;
        }
	
	public String toString() {
		return imagePath + " | " + firstName + " | " + lastName + " | " + expertise + " | " + emailAddress + " | " + schedule;
	}
}
