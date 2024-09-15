import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static String tmp;

    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int N = 26;

        // a-z
        char[] alphabet = new char[N];
        createAlpha(alphabet, N);

        String[] element = sc.nextLine().split(" ");
        HashMap<Character, Integer> alpElement = new HashMap<>();

        //受け取る
        for (int i = 0; i < N; i++) {
            alpElement.put(alphabet[i], Integer.valueOf(element[i]));
        }
        //alpElement.forEach((key,value)-> System.out.println(key+" "+value));

        // 入力値 : abcabcabcabc
        String inputE = sc.nextLine();
        StringBuilder resultMoji = new StringBuilder();

        for (int i = 0; i < inputE.length(); i++) {
            char currentC = inputE.charAt(i);
            int nowAbility = alpElement.get(currentC);

            if (nowAbility > 0) {
                resultMoji.append(currentC);
                alpElement.put(currentC, nowAbility - 1);
            }
        }
        // 表示
        System.out.println(resultMoji.toString());
    }

    public static void createAlpha(char[] a, int N) {
        for (int i = 0; i < N; i++) {
            a[i] = (char) ('a' + i);
        }
    }


}
