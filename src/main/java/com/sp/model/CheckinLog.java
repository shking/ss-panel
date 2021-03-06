package com.sp.model;

import java.io.Serializable;
import java.util.Date;

import com.blade.ioc.annotation.Inject;
import com.blade.jdbc.annotation.Table;

//
@Table(name = "ss_checkin_log", pk = "id")
public class CheckinLog implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;

	private Integer user_id;

	private Integer checkin_at;

	private Integer traffic;

	private Integer created_at;

	private Integer updated_at;

	public CheckinLog(){}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public Integer getCheckin_at() {
		return checkin_at;
	}

	public void setCheckin_at(Integer checkin_at) {
		this.checkin_at = checkin_at;
	}

	public Integer getTraffic() {
		return traffic;
	}

	public void setTraffic(Integer traffic) {
		this.traffic = traffic;
	}

	public Integer getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Integer created_at) {
		this.created_at = created_at;
	}

	public Integer getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Integer updated_at) {
		this.updated_at = updated_at;
	}
}