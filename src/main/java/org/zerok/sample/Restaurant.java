package org.zerok.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Setter;
///WEB-INF/spring/root-context.xml �����ʿ�. conponet-scan
@Component
@Data
public class Restaurant {

	//@Setter - lombok ���, @Autowired - Spring ���
	// ��� ��� ������ ������̼� : @Autowired = spring , @Inject =java
	@Setter(onMethod_ = @Autowired ) //== @Autowired
	
	private Chef chef;
}
