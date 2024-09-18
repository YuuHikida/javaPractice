import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] tmp = sc.nextLine().split(" ");
        // 予約されている席の数
        int reserveNum = Integer.parseInt(tmp[0]);
        // 縦
        int H = Integer.parseInt(tmp[1]);
        // 横
        int W = Integer.parseInt(tmp[2]);
        // もっとも見やすい席p座標
        int niceView_p = Integer.parseInt(tmp[3]);
        // もっとも見やすい席q座標
        int niceView_q = Integer.parseInt(tmp[4]);
        // 席構築
        int[][] seat = new int[H][W];

        //　席初期化
        for(int i=0;i<reserveNum;i++)
        {
            String[] tmp_setSeat = sc.nextLine().split(" ");
            int x = Integer.parseInt(tmp_setSeat[0]);
            int y = Integer.parseInt(tmp_setSeat[1]);
            seat[x][y] = 50;//(座席予約済)暫定
        }

        int[][] resultSeat = new int [H][W];

        //test
        // 一番小さい数値を記憶
        int tmpMinNum = 50;
        // 基準となる配列番号から離れれば離れるほど数を増やす
        for(int i=0;i<H;i++)
        {
            for(int j=0;j<W;j++)
            {
                int dis = Math.abs(niceView_p-i)+Math.abs(niceView_q-j);
                resultSeat[i][j]= dis + seat[i][j] ;
                if(tmpMinNum >resultSeat[i][j])
                {
                    tmpMinNum = resultSeat[i][j];
                }
            }
        }

        // 最終表示
        for(int i=0;i<H;i++)
        {
            for(int j=0;j<W;j++)
            {
                if(resultSeat[i][j] == tmpMinNum)
                {
                    System.out.println(i+" "+j);
                }
            }
        }

        // dbg用print
//        dbgPrint(resultSeat,H,W);

//        for(int i=0;i<H;i++)
//        {
//            for(int j=0;j<W;j++)
//            {
//
//            }
//        }
    }
    public static void dbgPrint(int[][] seat,int H,int W)
    {
        for(int i=0;i<H;i++)
        {
            for(int j=0;j<W;j++)
            {
                System.out.printf("%02d ",seat[i][j]);
            }
            System.out.println();
        }
    }

}

