package springcore;

public class TestEntity {
    private String msg;

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
    public void init(){
        System.out.println("TestEntity被创建");
    }
    public void destroy(){
        System.out.println("TestEntity被销毁");
    }
}
