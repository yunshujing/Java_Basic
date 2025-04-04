package com.yskye.work2.test7;
//研究生类增加成员direction(研究方向)
public class Graduate extends Student{
    private String direction;
    public Graduate(){}
    public Graduate(String name,int age, String degree,String direction){
        super(name,age,degree);
        this.direction=direction;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
    public void show(){
        super.show();
        System.out.println("研究方向："+direction);
    }
}
