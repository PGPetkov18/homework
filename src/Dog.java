package src;

public class Dog {
    private String kind;
    private String sex;
    private int age;

    public Dog(){
        this.kind="Husky";
        this.sex="male";
        this.age=4;

    }
    public Dog(String kind,String sex){
        this();
        this.kind=kind;
        this.sex=sex;
    }
    public String getKind() {
        return kind;
    }
    public void setKind(String kind) {
        this.kind = kind;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void kakvoPraviKucheto(){
        System.out.println("lae");
    }

}
