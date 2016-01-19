package com.news.test.page;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.news.test.UiObjectHelper;

//��ȡ��ҳ������
public class PageNews {
	public UiObject getNewsTitle(int index){
		return UiObjectHelper.getUiObjectByIdAndInstanceIndex("com.netease.newsreader.activity:id/title", index);
		
	}
	
	
/*
 * ��ȡָ���б����ı�����
 * @param index
 * @return
 * */
public String getNewsTitleText(int index){
	String newsTitle=null;
	try {
		newsTitle=getNewsTitle(index).getText().toString();
	} catch (UiObjectNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return newsTitle;
	
}

/*
 * ������ű��ⷽ��
 * @param index
 * */
	public void clickNewTitle(int index){
		try {
			getNewsTitle(index).clickAndWaitForNewWindow();
		} catch (UiObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}

}
