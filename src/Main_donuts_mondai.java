import java.util.Scanner;


public class Main_donuts_mondai {

    static int max_i ;
    static int max_j;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        String[] split_front = line.split(" ");
        max_i = Integer.parseInt(split_front[0]);
        max_j = Integer.parseInt(split_front[1]);

        char [][] donut = new char[max_i][max_j];

        for(int i=0;i<max_i;i++)
        {
            String tmp = sc.nextLine();
            for(int j=0;j<max_j;j++)
            {
                donut[i][j] = tmp.charAt(j);
            }
        }

        int ans = jugDonut(donut,max_i,max_j);
        // 判定
        System.out.println(ans);
        // 表示
//        for (char[] chars : donut) {
//            for (char aChar : chars) {
//                System.out.print(aChar);
//            }
//            System.out.println();
//        }
    }

    public static int jugDonut(char[][] d,int a,int b)
    {
        // 良いアルゴ思いつかないからjudnumが3ならドーナツ判定にする
        int judNum = 0;
        int ansNum = 0;
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                if(String.valueOf(d[i][j]).equals("."))
                {
                    //縦
                    judNum += yoko(d,i,j);
                    //横
                    judNum += tate(d,i,j);
                    //斜め
                    judNum += naname(d,i,j);

                    if(judNum == 3)
                    {
                        ansNum ++;
                        judNum =0;
                    }
                }
            }
        }

        return ansNum;
    }
    // 横判定
    public static int yoko(char[][] d,int i, int j)
    {
        //out of index対策
        if(j-1 < 0 || j+1 >= max_j)
        {
            return 0;
        }
        if(String.valueOf(d[i][j-1]).equals("#")&&String.valueOf(d[i][j+1]).equals("#"))
        {
            return 1;
        }
        return 0;
    }
    // 縦判定
    public static int tate(char[][] d,int i, int j)
    {
        if(i-1 < 0 || i+1 >= max_i)
        {
            return 0;
        }
        if(String.valueOf(d[i-1][j]).equals("#")&&String.valueOf(d[i+1][j]).equals("#"))
        {
            return 1;
        }
        return 0;
    }
    // 斜め判定
    public static int naname(char[][] d,int i, int j)
    {
        if(i-1 < 0 || j+1 >= max_j || i+1 >= max_i || j-1 < 0 )
        {
            return 0;
        }
        //右上&左下
        if(String.valueOf(d[i-1][j+1]).equals("#")&&String.valueOf(d[i+1][j-1]).equals("#"))
        {
            //右下&左上
            if(String.valueOf(d[i+1][j+1]).equals("#")&&String.valueOf(d[i-1][j-1]).equals("#"))
            {
                return 1;
            }
        }
        return 0;
    }
}
