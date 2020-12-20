package com.devfun.settingweb_boot.controller;

import java.util.HashMap;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.devfun.settingweb_boot.service.StatisticService;
import com.devfun.settingweb_boot.vo.DeptMonthlyStatisticVO;
import com.devfun.settingweb_boot.vo.StatisticVO;

@RestController
public class StatisticController {

	@Autowired
	private StatisticService statisticService;

	
	@ResponseBody
	@RequestMapping(value = "/getAverageLogin", method = RequestMethod.GET)
	public StatisticVO getAverageLogin(HttpServletResponse response) {
		int totCnt = statisticService.getAverageLogin();
		int resultCode = response.getStatus();

		StatisticVO statistic = new StatisticVO();
		statistic.setTotCnt(totCnt);
		statistic.setCreateDate("");
		if (resultCode == 200) {
			statistic.setIs_success(true);
		} else {
			statistic.setIs_success(false);
		}

		return statistic;
	}

	@GetMapping("statistic/{createDate}")
	@ResponseBody
	public StatisticVO getStatisticFromCreateDate(@PathVariable("createDate") String createDate,
			HttpServletResponse response) {

		int totCnt = statisticService.getStatisticFromCreateDate(createDate);
		int resultCode = response.getStatus();

		StatisticVO statistic = new StatisticVO();
		statistic.setTotCnt(totCnt);
		statistic.setCreateDate(createDate);

		if (resultCode == 200) {
			statistic.setIs_success(true);
		} else {
			statistic.setIs_success(false);
		}

		return statistic;
	}
	
	@GetMapping("statistic/{hr_organ}/{yearMonth}")
	@ResponseBody
	public DeptMonthlyStatisticVO getDeptMonthlyLogin(@PathVariable("hr_organ") String hr_organ, @PathVariable("yearMonth") String yearMonth, HttpServletResponse response) {
		
		HashMap<String, String> param = new HashMap<String, String>();
		
		param.put("hr_organ", hr_organ);
		param.put("yearMonth", yearMonth);
		
		int totCnt = statisticService.getDeptMonthlyLogin(param);
		int resultCode = response.getStatus();
		
		DeptMonthlyStatisticVO statistic = new DeptMonthlyStatisticVO();
		statistic.setTotCnt(totCnt);
		statistic.setYearMonth(yearMonth);
		statistic.setHr_organ(hr_organ);
		
		if(resultCode == 200) {
			statistic.setIs_success(true);
		}else {
			statistic.setIs_success(false);
		}
		
		return statistic;
	}
}
