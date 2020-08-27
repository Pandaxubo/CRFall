package Tencent;
/////////////////////////////////////////////////////////////////////////
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
//A和B号码包都是亿级的号码包文件,  文件A和文件B中的号码全为QQ号，号码包文件一行一个QQ号， A和B号码包是有重叠的，请找出A，B两个号码包中重叠的QQ号。
//int GetTheSameQQ(final List<String> vecA, final List<String> vecB,  List<String> vecRes)
//{}
public class Main {
    public static int GetTheSameQQ(final List<String> vecA, final List<String> vecB, List<String> vecRes)
    {
        Set<String> one = new HashSet<String>(vecA);
        Set<String> two = new HashSet<String>(vecB);
        Set<String> result = new HashSet<>();
        result.addAll(one);
        result.retainAll(two);
        vecRes = new ArrayList<>(result);
        String res = vecRes.get(0);
        return Integer.parseInt(res);
    }
    public static void main(String[] args) {
        ;
    }

}


