package com.news.test.page;

import com.android.uiautomator.testrunner.UiAutomatorTestCase;


/*
 * ���Ը��࣬���з������
 * */
public class BaiscTeatCase extends UiAutomatorTestCase {
	protected PageManager pm=null;
	
	/*ͨ��aapt dump badging apkname���app������Ͱ���
	 * */
	String packageName="com.netease.nr";
	String activityName="com.netease.nr.biz.ad.AdActivity";
	
	protected void setup(boolean isNeedLogin) throws Exception{
		super.setUp();
		
		/*ͨ��am start��������������Ӧ�ã���������ȷ���ڲ�ͬ���ֻ�����os����ͳһ�Ĵ�����������Ӧ�ã�
		 * */
		Runtime.getRuntime().exec("am start -n"+packageName+"/"+activityName);
	pm=new PageManager();
	Thread.sleep(1000);
	if(isNeedLogin){
		pm.getPageNavigetion().goToMySettingsTab();
		pm.getPageMy().clickLoginImageView();
		pm.getPageLogin().login("robotum2016@163", "uiautomator");
	}
	
	}
	

	
}
