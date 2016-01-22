package com.news.test.page;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.news.test.UiObjectHelper;

//��ȡ����������

public class PageNewsDetail {
	
	/*
	 * ��ȡ���ϽǸ���ؼ�
	 * */
	public UiObject getMoreTextView(){
		return UiObjectHelper.getUiObjectByResourceId("com.netease.newsreader.activity:id/biz_newspage_menu_more");
	}
	
	/*
	 * ��ȡ�ղؿؼ�
	 * */
	public UiObject getFavoritesTexView(){
		return UiObjectHelper.getUiObjectByText("�ղ�");
	}
	
	/*
	 * ������ϽǸ��ఴť
	 * */
	public void clickMoerTextView(){
		try {
			getMoreTextView().clickAndWaitForNewWindow();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/*
	 * ����ղذ�ť����
	 * */
	public void clickFavoritesTexView(){
		try {
			getFavoritesTexView().clickAndWaitForNewWindow();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
