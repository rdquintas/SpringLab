package zrq.com.hibernate.example4;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service("jpaContactService")
@Repository
@Transactional
public class ContactServiceImpl implements ContactService {
	
	private Log log = LogFactory.getLog(ContactServiceImpl.class);
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Contact> findAll() {
		return null;
	}

	@Override
	public List<Contact> findAllWithDetail() {
		return null;
	}

	@Override
	public Contact findById(Long id) {
		return null;
	}

	@Override
	public Contact save(Contact contact) {
		return null;
	}

	@Override
	public void delete(Contact contact) {
	}

}
