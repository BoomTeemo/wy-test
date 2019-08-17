package springcore;

import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringScope {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringBeansTest.xml");
        TestEntity testEntity = (TestEntity) applicationContext.getBean("testEntity");
        testEntity.setMsg("Object A");
        System.out.println(testEntity.getMsg());
        /*若这样写TestEntity testEntity1 = (TestEntity) applicationContext.getBean("testEntity");
         则结果都是Object A
         因为spring创建的是单例
         */
        TestEntity testEntity1 = (TestEntity) applicationContext.getBean("testEntity1");
        System.out.println(testEntity1.getMsg());
    }
}
