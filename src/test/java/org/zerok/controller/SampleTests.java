package org.zerok.controller;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerok.sample.Restaurant;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)

//��ü �����̳� DI ������ src/main/java -> �ڵ�����, src/test/java -> �ڵ����� �ȵ�(�о�� ���� ����)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")

@Log4j // Log��ü ����ϱ����� ���� log - ��볻�� ���
public class SampleTests {
	
	//�ڵ� DI - ������ ���� Ŭ������ �ڵ����� �־��ش�.
	@Setter(onMethod_ = {@Autowired} )
	private Restaurant restaurant; 
	
	//�������� �׽�Ʈ�� �ϴ� �޼ҵ� �ۼ�
	@Test
	public void testExist() {
		// not null Ȯ�� -null �̸� ���� �߻�
		assertNotNull(restaurant);
		
		log.info(restaurant);
		log.info("-----------------");
		log.info(restaurant.getChef());
	}
	
}
