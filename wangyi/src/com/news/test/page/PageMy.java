package com.news.test.page;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.news.test.UiObjectHelper;

//��ȡ�ҵ���
public class PageMy {
	/*
	 * ��ȡ��¼��view
	 * @return
	 * */
	public UiObject getLoginImageView(){
		return UiObjectHelper.getUiObjectByResourceId("");
	}
	
	/*
	 * �����¼��ť
	 * @return
	 * */
	public void clickLoginImageView(){
		try {
			getLoginImageView().clickAndWaitForNewWindow();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated 	catch block
			e.printStackTrace();
		}
	}
	
}
