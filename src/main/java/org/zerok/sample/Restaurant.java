package org.zerok.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Setter;
///WEB-INF/spring/root-context.xml 설정필요. conponet-scan
@Component
@Data
public class Restaurant {

	//@Setter - lombok 사용, @Autowired - Spring 사용
	// 대신 사용 가능한 어노테이션 : @Autowired = spring , @Inject =java
	@Setter(onMethod_ = @Autowired ) //== @Autowired
	
	private Chef chef;
}
