import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.qs.common.util.ContextUtil;
import com.qs.common.util.HttpClientUtil;
import com.qs.common.util.crypto.Base64Util;
import com.qs.sync.model.SyncTableCss;
import com.qs.sync.sender.SendDataFacade;

import net.sf.json.JSONArray;


/*
 * 文件名：Test2.java	 
 * 时     间：下午9:52:26
 * 作     者：wangzhen      
 * 版     权：2014-2022  牵手互动, 公司保留所有权利.
 * 
 */
/** 
 * @ClassName: Test2 
 * @描述: (这里用一句话描述这个类的作用) 
 * @author qs
 * @date 2017年5月24日 下午9:52:26 
 */
public class Test2
{
	
	public static void main(String[] args) throws ParseException
	{
		/*Date stime = new SimpleDateFormat("yyyy-MM").parse("2014-6");// 定义起始日期
		Date etime = new SimpleDateFormat("yyyy-MM").parse("2016-5");// 定义结束日期
		Calendar cd = Calendar.getInstance();// 定义日期实例
		cd.setTime(stime);// 设置日期起始时间
		while (cd.getTime().before(etime))
		{// 判断是否到结束日期
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
			String str = sdf.format(cd.getTime());
			System.out.println(str);// 输出日期结果
			cd.add(Calendar.MONTH, 1);// 进行当前日期月份加1
		}*/

		/*List list = new ArrayList();
		list.add(1);
		list.add(2);
		list = list.subList(1,2);
		System.out.print(list);*/

		/*int date =  DateUtil.convertToInt("2017-11-23 11:37:26");
		System.out.print(date);*/

		//String params = "appId=1&list=W3siaXNEZWZhdWx0IjowLCJvcHRpb25UeXBlIjoiNXFHTTViaUQiLCJvcHRpb25JdGVtIjoiNWJDUDU2YVA1cU9WIn0seyJpc0RlZmF1bHQiOjAsIm9wdGlvblR5cGUiOiI2Syt0NktpQTU3Rzc1WjZMIiwib3B0aW9uSXRlbSI6IjVwbXU2WUNhNXBhNTZLaUEifSx7ImlzRGVmYXVsdCI6MCwib3B0aW9uVHlwZSI6IjVhMlg1NG1NNTdHNzVaNkwiLCJvcHRpb25JdGVtIjoiTXc9PSJ9LHsiaXNEZWZhdWx0IjoxLCJvcHRpb25UeXBlIjoiNWIrcjZZQ2Y1WkNENTRtTSIsIm9wdGlvbkl0ZW0iOiI1cGl2In1d&logType=8&mid=54760&playId=8&playName=5rC45bee5omv6IOh5a2Q&sign=91AF1CDB047BE2909677A427EEAA2826&signCode=1511519761";
		String params = "appId=1&list=W3siaXNEZWZhdWx0IjowLCJvcHRpb25UeXBlIjoiNXFHTTViaUQiLCJvcHRpb25JdGVtIjoiNWFLbzU3dVwvIn0seyJpc0RlZmF1bHQiOjAsIm9wdGlvblR5cGUiOiI2Syt0NktpQTU3Rzc1WjZMIiwib3B0aW9uSXRlbSI6IjVweXM1Wnl3NXBhNTZLaUEifSx7ImlzRGVmYXVsdCI6MCwib3B0aW9uVHlwZSI6IjVhMlg1NG1NNTdHNzVaNkwiLCJvcHRpb25JdGVtIjoiTWc9PSJ9LHsiaXNEZWZhdWx0IjoxLCJvcHRpb25UeXBlIjoiNWIrcjZZQ2Y1WkNENTRtTSIsIm9wdGlvbkl0ZW0iOiI1cGl2In1d&logType=8&mid=103563&playId=10&playName=6YO05bee5a2X54mM&sign=4821253394D916A9B74B7D94D46DF884&signCode=1511775571";

		/*StringBuilder paramAppend = new StringBuilder();
		if(param != null){
			String[] strs = param.split("&");
			for(String s :strs){
				if(s.startsWith("list")){
					s = Base64Util.decode(s.substring(5));
					s = "list="+s;
				}
				paramAppend.append(s).append(",");
			}
			param = paramAppend.toString();
			param = param.substring(0,param.lastIndexOf(","));
			param = param.replace("=",":");
		}*/

		/*Map map = new HashMap<String,Object>();
		String paramAppend = "";
		if(param != null){
			String[] strs = param.split("&");
			for(String s :strs){
				if(s.startsWith("list")){
					s = Base64Util.decode(s.substring(5));
					paramAppend = "{list:"+s+"}";
				}else {
					String[] strs2 = s.split("=");
					map.put(strs2[0], strs2[1]);
				}
			}

		}
		SyncTableCss sr = JSON.parseObject(paramAppend,SyncTableCss.class);
		SyncTableCss sr2 = JSON.parseObject(JSON.toJSONString(map),SyncTableCss.class);
		sr2.setList(sr.getList());
		System.out.print(sr2);*/
		
		
		
		
		Map map = new HashMap<String,Object>();
		String paramAppend = "";
		//params = params.replace(" ", "+");
		if(params != null){
			String[] strs = params.split("&");
			for(String s :strs){
				if(s.startsWith("list")){
					s = Base64Util.decode(s.substring(5));
					s = s.substring(0, s.lastIndexOf("]")+1);
					List<Object> obj = JSON.parseArray(s);
					List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
					for(Object m:obj){
						Map mp = new HashMap();
						//Integer isDefault = Integer.valueOf(m.get("isDefault")+"");
						String optionType = Base64Util.decode((String)((JSONObject) m).get("optionType"));
						String optionItem = Base64Util.decode((String)((JSONObject) m).get("optionItem"));
						mp.put("optionType", optionType);
						mp.put("optionItem", optionItem);
						mp.put("isDefault", ((JSONObject) m).get("isDefault"));
						list.add(mp);
					}
					paramAppend = "{list:"+JSON.toJSONString(list)+"}";
				}else if(s.startsWith("playName")){
					s = Base64Util.decode(s.substring(9));
					map.put("playName", s);
				}else{
					String[] strs2 = s.split("=");
					map.put(strs2[0], strs2[1]);
				}
			}

		}
		SyncTableCss sr = JSON.parseObject(paramAppend,SyncTableCss.class);
		SyncTableCss sr2 = JSON.parseObject(JSON.toJSONString(map),SyncTableCss.class);
		sr2.setList(sr.getList());
		
		//http://datacenter.longzupoker.com:8888/datacenter/dataCenter/dataCenterLogDispatchLua.html
		//http://192.168.1.92:8080/sync-producer/dataCenter/dataCenterLogDispatchLua.html
		
		
		//String res = HttpClientUtil.httpClientByPost("http://datacenter.longzupoker.com:8888/datacenter/dataCenter/dataCenterLogDispatchLua.html",map);





	}
	
}
