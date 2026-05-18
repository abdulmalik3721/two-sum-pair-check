import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        System.out.println("now Enter the " + size + " elements in array");

        int[] array = new int[size];
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }

        System.out.println("this is our array: ");

        for(int i=0;i<array.length;i++){
            System.out.println( array[i]);
        }

        System.out.print("now chosse the target: ");
        int target=sc.nextInt();



        Solution arr = new Solution();

       String yes_No= arr.solution(array, size,target);
       System.out.println(yes_No);

       System.out.print("the indices: ");

       int[] res=arr.indices(array, target);
      System.out.println("[" + res[0] + ", " + res[1] + "]");
        
    }
}