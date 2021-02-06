package hackerrank;
import java.util.*;


public class MaximumMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1,n,noofsubjects,MarksInEachSem,k,l=0, max=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter no of semester:");
    n=sc.nextInt();
    if(n<=0) 
    {
    	System.out.println("Invalid Number of semester");
    }
    //Creating a new arraylist
    ArrayList<ArrayList<Integer>> x=new ArrayList<ArrayList<Integer>>();
    
    while(i<=n)
   {
    	System.out.println("Enter no of subject in "+i+" semester");
    	noofsubjects=sc.nextInt();
    	x.add(new ArrayList<Integer>());
    	x.get(i-1).add(noofsubjects);
    	i++;
   }
    k=0;
    while(k<n)
    {
    	System.out.println("Marks obtained in semester "+(k+1)+" :");
    	  noofsubjects=x.get(k).get(0);
    	//System.out.println(noofsubjects);
    	  while(l<noofsubjects) 
    	  {
    		MarksInEachSem=sc.nextInt();
    		  if(MarksInEachSem<0 || MarksInEachSem>100)
    		  {
    			System.out.println("You have entered invalid mark.");
    			return;
    		  }
    		x.get(k).add(MarksInEachSem);
    		l++;
    	  }
    	l=0;
    	k++;
    }
  // System.out.println(x);
    
    k=0;
    while(k<n)
     {
    	System.out.print("Maximum mark in "+(k+1)+" semester:");
       noofsubjects=x.get(k).get(0);
    	for(int m=1;m<noofsubjects;m++)
    	    {
			 max = x.get(k).get(m);
	             if (x.get(k).get(m+1) > max) {
	               max = x.get(k).get(m+1); 
	             }else {
	            	 break;
	             }
			}
    	System.out.println(max);
    	k++;
     }
	}
   }
//    System.out.println(x.get(0).get(1));
//    System.out.println(x.get(0).get(2));
   
 // System.out.println(x);
//    ArrayList<Integer> NoofSubjects=new ArrayList<Integer>();
//    ArrayList<Integer> marksinaSem=new ArrayList<Integer>();
//    int j,i=1;
//    while(i<=n) {
//    	System.out.println("Enter no of subjects in "+i+" semester:");
//    	j=sc.nextInt();
//    	NoofSubjects.add(j);
//    	i++;
//    }
//    for(i=1,j=NoofSubjects.get(i);i<n && j<NoofSubjects.size();i++,j++) {
//    	System.out.println("Marks obtained in semester "+i+" :");
////     while(i<=j)
////    	z=sc.nextInt();
//    }
//    for(int w=0;w<n;w++) {
//    	System.out.println("Marks obtained in semester "+(w+1)+" :");
//    	int y=NoofSubjects.get(w);
//    	int z=1;
//    	while(z<=y) {
//    		int Marks=sc.nextInt();
//    		if(Marks<0 || Marks>100) {
//    			System.out.println("You have entered invalid mark.");
//    		}
//    		marksinaSem.add(Marks);
//    		z++;
//		}
//    	
//    }
    
    
//    System.out.println(marksinaSem);
//    System.out.println(NoofSubjects);
    
    
    
//    for (int semNo = 0; semNo < n; semNo++) {
//		System.out.println("Maximum mark in "+(semNo+1)+" semester:");
//		int z=0;int p=NoofSubjects.get(semNo);
//		int max=0;
//		while(z<p) {
//			for (i = 1; i < p; i++) {
//				 max = marksinaSem.get(i-1);
//	             if (marksinaSem.get(i) > max) 
//	                 max = marksinaSem.get(i);   
//			}
//			z++;
//			System.out.println(max);
//			break;	
//		}
//		
//	}
    
//    for (int semNo = 0; semNo < n; semNo++) {
//		System.out.println("Maximum mark in "+(semNo+1)+" semester:");
//		int p=NoofSubjects.get(semNo);
//	
//		int max=0;
//		
//			for (i=1; i <= p; i++) {
//				 max = marksinaSem.get(i-1);
//	             if (marksinaSem.get(i) > max) 
//	                 max = marksinaSem.get(i);   
//			}
//			System.out.println(max);	
//	}
//    
   
    
     
	


