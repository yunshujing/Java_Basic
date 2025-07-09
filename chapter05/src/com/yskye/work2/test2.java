package com.yskye.work2;
//请用Map实现获取字符串"bwaerbctyxbacecrtdcvr"中每一个字母出现的次数。要求结果格式：a(2)b(3)c(4)…..
public class test2 {
    public static void main(String[] args) {
        String str = "bwaerbctyxbacecrtdcvr";
        java.util.Map<Character, Integer> charCountMap = new java.util.HashMap<>();
        
        // Count frequency of each character
        for (char c : str.toCharArray()) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }
        
        // Build result string in required format
        StringBuilder result = new StringBuilder();
        for (java.util.Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            result.append(entry.getKey()).append("(").append(entry.getValue()).append(")");
        }
        
        System.out.println(result.toString());
    }
}
