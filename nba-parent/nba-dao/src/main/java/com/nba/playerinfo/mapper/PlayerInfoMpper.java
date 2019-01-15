package com.nba.playerinfo.mapper;

import java.util.List;
import java.util.Map;

import com.nba.pojo.PlayerInfo;

/**
 * PlayerInfoDao 数据库层访问接口
 * 
 * @author 10905 2019/1/8
 * @version 1.0
 */

public interface PlayerInfoMpper {

	List<PlayerInfo> getPlayerInfoByCondition(Map<String, Object> map);

}
