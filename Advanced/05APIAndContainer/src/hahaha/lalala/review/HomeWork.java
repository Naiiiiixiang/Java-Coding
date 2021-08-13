package hahaha.lalala.review;

public class HomeWork {
    public static void main(String[] args) {

        // A c  B   1 , ]
        String s = "AAcccccAAAccAAAAABBBBBBBCC11111,,,A,,,,]]]]";
        //1.获取字符串内不重复的字符
        String newStr = "";
        //遍历原有字符串
        for (int i = 0; i < s.length(); i++) {
            //获取每一个字符
            char ele = s.charAt(i);
            //如果字符没有在newStr中出现过  添加到 newStr
            if (newStr.indexOf(ele) == -1) {
                //  newStr = newStr+ele;
                newStr += ele;
            }
        }
        System.out.println(newStr);
        //2.将不重复的字符 与 原有字符串内所有字符 挨个比较一遍
        // A c  B   1 , ]
        for(int i = 0;i<newStr.length();i++){
            //记录每一个字符出现的次数
            int count = 0;
            for(int j = 0;j<s.length();j++){
            // "AAcccccAAAccAAAAABBBBBBBCC11111,,,,,,,]]]]"
                char c = newStr.charAt(i);
                char c1 = s.charAt(j);
                if(c==c1){
                    count++;
                }
            }
            //3.输出结果
            System.out.println(newStr.charAt(i)+"----》 "+count);
        }
    }
}
