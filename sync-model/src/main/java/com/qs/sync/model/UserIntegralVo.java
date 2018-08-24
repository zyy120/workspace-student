package com.qs.sync.model;

import java.util.List;

public class UserIntegralVo extends SyncObject {
   private  List<UserIntegral> userIntegralList;

public List<UserIntegral> getUserIntegralList()
{
	return userIntegralList;
}

public void setUserIntegralList(List<UserIntegral> userIntegralList)
{
	this.userIntegralList = userIntegralList;
}

@Override
public String toString()
{
	return "UserIntegralVo [userIntegralList=" + userIntegralList + "]";
}



   
}