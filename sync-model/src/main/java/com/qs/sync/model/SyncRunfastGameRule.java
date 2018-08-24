package com.qs.sync.model;

import java.util.Date;

/**
 * C++调用接口，主要处理跑得快的游戏名堂
 * @author zhengshengfei
 *
 */
public class SyncRunfastGameRule extends SyncObject {
	private Integer id;				//id
	private Integer appId;			//游戏id
	private Date createTime;		//创建时间
	private String playId;			//玩法id
	private String playName;		//玩法名字
	private String roomId;
	private Integer player1Bomb1;	//玩家1的炸弹出现1次
	private Integer player1Bomb2;	//玩家1的炸弹出现2次
	private Integer player1Bomb3;	//玩家1的炸弹出现2次以上
	private Integer player1Spring;	//玩家1的春天出现
	private Integer player2Bomb1;
	private Integer player2Bomb2;
	private Integer player2Bomb3;
	private Integer player2Spring;
	private Integer player3Bomb1;
	private Integer player3Bomb2;
	private Integer player3Bomb3;
	private Integer player3Spring;
	private String ext1;			//扩展字段1
	private String ext2;			//扩展字段2
	private String ext3;			//扩展字段3
	
	public Integer getId()
	{
		return id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public Integer getAppId()
	{
		return appId;
	}

	public void setAppId(Integer appId)
	{
		this.appId = appId;
	}

	public Date getCreateTime()
	{
		return createTime;
	}

	public void setCreateTime(Date createTime)
	{
		this.createTime = new Date();
	}

	public String getPlayId()
	{
		return playId;
	}

	public void setPlayId(String playId)
	{
		this.playId = playId;
	}

	public String getPlayName()
	{
		return playName;
	}

	public void setPlayName(String playName)
	{
		this.playName = playName;
	}

	public String getRoomId()
	{
		return roomId;
	}

	public void setRoomId(String roomId)
	{
		this.roomId = roomId;
	}

	public Integer getPlayer1Bomb1()
	{
		return player1Bomb1;
	}

	public void setPlayer1Bomb1(Integer player1Bomb1)
	{
		this.player1Bomb1 = player1Bomb1;
	}

	public Integer getPlayer1Bomb2()
	{
		return player1Bomb2;
	}

	public void setPlayer1Bomb2(Integer player1Bomb2)
	{
		this.player1Bomb2 = player1Bomb2;
	}

	public Integer getPlayer1Bomb3()
	{
		return player1Bomb3;
	}

	public void setPlayer1Bomb3(Integer player1Bomb3)
	{
		this.player1Bomb3 = player1Bomb3;
	}

	public Integer getPlayer1Spring()
	{
		return player1Spring;
	}

	public void setPlayer1Spring(Integer player1Spring)
	{
		this.player1Spring = player1Spring;
	}

	public Integer getPlayer2Bomb1()
	{
		return player2Bomb1;
	}

	public void setPlayer2Bomb1(Integer player2Bomb1)
	{
		this.player2Bomb1 = player2Bomb1;
	}

	public Integer getPlayer2Bomb2()
	{
		return player2Bomb2;
	}

	public void setPlayer2Bomb2(Integer player2Bomb2)
	{
		this.player2Bomb2 = player2Bomb2;
	}

	public Integer getPlayer2Bomb3()
	{
		return player2Bomb3;
	}

	public void setPlayer2Bomb3(Integer player2Bomb3)
	{
		this.player2Bomb3 = player2Bomb3;
	}

	public Integer getPlayer2Spring()
	{
		return player2Spring;
	}

	public void setPlayer2Spring(Integer player2Spring)
	{
		this.player2Spring = player2Spring;
	}

	public Integer getPlayer3Bomb1()
	{
		return player3Bomb1;
	}

	public void setPlayer3Bomb1(Integer player3Bomb1)
	{
		this.player3Bomb1 = player3Bomb1;
	}

	public Integer getPlayer3Bomb2()
	{
		return player3Bomb2;
	}

	public void setPlayer3Bomb2(Integer player3Bomb2)
	{
		this.player3Bomb2 = player3Bomb2;
	}

	public Integer getPlayer3Bomb3()
	{
		return player3Bomb3;
	}

	public void setPlayer3Bomb3(Integer player3Bomb3)
	{
		this.player3Bomb3 = player3Bomb3;
	}

	public Integer getPlayer3Spring()
	{
		return player3Spring;
	}

	public void setPlayer3Spring(Integer player3Spring)
	{
		this.player3Spring = player3Spring;
	}

	public String getExt1()
	{
		return ext1;
	}

	public void setExt1(String ext1)
	{
		this.ext1 = ext1;
	}

	public String getExt2()
	{
		return ext2;
	}

	public void setExt2(String ext2)
	{
		this.ext2 = ext2;
	}

	public String getExt3()
	{
		return ext3;
	}

	public void setExt3(String ext3)
	{
		this.ext3 = ext3;
	}

	@Override
	public String toString()
	{
		return "SyncRunfastGameRule [id=" + id + ", appId=" + appId
				+ ", createTime=" + createTime + ", playId=" + playId
				+ ", playName=" + playName + ", roomId=" + roomId
				+ ", player1Bomb1=" + player1Bomb1 + ", player1Bomb2="
				+ player1Bomb2 + ", player1Bomb3=" + player1Bomb3
				+ ", player1Spring=" + player1Spring + ", player2Bomb1="
				+ player2Bomb1 + ", player2Bomb2=" + player2Bomb2
				+ ", player2Bomb3=" + player2Bomb3 + ", player2Spring="
				+ player2Spring + ", player3Bomb1=" + player3Bomb1
				+ ", player3Bomb2=" + player3Bomb2 + ", player3Bomb3="
				+ player3Bomb3 + ", player3Spring=" + player3Spring + ", ext1="
				+ ext1 + ", ext2=" + ext2 + ", ext3=" + ext3 + "]";
	}

	
}
