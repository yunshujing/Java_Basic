import java.util.Scanner;
class less02_3
{
   public static void main(String[] args)
   {
       // 第11题 杨辉三角
	   // 思路：第一列和每行的最后一列都是1；从第三行开始每一列等于上一行本列和上一行前列相加。

       /* int[][] arr = new int[10][10];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][0] = 1;
                arr[i][i] = 1;

            }
        }
        for (int i = 2; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length - 1; j++) {
                arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
            }

        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }*/

	//"\t"为“转义字符“，也叫水平制表符，\t是补全当前字符串长度到8的整数倍，最少1个最多8个空格，
       补多少要看你\t前字符串长度，比如当前字符串长度10，那么\t后长度是16，也就是补6个空格
       如果当前字符串长度12，此时\t后长度是16，补4个空格。
		
               //12 题 猜数字游戏
		/*Scanner sc=new Scanner(System.in);
		int r=(int)(Math.random()*10);
		while(true)
		{
			System.out.print("请输入您猜的数：");
			int s=sc.nextInt();
			if(s>r)
				System.out.println("sorry,你猜大了！");
			else if(s<r)
				System.out.println("sorry,你猜小了！");
			else
			{
				System.out.println("恭喜您，答对了！");
				break;	
			}
			
		}*/
		