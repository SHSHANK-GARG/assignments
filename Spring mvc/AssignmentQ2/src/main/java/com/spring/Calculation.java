package com.spring;

public class Calculation {
	public int principal;
	public int time;
	public int rate;
	
	public Calculation() {}
	
	public Calculation(int principal, int time, int rate) {
		super();
		this.principal = principal;
		this.time = time;
		this.rate = rate;
	}
	public int getPrincipal() {
		return principal;
	}
	public void setPrincipal(int principal) {
		this.principal = principal;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public int interest() {
		return (principal*rate*time)/100;
	}
	
}
