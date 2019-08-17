package springdi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DITestMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("DIBeans.xml");
        DITestEntity te = (DITestEntity) applicationContext.getBean("diTestEntity");
        te.justPrint();
    }
}
