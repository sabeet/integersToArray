import java.util.Arrays;

public class driver {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(digitsToArray(3000)));
    }

    public static int digitCount(int digits){ //this counts digits
        int count = 0;
        while(!(digits < 1)){
            digits /= 10;
            count++;
        }
        return count;
    }

    public static int[] digitsToArray(int digits){
        //for the length of the digits, add each digit into the array
        int arr[] = new int[digitCount(digits)];
        for(int i = 0; i <= digitCount(digits) - 1; i++ ) {
            arr[i] = Integer.parseInt(Integer.toString(digits).substring(i, i+1));;
        }
        return arr;
    }
}