package com.hlj.designpatterns.AbstractFactory;
/** 
 * @author 作者 HealerJean
 * @version 创建时间：2017年9月26日 上午9:01:43 
 * 类说明  抽象工厂模式
 */
public class SmsSender implements Sender {  
	  
    @Override  
    public void Send() {  
        System.out.println("this is sms sender!");  
    }  
}