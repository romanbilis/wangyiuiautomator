package com.news.test.page;

import junit.framework.Assert;
import android.provider.MediaStore.Video;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.news.test.UiObjectHelper;

//��ȡ��¼��

public class PageLogin {
	public UiObject getUserEditText(){
		return UiObjectHelper.getUiObjectByResourceId("");
	}
	
	public UiObject getPwdEditText(){
		return UiObjectHelper.getUiObjectByResourceId("");
	}
	
	public UiObject getLoginButton(){
		return UiObjectHelper.getUiObjectByResourceId("");
	}
	
	/*
	 * �����û�������
	 * 
	 * */
	
	public void enterUsername(String username){
		try {
			getUserEditText().clearTextField();
			getUserEditText().setText(username);
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			Assert.fail("�û�����������Ϊnull");
		}
				
	}
	
	/*
	 * �������뷽��
	 * 
	 * */
	public void enterPwd(String password){
		try {
			getPwdEditText().clearTextField();
			getPwdEditText().setText(password);
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.fail("������������Ϊnull");
		}
		
	}
	/*
	 * �����¼����
	 * */
	public void clickLoginButton(){
		try {
			getLoginButton().clickAndWaitForNewWindow();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.fail("��¼��ť����Ϊnull");
		}
	}
	
	/*
	 * ��¼����
	 * */
	public void login(String username,String password){
		enterUsername(username);
		
		try {
			getPwdEditText().setText(password);
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		enterPwd(password);
		clickLoginButton();
	}
}
