package com.webservice.starter.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@Entity
public class Conference {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", unique = true, nullable = false)
	@Setter(AccessLevel.NONE)
	public Long id;
	public String name;
	public int capacity;
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	public Date startTime;
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	public Date endTime;
	public String status;

}
