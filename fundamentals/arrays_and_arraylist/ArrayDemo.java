import java.util.Arrays;

public class ArrayDemo{
    public static void main(String[] args){
        System.out.println("hello array demo");

        //initialize an array for storing primitive ints only 
        int[] nums = {5,8,20,12,9};
    

        // int[] nums = new int[5]; //this is saying "create an intger array called nums which will have 5 values it can fill"
        // nums[0] = 5;
        // nums[1] = 8;
        // nums[2] = 20;
        System.out.println(Arrays.toString(nums));
    }
}
