package com.hlj.designpatterns.FactoryMethod.manyMethod;
/** 
 * @author ���� HealerJean
 * @version ����ʱ�䣺2017��9��26�� ����9:01:43 
 * ��˵��  ��������ģʽ �����������ģʽ
 */
public class SmsSender implements Sender {  
	  
    @Override  
    public void Send() {  
        System.out.println("this is sms sender!");  
    }  
}