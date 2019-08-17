package springcore;

import org.aspectj.apache.bcel.util.ClassPath;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.*;

public class TestSpringLife {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansTest.xml");
        TestEntity obj = (TestEntity) context.getBean("examplebean");
        obj.setMsg("aaaaaaa");
        System.out.println(obj.getMsg());
        context.registerShutdownHook();
    }
}
