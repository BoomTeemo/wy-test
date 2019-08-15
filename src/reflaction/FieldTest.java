package reflaction;


import java.lang.reflect.Field;

class Obj{
    protected String xxx;
}

class Person extends Obj
{
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    private String wy;
    private int age;
    public String toString()
    {
        return "Person[name:" + name +
                " ,wy=" + wy+", age:" + age + " ]";
    }
}

public class FieldTest {
    public static void main(String[] args) throws Exception {
        Person person = new Person();
        person.setName("name");
        Class<Person> personClass = Person.class;
        Field field = personClass.getDeclaredField("wy");//取到可用的成员变量
        System.out.println(field);
        field.setAccessible(true);//取消访问控制权限
        field.set(person,"w");
        System.out.println(person);
    }
}
