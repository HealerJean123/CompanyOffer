package com.hlj.util;

import java.io.UnsupportedEncodingException;

import org.apache.commons.codec.binary.Base64;


/** 
 * @author 作者 HealerJean
 * @version 创建时间：2017年10月13日 下午1:50:50 
 * 类说明 
 */
public class Base64Util {


	 public static void main(String[] args){
		
		 String str = "MjAxNzA5MTAxNzQ0MDAgICAgICAgICAgICAgICAgMjAyNjAwMDAwMDAyMDAwMDAwMDAwMDAwMDMwNzIwMDAwMDAwMDAwMDAwMDAwMDAwMDAwMDAwMDAwMDAzMDcyUzY1VDEwDQogICAgICAgICAgICAgICAgICAgICAgNjIwODk5MjcgICAgICAgICAgICAgICAgICAgICAgICAgICAyMjEyMDE3MDggICAgICAgICAgICA2MjA4OTkyNzY1MDEwMjE5NjQxMDE5MTY0NDAxICA2NTAxMDIxOTY0MTAxOTE2NDQgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAg55Kn5Z6r5Y+OMTAyICAgICAgICAgICAxICAgICAgICAgICAgICAgICAgICAgNDM2NzQyNDU0MDAxNjk2MDY0NSAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICDnkqflnqvlj44wMDAwMDAwMDAwMDAwMDU0NDAwMDAwMDAwMDAwMDAwMDAwMDAwMDAwMDAwMDAwMDA1NDQxMiAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgIA0KICAgICAgICAgICAgICAgICAgICAgIDYyMDg5OTM4ICAgICAgICAgICAgICAgICAgICAgICAgICAgMjIxMjAxNzA4ICAgICAgICAgICAgNjIwODk5Mzg2NTAxMDIxOTYzMDIwNzAwMjgwMSAgNjUwMTAyMTk2MzAyMDcwMDI4ICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgIOmPieW6o+Wtqee8iO+/vTAyICAgICAgICAgICAxICAgICAgICAgICAgICAgICAgICAgNjIyNzAwNDU0MDMwNzIzOTA4MSAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICDpj4nluqPlrannvIjvv70wMDAwMDAwMDAwMDAyNTI4MDAwMDAwMDAwMDAwMDAwMDAwMDAwMDAwMDAwMDAwMjUyODEyICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgDQo=+OMTAyICAgICAgICAgICAxICAgICAgICAgICAgICAgICAgICAgNDM2NzQyNDU0MDAxNjk2MDY0NSAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICDnkqflnqvlj44wMDAwMDAwMDAwMDAwMDU0NDAwMDAwMDAwMDAwMDAwMDAwMDAwMDAwMDAwMDAwMDA1NDQxMiAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgIA0KICAgICAgICAgICAgICAgICAgICAgIDYyMDg5OTM4ICAgICAgICAgICAgICAgICAgICAgICAgICAgMjIxMjAxNzA4ICAgICAgICAgICAgNjIwODk5Mzg2NTAxMDIxOTYzMDIwNzAwMjgwMSAgNjUwMTAyMTk2MzAyMDcwMDI4ICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgIOmPieW6o+Wtqee8iO+/vTAyICAgICAgICAgICAxICAgICAgICAgICAgICAgICAgICAgNjIyNzAwNDU0MDMwNzIzOTA4MSAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICDpj4nluqPlrannvIjvv70wMDAwMDAwMDAwMDAyNTI4MDAwMDAwMDAwMDAwMDAwMDAwMDAwMDAwMDAwMDAwMjUyODEyICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgDQo=+MS4wLjA8L3ZlcnNpb24+DQogIDxzZW5kY29kZT5TNjU8L3NlbmRjb2RlPg0KICA8cmVjZWl2ZWNvZGU+VDEwPC9yZWNlaXZlY29kZT4NCiAgPHNlbmRlcm5hbWUvPg0KICA8cmVjZWl2ZXJuYW1lLz4NCiAgPHNlbmRkYXRlPjIwMTcxMDExPC9zZW5kZGF0ZT4NCiAgPHNlbmR0aW1lPjAyNTQ0ODwvc2VuZHRpbWU+DQogIDxkYXRhc2V0dHlwZT4NCiAgICA8dHlwZWNvZGU+MTIwNTwvdHlwZWNvZGU+DQogICAgPHR5cGVuYW1lLz4NCiAgPC9kYXRhc2V0dHlwZT4NCiAgPGFwcGNvZGU+OTk5OTwvYXBwY29kZT4NCiAgPGFwcG1zZz7mnKzmibnmrKHlvoXpgYfmlK/ku5jmibnmrKHlj7flt7Lnu4/nlJ/miJDov4flvoXpgYfmlK/ku5jku7vliqHvvIE8L2FwcG1zZz4NCiAgPHBlbnNpb25pbmZvPg0KICAJPGFwcHNlcmlvbm8+MjAxNzc3Nzc3NzcyMjIyPC9hcHBzZXJpb25vPg0KICAJIDxhcHBjb2RlPjk5OTk8L2FwcGNvZGU+DQogCSA8YXBwbXNnPuacrOaJueasoeW+hemBh+aUr+S7mOaJueasoeWPt+W3sue7j+eUn+aIkOi/h+W+hemBh+aUr+S7mOS7u+WKoe+8gTwvYXBwbXNnPg0KICAgIDxmaWxlbmFtZT5SU1M2NVRvU1RUMTBfTkpGMDEwMDFfMjAxNzA5MTBfMjAyNi50eHQ8L2ZpbGVuYW1lPg0KCTxmaWxlc2lnbj5iSHBxYnZaV2UrQ2NXdEpoM0ZzcXhHUWJuZEFaSUFFRGpVVll4UXZOaTJlbzgrL0NxZzNaVDRPQVU5TnVQTXVPanBoUE9CWXZvckZ2TWhQeEhDeWtjRHhMVWgyQUY5VExXcVRQUm1ZSnh0WndSM2JQMHBnMWtpYWoxVVF0UVNtZlpEalRGV0JLdmVhYTRuQ0JLcDI4c1luOUxrT1J6Vk1IMDdEOWRUcndUMGs9PC9maWxlc2lnbj4gCQ0KICA8L3BlbnNpb25pbmZvPg0KPC9wZW5zaW9uZGF0YT4gDQoNCg==";
		
		 System.out.println(Base64Util.decode(str));

		}
	 
  
    /** 
     * 加码
     * 
     * @param bytes 
     * @return 
     * @throws Exception 
     */  
    public static String encode(final  String str) { 
    	byte[] bytes;
		try {
			bytes = str.getBytes("utf-8");
        return new String(Base64.encodeBase64(bytes)); 
		} catch (UnsupportedEncodingException e) {
			// 
			e.printStackTrace();
		}
		return null;
    } 
    
	/** 解码
     * @param bytes 
     * @return 
     */  
    public static String decode(final String str) {
    	byte[] bytes;
		try { 
			bytes = str.getBytes("utf-8");
	        return new String(Base64.decodeBase64(bytes),"utf-8");  

		} catch (UnsupportedEncodingException e) {
			// 
			e.printStackTrace();
		}
		return null;
    }  
}
