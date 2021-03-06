package zrq.com.jdbc.example6;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

public class ContactJDBCTemplate implements ContactDAO, InitializingBean {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
		this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}

	public DataSource getDataSource() {
		return dataSource;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		if (dataSource == null) {
			throw new BeanCreationException("Must set dataSource on ContactDao");
		} else {
			System.out.println("ZRQ todo lá dentro!");
		}
	}

	// SELECT INTO TABLE
	@Override
	public List<Contact> findAll() {
		String sql = "select id, first_name, last_name, birth_date from contact";
		return jdbcTemplate.query(sql, new ContactMapper());
	}

	// SELECT SINGLE
	// This example uses NAMED JDBCtemplate (order of params is NOT important)
	@Override
	public String findLastNameById(Long id) {
		String sql = "select last_name from contact where id = :contactId";
		Map<String, Object> namedParameters = new HashMap<String, Object>();
		namedParameters.put("contactId", id);
		return namedParameterJdbcTemplate.queryForObject(sql, namedParameters, String.class);
	}

	// SELECT SINGLE
	// This example uses NORMAL JDBCtemplate (order of params is important)
	@Override
	public String findFirstNameById(Long id) {
		return jdbcTemplate.queryForObject("select first_name from contact where id = ?", new Object[] { id },
				String.class);
	}

	// SELECT JOIN
	@Override
	public List<Contact> findAllWithDetail() {
		String sql = "select c.id, c.first_name, c.last_name, c.birth_date"
				+ ", t.id as contact_tel_id, t.tel_type, t.tel_number from contact c "
				+ "left join contact_tel_detail t on c.id = t.contact_id";
		return jdbcTemplate.query(sql, new ContactWithDetailExtractor());
	}

	// UPDATE
	@Override
	public void update(Contact contact) {
		UpdateContact upd = new UpdateContact(this.dataSource);
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("first_name", contact.getFirst_name());
		paramMap.put("last_name", contact.getLast_name());
		paramMap.put("birth_date", contact.getBirth_date());
		paramMap.put("id", contact.getId());
		upd.updateByNamedParam(paramMap);
		System.out.println("(e) Existing contact updated with id: " + contact.getId());
	}

	@Override
	public void insert(Contact contact) {
		InsertContact ins = new InsertContact(this.dataSource);
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("first_name", contact.getFirst_name());
		paramMap.put("last_name", contact.getLast_name());
		paramMap.put("birth_date", contact.getBirth_date());
		KeyHolder keyHolder = new GeneratedKeyHolder();
		ins.updateByNamedParam(paramMap, keyHolder);
		contact.setId(keyHolder.getKey().longValue());
		System.out.println("(f) New contact inserted with id: " + contact.getId());
	}

}