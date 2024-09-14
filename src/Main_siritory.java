import java.util.Scanner;


public class Main_siritory {
    static String tmp;
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        String element[] = new String[N];


        boolean jud = false;
        for (int i = 0; i < N; i++)
        {
            element[i] = sc.nextLine();
        }


        jud = judSIRITORI(element,N);
        if (jud) {
            System.out.println("Yes");
        }

    }

    public static boolean judSIRITORI(String[] E,int N)
    {

        boolean jud = false;
        for(int i = 1;i<N;i++)
        {

            String tmpChar = E[i-1];
            int lastIndex  = tmpChar.length() -1;

            int tmpInt  = 0;
            if (tmpChar.charAt(lastIndex) == E[i].charAt(0))
            {
                jud = true;
            }else
            {
                char x = tmpChar.charAt(lastIndex);
                char y = E[i].charAt(0);
                System.out.println(x+" "+y);
                jud = false;
                break;
            }

        }

        return jud;
    }
}