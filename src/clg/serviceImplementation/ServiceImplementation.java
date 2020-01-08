package clg.serviceImplementation;

import java.util.List;

import clg.daoImplementation.DaoImplementation;
import clg.daoInterface.DaoInterface;

import clg.model.UserInformation;
import clg.serviceInterface.ServiceInterface;

public class ServiceImplementation implements ServiceInterface {
  DaoInterface di=new DaoImplementation();
	@Override
	public int registerdata(UserInformation u) {
		
		return di.registerData(u);
	}
	@Override
	public UserInformation validUser(String email, String password) {
		// TODO Auto-generated method stub
		UserInformation userInformation=di.validUser(email, password);
		return di.validUser(email, password);
	}
	@Override
	public List<UserInformation> studentList() {
		// TODO Auto-generated method stub
		return di.studentList();
	}
	@Override
	public List<UserInformation> facultyList() {
		// TODO Auto-generated method stub
		return di.facultyList();
	}
	@Override
	public UserInformation getStudent(UserInformation u) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int deleteData(int id) {
		// TODO Auto-generated method stub
		return di.deleteData(id);
	}
	@Override
	public UserInformation getArecord(int id) {
		// TODO Auto-generated method stub
		return di.getArecord(id);
	}
	@Override
	public int updateData(UserInformation u) {
		// TODO Auto-generated method stub
		return di.updateData(u);
	}
	
	
	
	
	}
	
	


