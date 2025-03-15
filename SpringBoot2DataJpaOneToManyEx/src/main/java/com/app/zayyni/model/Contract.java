package com.app.zayyni.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Contract {
	@Id
	private Integer cid;
	private String code;
	private Double bidAmt;
	private String ctype;

}
