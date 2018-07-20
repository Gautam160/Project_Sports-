package com.it.sportsplus.models;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.JoinColumn;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="tbl_schedule")

public class Schedule implements Serializable{
	
	@Id
	@GeneratedValue
	@Column(name="schedule_id")
	private Long scheduleId;
	@Column(name="date_time")
	private String datetime;
	@Column(name="description")
	private String description;
	@Column(name="update_time")
	private String updatetime;
	@Column(name="status")
	private String status;
	@Column(name="group_id")
	private String groupid;
	@Column(name="academy_id")
	private String academyid;
	
	public Long getScheduleId() {
		return scheduleId;
	}
	public void setScheduleId(Long scheduleId) {
		this.scheduleId = scheduleId;
	}
	public String getDatetime() {
		return datetime;
	}
	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUpdatetime() {
		return updatetime;
	}
	public void setUpdatetime(String updatetime) {
		this.updatetime = updatetime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getGroupid() {
		return groupid;
	}
	public void setGroupid(String groupid) {
		this.groupid = groupid;
	}
	public String getAcademyid() {
		return academyid;
	}
	public void setAcademyid(String academyid) {
		this.academyid = academyid;
	}
	
	public Schedule(Long scheduleId, String datetime, String description, String updatetime, String status,
			String groupid, String academyid) {
		super();
		this.scheduleId = scheduleId;
		this.datetime = datetime;
		this.description = description;
		this.updatetime = updatetime;
		this.status = status;
		this.groupid = groupid;
		this.academyid = academyid;
	}
	
	public Schedule() {
		super();
		
	}
	

}
