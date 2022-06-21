import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class AppTest {
     public static void main (String[]args) {
	
	//Configuration- activates hibernate framework
	// configure - read both cfg files & mapping details
	// buildSessionFactory - from cfg object it takes jdbc information & create a jdbc connection
	SessionFactory s = new Configuration().configure().buildSessionFactory();
	//opens an connection with db & session object perform CRUD
	Session ses = s.openSession();
	// operation performed with db, save permanent
	Transaction t = ses.beginTransaction();

	// creating object of persistent class
	Employee e = new Employee();
	// use object to enter data in table with setter method
	e.setEmpId(102);
	e.setEmpFirstName("Ram");
	e.setEmpLastName("Kumar");
	e.setEmpEmail("ram@gmail.com");
	e.setEmpPhone(934822288);
	e.setEmpAddr("Chennai");
	e.setEmpSalary(16300.90);
	// session object is used to save the persistent class object
	ses.save(e);
	// transaction object to commit changes
	t.commit();
	ses.close();
	
	
}
}
   
