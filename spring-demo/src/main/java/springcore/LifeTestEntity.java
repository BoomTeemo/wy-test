package springcore;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LifeTestEntity implements InitializingBean, DisposableBean {

    public void destroy() throws Exception {
        System.out.println("LifeTestEntity对象被创建");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("LifeTestEntity对象被销毁");
    }
}
