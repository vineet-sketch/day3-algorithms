import java.util.Scanner;
import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        for(int i=0; i<arr.length; i++){
            int minIndex = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
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
            selectionSort(numbers);
            System.out.println("The sorted array is:"+Arrays.toString(numbers));
        } catch (NumberFormatException e) {
            System.out. println("An NumberFormatException occured: "+ e.getMessage());
        }
    }
}
