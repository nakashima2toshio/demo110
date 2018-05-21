package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;

import java.util.List;

@Entity
@NamedQuery(name="Department.findAll", query="SELECT d FROM Department d")
public class Department implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String memo;

	private String name;

	//bi-directional many-to-one association to Emp
	@OneToMany(mappedBy="department")
	private List<Emp> emps;

	public Department() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Emp> getEmps() {
		return this.emps;
	}

	public void setEmps(List<Emp> emps) {
		this.emps = emps;
	}

	public Emp addEmp(Emp emp) {
		getEmps().add(emp);
		emp.setDepartment(this);

		return emp;
	}

	public Emp removeEmp(Emp emp) {
		getEmps().remove(emp);
		emp.setDepartment(null);

		return emp;
	}

}