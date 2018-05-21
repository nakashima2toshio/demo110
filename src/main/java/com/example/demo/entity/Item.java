package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name="items")
@NamedQuery(name="Item.findAll", query="SELECT i FROM Item i")
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Item implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id @Getter  @Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;

	@Getter @Setter @Column(name="name")
	private String name;

	@Getter @Setter @Column(name="price")
	private int price;

	public Item() {
	}

}