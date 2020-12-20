package com.devfun.settingweb_boot.service;

import java.util.HashMap;

public interface StatisticService {
	public int sqlyearStatistic(String year);
	public int getStatisticFromCreateDate(String createDate);
	public int getAverageLogin();
	public int getDeptMonthlyLogin(HashMap<String, String> param);
}
