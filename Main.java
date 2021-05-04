import java.util.*;
import java.io.*;

public class Main{
  int[] list;
  int a;
  int cap;
  public Main(int max){
    cap= max;
    list= new int[max];
    a= 0;
  }
  void insert(int num){
    if (a>= cap){
      System.out.println("The list is full.");
    } 
    else{
      list[a]= num;
      a++;
      System.out.println("The value is inserted.");
    }
  }
  void delete(){
    if (a== 0){
      System.out.println("The list is empty.");
    } 
    else{
      a--;
      System.out.println("The deleted value is: "+ list[a]);
    }
  }
  void display(){
    if (a<= 0){
      System.out.println("The list is empty.");
    } 
    else{
      System.out.println("Values in the list: ");
      for (int i= 0; i< a; i++){
        System.out.print(list[i]+ " ");
      }
      System.out.println("\nThe highest priority is "+ list[a - 1]);
      System.out.println("The lowest priority is: "+ list[0]);
      System.out.println();
    }
  }
  public static void main(String[] args){
    Scanner n= new Scanner(System.in);
    System.out.print("Enter the size of the list:");
    int b= n.nextInt();
    boolean c= false;
    Main q= new Main(b);
    while (c!= true){
      System.out.println("1.Insert  2.Delete  3.Display  4.Exit");
      System.out.print("Enter your choice: ");
      int choice= n.nextInt();
      switch (choice){
        case 1:
        System.out.print("Enter a value: ");
        int val= n.nextInt();
        q.insert(val);
        break;
        case 2:
        q.delete();
        break;
        case 3:
        q.display();
        break;
        case 4:
        c = true;
        break;
        default:
        System.out.println("Invalid choice.");
        break;
      }
    }
  }
}