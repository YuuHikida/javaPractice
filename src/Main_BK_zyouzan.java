import java.util.Scanner;


public class Main_BK_zyouzan {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        String[] front_num = sc.nextLine().split(" ");
        int a = Integer.parseInt(front_num[0]);
        int b = Integer.parseInt(front_num[1]);

        int[] moneyNum = new int[a];
        for(int i=0;i<a;i++)
        {
            moneyNum[i] = Integer.parseInt(sc.nextLine());
        }

        // 表示
        for(int x:moneyNum)
        {
            System.out.println(x);
        }
        int ansNum = 0 ;

        for(int i=0;i<a;i++)
        {
            int tmpNum =0;
            for(int j=0;j<b;j++)
            {
                tmpNum += moneyNum[(i+j) % a];
            }
            ansNum = Math.max(tmpNum,ansNum);
        }

        System.out.println(ansNum);
    }
}