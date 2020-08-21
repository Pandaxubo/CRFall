package Tencent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//一个数组vec中存放大量坐标点，从vec中找出离目标点e最近的k个点。坐标点用结构体Coord表示。
//请实现该算法，函数原型如下：
//class Coord{
//        int x;
//        int y;
//};
//List<Coord> GetNearestCoord(List<Coord> vec, Coord e, int k);
public class Main3 {
    class Coord{
        int x;
        int y;
    }
    public static List<Coord> GetNearestCoord(List<Coord> vec, Coord e, int k){
        int veclen = vec.size();
        int[] lens = new int[veclen];
        for (int i = 0; i < veclen; ++i){
            lens[i] = len(vec.get(i),e);
        }
        Arrays.sort(lens);
        int distK = lens[k-1];
        List<Coord> res = new ArrayList<>();
        for (Coord coord : vec){
            if (len(coord, e) <= distK)
                res.add(coord);
        }

        return res;
    }
    public static int len(Coord node,Coord e) {
        return (e.x-node.x)*(e.x-node.x) + (e.y-node.y)*(e.y-node.y) ;
    }
    public static void main(String[] args) {

    }

}
