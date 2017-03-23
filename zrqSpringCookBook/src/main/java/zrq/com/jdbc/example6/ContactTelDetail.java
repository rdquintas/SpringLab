package zrq.com.jdbc.example6;

public class ContactTelDetail {
	private Long id;
	private String tel_type;
	private String tel_number;
	private Long contact_id;

	public Long getContact_id() {
		return contact_id;
	}

	public void setContact_id(Long contact_id) {
		this.contact_id = contact_id;
	}

	public String getTel_type() {
		return tel_type;
	}

	public void setTel_type(String tel_type) {
		this.tel_type = tel_type;
	}

	public String getTel_number() {
		return tel_number;
	}

	public void setTel_number(String tel_number) {
		this.tel_number = tel_number;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "ID: " + id + " - tel_type: " + tel_type + " - tel_number: " + tel_number;
	}

}