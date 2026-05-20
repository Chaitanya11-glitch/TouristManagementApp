package com.example.globalexception;

import java.time.LocalDateTime;

public class ErrorDetails {
	
	private String msg;
	private LocalDateTime localDateTime;
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}
	public void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
	}
	public ErrorDetails(String msg, LocalDateTime localDateTime) {
		super();
		this.msg = msg;
		this.localDateTime = localDateTime;
	}
	public ErrorDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ErrorDetails [msg=" + msg + ", localDateTime=" + localDateTime + "]";
	}
	
	

}
