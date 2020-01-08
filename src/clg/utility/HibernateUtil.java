package clg.utility;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;


import clg.model.UserInformation;

public class HibernateUtil {
	private static StandardServiceRegistry registry;
	  private static SessionFactory sf;
	  public static SessionFactory getSessionfactory() {
		  Map<String,Object> setting=new HashMap<String,Object>();
		  setting.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
			setting.put(Environment.URL, "jdbc:mysql://localhost:3306/miniproject");
			setting.put(Environment.USER, "root");
			setting.put(Environment.PASS, "root");
			setting.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
			setting.put("hibernate.hbm2ddl.auto", "update");
			setting.put(Environment.SHOW_SQL, "true");
		    registry=new StandardServiceRegistryBuilder().applySettings(setting).build();
		    MetadataSources mds=new MetadataSources(registry).addAnnotatedClass(UserInformation.class);
			
			
			Metadata md=mds.getMetadataBuilder().build();
			
		    sf=md.getSessionFactoryBuilder().build();


		  return sf;
	  }

}
