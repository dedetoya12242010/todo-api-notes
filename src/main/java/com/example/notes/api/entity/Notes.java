package com.example.notes.api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table
public class Notes {

	@jakarta.persistence.Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private int Id;
	
	@Column
	@NotBlank(message = "Title is mandatory")
	private String title;
	
	@Column
	@NotBlank(message = "Body is mandatory")
	private String body;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
}
