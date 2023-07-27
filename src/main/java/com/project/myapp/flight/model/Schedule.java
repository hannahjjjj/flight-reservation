package com.project.myapp.flight.model;

import java.sql.Date;
import java.sql.Timestamp;

import lombok.Data;

@Data
public class Schedule {
	private int ROWNUM;
	private int scheduleId;
	private int airlineId;
	
	private String departmentNation;
	private String arrivalNation;
	
	private Date departmentDate;
	private Date arrivalDate;
	
	private String departmentTime;
	private String arrivalTime;
	private int flightTime;
	// 시간 / 분을 나타내기 위한 필드
	private String flightTimeDetail;
	
	private int firstClassFare;
	private int firstClassRemain;
	
	private int businessClassFare;
	private int businessClassRemain;
	
	private int economyClassFare;
	private int economyClassRemain;
	
	private Timestamp createdAt;
	private Timestamp updatedAt;
	
	// Airline Table
	private String airlineName;
	private String airplaneTypeName;
	private String image;
	
	// Check Person Count
	private int person;
	
	// 페이징 처리
	private int page;
	
	// Grade
	private int grade;
}
