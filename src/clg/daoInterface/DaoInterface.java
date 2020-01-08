package clg.daoInterface;

import java.util.List;


import clg.model.UserInformation;

public interface DaoInterface {
 int registerData(UserInformation u);
 UserInformation validUser(String email,String password);
 List<UserInformation> studentList();
 List<UserInformation> facultyList();
  int deleteData(int id);
 UserInformation getArecord(int id);
 int updateData(UserInformation u);
 }
