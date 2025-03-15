package com.app.zayyni.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Book {

	@Id
	private Integer bid;
	private String bname;
	private String bType;
	
	
	@ManyToMany
	@JoinTable(
			name = "book_auth_tab",
			joinColumns = @JoinColumn(columnDefinition = "bid_fk"),
			inverseJoinColumns = @JoinColumn(columnDefinition  = "aid_fk")
			)
	private List<Author> aobs;
}
