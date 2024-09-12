import java.util.ArrayList;

public class Main_BK {
    public static void main(String[] args) {

        int num = 3;
        System.out.println("Hello world!");
        // まずカードを作る
        ArrayList<String> allList = createCard();

        // 半分に分ける
//        ArrayList<ArrayList<String>> splitLists = splitList(allList);

        for(int i= 0; i<num;i++)
        {
             allList = resultCard(allList);
        }

        //表示
        for(String ans : allList)
        {
            System.out.println(ans);
        }
    }

    // 回数分シャッフル
    public static ArrayList<String> resultCard(ArrayList<String> allList)
    {
        ArrayList<ArrayList<String>> splitLists= splitList(allList);
        ArrayList<String>front = splitLists.get(0);
        ArrayList<String>back  = splitLists.get(1);

        ArrayList<String>resultCard = new ArrayList<>();
        for(int i = 0; i < front.size(); i++) {

            resultCard.add(front.get(i)); // 上半分のカードを後に追加
            resultCard.add(back.get(i));  // 下半分のカードを先に追加
        }
        return  resultCard;
    }
    // カードを作成するメソッド
    public static ArrayList<String> createCard(){
        int loopNum = 14;

        ArrayList<String> S = new ArrayList<>();
        ArrayList<String> H = new ArrayList<>();
        ArrayList<String> D = new ArrayList<>();
        ArrayList<String> C = new ArrayList<>();

        ArrayList<String> allList = new ArrayList<>();

        for(int i = 1; i < loopNum; i++) {
            S.add("S_" + i);
            H.add("H_" + i);
            D.add("D_" + i);
            C.add("C_" + i);
        }

        allList.addAll(S);
        allList.addAll(H);
        allList.addAll(D);
        allList.addAll(C);

        return allList;
    }

    // リストを2つに分けて返すメソッド
    public static ArrayList<ArrayList<String>> splitList(ArrayList<String> allList) {
        // 分割するためのリストを準備
        ArrayList<ArrayList<String>> result = new ArrayList<>();

        // 中間点を計算
        int midIndex = allList.size() / 2;

        // 前半と後半のリストを分割
        ArrayList<String> firstHalf = new ArrayList<>(allList.subList(0, midIndex));
        ArrayList<String> secondHalf = new ArrayList<>(allList.subList(midIndex, allList.size()));

        // 分割したリストを result に格納
        result.add(firstHalf);
        result.add(secondHalf);

        return result;
    }
}

//
//import java.util.ArrayList;
//
//public class Main {
//    public static void main(String[] args) {
//
//        int num = 1;
//        System.out.println("Hello world!");
//        // まずカードを作る
//        ArrayList<String> allList = createCard();
//
//        // 半分に分ける
////        ArrayList<ArrayList<String>> splitLists = splitList(allList);
//
//        for(int i= 0; i<num;i++)
//        {
//            allList = resultCard(allList);
//        }
//
//        //表示
////        for(String ans : allList)
////        {
////            System.out.println(ans);
////        }
//    }
//
//    // 回数分シャッフル
//    public static ArrayList<String> resultCard(ArrayList<String> allList)
//    {
//        ArrayList<ArrayList<String>> splitLists= splitList(allList);
//        ArrayList<String>front = splitLists.get(0);
//        ArrayList<String>back  = splitLists.get(1);
//
//        for(String x : front)
//        {
//            System.out.println(x);
//        }
//        System.out.println("--------------------");
//
//        for(String x : back)
//        {
//            System.out.println(x);
//        }
//        ArrayList<String>resultCard = new ArrayList<>();
//        for (int i = front.size() - 1; i >= 0; i--) {
//            resultCard.add(back.get(i));  // 下半分の一番下から順に
//            //System.out.printf("back.get(%s)\n",back.get(i));
//            resultCard.add(front.get(i)); // 上半分の一番下から順に
//            //System.out.printf("front.get(%s)\n",front.get(i));
//        }
//        return  resultCard;
//    }
//    // カードを作成するメソッド
//    public static ArrayList<String> createCard(){
//        int loopNum = 14;
//
//        ArrayList<String> S = new ArrayList<>();
//        ArrayList<String> H = new ArrayList<>();
//        ArrayList<String> D = new ArrayList<>();
//        ArrayList<String> C = new ArrayList<>();
//
//        ArrayList<String> allList = new ArrayList<>();
//
//        for(int i = 1; i < loopNum; i++) {
//            S.add("S_" + i);
//            H.add("H_" + i);
//            D.add("D_" + i);
//            C.add("C_" + i);
//        }
//
//        allList.addAll(S);
//        allList.addAll(H);
//        allList.addAll(D);
//        allList.addAll(C);
//
//        return allList;
//    }
//
//    // リストを2つに分けて返すメソッド
//    public static ArrayList<ArrayList<String>> splitList(ArrayList<String> allList) {
//        // 分割するためのリストを準備
//        ArrayList<ArrayList<String>> result = new ArrayList<>();
//
//        // 中間点を計算
//        int midIndex = allList.size() / 2;
//
//        // 前半と後半のリストを分割
//        ArrayList<String> firstHalf = new ArrayList<>(allList.subList(0, midIndex));
//        ArrayList<String> secondHalf = new ArrayList<>(allList.subList(midIndex, allList.size()));
//
//        // 分割したリストを result に格納
//        result.add(firstHalf);
//        result.add(secondHalf);
//
//        return result;
//    }
//}
