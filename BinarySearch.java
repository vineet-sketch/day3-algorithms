import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int first = 0, last = arr.length-1, counter = 0;
        while(first <= last){
            counter++;
            if(counter > 10)
                break;
            int mid = (first+last)/2;
            if(arr[mid] == target)
                return mid;
            if(arr[mid] < target)
                first = mid;
            if(arr[mid] > target)
                last = mid;
        }
        return -1;
    }

    public static void main(String[] args){

        int target;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter input array of ascending numbers separted by single space:");
            String line = sc.nextLine();
            String[] numberStrings = line.split(" ");
            int[] numbers = new int[numberStrings.length];
            for(int i=0; i<numberStrings.length; i++)
                    numbers[i] = Integer.parseInt(numberStrings[i]);
            System.out.println("Input array is as follows:");
            for(int i=0; i<numbers.length; i++)
                System.out.print(numbers[i]+" ");
            System.out.println();
            System.out.print("Enter target number to be searched:");
            target = sc.nextInt();
        System.out.println("The target is found at index:"+binarySearch(numbers, target));
        } catch (NumberFormatException e) {
            System.out. println("An NumberFormatException occured: "+ e.getMessage());
        }
    }
}
