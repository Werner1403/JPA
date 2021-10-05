package at.ac.htlinn.jpa.uni;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class salaries {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@ManyToOne
	private int emp_no;
	private float salary;
	private Date fromDate;
	private Date toDate;
	
	@ManyToOne
	@JoinColumn(name="emp_no", nullable = false)
	private Employee employee;
	
	public salaries() {
		
	}
	public salaries(int emp_no, float salary, Date fromDate, Date toDate) {
		this.emp_no = emp_no;
		this.salary = salary;
		this.fromDate = fromDate;
		this.toDate = toDate;
	}

	public int getEmp_no() {
		return emp_no;
	}
	public void setEmp_no(int emp_no) {
		this.emp_no = emp_no;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public Date getFromDate() {
		return fromDate;
	}
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
	public Date getToDate() {
		return toDate;
	}
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}
	@Override
	public String toString() {
		return "salaries [emp_no=" + emp_no + ", salary=" + salary + ", fromDate=" + fromDate + ", toDate=" + toDate
				+ "]";
	}
	
	
	
	
}
