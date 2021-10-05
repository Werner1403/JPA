package at.ac.htlinn.jpa.uni;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class departments {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int dept_no;
	private String dept_name;
	
	@OneToMany
	@JoinColumn(name = "dept_no") 
	private List<dept_emp> dept_emp ;
	
	@OneToMany
	@JoinColumn(name = "dept_no")
	private List<dept_manager> dept_manager;
	
	public departments() {
		
	}
	
	public departments(int dept_no, String dept_name) {
		this.dept_no = dept_no;
		this.dept_name = dept_name;
	}

	public int getDept_no() {
		return dept_no;
	}
	public void setDept_no(int dept_no) {
		this.dept_no = dept_no;
	}
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	@Override
	public String toString() {
		return "departments [dept_no=" + dept_no + ", dept_name=" + dept_name + "]";
	}
	
}
