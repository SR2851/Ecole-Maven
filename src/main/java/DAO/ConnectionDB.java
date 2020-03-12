package DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ConnectionDB {
	private  SessionFactory factory=null ;
	 private  Session session;
	 private static ConnectionDB instance=null;
	 
	 
	 

	public ConnectionDB() {
		super();
	}

	public SessionFactory getFactory(){
		 if(factory==null) {
			 factory = new Configuration().configure().buildSessionFactory();
		 }
		 return factory;
	 }
	 
	 public Session getSession() {
		 if(session==null) {
			 session = factory.openSession();
		 }
		 return session;
	 }
	 
	 public static ConnectionDB getInstance() {
		 if(instance==null) {
			 instance = new ConnectionDB();
		 }
		 return instance;
	 }
	
}
