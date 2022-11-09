package packManyToOne;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int empid;
	private String name;
	private String designation;
	private String address;
	private String compLocation;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCompLocation() {
		return compLocation;
	}
	public void setCompLocation(String compLocation) {
		this.compLocation = compLocation;
	}
	
	
	
	
}
