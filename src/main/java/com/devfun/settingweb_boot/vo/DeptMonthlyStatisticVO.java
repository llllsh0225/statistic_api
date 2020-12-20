package com.devfun.settingweb_boot.vo;

public class DeptMonthlyStatisticVO {
	private int totCnt;
	private String hr_organ;
	private String yearMonth;
	private boolean is_success;
	public int getTotCnt() {
		return totCnt;
	}
	public void setTotCnt(int totCnt) {
		this.totCnt = totCnt;
	}
	public String getHr_organ() {
		return hr_organ;
	}
	public void setHr_organ(String hr_organ) {
		this.hr_organ = hr_organ;
	}
	public String getYearMonth() {
		return yearMonth;
	}
	public void setYearMonth(String yearMonth) {
		this.yearMonth = yearMonth;
	}
	public boolean isIs_success() {
		return is_success;
	}
	public void setIs_success(boolean is_success) {
		this.is_success = is_success;
	}
}

