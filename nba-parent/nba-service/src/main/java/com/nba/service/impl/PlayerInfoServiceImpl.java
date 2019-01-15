package com.nba.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.alibaba.dubbo.config.annotation.Service;
import com.nba.playerinfo.mapper.PlayerInfoMpper;
import com.nba.pojo.PlayerInfo;
import com.nba.service.PlayerInfoService;
@Service//alibaba
public class PlayerInfoServiceImpl implements PlayerInfoService{
	//Service依赖Dao(MyBatis的Mapper)
	@Autowired
	@Qualifier("playerInfoMpper")
	private PlayerInfoMpper playerInfoMpper;

	@Override
	public List<PlayerInfo> getPlayerInfoByCondition(Map<String, Object> map) {
		System.out.println("---------------进入了PlayerInfoServiceImpl---------@Service是alibaba的注解----------------------");
		return playerInfoMpper.getPlayerInfoByCondition(map);
	}

}
