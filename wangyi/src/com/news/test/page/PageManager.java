package com.news.test.page;

public class PageManager {
	PageLogin pageLogin;
	PageMy pageMy;
	PageMyFavorites pageMyFavorites;
	PageNavigetion pageNavigetion;
	PageNews pageNews;
	PageNewsDetail pageNewsDetail;
	
	/*
	 * ��õ���page���������
	 * */
	public PageNavigetion getPageNavigetion(){
		if(pageNavigetion==null){
		pageNavigetion =new PageNavigetion();
		}
		return pageNavigetion;
	}
	
	/*
	 * ��õ�¼page����������
	 * */
	public PageLogin getPageLogin(){
		
		if(pageLogin==null){
		pageLogin =new PageLogin();
		}
		return pageLogin;
	}
	
	/*
	 * �������ҳ���������
	 * */
	public PageNews getPageNews(){
		if(pageNews==null){
			pageNews=new PageNews();
		}
		return pageNews;
	}
	
	/*
	 * �������������������
	 * */
	public PageNewsDetail getPageNewsDetail(){
		if(pageNewsDetail==null){
			pageNewsDetail=new PageNewsDetail();
		}
		return pageNewsDetail;
	}
	
	/*
	 * ����ҵ�tabҳ���������
	 * */
	public PageMy getPageMy(){
		if(pageMy==null){
			pageMy=new PageMy();
			
		}
		return pageMy;
	}
	
	/*
	 * ����ղ�ҳ���������
	 * */
	public PageMyFavorites getPageMyFavorites(){
		if(pageMyFavorites==null){
			pageMyFavorites=new PageMyFavorites();
		}
		return pageMyFavorites;
	}
	

}
