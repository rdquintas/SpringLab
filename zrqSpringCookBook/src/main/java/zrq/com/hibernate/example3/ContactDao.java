package zrq.com.hibernate.example3;

import java.util.List;

public interface ContactDao {
	List<Contact> findAll();

	List<Contact> findAllWithDetail();

	Contact findById(Long id);

	Contact save(Contact contact);

	void delete(Contact contact);
}
