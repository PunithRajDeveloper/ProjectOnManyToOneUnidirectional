package packManyToOne;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Office {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private  String name;
private  String location;
private  String  mainbranch;
private  String field;

@ManyToOne
private Employee employee;


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getLocation() {
	return location;
}


public void setLocation(String location) {
	this.location = location;
}


public String getAddress() {
	return mainbranch;
}


public void setAddress(String address) {
	this.mainbranch = address;
}


public String getField() {
	return field;
}


public void setField(String field) {
	this.field = field;
}


public Employee getEmployee() {
	return employee;
}


public void setEmployee(Employee employee) {
	this.employee = employee;
}


}
