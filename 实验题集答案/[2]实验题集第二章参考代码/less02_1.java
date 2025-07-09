class less02_1
{
   public static void main(String[] args)
   {
      /*1题 定义一维数组
	  int[] k=new int[6];
	  for(int i=0;i<k.length;i++)
		  k[i]=i;
	  System.out.println("k[3]="+k[3]);
      */
	  
	  /*2题 二维数组
	  int[][] k=new int[3][4];
	  for(int i=0;i<k.length;i++)
		  for(int j=0;j<k[i].length;j++)
	          k[i][j]=i*j;
	  System.out.println("k[2][3]="+k[2][3]);
	  */
	  
	  /*3题 命令行输入字符串
	  System.out.println("从命令行输入的字符串个数："+args.length);//通过args.length可以得到你在CMD运行时的命令长度
	  for(int i=0;i<args.length;i++)
		  System.out.println("第"+(i+1)+"个字符串的字符数："+args[i].length());
	  */
	  
	  /* 4题 判断数的奇偶
	  int n=Integer.parseInt(args[0]);
	  if(n%2==1){
		  System.out.println(n+"是奇数");}
	  else{
		  System.out.println(n+"是偶数");}
	  */
	  //5题 比较大小
	  int n=Integer.parseInt(args[0]);
	  int m=Integer.parseInt(args[1]);
	  if(n>m)
		  System.out.println(n+" > "+m);
	  else if(n==m)
		  System.out.println(n+" = "+m);
	  else
	      System.out.println(n+" < "+m);
   }
}


在main方法的参数里面默认声明成一个String类型的数组，在运行main方法的时候可以传入多个参数。使用传入的参数时，只需要调用args[0],args[1],args[2]....就可以。
args为主方法入口参数
传入：
回到最原始的命令符操作上来，先是javac test.java生成了test.class然后java test运行。
此时java test ABC 123 456
就使用到了args了。
调用：
在主方法体内，args这个String[]（字符串数组）接收到了3个参数，所以大小为3，args[0]就是"ABC"，args[1]就是"123"（注意，是字符串），args[2]就是"456"。