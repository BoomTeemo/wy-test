package reflaction;

import static java.lang.Class.forName;

public class reflactionTest {

    public static void main(String[] args) {
	// write your code here
        //第一种方式获取Class对象
    student student = new student(); //这一new 产生一个Student对象，一个Class对象。
    Class stu = student.getClass();//获取Class对象
        System.out.println(stu);
//第二种方式获取Class对象
        Class stu2 = reflaction.student.class;//Class<student> stu2 = student.class;
        System.out.println(stu2);
//第三种方式获取Class对象
        try {
            Class stu3 = Class.forName("reflaction.student");//注意此字符串必须是真实路径，就是带包名的类路径，包名.类名
            System.out.println(stu3);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
