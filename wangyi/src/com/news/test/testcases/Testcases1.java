package com.news.test.testcases;

import com.news.test.page.BaiscTeatCase;

/*
 * 	�����������飺
 *		������ҡ�tabҳ
 *		�����¼ͷ��
 *		�����û���:robotium2016@163.com
 *		�������룺uiautomator
 *			�����¼��ť
 *			����ص������š�tabҳ
 *			�������ڶ�������
 *			������������һ����������
 *			����ղذ�ť
 *			������ذ�ť
 *			����������ذ�ť
 *			������ҡ�tabҳ
 *			����ղذ�ť
 *			���ҵ��ղ�ҳУ���һ���ı������ݺ���������ҳ��ı���һ��
 * */

public class Testcases1 extends BaiscTeatCase {
	protected void setup() throws Exception{
		//��Ҫ�ڵ�¼�½��У���������Ϊtrue
		super.setup(true);
	}
	public void testCases1(){
		//��¼������ת������ҳ��
		pm.getPageNavigetion().goToNewsTab();
		
		//��ȡ��Ҫ�����һ�е����ű���
		String expect=pm.getPageNews().getNewsTitleText(2);
		
		//���ָ����һ��
		pm.getPageNews().clickNewTitle(2);
		
		//����������ҳ������ϽǸ��ఴť
		pm.getPageNewsDetail().clickMoerTextView();
		
		//����ղ�
		pm.getPageNewsDetail().clickFavoritesTexView();
		
		//ͨ��getuiDeviceִ��һЩģ��Ӳ���������緵��
		getUiDevice().pressBack();
		
		//��Ҫ��ת���ҵ�tabҳ
		pm.getPageNavigetion().goToMySettingsTab();
		
		//����tabҳ����ղ�
		pm.getPageMy().clickFavoirtesRL();
		
		//���ղ�ҳ���ȡ��һ�е����ű���
		String actual=pm.getPageMyFavorites().getTitleTVText(0);
		//��Ԥ�ڵ����Ƚϣ������������
		assertEquals("�ղص����ű��ⲻһ��",expect, actual);
		
		//ģ��Ӳ������
		getUiDevice().pressBack();
		
		//������ҳ
		pm.getPageNavigetion().goToNewsTab();
		
	}
	
}
