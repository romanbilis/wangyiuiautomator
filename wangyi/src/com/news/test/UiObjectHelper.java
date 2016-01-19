package com.news.test;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiScrollable;
import com.android.uiautomator.core.UiSelector;

public class UiObjectHelper {
	/**
	 * ͨ���ı���λ�ķ���
	 * @param text
	 * @return
	 */
	public static UiObject getUiObjectByText(String text){
		UiObject object = new UiObject(new UiSelector().text(text));
		return object;
	}
	
	/**
	 * ͨ��������λ�ķ���
	 * @param className
	 * @return
	 */
	public static UiObject getUiObjectByClassName(String className){
		UiObject object = new UiObject(new UiSelector().className(className));
		return object;
	}
	
	/**
	 * ͨ��ID��λ�ķ���
	 * @param id
	 * @return
	 */
	public static UiObject getUiObjectByResourceId(String id){
		UiObject object = new UiObject(new UiSelector().resourceId(id));
		return object;
	}
	
	/**
	 * ͨ��Content Description��λ�ķ���
	 * @param des
	 * @return
	 */
	public static UiObject getUiObjectByContentDes(String des){
		UiObject object = new UiObject(new UiSelector().description(des));
		return object;
	}
	
	/**
	 * ����������ı�һ��λ�ķ���
	 * @param className
	 * @param text
	 * @return
	 */
	public static UiObject getUiObjectByBothClassNameAndText(String className,String text){
		UiObject object = new UiObject(new UiSelector().className(className).text(text));
		return object;
	}
	
	/**
	 * ӵ����ͬid�Ĳ�ͬ�ؼ��Ļ�ȡ����
	 * @param id
	 * @param index
	 * @return
	 */
	public static UiObject getUiObjectByIdAndInstanceIndex(String id,int index){
		return new UiObject(new UiSelector().resourceId(id).instance(index));
	}
	
	/**
	 * ��ȡ��������ķ���������ָ��ˮƽ������ֱ������true��ʾˮƽ������false��ʾ��ֱ����
	 * @param isHorizontal
	 * @return
	 * @throws UiObjectNotFoundException
	 */
	public static UiScrollable getScrollList(boolean isHorizontal) throws UiObjectNotFoundException{
		UiScrollable scrollView = new UiScrollable(
				new UiSelector().scrollable(true));
		if(isHorizontal)
			scrollView.setAsHorizontalList();
		else
			scrollView.setAsVerticalList();
		return scrollView;
	}

	/**
	 * ��ȡ���������µ��Ӷ���ķ���
	 * @param scrollView
	 * @param text
	 * @return
	 * @throws UiObjectNotFoundException
	 */
	public static UiObject scrollToGetChild(UiScrollable scrollView, String text) throws UiObjectNotFoundException{
		return scrollView.getChild(new UiSelector().text(text));
	}
	
	/**
	 * ͨ�����������ָ��UiObject
	 * @param clsName
	 * @param index
	 * @return
	 */
	public static UiObject getUiObjectByClassNameAndInstanceIndex(String clsName,int index){
		return new UiObject(new UiSelector().className(clsName).instance(index));
	}
}
