//import java.util.*;
//
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int[] y_x_z_length = parseInputToIntArray(sc.nextLine());
//
//        // 長さに対する料金体系を取得
//        int[] lengthValue = parseInputToIntArray(sc.nextLine());
//
//        // 実際の郵送料金
//        int[] sendValue = parseInputToIntArray(sc.nextLine());
//
//        // 判定
//        // 高さがl_1 cm 以下の場合
//        if (lengthValue[0]>= y_x_z_length[2])
//        {
//            int lengthMax = Math.max(y_x_z_length[0],y_x_z_length[1]);
//            int lengthAll = y_x_z_length[0]+ y_x_z_length[1];
//
//            if(lengthMax <= lengthValue[1])
//            {
//                System.out.println(sendValue[0]);
//            }
//            else if (lengthAll <= lengthValue[2])
//            {
//                System.out.println(sendValue[1]);
//            }else
//            {
//                System.out.println(sendValue[2]);
//            }
//
//        }
//        else // それ以外
//        {
//            int allLength = Math.max(y_x_z_length[0],Math.max(y_x_z_length[1],y_x_z_length[2]));
//            int allSum    =  y_x_z_length[0]+y_x_z_length[1]+y_x_z_length[2];
//
//            if(allLength <= lengthValue[3])
//            {
//                System.out.println(sendValue[3]);
//            }
//            else if (allSum <= lengthValue[4])
//            {
//                System.out.println(sendValue[4]);
//            }
//            else
//            {
//                int V = y_x_z_length[0]* y_x_z_length[1]*y_x_z_length[2] * sendValue[5];
//                System.out.println(V);
//            }
//
//
//        }
//
//
//    }
//
//    public static int[] parseInputToIntArray(String input) {
//        String[] lengthValue = input.split(" ");
//        int[] lengthValues = new int[lengthValue.length];
//        for (int i = 0; i < lengthValue.length; i++) {
//            lengthValues[i] = Integer.parseInt(lengthValue[i]);
//        }
//
//        return lengthValues;
//    }
//
////    public static  void underLength(int[] y_x_z_length, int[] lengthValue, int[] sendValue)
////    {
////
////
////    }
//
//}