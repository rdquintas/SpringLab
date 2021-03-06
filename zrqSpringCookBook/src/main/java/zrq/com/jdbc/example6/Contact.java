package zrq.com.jdbc.example6;

import java.util.ArrayList;
import java.util.Date;

public class Contact {
	private Long id;
	private String first_name;
	private String last_name;
	private Date birth_date;
	private ArrayList<ContactTelDetail> contactTelDetails;
	
	public ArrayList<ContactTelDetail> getContactTelDetails() {
		return contactTelDetails;
	}

	public void setContactTelDetails(ArrayList<ContactTelDetail> contactTelDetails) {
		this.contactTelDetails = contactTelDetails;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public Date getBirth_date() {
		return birth_date;
	}

	public void setBirth_date(Date birth_date) {
		this.birth_date = birth_date;
	}
	
	@Override
	public String toString(){
		return "ID: " + id + " - " + first_name + " " + last_name + " - " + birth_date.toGMTString();
	}

}