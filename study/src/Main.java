import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        System.out.println("Hello, World."+n);
//        int[] a =new int[n];
//        for (int i = 0; i < n; i++) {
//            a[i]=sc.nextInt();
//        }
//        for (int i = 0; i < n; i++) {
//            System.out.println(a[i]);
//
//        -------------------------------------
        //假设班级有8名学生，请帮我开发程序可以录入8名学生的Java成绩，
        //成绩类型是小数，并输出平均分，最高分和最低分
//        int n = 8;
        double[] a = new double[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextDouble();
        }
        double sum = 0;
        double max = 0;
        double min = 0x3f3f3f3f;

        for (int i = 0; i < n; i++) {
            sum += a[i];
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }
        }

        System.out.println(sum / n);
        System.out.println(max);
        System.out.println(min);

    }
}
