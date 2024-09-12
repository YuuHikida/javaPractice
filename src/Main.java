import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        String[] front_num = sc.nextLine().split(" ");
        int chiledlenNum = Integer.parseInt(front_num[0]);
        int zyankenNum = Integer.parseInt(front_num[1]);

        int[][] resultNum = new int[zyankenNum][2];
        // list作成
        for(int i=0;i<zyankenNum;i++)
        {
            String[] tmpNum = sc.nextLine().split(" ");
            for(int j=0;j<2;j++)
            {
                resultNum[i][j] = Integer.parseInt(tmpNum[j]);
            }
        }
        // 勝者の配列を作成してkey
        HashMap<Integer,ArrayList<Integer>> winnerList = new HashMap<>();
        for(int i=0;i < zyankenNum;i++)
        {
            ArrayList<Integer>winners = new ArrayList<>();
            winners.add(resultNum[i][0]);
            winners.add(resultNum[i][1]);
            winnerList.put(resultNum[i][0],winners);
        }

        //敗者走査
        for(int i=0;i<zyankenNum;i++)
        {
            // 敗者と勝者の中の数が一致するかを確認
            int tmpEnji = resultNum[i][0];
            if(winnerList.get(resultNum[i][0]).equals(tmpEnji))
            {
                //一致したらかつての勝者の率いる園児を、勝った勝者へ
                //
            }
        }
        //予想->[key:1,value:[1,2],

    }
}

//public class Main {
//    public static void main(String[] args) {
//        // 自分の得意な言語で
//        // Let's チャレンジ！！
//        Scanner sc = new Scanner(System.in);
//        String[] front_num = sc.nextLine().split(" ");
//        int chiledlenNum = Integer.parseInt(front_num[0]);
//        int zyankenNum = Integer.parseInt(front_num[1]);
//
//        int[][] resultNum = new int[zyankenNum][2];
//        // list作成
//        for(int i=0;i<zyankenNum;i++)
//        {
//            String[] tmpNum = sc.nextLine().split(" ");
//            for(int j=0;j<2;j++)
//            {
//                resultNum[i][j] = Integer.parseInt(tmpNum[j]);
//            }
//        }
//        // 勝者の配列を作成してkey
//        HashMap<Integer,ArrayList<Integer>> winnerList = new HashMap<>();
//        for(int i=0;i < zyankenNum;i++)
//        {
//            ArrayList<Integer>winners = new ArrayList<>();
//            winners.add(resultNum[i][0]);
//            winners.add(resultNum[i][1]);
//            winnerList.put(resultNum[i][0],winners);
//        }
//
//
//    }
//}