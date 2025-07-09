//第一题
public class StringTest 
{
	public static void main(String[] args) 
	{		
		String str="asfasfnabaasdfnbasdnbasnbasdnbadfasdf";
		String key="nba";
		int count=0;//总次数
		int index=0;
		int index1=0;
		int n=1;//每次显示的次数
		if(str.contains(key))//判断此字符串中是否包含指定的字符序列
		{
			while((index=str.indexOf(key))!=-1) //如果要检索的字符串值没有出现，str.indexof(key)=-1
			{
				str=str.substring(index + key.length());//在查找到一个后，马上找到新的字符串进行搜索。
				System.out.println("第"+(n++)+"次出现的位置是："+(index+index1));
				index1=(index+index1+key.length());//加上上一次的索引和key的长度来显示在整个父字符串中的位置
				count++;
			}	
		}
		System.out.println("统计：字符串nba一共出现了"+count+"次");	
	}	
}
//第2题
import java.util.Arrays;
class Test 
{
    private static final String SEPARATOR = " ";
    public static void main(String[] args) {

        String numStr = "23 10 -8 0 3 7 108";
        String sortStr = sortNumberString(numStr);
        System.out.println(sortStr);
    }
    /**
     * 对一个有多个数值的字符串，进行数值的排序
     * @param numStr
     * @return
     */
    public static String sortNumberString(String numStr) {
        // 1，将给定的字符串分解成多个数字格式的字符串
        String[] numStrs = toStringArray(numStr);

        // 2，将字符串数组转成int数组
        int[] nums = toIntArray(numStrs);

        // 3，对数组排序
        sort(nums);

        // 4，将int数组转成字符串
        return toString(nums);
    }

    /*
     * 将字符串按照指定的分隔，转成字符串数组
     */
    private static String[] toStringArray(String numStr) {
        // 使用字符串的split(regex)
        return numStr.split(SEPARATOR);
    }

    /*
     * 将字符串数组转成int类型数组
     */
    private static int[] toIntArray(String[] numStrs) {
        // 1，创建一个int类型的数组，长度和字符串数组的长度一致
        int[] nums = new int[numStrs.length];
        // 2，对字符串数组进行遍历
        for (int i = 0; i < numStrs.length; i++) {
            // 3，将字符串数组中的元素通过parseInt()方法转换后，赋值给int类型的数组
            nums[i] = Integer.parseInt(numStrs[i]); //P176表5-8，parseInt方法将字符串参数作为有符号的十进制整数进行解析。
        }
        return nums;
    } 

    /*
     * 对int数组进行升序排序
     */
    private static void sort(int[] nums) {
        Arrays.sort(nums);
    }

    /*
     * 将int数组转成字符串
     */
    private static String toString(int[] nums) {
        // 1，定义一个StringBuilder字符串缓冲区
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            if (i != nums.length) 
                sb.append(nums[i] + SEPARATOR);
            else 
                sb.append(nums[i]);

        }
        return sb.toString();
    }    
}

//第3题
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Scanner;

public class RuntimeTest {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Properties pp=System.getProperties();//获取当前系统属性的Properties集合
		Runtime rt=Runtime.getRuntime();//创建Runtime实例对象
		String tmp=null;
		while(true)
		{
			System.out.println("请选择操作【请用大写字母】：");
			System.out.println("***************************************");
			System.out.println("A:记事本");
			System.out.println("B:重启计算机");
			System.out.println("C:启动QQ");
			System.out.println("D:查看系统属性");
			System.out.println("G:退出");
			
			tmp=sc.next();
			
			if(tmp.equals("A"))  
           //String类重写了equals（）方法，equals用于比较两个字符串的字符是否相等，==用于比较两个字符串对象的地址是否相同，所以不能用==。
			{
			   try 
			   {
				   rt.exec("notepad.exe");
			   } catch (IOException e) 
			   {
				   e.printStackTrace();
			   }
			}else if(tmp.equals("B"))
			{
				   try 
				   {
					   rt.exec("shutdown -r");
				   } catch (IOException e) 
				   {
					   e.printStackTrace();
				   }
			}else if(tmp.equals("C"))
			{
				   try 
				   {
					   rt.exec("C:\\Program Files (x86)\\Tencent\\QQ\\Bin\\QQScLauncher.exe");
				   } catch (IOException e) 
				   {
					   e.printStackTrace();
				   }
			}else if(tmp.equals("D"))
			{
				Enumeration ee=pp.propertyNames();
//propertyNames()返回属性列表中存在的所有键的集合,propertyNames()返回一个Enumeration对象。
//Enumeration接口定义了一些方法，通过这些方法可以枚举（一次获得一个）对象集合中的元素，这种传统接口已被迭代器取代。
				while(ee.hasMoreElements())
				{
					String key=(String)ee.nextElement();
					String value=System.getProperty(key);
					System.out.println(key+"--->"+value);
				}
			}else if(tmp.equals("G"))
			{
				    break;
			}
			
		}

	}

}
//catch(Exception e){
e.printStackTrace() ;
}
当try语句中出现异常是时，会执行catch中的语句，java运行时系统会自动将catch括号中的Exception e 初始化，也就是实例化Exception类型的对象。
e是此对象引用名称。然后e会自动调用Exception类中指定的方法，也就出现了e.printStackTrace() ;。
printStackTrace()方法的意思是：在命令行打印异常信息在程序中出错的位置及原因。