package com.devfun.settingweb_boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devfun.settingweb_boot.dao.StatisticDAO;
import com.devfun.settingweb_boot.vo.YearStatisticVO;

@Service
public class StatisticServiceImpl implements StatisticService {

	@Autowired
	private StatisticDAO statisticDao;
	
	@Override
	public int sqlyearStatistic(String year) {
		return statisticDao.sqlyearStatistic(year);
	}

}
