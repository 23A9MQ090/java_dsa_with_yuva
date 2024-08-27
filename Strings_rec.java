
/*it is used for the small small promblems*/
// import java.util.*;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for (int i = 1; i <=n; i++) {
//          for (int j = 1; j < i; j++) {
//              System.out.print(j);
//          }
//          System.out.println();
//         }
//     }
// }
// import java.util.*;
//  public class Main {
//     public static void main(String[] args) {
//      System.out.println(pattern(null, 0, 0));
//     }
//     static int[] pattern(int[] arr,int r,int c){
//      if (r==0) {
//         return;
//      }
//      if (c<r) {
//         if (arr[c] > arr[c+1]) {
//             int temp= arr[c];
//             arr[c]=arr[c+1];
//             arr[c+1]=temp;
//         }
//       return pattern(arr, r, c+1);
//      }
//      else {
//       return pattern(arr,r-1,0);
//      }

//     }
//  }
// import java.util.*;
// public class Assessment {
//   public static void main(String[] args) {
//     skip("","baccdah");   
//   }
//   static void skip(String p,String up){
//     if (up.isEmpty()) {
//       System.out.println(p);
//       return;
//     }
//     char ch = up.charAt(0); 
//     if (ch == 'a') {              
//       skip(p, up.substring(1));   
//     }
//     else{
//       skip(p+ch, up.substring(1)); 
//     }
//   }
// }
//..................................................................................................................................
//..................................................................................................................................
//...................................................................................................................................
// import java.util.*;
// public class Assessment {
//   public static void main(String[] args) {
//  System.out.println(skip("bappledah"));
//   }
//   static String skip(String up){
//     if (up.isEmpty()) {
//       return " ";
//     }    
//     if (up.startsWith("apple")) {            
//     return skip(up.substring(5));   
//     }
//     else{
//       return up.charAt(0) + skip(up.substring(1));  
//     }
//   }
// }
//  import java.util.*;
// public class Assessment {
//   public static void main(String[] args) {
//  subsequence("","abc");
//   }
//   static void subsequence(String p,String up){
//     if (up.isEmpty()) {          
//         System.out.println(p);
//         return;
//     }     
//      char ch=up.charAt(0);                         
//      subsequence(p+ch, up.substring(1));      
//      subsequence(p, up.substring(1));           
//   }
// }
// import java.util.*;
// public class Assessment {
//   public static void main(String[] args) {
//     System.out.println(subsequence("","abc"));
//   }
//   static ArrayList<String> subsequence(String p,String up){
//     if (up.isEmpty()) {
//         ArrayList<String> list = new ArrayList<>();
//         list.add(p);
//         return list;
//     }    
//      char ch=up.charAt(0);
//   ArrayList<String> left=subsequence(p+ch, up.substring(1));
//   ArrayList<String> right =subsequence(p, up.substring(1));
//   left.addAll(right);
//   return left;
//   }
// }
// import java.util.*;
// public class Assessment {
//   public static void main(String[] args) {
//  subsequence("","abc");
//   }
//   static void subsequence(String p,String up){
//     if (up.isEmpty()) {
//         System.out.println(p);
//         return;
//     }    
//      char ch=up.charAt(0);
//      subsequence(p+ch, up.substring(1));
//      subsequence(p, up.substring(1));
//      subsequence(p+(ch+0), up.substring(1));
//   }
// }

