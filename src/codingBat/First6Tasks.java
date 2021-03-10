package codingBat;

public class First6Tasks {

    public static void main(String[] args) {
        int[] arr = {1,2,11,15,11,55,11,11};
        System.out.println(array11(arr));
        System.out.println(factorial(3));
        System.out.println(bunnyEars2(4));
        System.out.println(count7(7177897));
        System.out.println(countX("xhixhix"));
        System.out.println(changePi("hip"));
        System.out.println(factorialRecursion(10));
        System.out.println(array11(arr, 0));


    }

    public static int array11(int array[]){
        int count = 0;
        for (int eachNumber : array  ){
            if (eachNumber==11){
                count++;
            }
        }
        return count;

        /*
Given an array of ints, compute recursively the number of times that the value 11 appears in the array.
We'll use the convention of considering only the part of the array that begins at the given index.
In this way, a recursive call can pass index+1 to move down the array. The initial call will pass in index as 0.

array11([1, 2, 11], 0) → 1
array11([11, 11], 0) → 2
array11([1, 2, 3, 4], 0) → 0
 */

    }

    public static int factorial(int n){ //2!=1*2=2, 3!=1*2*3=6
        if (n==0 || n==1) return 1;
        int result = 1;
        for (int i=1; i<=n;i++){
            result *= i;
        }
        return result;


        /*
Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1.
Compute the result recursively (without loops).

factorial(1) → 1
factorial(2) → 2
factorial(3) → 6
         */
    }

    public static int bunnyEars2(int bunnies){
        int ears = 0;
        if (bunnies==0) return 0;
        if (bunnies==1) return 2;
        for (int i = 1; i <= bunnies; i++) {
            if (i%2==0){
                ears+=3;
            }else {
                ears+=2;
            }
        }
        return ears;
        /*
We have bunnies standing in a line, numbered 1, 2, ...
The odd bunnies (1, 3, ..) have the normal 2 ears.
The even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a raised foot.
Recursively return the number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).

bunnyEars2(0) → 0
bunnyEars2(1) → 2
bunnyEars2(2) → 5
         */
    }

    public static int count7(int n){
        String seven = String.valueOf(n); //Integer.toString(n)
        int count = 0;
        for (String eachNumber: seven.split("")){
            if (eachNumber.equals("7")){
                count++;
            }
        }
        return count;
        /*
Given a non-negative int n, return the count of the occurrences of 7 as a digit, so for example 717 yields 2. (no loops).
Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

count7(717) → 2
count7(7) → 1
count7(123) → 0
         */
    }

    public static int countX(String str){
        int count = 0;
        for (String each : str.split("")){
            if (each.equals("x")) count++;
        }
        return count;
        /*
Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.

countX("xxhixx") → 4
countX("xhixhix") → 3
countX("hi") → 0
         */

    }

    public static String changePi(String str){
        String str2 = "";
        if (str.contains("pi")){
            str2 = str.replace("pi", "3.14");
            return str2;
        }else{
            return str;
        }

        /*
Given a string, compute recursively (no loops) a new string where all appearances of "pi" have been replaced by "3.14".

changePi("xpix") → "x3.14x"
changePi("pipi") → "3.143.14"
changePi("pip") → "3.14p"
         */
    }

    public static int factorialRecursion(int n){
        if (n==0 || n==1){
            return 1;
        } else {
            return n * factorial(n-1);
        }

    }

    public static int array11(int[] nums, int index) {
        if(index >= nums.length)
            return 0;

        if(nums[index] == 11)
            return 1 + array11(nums, index + 1);

        return array11(nums, index + 1);
    }



}
