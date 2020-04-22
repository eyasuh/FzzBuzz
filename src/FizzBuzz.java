/**
 * create a for loop to iterate 1 to 100
 *      within for loop
     *      declare a string output variable
     *      if the iterator number is divisible by both 3 and 5
     *          assign the output variable "FizzBuzz"
     *      else if iterator is divisible by 5? assign output to "Buzz"
     *      else if iterator is divisible by 3? assign output to "Fizz"
     *      else assign output to the string value of the iterator
 *
 *          print output variable.
 *      end for loop
 *
 *
 *
 * **/

public class FizzBuzz {
    public static void main (String [] args) {
        for(int i = 1; i <= 100; i++) {
            String output;
            if((i%3 == 0)&&(i%5 == 0)) output = "Fizzbuzz";
            else if (i%5 == 0) output = "Buzz";
            else if ((i%3) == 0) output = "Fizz";
            else output = String.valueOf(i);
            System.out.println(output);
        }
    }
}
