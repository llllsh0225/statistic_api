package com.devfun.settingweb_boot.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devfun.settingweb_boot.dao.StatisticDAO;

@Service
public class StatisticServiceImpl implements StatisticService {

	@Autowired
	private StatisticDAO statisticDao;
	
	@Override
	public int sqlyearStatistic(String year) {
		return statisticDao.sqlyearStatistic(year);
	}

	@Override
	public int getStatisticFromCreateDate(String createDate) {
		return statisticDao.getStatisticFromCreateDate(createDate);
	}

	@Override
	public int getAverageLogin() {
		return statisticDao.getAverageLogin();
	}

	@Override
	public int getDeptMonthlyLogin(HashMap<String, String> param) {
		return statisticDao.getDeptMonthlyLogin(param);
	}

}
