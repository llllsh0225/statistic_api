package com.devfun.settingweb_boot.dao;

import java.util.HashMap;


public interface StatisticDAO {

	public int sqlyearStatistic(String year);
	public int getStatisticFromCreateDate(String createDate);
	public int getAverageLogin();
	public int getDeptMonthlyLogin(HashMap<String, String> param);
}
