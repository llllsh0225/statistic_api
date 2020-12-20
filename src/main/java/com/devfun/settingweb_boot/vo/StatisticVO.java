package com.devfun.settingweb_boot.vo;

public class StatisticVO {
	private int totCnt;
	private String createDate;
	private boolean is_success;
	public int getTotCnt() {
		return totCnt;
	}
	public void setTotCnt(int totCnt) {
		this.totCnt = totCnt;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String year) {
		this.createDate = year;
	}
	public boolean isIs_success() {
		return is_success;
	}
	public void setIs_success(boolean is_success) {
		this.is_success = is_success;
	}
}
