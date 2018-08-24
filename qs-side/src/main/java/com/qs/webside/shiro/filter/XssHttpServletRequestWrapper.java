/*
 * 文件名：XssHttpServletRequestWrapper.java	 
 * 时     间：上午9:02:13
 * 作     者：QS       
 * 版     权：2014-2022  牵手互动, 公司保留所有权利.
 * 
 */
package com.qs.webside.shiro.filter;

import java.util.regex.Pattern;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

import org.apache.commons.lang3.StringUtils;

/** 
 * @ClassName: XssHttpServletRequestWrapper 
 * @描述: (这里用一句话描述这个类的作用) 
 * @author QS
 * @date 2018年5月3日 上午9:02:13 
 */
/**
 * xss请求适配器
 */
public class XssHttpServletRequestWrapper extends HttpServletRequestWrapper {

    public XssHttpServletRequestWrapper(HttpServletRequest request) {
        super(request);
    }

    /**
     * 对数组参数进行特殊字符过滤
     */
    @Override
    public String[] getParameterValues(String name) {
        String[] values = super.getParameterValues(name);
        if (values == null) {
            return null;
        }
        int count = values.length;
        String[] encodedValues = new String[count];
        for (int i = 0; i < count; i++) {
            String xssVaule= cleanXSS(values[i]);
            //rememberMe直接置成true或者false
           xssVaule = rememberMeXss(name, xssVaule);
            
            encodedValues[i]=xssVaule;
        }
        return encodedValues;
    }

	private String rememberMeXss(String name, String xssVaule)
	{
		if("rememberMe".equals(name)){
        	   if(!StringUtils.isBlank(xssVaule)){
        		   if(xssVaule.startsWith("true")){
        			   if(xssVaule.length()>4){
        				   xssVaule="true";
        			   }
        			   
        		   } else if(xssVaule.startsWith("false")){
        			   if(xssVaule.length()>5){
        				   xssVaule="false";
        			   }
        			   
        		   }else if(!xssVaule.equals("false")&&!xssVaule.equals("true")){
        			   xssVaule="false";
        		   }
        	   }
           }
		return xssVaule;
	}

    /**
     * 对参数中特殊字符进行过滤
     */
    @Override
    public String getParameter(String name) {
        String value = super.getParameter(name);
        if (value == null) {
            return null;
        }
        return cleanXSS(value);
    }

    /**
     * 获取attribute,特殊字符过滤
     */
    @Override
    public Object getAttribute(String name) {
        Object value = super.getAttribute(name);
        if (value != null && value instanceof String) {
            cleanXSS((String) value);
        }
        return value;
    }

    /**
     * 对请求头部进行特殊字符过滤
     */
    @Override
    public String getHeader(String name) {
        String value = super.getHeader(name);
        if (value == null) {
            return null;
        }
        return cleanXSS(value);
    }

    /**
     * 转义字符,使用该方法存在一定的弊端
     * 
     * @param value
     * @return
     */
    private String cleanXSS2(String value) {
        // 移除特殊标签
        value = value.replaceAll("<", "&lt;").replaceAll(">", "&gt;");
        value = value.replaceAll("\\(", "&#40;").replaceAll("\\)", "&#41;");
        value = value.replaceAll("'", "&#39;");
        value = value.replaceAll("eval\\((.*)\\)", "");
        value = value.replaceAll("[\\\"\\\'][\\s]*javascript:(.*)[\\\"\\\']", "\"\"");
        value = value.replaceAll("script", "");
        return value;
    }

    private String cleanXSS(String value) {
        if (value != null) {
            //推荐使用ESAPI库来避免脚本攻击,value = ESAPI.encoder().canonicalize(value);
            // 避免空字符串
            //value = value.replaceAll(" ", "");
        	  // 避免script 标签
            Pattern wlhurcPattern = Pattern.compile("<wlhurc>(.*?)</wlhurc>", Pattern.CASE_INSENSITIVE);
            value = wlhurcPattern.matcher(value).replaceAll("");
            
            // 避免script 标签
            Pattern scriptPattern = Pattern.compile("<script>(.*?)</script>", Pattern.CASE_INSENSITIVE);
            value = scriptPattern.matcher(value).replaceAll("");
            // 避免src形式的表达式
            scriptPattern = Pattern.compile("src[\r\n]*=[\r\n]*\\\'(.*?)\\\'",
                    Pattern.CASE_INSENSITIVE | Pattern.MULTILINE | Pattern.DOTALL);
            value = scriptPattern.matcher(value).replaceAll("");
            scriptPattern = Pattern.compile("src[\r\n]*=[\r\n]*\\\"(.*?)\\\"",
                    Pattern.CASE_INSENSITIVE | Pattern.MULTILINE | Pattern.DOTALL);
            value = scriptPattern.matcher(value).replaceAll("");
            // 删除单个的 </script> 标签
            scriptPattern = Pattern.compile("</script>", Pattern.CASE_INSENSITIVE);
            value = scriptPattern.matcher(value).replaceAll("");
            // 删除单个的<script ...> 标签
            scriptPattern = Pattern.compile("<script(.*?)>",
                    Pattern.CASE_INSENSITIVE | Pattern.MULTILINE | Pattern.DOTALL);
            value = scriptPattern.matcher(value).replaceAll("");
            // 避免 eval(...) 形式表达式
            scriptPattern = Pattern.compile("eval\\((.*?)\\)",
                    Pattern.CASE_INSENSITIVE | Pattern.MULTILINE | Pattern.DOTALL);
            value = scriptPattern.matcher(value).replaceAll("");
            // 避免 e­xpression(...) 表达式
            scriptPattern = Pattern.compile("e­xpression\\((.*?)\\)",
                    Pattern.CASE_INSENSITIVE | Pattern.MULTILINE | Pattern.DOTALL);
            value = scriptPattern.matcher(value).replaceAll("");
            // 避免 javascript: 表达式
            scriptPattern = Pattern.compile("javascript:", Pattern.CASE_INSENSITIVE);
            value = scriptPattern.matcher(value).replaceAll("");
            // 避免 vbscript:表达式
            scriptPattern = Pattern.compile("vbscript:", Pattern.CASE_INSENSITIVE);
            value = scriptPattern.matcher(value).replaceAll("");
            // 避免 onload= 表达式
            scriptPattern = Pattern.compile("onload(.*?)=",
                    Pattern.CASE_INSENSITIVE | Pattern.MULTILINE | Pattern.DOTALL);
            value = scriptPattern.matcher(value).replaceAll("");
        }
        return value;
    }

}