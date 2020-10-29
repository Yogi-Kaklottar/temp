package sample;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "employee")
public class Employee {
	
	@Id
	@GeneratedValue
	private long eid;
	
	@Column(name="name")
	private String name;
	
	@Column(name="salary")
	private long salary;
	
	@Column(name="designtion")
	private String designtion;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "pid")
	private Phone pid;
	
	@OneToMany(mappedBy = "employee")
	private Set<Address> address;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Set<Address> getAddress() {
		return address;
	}


	public void setAddress(Set<Address> address) {
		this.address = address;
	}


	public Employee(long eid, String name, long salary, String designtion, Phone pid, Set<Address> address) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
		this.designtion = designtion;
		this.pid = pid;
		this.address = address;
	}


	public Phone getPid() {
		return pid;
	}
	public void setPid(Phone pid) {
		this.pid = pid;
	}
	
	
	public long getEid() {
		return eid;
	}



	public void setEid(long eid) {
		this.eid = eid;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public long getSalary() {
		return salary;
	}



	public void setSalary(long salary) {
		this.salary = salary;
	}



	public String getDesigntion() {
		return designtion;
	}



	public void setDesigntion(String designtion) {
		this.designtion = designtion;
	}



	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + ", designtion=" + designtion
				+ ", pid=" + pid + ", address=" + address + "]";
	}
	
	
	
	
}
