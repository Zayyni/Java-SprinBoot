package com.app.zayyni.model;

import java.util.Set;

import jakarta.persistence.Id; 

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "usertab")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id_col")
	private Integer userId;
	@Column(name = "user_name_col")
	private String userName;
	@Column(name = "user_mail_col")
	private String userMail;
	@Column(name = "user_pwd_col")
	private String userPwd;
	
	@ElementCollection
	@CollectionTable(name = "usr_roles_tab", joinColumns = @JoinColumn(referencedColumnName = "user_id_col"))
	@Column(name = "user_role_col")
	private Set<String> userRoles;

}
