package com.news.test.page;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.news.test.UiObjectHelper;

//��ȡ�ղ���
public class PageMyFavorites {
		/*
		 * ��ȡָ���е����ű���ؼ�
		 * */
	public UiObject getTitleTV(int index){
			return UiObjectHelper.getUiObjectByIdAndInstanceIndex("", index);
	}
	
	/*
	 * ��ȡ�ؼ��ı�
	 * */
	public String getTitleTVText(int index){
		String title=null;
		
		try {
			title=getTitleTV(index).getText().toString();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return title;
	}
}
