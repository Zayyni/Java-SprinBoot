package com.app.zayyni.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapKeyColumn;
import jakarta.persistence.OrderColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "emptab")
public class Employee {
	
	@Id
	@Column(name = "eid")
	private Integer empId;
	@Column(name = "ename")
	private String empName;
	@Column(name = "esal")
	private Double empSal;
	
	@ElementCollection
	@CollectionTable(name = "empprjstab",joinColumns = @JoinColumn(referencedColumnName = "eid")) //key column
	@Column(name = "prj") // element column
	@OrderColumn(name = "pos") //index column
	private List<String> empPrjs;
	
	@ElementCollection
//	@CollectionTable(name = "emptasktab",joinColumns = @JoinColumn(referencedColumnName = "eid"))
	@Column(name = "task")
	private Set<String> empTasks;
	
	
	@ElementCollection
	@CollectionTable(name = "empmodulestab",joinColumns = @JoinColumn(referencedColumnName = "eid"))
	@Column(name = "module") // element column
	@MapKeyColumn(name = "pos") // index column
	private Map<Integer,String> empModules;

}
