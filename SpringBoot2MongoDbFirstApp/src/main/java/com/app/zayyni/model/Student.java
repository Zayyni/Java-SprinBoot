package com.app.zayyni.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.annotation.Nonnull;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Document  //Map with collection-documents
public class Student {

	@Id
	private String id;
	
	@Nonnull
	private Integer sid;
	@Nonnull
	private String sname;
	@Nonnull
	private Double sfee;
	
	private List<String> courses;
	
}
