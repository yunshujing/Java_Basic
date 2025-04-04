package com.yskye.work1.test1;

// 定义一个复数类complex,它的内部具有两个实例变量：realPart和imagPart，分别代表复数的实部和虚部
// 编程实现要求的数学运算：1)实现两个复数相加；2)实现两个复数相减；3)输出运算的结果。
// 然后，调用上述方法实现两个复数18+2i、19-13i的相加、相减，并打印出结果。
public class test1 {
    public static void main(String[] args) {
        Complex c1=new Complex(18,2);
        Complex c2=new Complex(19,-13);
        c1.add(c2);
        c1.print();
        c1.sub(c2);
        c1.print();
    }
}
