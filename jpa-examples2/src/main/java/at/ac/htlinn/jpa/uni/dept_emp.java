package at.ac.htlinn.jpa.uni;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class dept_emp {
	
	private int emp_no;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int dept_no;
	private Date from_Date;
	private Date to_Date;
	
	@ManyToOne
	@JoinColumn(name="dept_no", nullable = false)
	private departments departments;
	
	@ManyToOne
	@JoinColumn(name="emp_no", nullable = false)
	private Employee employee;
	
	public dept_emp() {
	}
	
	public dept_emp(int emp_no, int dept_no, Date from_Date, Date to_Date) {
		this.emp_no = emp_no;
		this.dept_no = dept_no;
		this.from_Date = from_Date;
		this.to_Date = to_Date;
	}
	public int getEmp_no() {
		return emp_no;
	}
	public void setEmp_no(int emp_no) {
		this.emp_no = emp_no;
	}
	public int getDept_no() {
		return dept_no;
	}
	public void setDept_no(int dept_no) {
		this.dept_no = dept_no;
	}
	public Date getFrom_Date() {
		return from_Date;
	}
	public void setFrom_Date(Date from_Date) {
		this.from_Date = from_Date;
	}
	public Date getTo_Date() {
		return to_Date;
	}
	public void setTo_Date(Date to_Date) {
		this.to_Date = to_Date;
	}

	@Override
	public String toString() {
		return "dept_emp [emp_no=" + emp_no + ", dept_no=" + dept_no + ", from_Date=" + from_Date + ", to_Date="
				+ to_Date + "]";
	}
	
	
	
}
