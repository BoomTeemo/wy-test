package springaop;

import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.beans.factory.InitializingBean;
public class Student {
    private Integer age;
    private String name;

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
        public void printThrowExcecption(){
            System.out.println("Exception raised");
            throw new IllegalArgumentException();
        }
}
