package src;

public class SubtractionSquare {

    /*

    Given one method name is substSquare

    This method get two ints as parameter

    return type is int

    Get  square of the sum of the numbers using getSumOfSquares method ,

    Parameter 1 square of the sum + Parameter 2 square of the sum  = your result

    for example:
    int 1 = 10

    int 2 = 5;

    3025 + 225 = 3250

    return 3250

     */
    public int substSquare(int num1, int num2) {
        int sum1 = getSumOfSquares(num1);
        int sum2 = getSumOfSquares(num2);


        return sum1 + sum2;
    }

    /*
    Create one method name is getSumOfSquares
    This method get one int as parameter
    Return type is int

    Get the square of the sum of the numbers

    for example:

    int is 10
     (1+2+...+10)²=55²=3025
     return 3025

     */

    public static int getSumOfSquares(int number) {
        int total = 0;

        for (int i = 0; i <=number ; i++) {
            total+=i;

        }
        return total * total;
    }

}