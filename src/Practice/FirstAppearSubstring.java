package Practice;

/**
 * @author pandaxubo
 *
 * @description    给定一个字符串A，要求在A中查找一个子串B。如A="ABCDF"，要你在A中查找子串B=“CD”。
 *         /// <summary>
 *         /// 给定一个字符串A，要求在A中查找一个子串B。
 *         /// 如A="ABCDF"，要你在A中查找子串B=“CD”。
 *         /// </summary>
 *         /// <param name="str">主串</param>
 *         /// <param name="strSub">子串</param>
 *         /// <returns>索引位置</returns>
 */

public class FirstAppearSubstring {
        private static int FindIndex(String[] str, String[] strSub)
        {
            int res = -1;
            if(str == null || str.length <= 0 || strSub.length > str.length){
                return res;
            }
            int strr = 0;
            int substrr = 0;
            while(strr < str.length){
                if(strSub[substrr].equals(str[strr])){
                    res = strr;
                    strr++;
                    substrr++;
                }
                else{
                    strr++;
                }
                if(substrr == strSub.length){
                    res = strr - strSub.length;
                    break;
                }
            }
            return res;
        }
        public static void main(String[] args){
            String[] str = {"may","john","harlotry","john","like"};
            String[] strSub = {"may","john","harlotry","john","like"};
            System.out.println(FindIndex(str,strSub));
        }
}
