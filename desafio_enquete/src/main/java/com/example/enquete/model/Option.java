package com.example.enquete.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "option")
public class Option {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonProperty("poll_id")
	private Integer id;
	@JsonProperty("poll_description")
	private String description;

	@ManyToOne
	@JoinColumn(name = "poll_id")
	@JsonBackReference
	private Poll poll;

	public Option(String description) {
		this.description = description;
	}
	

	public Option() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Poll getPoll() {
		return poll;
	}

	public void setPoll(Poll poll) {
		this.poll = poll;
	}

}
