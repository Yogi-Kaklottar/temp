package sample;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="phone")
public class Phone {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long pid;
	
	@Column(name="number")
	private long number;

	public Phone() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Phone(long number) {
		super();
		this.number = number;
	}	

	public long getPid() {
		return pid;
	}

	public void setPid(long pid) {
		this.pid = pid;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Phone [getPid()=" + getPid() + ", getNumber()=" + getNumber() + "]";
	}
	
}
