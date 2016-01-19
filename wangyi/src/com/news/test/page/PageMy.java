package com.news.test.page;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.news.test.UiObjectHelper;

//抽取我的类
public class PageMy {
	/*
	 * 获取登录的view
	 * @return
	 * */
	public UiObject getLoginImageView(){
		return UiObjectHelper.getUiObjectByResourceId("");
	}
	
	/*
	 * 点击登录按钮
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
