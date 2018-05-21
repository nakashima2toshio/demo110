package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="emp")
@NamedQuery(name="Emp.findAll", query="SELECT e FROM Emp e")
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Emp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id @Getter @Setter @Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Getter @Setter @Column(name="memo")
	private String memo;

	@Getter @Setter @Column(name="name")
	private String name;

	//bi-directional many-to-one association to Department
	@ManyToOne @Getter @Setter
	private Department department;

	public Emp() {
	}

	/*
	public Department getDepartment() {
		return this.department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	*/

}