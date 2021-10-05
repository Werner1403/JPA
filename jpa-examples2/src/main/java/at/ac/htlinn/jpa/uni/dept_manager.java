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
public class dept_manager {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int dept_no;
	private int emp_no;
	private Date from_date;
	private Date to_date;
	
	@ManyToOne
	@JoinColumn(name="dept_no", nullable = false)
	private departments departments;
	
	@ManyToOne
	@JoinColumn(name="emp_no", nullable = false)
	private Employee employee;
	
	public dept_manager() {
		super();
	}

	public dept_manager(int dept_no, int emp_no, Date from_date, Date to_date) {
		this.dept_no = dept_no;
		this.emp_no = emp_no;
		this.from_date = from_date;
		this.to_date = to_date;
	}
	
	public int getDept_no() {
		return dept_no;
	}
	public void setDept_no(int dept_no) {
		this.dept_no = dept_no;
	}
	public int getEmp_no() {
		return emp_no;
	}
	public void setEmp_no(int emp_no) {
		this.emp_no = emp_no;
	}
	public Date getFrom_date() {
		return from_date;
	}
	public void setFrom_date(Date from_date) {
		this.from_date = from_date;
	}
	public Date getTo_date() {
		return to_date;
	}
	public void setTo_date(Date to_date) {
		this.to_date = to_date;
	}

	@Override
	public String toString() {
		return "dept_manager [dept_no=" + dept_no + ", emp_no=" + emp_no + ", from_date=" + from_date + ", to_date="
				+ to_date + "]";
	}
	
	
}
