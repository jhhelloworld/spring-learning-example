import com.spring.demo.bean.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * jh
 * 2019年05月16日  17：05
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring-ioc.xml")
public class TestIoCBasedXML {

    /**
     * 构造函数注入
     */
    @Test
    public void testInitApplicationContext() throws Exception {
        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-ioc.xml");
        User bean = (User) context.getBean("User");
        User bean2 = (User) context.getBean("User");
        System.out.println(bean);
        System.out.println(bean2);
    }


}