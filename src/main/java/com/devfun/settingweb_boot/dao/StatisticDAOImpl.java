package com.devfun.settingweb_boot.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.devfun.settingweb_boot.vo.YearStatisticVO;

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

}
