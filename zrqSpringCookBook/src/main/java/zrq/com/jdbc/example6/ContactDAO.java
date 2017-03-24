package zrq.com.jdbc.example6;

import java.util.List;

public interface ContactDAO {

	List<Contact> findAll();

	List<Contact> findAllWithDetail();

	String findLastNameById(Long id);

	String findFirstNameById(Long id);

	void update(Contact contact);

	void insert(Contact contact);

	// List<Contact> findByFirstName(String firstName);

	// void delete(Long contactId);
}