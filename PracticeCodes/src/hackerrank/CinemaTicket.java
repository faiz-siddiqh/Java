package hackerrank;
import java.util.*;
import java.text.DecimalFormat;
//public class CinemaTicket {
//	public static void main(String args[]) {
//
//	 int refe,total=0;
//     double cost,sum,sum1,sum3,sum2;
//     Scanner sc=new Scanner(System.in);
//      System.out.print("Enter the no of ticket:");
//      int n=sc.nextInt();
//     if( n<5 ||  n>40){
//         System.out.println("Minimum of 5 and Maximum of 40 Tickets");        
//         return;
//     }
//     System.out.print("Do you want refreshment:");
//     String c=sc.next();
//     System.out.print("Do you have coupon code:");
//     String d=sc.next();
//     System.out.print("Enter the circle:");
//     String circle =sc.next();
//     
//     if (circle.equals("k")) {
//         total = n * 75;
//     } else if (circle.equals("q")) {
//         total = n * 150;
//     } else {
//         System.out.println("Invalid Input");
//         return;
//     }
//     if (n > 20) {
//         sum = ((0.1) * total);
//         sum1 = total - sum;
//         if (d == "y") {
//             sum2 = ((0.2) * total);
//             sum3 = sum1 - sum2;
//             if (c == "y") {
//                 refe = n * 50;
//                 cost = sum3 + refe;
//             } else {
//                 cost = sum3;
//             }
//         } else {
//             cost = sum1;
//         }
//     } else {
//         cost = total;
//     }
//     DecimalFormat df = new DecimalFormat("#.##");
//     System.out.println("Ticket cost:" + df.format(cost));
// }
//	
//}
public class CinemaTicket {
    public static void main(String[] args) {
        int no, refe, total = 0;
        double cost, sum, sum1, sum2, sum3;
        String ref, co, circle;
        Scanner s = new Scanner(System.in);
        double rating=s.nextDouble();
        
        System.out.println("Enter the no of ticket: ");
        no = s.nextInt();
        if (no < 5 || no > 40) {
            System.out.println("Minimum of 5 and Maximum of 40 tickets");
        }
        System.out.println("Do you want refreshment:");
        ref = s.next();
        System.out.println("Do you have a coupon code:");
        co = s.next();
        System.out.println("Enter the circle:");
        circle = s.next();
        if (circle.equals("k")) {
            total = no * 75;
        } else if (circle.equals("q")) {
            total = no * 150;
        } else {
            System.out.println("Invalid Input");
            return;
        }
//        if (no > 20) {
//            sum = ((0.1) * total);
//            sum1 = total - sum;
//            if (co.equals("y")) {
//                sum2 = ((0.02) * sum1);
//                sum3 = sum1 - sum2;
//                if (ref.equals("y")) {
//                    refe = no * 50;
//                    cost = sum3 + refe;
//                } else {
//                    cost = sum3;
//                }
//            } else {
//                cost = sum1;
//            }
//        } else {
//            cost = total;
//        }
        cost=total;
        if((no>20)&&(co.equals("y"))){
        	sum = ((0.1) * total);
          sum1 = total - sum;
              sum2 = ((0.02) * sum1);
              sum3 = sum1 - sum2;
              if (ref.equals("y")) {
                  refe = no * 50;
                  cost = sum3 + refe;
              }
        }else if((no>20)&&(co.equals("n"))) {
        	sum = ((0.1) * total);
            sum1 = total - sum;
            if (ref.equals("y")) {
                refe = no * 50;
                cost = sum1 + refe;
            }
        }else if((no<20)&&(co.equals("y"))) {
        	sum2 = ((0.02) * total);
            sum3 = total-sum2;
            if (ref.equals("y")) {
                refe = no * 50;
                cost = sum3 + refe;
            }else 
            
            cost=sum3;
            
        }
        
        else {
        	cost=total;
        }
       
        String str=String.format("%.2f", cost);
		 System.out.println("Ticket cost:"+str);
    }
}
