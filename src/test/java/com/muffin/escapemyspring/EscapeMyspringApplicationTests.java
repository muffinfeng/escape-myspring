package com.muffin.escapemyspring;

import com.muffin.escapemyspring.service.HowToUseAutowired;
import com.muffin.escapemyspring.util.ApplicationUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class EscapeMyspringApplicationTests {

	@Test
	public void contextLoads() {
	}


	@Test
    public void testHowToUseAutowired(){
        HowToUseAutowired howToUseAutowired = (HowToUseAutowired) ApplicationUtil.getBean("howToUseAutowired");
        //HowToUseAutowired howToUseAutowired = new HowToUseAutowired();
        howToUseAutowired.print();
    }
}
