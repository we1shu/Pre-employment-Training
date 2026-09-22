import java.util.*;


public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a * b % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}

//public class Main {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        String s = sc.next();
//        int[] arr = new int[3];
//        for(int i = 0; i < 3; i++){
//            arr[i] = s.charAt(i) - '0';
//        }
//        System.out.println(arr[0] + arr[1] + arr[2]);
//    }
//}

//public class Main {
//    public static int judge(int n, int a, int b){
//        int add = 0;
//        while(n > 0){
//            int c = n % 10;
//            add += c;
//            n /= 10;
//        }
//        if (add >= a && add <= b)
//            return 1;
//        else
//            return 0;
//
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int A = sc.nextInt();
//        int B = sc.nextInt();
//        int count = 0;
//        for(int i = 1; i <= N; i++){
//            if(judge(i, A, B) == 1)
//                count += i;
//        }
//        System.out.println(count);
//    }
//}

//public class Main {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int[] a = new int[sc.nextInt()];
//        for(int i = 0; i < a.length; i++){
//            a[i] = sc.nextInt();
//        }
//        Arrays.sort(a);
//        int Alice_Score = 0;
//        int Bob_Score = 0;
//        int A_or_B = 0;
//        for(int i = a.length - 1; i >= 0; i--){
//            if(A_or_B == 0) {
//                Alice_Score += a[i];
//                A_or_B = 1;
//            }
//
//            else {
//                Bob_Score += a[i];
//                A_or_B = 0;
//            }
//        }
//        System.out.println(Alice_Score - Bob_Score);
//
//    }
//}

//package track;
//
//import java.util.*;
//
//public class MyFunction {
//    public static long findFirstDuplicate(long n, List<Long> a) {
//        // TODO: Implement this function
//
//        Set<Long> seen = new HashSet<>();
//        for(int i = 0; i < a.size(); i++){
//
//            if (seen.contains(a.get(i))) {
//                return i + 1;
//            }
//            seen.add(a.get(i));
//        }
//
//        return -1;
//    }
//}



//package track;
//
//import java.util.*;
//
//public class MyFunction {
//    public static List<Long> calcGreenness(long n, List<Long> a) {
//        long max = a.get(0);
//        int max_index = 0;
//        for(int i = 1; i < n; i++){
//            if(a.get(i) > max){
//                max = a.get(i);
//                max_index = i;
//            }
//        }
//        a.remove(max_index);
//        long max2 = Collections.max(a);
//
//        List<Long> ans = new ArrayList<>();
//        for(int i = 0; i < n; i++){
//            if(i != max_index){
//                ans.add(max);
//            }
//            else{
//                ans.add(max2);
//            }
//        }
//        return ans;
//    }
//}


//package track;
//
//import java.util.*;
//
//public class MyFunction {
//    public static List<String> canDefeatBoss(long h, long a, long b) {
//        List<String> result = new ArrayList<>();
//
//        if (h <= a) {
//            result.add("YES");
//            result.add("1");
//            return result;
//        }
//
//        if (a <= b) {
//            result.add("NO");
//            return result;
//        }
//
//        long decline = a - b;
//        long turn = (h - a + decline - 1) / decline + 1;
//
//        result.add("YES");
//        result.add(String.valueOf(turn));
//
//        return result;
//    }

//}