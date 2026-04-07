
import java.util.Scanner;
public class linearsearch {

    public static void main(String[] args) {
        int a[]= {25,10,30,34,5};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to be searched: ");
        int key = sc.nextInt();

        int flag = 0;
        for (int i =0;i<a.length;i++){
            if(a[i] == key){
                System.out.println("Element found at index: " + i);
                flag = 1;
                break;
            }
           
        }
        if (flag == 0) {
            System.out.println("Element not found in the array.");
        }
    }

    
}
