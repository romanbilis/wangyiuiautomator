package com.news.test.page;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.news.test.UiObjectHelper;

//��ȡ������


public class PageNavigetion {
		/*
		 * ��ȡ�Ķ�tabҳ
		 * */
	public UiObject getReadTab(){
		return UiObjectHelper.getUiObjectByIdAndInstanceIndex("", 1);
	}
	
	/*
	 * ��ȡ�ҵ�tabҳ
	 * */
	public UiObject getMyTab() throws UiObjectNotFoundException{
		return UiObjectHelper.getUiObjectByIdAndInstanceIndex("", 4);	
	}
	
	/*
	 * ��ȡ����tabҳ
	 * */
	public UiObject getNewsTab() throws UiObjectNotFoundException{
		return UiObjectHelper.getUiObjectByIdAndInstanceIndex("", 0);
	}
	
	/*
	 * �л�����tabҳ����
	 * */	
	public void goToMySettingsTab(){
		try {
			getMyTab().clickAndWaitForNewWindow();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/*
	 * �л�������tab����
	 * */
	public void goToNewsTab(){
		try {
			getNewsTab().clickAndWaitForNewWindow();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
