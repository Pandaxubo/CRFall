package Practice;

/**
 * @author pandaxubo
 * @description 对一些String的基本函数用法的理解
 */
public class testString {
    public static void main(String[] args) {
        String s = "There is a fox.";
        char[] ch = s.toCharArray();
        String ww = new String(ch);
        System.out.println(ww);
        String r = s.replace('f', 'c');
        String q = s.replace("fox","cat");
        String l = new String(new char[]{'a','b',' '});
        String[] arr = {"Hello", "Shenzhen","OK"};
        String score = "Hi %s, your total is %.3f";
        String sub = score.substring(0,0);
        System.out.println(sub);
        String kk = String.valueOf(82811.223123);
        float kkk = Float.parseFloat(kk);
        System.out.println(String.join(l,arr));
        System.out.println(r.toUpperCase().equalsIgnoreCase(r));
        System.out.println(q);
        //System.out.println(String.format(score,"John", 81.4));
        System.out.printf((score) + "%n", "John", 81.4);
        System.out.println(kkk);
    }
}
