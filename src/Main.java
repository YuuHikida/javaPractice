import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        String[] crd_NumberOfTimes = sc.nextLine().split(" ");
        int card = Integer.parseInt(crd_NumberOfTimes[0]);
        int numberOfTimes = Integer.parseInt(crd_NumberOfTimes[1]);
        int pointTotal = 0;
        for(int i=0;i<numberOfTimes;i++)
        {
            int tmpPrice = Integer.parseInt(sc.nextLine());
            if(pointTotal >tmpPrice)
            {
                pointTotal -= tmpPrice;
            }else
            {
                card -= tmpPrice;
                pointTotal += (int) (tmpPrice * 0.1);
            }
            System.out.println(card+" "+pointTotal);
        }

        // 最終出力用
//        System.out.println();
    }
}

