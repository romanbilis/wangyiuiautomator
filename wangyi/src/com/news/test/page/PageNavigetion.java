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
		return UiObjectHelper.getUiObjectByIdAndInstanceIndex("com.netease.newsreader.activity:id/biz_navi_tab", 1);
	}
	
	/*
	 * ��ȡ�ҵ�tabҳ
	 * */
	public UiObject getMyTab() throws UiObjectNotFoundException{
		return UiObjectHelper.getUiObjectByIdAndInstanceIndex("com.netease.newsreader.activity:id/biz_navi_tab", 4);	
	}
	
	/*
	 * ��ȡ����tabҳ
	 * */
	public UiObject getNewsTab() throws UiObjectNotFoundException{
		return UiObjectHelper.getUiObjectByIdAndInstanceIndex("com.netease.newsreader.activity:id/biz_navi_tab", 0);
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
