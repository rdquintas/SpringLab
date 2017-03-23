package zrq.com.jdbc.example6;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

public class ContactWithDetailExtractor implements ResultSetExtractor<List<Contact>> {
	@Override
	public List<Contact> extractData(ResultSet rs) throws SQLException, DataAccessException {
		Map<Long, Contact> map = new HashMap<Long, Contact>();
		Contact contact = null;
		while (rs.next()) {
			Long id = rs.getLong("id");
			contact = map.get(id);
			if (contact == null) {
				contact = new Contact();
				contact.setId(id);
				contact.setFirst_name(rs.getString("first_name"));
				contact.setLast_name(rs.getString("last_name"));
				contact.setBirth_date(rs.getDate("birth_date"));
				contact.setContactTelDetails(new ArrayList<ContactTelDetail>());
				map.put(id, contact);
			}
			Long contactTelDetailId = rs.getLong("contact_tel_id");

			if (contactTelDetailId > 0) {
				ContactTelDetail contactTelDetail = new ContactTelDetail();
				contactTelDetail.setId(contactTelDetailId);
				contactTelDetail.setContact_id(id);
				contactTelDetail.setTel_type(rs.getString("tel_type"));
				contactTelDetail.setTel_number(rs.getString("tel_number"));
				contact.getContactTelDetails().add(contactTelDetail);
			}
		}
		return new ArrayList<Contact>(map.values());
	}
}