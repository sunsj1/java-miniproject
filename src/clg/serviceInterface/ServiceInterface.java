package clg.serviceInterface;

import java.util.List;


import clg.model.UserInformation;

public interface ServiceInterface {
int registerdata(UserInformation u);
UserInformation validUser(String email,String password);
List<UserInformation> studentList();
List<UserInformation> facultyList();
UserInformation getStudent(UserInformation u);
int deleteData(int id);
UserInformation getArecord(int id);
int updateData(UserInformation u);
}
