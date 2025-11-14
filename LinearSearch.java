import java.util.Scanner;

public class LinearSearch {
    public static int linearSearch(int[] arr, int target) {
        for(int i=0; i<arr.length; i++){
            if (arr[i]==target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){

        int target;

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
            System.out.print("Enter target number to be searched:");
            target = sc.nextInt();
        System.out.println("The target is first found at index:"+linearSearch(numbers, target));
        } catch (NumberFormatException e) {
            System.out. println("An NumberFormatException occured: "+ e.getMessage());
        }
    }
}
