package com.hlj.file;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

public class FileTest {
	
	/**
	 * 6��
	 */
	static int i = 1; //���ڱ���ͳ�Ƽ�¼�ĸ���

	
	public static void main(String[] args) throws Exception {
		/**
		 * 1����֪·������ ����ļ�  ǰ�ᣬ�������·��	��û��·���ᱨ��
		*/
		//	createFile();
				
		/**
		 * 1.2�������и���Ŀ¼���ļ�
		 * 
		 */
		//	createHavaDirectoryFile();
			
		/**	
		* 2���ж��ǲ����ļ�����Ŀ¼	
		* ��������ļ���Ŀ¼�����ڣ�Ҳ���ᱨ��
		*/	
	    //	File directoryName	  = new File("D:/test/healerjean/txt.txt");
		//	judgeFileOrDirectory(directoryName);
		
		/**
		 * 3��
		 * �ж��ǲ���Ŀ¼
		 * ����Ŀ¼����ʹ·�������ڣ�Ҳ�ᴴ�����·������Ϊ��mkdirs
		 */
		//	 createDirectory();

		
		/**
		 * 4�������ļ�
		 * ��һ���ļ��Լ�·��������ڣ� ����fileInputStream�ᱨ��
		 * �ڶ����ļ����Բ�����,����·��������ڣ����·����������FileOutSteam�ᱨ��
		 */
		// copyFile("D:/test/healerjean/file.txt","D:/test/copyFile/file2.txt");
		
		/**
		 * 5��ɾ��Ŀ¼
		 * 
		 */
        //	File file	  = new File("C:/Users/qdkf/Desktop/��Ŀ/��ʡ�籣����/ceshi");
        //	delteFiles(file);
		
		/**
		 * 6 ��Ŀ¼�¶�ȡ�ļ����ݽ���ƥ��
		 * 
		 */
		//	File file  = new File("C:\\Users\\qdkf\\Desktop\\��Ŀ\\��ʡ�籣����\\���ݰ�\\���ݰ�\\�����籣--�����������ݰ�");
		//	getFileValue(file,"datasettype");
		
		
		/**
		 * 7����ȡtxt�ļ�����
		 * 
		 */
		//	String filePath = "D:\\test\\20170904\\9108_REQ_XML_T0120170904006463.xml";
		//	getFileTextValue(filePath);
			
		/**
		 * 8��������,һ��һ�ж�ȡ����	
		 */
	   //	String filePath = "C:/Users/qdkf/Desktop/��Ŀ/����/STS01ToRST01_NJF01001_20170904_2017090465853776438363389189.txt";
	   //	getFileReadLineTextValue(filePath);
	
	   /**
	    * 9�������ַ�����������
	    * ֻҪ�޸�code  city testType typecChoice  directChoice 
	    */
		String textContext = XmlTestContet.xinJiangZzqNew0102StToRsEnd;
		String code = "0102-";             //�޸�λ�� 1 
		String city = "�½��������°�-";           //�޸�λ��  2
		
		String testType = "ͨ�ý��ײ�ѯ".trim();          //�޸�λ��  3 
		
		String typeOne = "���ͱ���-";
    	String typeTwo = "��Ӧ����-";
		int typecChoice = 0; //1���ͱ���                         //�޸�λ�� 4
		String typecChoiceFinal = null;
		if(typecChoice==1){                    
			typecChoiceFinal = typeOne;
		}else{
			typecChoiceFinal = typeTwo;
		}
		
		String directRS = "�����˷�������-";
		String directST = "�����˷�������-";
		int directChoice = 0; //1 �����˷�������             //�޸�λ�� 5
		String directChoiceFinal = null;
		if(directChoice==1){
			directChoiceFinal = directRS;
		}else {
			directChoiceFinal = directST;
		}
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd-HHmmss");
		String ds =simpleDateFormat.format(new Date());
		String fileName = city+typecChoiceFinal+code+ds+".xml";
		
		//���� 
		String path = "D:/txtDirectory/"+city+"/"+testType+"/"+code+directChoiceFinal+"/"+typecChoiceFinal;
		getTxtByTextContent(textContext,fileName,path);	
	
	}
	
	




	/**
	 * 1��
	 * ��֪·������ ����ļ�  
	 * ǰ�ᣬ�������·��,���򴴽��ļ��ᱨ��	
	 * @throws IOException 
	 */
	private static void createFile() throws IOException {
		
			File fileNameTxt = new File("D:/test/healerjean/file.txt");
			
			if(!fileNameTxt.exists()){
				fileNameTxt.createNewFile();
			}
			System.out.println("���Գɹ�");
	}
	
	

	/**
	 * 1.2��������Ŀ¼���ļ�
	 * 
	 */
	private static void createHavaDirectoryFile() throws IOException {
		File directoryName = new File("D:/test/healerjean/file");  

//ͨ������Ŀ¼�����ļ�   a1 �Ǹ��� (ֻҪ��֮ǰ�ĸ������϶��ǿ��Ե�)
		File directoryNameTxt = new File(directoryName,"directoryName.txt");
		
		if(!directoryNameTxt.exists()){
			directoryNameTxt.createNewFile();
		}
		System.out.println("������Ŀ¼���ļ��ɹ�");
	}
	
	/**	
	 * 2��
	 * �ж��ǲ����ļ�����Ŀ¼	
	 * ͬʱҲ���ᱨ��
	 */
	private static void judgeFileOrDirectory(File path) {
		
				System.out.println("���Կ�ʼ");
				if(path.isFile()){
					System.out.println(path.getPath()+"��һ���ļ�");
				}
				else if(path.isDirectory()){
					System.out.println(path.getPath()+"��һ��Ŀ¼");
				}else {
					System.out.println(path.getPath()+"�����ļ�Ҳ����Ŀ¼");

				}
	}
	
	
	

	/**
	 * 3��
	 * �ж��ǲ���Ŀ¼
	 * ����Ŀ¼����ʹ·�������ڣ�Ҳ�ᴴ�����·������Ϊ��mkdirs
	 */
	private static void createDirectory() {
		//����Ŀ¼
				File directoryName = new File("D:/test/healerjean/file");  
				
				if(!directoryName.exists()){
					directoryName.mkdirs();
					System.out.println(directoryName.getPath()+"����Ŀ¼�ɹ�"); 
				}
		
	}
	
	
	/**
	 * 4�������ļ�
	 * ��һ���ļ��Լ�·��������ڣ� ����fileInputStream�ᱨ��
	 * �ڶ����ļ����Բ�����,����·��������ڣ����·����������FileOutSteam�ᱨ��
	 */
	 public static void copyFile(String string,String string2) throws IOException{
	        FileInputStream ins = new FileInputStream(string);
	        FileOutputStream out = new FileOutputStream(string2);
	        byte[] b = new byte[1024];
	        int n=0;
	        while((n=ins.read(b))!=-1){
	            out.write(b, 0, n); 
	        }
	         
	        ins.close();
	        out.close();
	        System.out.println("�����ļ��ɹ�");
	    }
	 /**
	  * 5��ɾ�����Ŀ¼
	  */
	 
	    public static void  delteFiles(File file){
	    	//file.listFiles()�ǻ�ȡfile�������Ҳ����file���Ŀ¼������ļ����ļ��еļ���
	        File[] files=file.listFiles(); 
	        for(File f:files)
	        {
	            if(f.isDirectory())//�ݹ����
	            {
	                delteFiles(f);
	            }
	            else {
	                f.delete();
	            }
	        }
	        file.delete();
	        System.out.println("ɾ��Ŀ¼�ɹ�");
	    }
	    
	    
	    /**
		 * 6 ��Ŀ¼�¶�ȡ�ļ����ݽ���ƥ��
	     * @throws Exception 
		 * 
		 */
		private static void getFileValue(File file,String content) throws Exception {
			// TODO Auto-generated method stub
			//file.listFiles()�ǻ�ȡfile�������Ҳ����file���Ŀ¼������ļ����ļ��еļ���
	        File[] files=file.listFiles(); 
	        for(File f:files)
	        {
	            if(f.isDirectory())//�ݹ����
	            {
	            	getFileValue(f,content);
	            }
	            else {  
	            	String path = f.getPath();
	                String xml = path.substring(path.lastIndexOf(".")+1, path.length());
	            	if(xml.equals("xml")){
	            		FileInputStream fInputStream = new FileInputStream(f);
	            		ByteArrayOutputStream outStream = new ByteArrayOutputStream();      
	            		
	            		byte[] buffer = new byte[1024]; 
	            		int len = 0;
	            		while((len=fInputStream.read(buffer))!=-1){
	            			outStream.write(buffer, 0, len);
	            		}
	            		String str = new String(outStream.toByteArray(),"utf-8");

	 //            		System.out.println("�ļ���Ϊ"+f.getName()+"/n������Ϊ"+str); 
	 //           		if(str.contains("<typecode>9208</typecode>")&&str.contains("<appcode>0000</appcode>")){
	 //           		if(str.contains("<typecode>1103</typecode>")&&!str.contains("<appcode>0000</appcode>")){
	              	    if(str.contains(content)){
	            			System.out.println("��"+i+"���ļ���Ϊ\n"+f.getPath());
	                		System.out.println("����Ϊ\n"+str); 
	                		i++;
	            		}
	            	}            	
	        		
	            }
	        }
		}
		

		/**
		 * 7����ȡtxt�ļ�����
		 * 
		 */
		private static String getFileTextValue(String filePath) throws Exception {
			// TODO Auto-generated method stub 
			 FileInputStream fileInputStream = new FileInputStream(filePath);
			 ByteArrayOutputStream byteOutputStream = new ByteArrayOutputStream();
			 int len  = 0;
			 byte[] buffer = new byte[1024];
			 while((len = fileInputStream.read(buffer))!=-1){
				 byteOutputStream.write(buffer, 0, len);
			 }
			 String txtValue = new String(byteOutputStream.toByteArray());
			 System.out.println(txtValue);
			 return txtValue;
		}



		/**
		 * 8��������,һ��һ�ж�ȡtxt����	
		 */
		private static String getFileReadLineTextValue(String filePath) throws Exception {
		
			 FileInputStream fileInputStream = new FileInputStream(filePath);
			 ByteArrayOutputStream byteOutputStream = new ByteArrayOutputStream();
			 int len  = 0;
			 byte[] buffer = new byte[1024];
			 while((len = fileInputStream.read(buffer))!=-1){
				 byteOutputStream.write(buffer, 0, len);
			 }
			 byte[] txtByteArray = (byteOutputStream.toByteArray());
			 
			BufferedReader reader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(txtByteArray),"utf-8"));
	     	String lineVal =null ;
	     	int flagLength = 0;
			while((lineVal = reader.readLine()) != null ){
			
				flagLength++;
			 if(flagLength==1){
				 System.out.println("��"+flagLength+"�е�����Ϊ"+lineVal);
			 }
			 else{
				 System.out.println("��"+flagLength+"�е�����Ϊ"+lineVal);			 
			 }
			 
			}
	     	
	     	
			return null;
		}

		
		  /**
		    * 9�������ַ�����������
		    * ֻҪ�޸�code  city testType typecChoice  directChoice 
		    */
		public static void getTxtByTextContent(String textContext,String fileName,String path){

			try {
			
				File fileDirectory = new File(path);
				if(!fileDirectory.exists()){
					fileDirectory.mkdirs();
				}
				File fileTxt = new File(path+"/"+fileName) ;
				if(!fileTxt.exists()){
					fileTxt.createNewFile();
				}
				FileOutputStream outputStream = new FileOutputStream(fileTxt);
					
				byte[] buffer = textContext.getBytes("utf-8");
				
				outputStream.write(buffer);
			System.out.println("�ɹ�"+path+"/"+fileName);
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
			
		}		
		

}