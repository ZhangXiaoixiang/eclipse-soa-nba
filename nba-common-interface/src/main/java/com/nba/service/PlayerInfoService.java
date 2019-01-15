package com.nba.service;

import java.util.List;
import java.util.Map;

import com.nba.pojo.PlayerInfo;

/**
 * PlayerInfoService
 * 球员信息服务
 * @author 10905 2019/1/8
 * @version 1.0
 */

public interface PlayerInfoService {
	  List<PlayerInfo> getPlayerInfoByCondition(Map<String, Object> map);
}
