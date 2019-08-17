package springdi;

public class DITestEntity {
    private DIEntity diEntity;
    public void setDiEntity(DIEntity diEntity){
        System.out.println("set DIEntity");
        this.diEntity = diEntity;
    }
    public DIEntity getDiEntity(){
        System.out.println("aaaaaaaa");
        System.out.println("aaaaaaaa");
        System.out.println("aaaaaaaa");
        return diEntity;
    }
    public void justPrint(){
        diEntity.print();
    }
}
