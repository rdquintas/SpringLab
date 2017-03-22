package zrq.com.jdbc.example6;

import javax.sql.DataSource;

import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.jdbc.core.JdbcTemplate;

public class ContactJDBCTemplate implements ContactDAO, InitializingBean {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		if (dataSource == null) {
			throw new BeanCreationException("Must set dataSource on ContactDao");
		} else{
			System.out.println("ZRQ todo lá dentro!");
		}
	}
	// public void create(String name, Integer age) {
	// String SQL = "insert into Student (name, age) values (?, ?)";
	//
	// jdbcTemplateObject.update(SQL, name, age);
	// System.out.println("Created Record Name = " + name + " Age = " + age);
	// return;
	// }

	// public Student getStudent(Integer id) {
	// String SQL = "select * from Student where id = ?";
	// Student student = jdbcTemplateObject.queryForObject(SQL, new Object[] {
	// id }, new StudentMapper());
	// return student;
	// }

	// public List<Student> listStudents() {
	// String SQL = "select * from Student";
	// List<Student> students = jdbcTemplateObject.query(SQL, new
	// StudentMapper());
	// return students;
	// }

	// public void delete(Integer id) {
	// String SQL = "delete from Student where id = ?";
	// jdbcTemplateObject.update(SQL, id);
	// System.out.println("Deleted Record with ID = " + id);
	// return;
	// }

	// public void update(Integer id, Integer age) {
	// String SQL = "update Student set age = ? where id = ?";
	// jdbcTemplateObject.update(SQL, age, id);
	// System.out.println("Updated Record with ID = " + id);
	// return;
	// }

	@Override
	public String findLastNameById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}