public class test1 {
    public static void main(String[] args) {
        String str = "asfasfnabaasdfnbasdnbasnbasdnbadfasdf";
        String subStr = "nba";
        
        int count = 0;
        int index = 0;
        
        System.out.println("子字符串 \"" + subStr + "\" 在字符串中的出现位置：");
        
        while ((index = str.indexOf(subStr, index)) != -1) {
            System.out.println("位置: " + index);
            count++;
            index += subStr.length();
        }
        
        System.out.println("总共出现次数: " + count);
    }
}