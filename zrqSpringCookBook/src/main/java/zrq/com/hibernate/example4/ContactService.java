package zrq.com.hibernate.example4;

import java.util.List;

public interface ContactService {
	List<Contact> findAll();

	List<Contact> findAllWithDetail();

	Contact findById(Long id);

	Contact save(Contact contact);

	void delete(Contact contact);
}
