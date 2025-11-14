import java.util.Scanner;
import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for(int i=0; i<n-1; i++){
            swapped = false;
            for(int j=0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped)
                break;
        }
    }

    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter input array of numbers separted by single space:");
            String line = sc.nextLine();
            String[] numberStrings = line.split(" ");
            int[] numbers = new int[numberStrings.length];
            for(int i=0; i<numberStrings.length; i++)
                    numbers[i] = Integer.parseInt(numberStrings[i]);
            System.out.println("Input array is as follows:");
            for(int i=0; i<numbers.length; i++)
                System.out.print(numbers[i]+" ");
            System.out.println();
            bubbleSort(numbers);
            System.out.println("The sorted array is:"+Arrays.toString(numbers));
        } catch (NumberFormatException e) {
            System.out. println("An NumberFormatException occured: "+ e.getMessage());
        }
    }
}
