import java.util.*;

 // Compiler version JDK 11.0.2

 class Dcoder
 {
   public static void main(String args[])
   {  
     Scanner sc=new Scanner(System.in);
     System.out.println("ENTER LENGTH FOR ARRAY");
     int n=sc.nextInt();
     
     int a[]= new int[n];
     int l=a.length;
     System.out.println("INPUT YOUR NUMBERS");
     
     
     for(int m=0;m<l;m++)
     a[m]=sc.nextInt();
     int i=0;
     for(i=0;i<l;i++)
     {
       int key =a[i];
       int j=i-1;
       while(j>=0&&a[j]>key)
       {
         a[j+1]=a[j];
         j--;
       }
       a[j+1]=key;
       }
       for(int k=0;k<l;k++)
       System .out.print(a[k]+" ");
       System.out.println();
       System.out.print("THANK YOU"+"\n"+" DO LEAVE A LIKE");
   }
  }