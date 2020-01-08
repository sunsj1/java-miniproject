package clg.daoImplementation;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import clg.daoInterface.DaoInterface;

import clg.model.UserInformation;
import clg.utility.HibernateUtil;

public class DaoImplementation implements DaoInterface {
	Session session = new HibernateUtil().getSessionfactory().openSession();

	@Override
	public int registerData(UserInformation u) {
		// TODO Auto-generated method stub
		int id = (int) session.save(u);
		session.beginTransaction().commit();
		return id;
	}

	@Override
	public UserInformation validUser(String email, String password) {
		// TODO Auto-generated method stub
		Query q = session
				.createQuery("from UserInformation where email='" + email + "' and password='" + password + "' ");
		UserInformation u = (UserInformation) q.getSingleResult();
		if (u == null) {
			return null;
		} else {
			return u;
		}
	}

	@Override
	public List<UserInformation> studentList() {
		// TODO Auto-generated method stub
		String s = "student";
		Query q = session.createQuery("from UserInformation where role='" + s + "'");

		return q.getResultList();
	}

	@Override
	public List<UserInformation> facultyList() {
		// TODO Auto-generated method stub
		String f = "Assistance Proffessor";
		Query q1 = session.createQuery("from UserInformation where role='" + f + "'");

		return q1.getResultList();
	}

	@Override
	public int deleteData(int id) {
		// TODO Auto-generated method stub
		UserInformation u = getArecord(id);
		if (u != null) {
			Transaction txn = session.beginTransaction();
			session.delete(u);
			txn.commit();
			return 1;

		} else {
			return 0;
		}

	}

	@Override
	public UserInformation getArecord(int id) {
		// TODO Auto-generated method stub

		UserInformation u = session.get(UserInformation.class, id);
		return u;
	}

	@Override
	public int updateData(UserInformation u) {
		// TODO Auto-generated method stub
		UserInformation u1 = getArecord(u.getId());
		Session session1 = new HibernateUtil().getSessionfactory().openSession();
		System.out.println("in daoimplementation" + u.getId());
		if (u1 != null) {
			Transaction txn = session1.beginTransaction();
			session1.update(u);
			txn.commit();
			return 1;
		}
		return 0;
	}

	
}
