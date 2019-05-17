import com.spring.demo.bean.Car;
import com.spring.demo.bean.CollectionBean;
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
    public void testIocWithConstructor() throws Exception {
        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-ioc.xml");
        User bean = (User) context.getBean("User");
        User bean2 = (User) context.getBean("User");
        System.out.println(bean);
        System.out.println(bean2);
    }

    /**
     * set 方法注入  xml 方式
     */
    @Test
    public void testIocWithSet() throws Exception{
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-ioc.xml");
        User bean = (User)context.getBean("User2");
        System.out.println(bean.getName());
    }

    /**
     * set 方法注入  注解方式
     * todo
     */

    /**
     * 命名空间方式
     */
    @Test
    public void testIocWithNameSpace(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-ioc.xml");
        Car bean = (Car)context.getBean("Car");
        System.out.println(bean.getDriver().getName());
    }

    /**
     * 集合类型
     */
    @Test
    public void testIocWithCollection(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-ioc.xml");
        CollectionBean bean = (CollectionBean)context.getBean("CollectionBean");
        System.out.println(bean);
    }







}