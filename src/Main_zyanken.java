import java.util.*;


public class Main_asdad {
    static int[] parent;
    static HashMap<Integer,Integer> result = new HashMap<>();
    static int N;

    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        String[] front_num = sc.nextLine().split(" ");
        N = Integer.parseInt(front_num[0]);
        int M = Integer.parseInt(front_num[1]);
        //初期化
        parent = new int[N+1];
        //配列の初期化
        init(N);

        //mwasu
        for(int i=1;i<=M;i++)
        {
            String[]splitList = sc.nextLine().split(" ");
            union(Integer.parseInt(splitList[0]), Integer.parseInt(splitList[1]));

        }

        for(int num :parent)
        {
            result.put(num,result.getOrDefault(num,0)+1);
        }

        int max_V  =0;
        List<Integer> maxKeys = new ArrayList<>();
        for(Map.Entry<Integer,Integer>entry:result.entrySet())
        {
            int value = entry.getValue();

            if(value > max_V)
            {
                max_V = value;
                maxKeys.clear();
                maxKeys.add(entry.getKey());
            } else if (value==max_V)
            {
                maxKeys.add(entry.getKey());
            }
        }

        //表示
        for(int x:maxKeys)
        {
            System.out.println(x);
        }


    }

    public static void  init(int n)
    {
        for(int i=1;i<=n;i++)
        {
            parent[i]=i;
            result.put(i,0);//ついでに初期化
        }
    }


    public static void union(int a,int b)
    {
        int x = find(a);
        int y = find(b);

        if(x != y)
        {
            for(int i=1;i<=N;i++)
            {
                if(parent[i]== y)
                {
                    parent[i] = x;
                }
            }
        }

    }

    public static int find(int n)
    {
        if(parent[n] == n)
        {
            return parent[n];
        }
        return find(n);
    }
}