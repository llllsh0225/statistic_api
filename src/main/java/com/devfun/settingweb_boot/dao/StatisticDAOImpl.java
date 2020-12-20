package com.devfun.settingweb_boot.dao;

import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StatisticDAOImpl implements StatisticDAO {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public int sqlyearStatistic(String year) {
		System.out.println(sqlSession.toString());
		int totCnt = sqlSession.selectOne("com.devfun.settingweb_boot.dao.StatisticDAO.sqlyearStatistic", year);
		
		System.out.println(totCnt);
		return totCnt;
	}

	@Override
	public int getStatisticFromCreateDate(String createDate) {
		int totCnt = sqlSession.selectOne("com.devfun.settingweb_boot.dao.StatisticDAO.getStatisticFromCreateDate", createDate);
		
		return totCnt;
	}

	@Override
	public int getAverageLogin() {
		int totCnt = sqlSession.selectOne("com.devfun.settingweb_boot.dao.StatisticDAO.getAverageLogin");
		return totCnt;
	}

	@Override
	public int getDeptMonthlyLogin(HashMap<String, String> param) {
		int totCnt = sqlSession.selectOne("com.devfun.settingweb_boot.dao.StatisticDAO.getDeptMonthlyLogin", param);
		return totCnt;
	}

}
