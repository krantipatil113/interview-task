package com.task.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class pro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String message;
    
    public pro()
    {
    	
    }

    public pro(Long id, String name, String message, cat category) {
		super();
		this.id = id;
		this.name = name;
		this.message = message;
		this.category = category;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getmessage() {
		return message;
	}

	public void setPrice(String message) {
		this.message = message;
	}

	public cat getCategory() {
		return category;
	}

	public void setCategory(cat category) {
		this.category = category;
	}

	@ManyToOne
    @JoinColumn(name = "category_id")
    private cat category;

    
}

