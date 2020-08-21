package Tencent;

import java.util.*;

public class Main2 {
//    在微博中，一个用户可以关注另一个用户，userA关注userB表示为如下的结构体：
//    class Record{
//        // 表示userA关注userB
//        String userA;
//        String userB;
//    };
//    现在给定一个关注关系的数组（vecRecords），
//    请找出一个用户strUserMaxFollow：该用户关注的人最多
//    请找出一个用户strUserMaxFollowed：该用户被最多的人关注，函数声明如下
//    void GetTopUser(final List<Record> vecRecords,
//                                String strUserMaxFollow, String strUserMaxFollowed);
    class Record{
        // 表示userA关注userB
        String userA;
        String userB;
    };
    public static void GetTopUser(final List<Record> vecRecords,
                                String strUserMaxFollow, String strUserMaxFollowed){
        Map<String, Integer> fans = new HashMap<String, Integer>();
        Map<String, Integer> follow = new HashMap<String, Integer>();
        for(Record rec: vecRecords){
            if(!fans.containsKey(rec.userA)){
                fans.put(rec.userA, 1);
            }
            else{
                fans.put(rec.userA, fans.get(rec.userA)+1);
            }
            if(!follow.containsKey(rec.userB)){
                fans.put(rec.userB, 1);
            }
            else{
                fans.put(rec.userB, fans.get(rec.userB)+1);
            }
        }
        List<Map.Entry<String,Integer>> cfans = new ArrayList(fans.entrySet());
        Collections.sort(cfans, (o1, o2) -> (o2.getValue() - o1.getValue()));
        strUserMaxFollowed = cfans.get(0).getKey();
        List<Map.Entry<String,Integer>> cfollow = new ArrayList(follow.entrySet());
        Collections.sort(cfollow, (o1, o2) -> (o2.getValue() - o1.getValue()));
        strUserMaxFollow = cfans.get(0).getKey();
        System.out.println("被最多人关注的用户是："+strUserMaxFollowed);
        System.out.println("关注的人最多的用户是："+strUserMaxFollow);
    }
}
