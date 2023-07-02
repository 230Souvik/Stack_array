
package stackarray;
import java.util.*;

public class Stackarray {
int top=-1;
//System.out.println("size of array");
//System.out.println("size of array");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
   public void push(){
       if(top==(n-1))
           System.out.println("stack overflow");
       else{
           top++;
           int data;
           System.out.println("enter data");
           data=sc.nextInt();
           arr[top]=data;
           System.out.println("data inserted");
       }
   }
   public void pop(){
       if(top==-1){
           System.out.println("stack underflow");
       }
       else{
           System.out.println("deleted item is"+arr[top]);
           --top;
           System.out.println("item deleted");
       }
   }
   public void peak(){
       System.out.println("top element is");
       System.out.println(arr[top]);
   }
   public void display(){
       System.out.println("item are ");
       for(int i=top;i>=0;i--){
           System.out.println(arr[i]);
       }
   }
    public static void main(String[] args) {
        // TODO code application logic here
        Stackarray s=new Stackarray();
        int i,l;
        Scanner sc=new Scanner(System.in);
        //i=sc.nextInt();
        do{
            System.out.println("1. push 2.pop 3.peak 4. display");
            int d=sc.nextInt();
            switch(d){
                case 1->{
                    s.push();
                }
                case 2->{
                    s.pop();
                }
                case 3->{
                    s.peak();
                            
                }
                case 4->{
                    s.display();
                }
            }
            System.out.println("press 0 to continue");
        
             l=sc.nextInt(); }
        while(l==0);
        System.out.println("exit from stack");
    }
    
}
