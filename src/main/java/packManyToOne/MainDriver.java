package packManyToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainDriver {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("punith");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	Employee employee1=new Employee();
	employee1.setAddress("Bangalore");
	employee1.setDesignation("CEO");
	employee1.setEmpid(1297868);
	employee1.setName("PunithRAJ");
	employee1.setCompLocation("Bangalore");
	
	Office office=new Office();
	office.setAddress("pune");
	office.setField("Information technology");
	office.setLocation("Mumbai");
	office.setName("punithraj infotech prvt ltd");
	office.setEmployee(employee1);
	
	
	Office  office1=new Office();
	office1.setAddress("LA california");
	office1.setField("corporate");
	office1.setLocation("America");
	office1.setName("Dream come true constructions prvt ltd");
	office1.setEmployee(employee1);
	
	entityTransaction.begin();
	entityManager.persist(office);
	entityManager.persist(office1);
	entityManager.persist(employee1);
	entityTransaction.commit();
	
	
	
	
	
	
	
	
}
}
