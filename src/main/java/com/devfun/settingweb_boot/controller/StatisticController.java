package com.devfun.settingweb_boot.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.devfun.settingweb_boot.service.StatisticService;
import com.devfun.settingweb_boot.vo.YearStatisticVO;

@RestController
public class StatisticController {

	@Autowired
	private StatisticService statisticService;
	
	@ResponseBody
	@RequestMapping(value = "/sqlyearStatistic", method = RequestMethod.GET)
	public YearStatisticVO sqlyearStatistic(@RequestParam String year, HttpServletResponse response) {
		System.out.println("year ===> " + year);
		int totCnt = statisticService.sqlyearStatistic(year);
		int resultCode = response.getStatus();
		
		YearStatisticVO statistic = new YearStatisticVO();
		statistic.setTotCnt(totCnt);
		statistic.setYear(year);
		if(resultCode == 200) {
			statistic.setIs_success(true);
		}else {
			statistic.setIs_success(false);
		}
		
		return statistic;
	}
}
