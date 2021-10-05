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
public class titles {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int emp_no;
	private String title;
	private Date fromDate;
	private Date toDate;
	
	@ManyToOne
	@JoinColumn(name="emp_no", nullable = false)
	private Employee employee;
	
	public titles() {
	}
	
	public titles(int emp_no, String title, Date fromDate, Date toDate) {
		this.emp_no = emp_no;
		this.title = title;
		this.fromDate = fromDate;
		this.toDate = toDate;
	}
	public int getEmp_no() {
		return emp_no;
	}
	public void setEmp_no(int emp_no) {
		this.emp_no = emp_no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
		return "titles [emp_no=" + emp_no + ", title=" + title + ", fromDate=" + fromDate + ", toDate=" + toDate + "]";
	}

}
