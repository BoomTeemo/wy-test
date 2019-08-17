package springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringBeansTest.xml");
        TestEntity testEntity = (TestEntity) applicationContext.getBean("testEntity");
        TestEntity testEntity1 = (TestEntity) applicationContext.getBean("testEntity");
        System.out.println(testEntity == testEntity1);
        TestEntity testEntity2 = (TestEntity) applicationContext.getBean("testEntity2");
        TestEntity testEntity3 = (TestEntity) applicationContext.getBean("testEntity2");
        System.out.println(testEntity2 == testEntity3);
    }
}
