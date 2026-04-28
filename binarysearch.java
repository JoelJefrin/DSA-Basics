
import java.util.Scanner;

public class binarysearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = {10,20,30,40,50,60,70};

        System.out.println("Enter the element to be searched: ");
        int key = sc.nextInt();
        int low = 0;
        int high = a.length - 1; 

        while(low <= high){
            int mid = (low + high) / 2;

            if(a[mid] == key){
                System.out.println("Element found at index: " + mid);
                return;
            }
            else if(a[mid] < key){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }


         
    
}
}
