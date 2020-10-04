package Practice;

/**
 * @author pandaxubo
 *
 * @description 理解static
 */
public class StaticExample {
    static int i= 1;
    static{
        i++;
        System.out.println("1st static:"+i);
    }
    public static void main(String[] args){
        System.out.println("final:"+i);
    }
    static{
        i *= 5;
        System.out.println("2nd static:"+i);
    }
}
