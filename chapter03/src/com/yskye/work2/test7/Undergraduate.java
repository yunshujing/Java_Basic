package com.yskye.work2.test7;
//本科生类Undergraduate增加成员specialty(专业)
public class Undergraduate extends Student{
    private String specialty;
    public Undergraduate(){
        super();
    }
    public Undergraduate(String name,int age, String degree,String specialty){
        super(name,age,degree);
        this.specialty=specialty;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public void show(){
        super.show();
        System.out.println("专业："+specialty);
    }
}
