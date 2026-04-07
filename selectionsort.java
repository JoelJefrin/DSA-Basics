
import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
        int a[] = {25,10,30,34,5};
        System.out.println(Arrays.toString(a));

        for (int i=0;i<a.length-1;i++){

            int min = i; 
          for(int j=i+1;j<a.length;j++){
            if(a[j]<a[min]){
                min = j;
            }

          }
          int emp =a[i];
            a[i] = a[min];  
            a[min] = emp;
            
        }
         System.out.println("Array after sorting: " + Arrays.toString(a));

    }
    
}
