package arrayexample;

public class ArrayExample {
    public static void main(String[] args){

        // declare the array to store integers
        int[] numbers;

        //instantiate the array
        numbers = new int[5];

        // initialize the array
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // access and print elements of array

        for(int i = 0; i<numbers.length; i++){
            System.out.println("Elements of array at index "+i+" :"+numbers[i]);
        }
    }
}
