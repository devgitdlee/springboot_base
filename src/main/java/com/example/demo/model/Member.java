package com.example.demo.model;

import java.io.Serializable;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@DynamicInsert @DynamicUpdate
@Getter @Setter
@NoArgsConstructor
@Entity
@Table(name = "TB_MEM")
public class Member implements Serializable {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(updatable = false, nullable = false, columnDefinition = "INT UNSIGNED")
	private Long  id;
	
	@JsonIgnore
	@Column(nullable = false, length = 50)
	private String email;
	
	@JsonIgnore
	@Column(nullable = false, length = 150)
	private String password;
}
