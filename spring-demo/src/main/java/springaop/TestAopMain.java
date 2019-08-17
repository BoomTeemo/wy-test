package springaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAopMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringAopTest.xml");
        Student student = (Student) applicationContext.getBean("student");
        student.getName();
        student.getAge();
        student.printThrowExcecption();
    }
}
