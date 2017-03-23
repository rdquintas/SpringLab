package zrq.com.jdbc.example6;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ContactMapper implements RowMapper<Contact> {
	@Override
	public Contact mapRow(ResultSet rs, int rowNum) throws SQLException {
		Contact contact = new Contact();
		contact.setId(rs.getLong("id"));
		contact.setFirst_name(rs.getString("first_name"));
		contact.setLast_name(rs.getString("last_name"));
		contact.setBirth_date(rs.getDate("birth_date"));
		return contact;
	}
}