package sample;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class Address {
    
	@Id
	@GeneratedValue
	long aid;
	
	@Column(name="state")
	String state;
	
	@Column(name="city")
	String city;
	
	@Column(name="number")
	long number;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Employee employee;
	
    Address()
    {
    	
    }

	


	public Address(long aid, String state, String city, long number, Employee employee) {
		super();
		this.aid = aid;
		this.state = state;
		this.city = city;
		this.number = number;
		this.employee = employee;
	}




	public long getAid() {
		return aid;
	}


	public void setAid(long aid) {
		this.aid = aid;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public long getNumber() {
		return number;
	}


	public void setNumber(long number) {
		this.number = number;
	}


	
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Address [getAid()=" + getAid() + ", getState()=" + getState() + ", getCity()=" + getCity()
				+ ", getNumber()=" + getNumber() + ", getEid()=" + getEmployee() + "]";
	}
	
	
	
	
	
}
