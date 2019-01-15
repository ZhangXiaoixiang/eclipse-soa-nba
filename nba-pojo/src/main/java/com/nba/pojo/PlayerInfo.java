package com.nba.pojo;



import java.io.Serializable;

/**
 * player_info
 * @author 
 */

public class PlayerInfo implements Serializable {
    /**
     * ID
     */
    private Integer id;

    /**
     * 球员编码
     */
    private Integer playerId;

    /**
     * 英文名称
     */
    private String nameEn;

    /**
     * 中文名称
     */
    private String nameCh;

    /**
     * 球队名称
     */
    private String teamId;

    /**
     * 球员角色
     */
    private String playerRole;

    /**
     * 身高
     */
    private String height;

    /**
     * 体重
     */
    private String weight;

    /**
     * 球龄
     */
    private Integer bollYear;

    /**
     * 球员国籍
     */
    private String nationality;

    /**
     * 球员场均数据
     */
    private Integer playerRecordId;


    public PlayerInfo() {
		super();
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Integer getPlayerId() {
		return playerId;
	}


	public void setPlayerId(Integer playerId) {
		this.playerId = playerId;
	}


	public String getNameEn() {
		return nameEn;
	}


	public void setNameEn(String nameEn) {
		this.nameEn = nameEn;
	}


	public String getNameCh() {
		return nameCh;
	}


	public void setNameCh(String nameCh) {
		this.nameCh = nameCh;
	}


	public String getTeamId() {
		return teamId;
	}


	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}


	public String getPlayerRole() {
		return playerRole;
	}


	public void setPlayerRole(String playerRole) {
		this.playerRole = playerRole;
	}


	public String getHeight() {
		return height;
	}


	public void setHeight(String height) {
		this.height = height;
	}


	public String getWeight() {
		return weight;
	}


	public void setWeight(String weight) {
		this.weight = weight;
	}


	public Integer getBollYear() {
		return bollYear;
	}


	public void setBollYear(Integer bollYear) {
		this.bollYear = bollYear;
	}


	public String getNationality() {
		return nationality;
	}


	public void setNationality(String nationality) {
		this.nationality = nationality;
	}


	public Integer getPlayerRecordId() {
		return playerRecordId;
	}


	public void setPlayerRecordId(Integer playerRecordId) {
		this.playerRecordId = playerRecordId;
	}


	public PlayerInfo(Integer playerId, String nameEn, String nameCh, String teamId, String playerRole, String height, String weight, Integer bollYear, String nationality, Integer playerRecordId) {
        this.playerId = playerId;
        this.nameEn = nameEn;
        this.nameCh = nameCh;
        this.teamId = teamId;
        this.playerRole = playerRole;
        this.height = height;
        this.weight = weight;
        this.bollYear = bollYear;
        this.nationality = nationality;
        this.playerRecordId = playerRecordId;
    }


	public PlayerInfo(Integer id, Integer playerId, String nameEn, String nameCh, String teamId, String playerRole,
			String height, String weight, Integer bollYear, String nationality, Integer playerRecordId) {
		super();
		this.id = id;
		this.playerId = playerId;
		this.nameEn = nameEn;
		this.nameCh = nameCh;
		this.teamId = teamId;
		this.playerRole = playerRole;
		this.height = height;
		this.weight = weight;
		this.bollYear = bollYear;
		this.nationality = nationality;
		this.playerRecordId = playerRecordId;
	}


	@Override
	public String toString() {
		return "PlayerInfo [id=" + id + ", playerId=" + playerId + ", nameEn=" + nameEn + ", nameCh=" + nameCh
				+ ", teamId=" + teamId + ", playerRole=" + playerRole + ", height=" + height + ", weight=" + weight
				+ ", bollYear=" + bollYear + ", nationality=" + nationality + ", playerRecordId=" + playerRecordId
				+ "]";
	}
	
}