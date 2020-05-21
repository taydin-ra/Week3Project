package src;

public class ThreeEvenOdd {

    /*

    Given an int array as a parameter
    return true if the array contains either 3 even or 3 odd values .

    for Example:

    intArray([2, 1, 3, 5]) result should be true
    intArray([2, 1, 2, 5]) result should be  false
    intArray([2, 4, 2, 5]) result should be  true

     */

    public boolean threeEvenOrOdd(int[] intArr) {
        int count = 0;
        int count1 = 0;
        boolean my = false;

        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] % 2 == 0) {
                count++;
            } else {
                count1++;
            }

        }
        if (count == 3 || count1 == 3) {
            my = true;

        }

        return my;
    }
}