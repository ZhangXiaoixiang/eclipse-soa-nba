package com.nba.palyerinfo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.config.annotation.Reference;
import com.nba.pojo.PlayerInfo;
import com.nba.service.PlayerInfoService;
@Controller
@RequestMapping("controller")
public class PlayerInfoController {
	@Reference //AutoWire
	PlayerInfoService playerInfoService;
	private Map<String, Object> map;
	@ResponseBody
	@RequestMapping( value="getAll",produces = "application/json; charset=utf-8")//解决SpringMvc响应的乱码
	public String getAll() {
		Map<String, Object> map=new HashMap<>();
		List<PlayerInfo> playerInfoByCondition = playerInfoService.getPlayerInfoByCondition(map);
		PlayerInfo	playerInfo = playerInfoByCondition.get(1);
		System.out.println("json---------------"+playerInfo.getNameCh());
		
		return "后端返回字符串:  "+playerInfo.getNameCh();//返回json
		
	}

	@RequestMapping("getAll2")
	public Object getAll2(Model model) {
		Map<String, Object> map=new HashMap<>();
		List<PlayerInfo> playerInfoByCondition = playerInfoService.getPlayerInfoByCondition(map);
		PlayerInfo	playerInfo = playerInfoByCondition.get(1);
		System.out.println("-----------jsp-------"+playerInfo.getNameCh());
		model.addAttribute("playerInfo", playerInfo);
		return "success";//JSP页面显示model
		
	}

}
