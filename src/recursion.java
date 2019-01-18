public class recursion {
    public int triangle(int rows) {
        if (rows == 0) {
            return 0;
        }
        return rows + triangle(rows - 1);
    }

    public int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 2) + fibonacci(n - 1);
    }
    public int countHi(String str) {
        if(str.length()<2){
            return 0;
        }
        if(str.substring(0,2).equals("hi")){
            return 1 + countHi(str.substring(2));
        }
        return countHi(str.substring(1));
    }
    public int sumDigits(int n) {
        if(n<10){
            return n;
        }
        return n%10 + sumDigits(n/10);
    }
    public int bunnyEars2(int bunnies) {
        if (bunnies == 0){
            return 0;
        }
        if(bunnies%2 ==0){
            return 3 + bunnyEars2(bunnies-1);
        }
        return 2 + bunnyEars2(bunnies-1);
    }
    public int bunnyEars(int bunnies) {
        if(bunnies == 0 ){
            return 0;
        }
        return 2+ bunnyEars(bunnies-1);
    }
    public int powerN(int base, int n) {
        if(n == 0){
            return 1;
        }
        return base*powerN(base,n-1);
    }
    public boolean array6(int[] nums, int index) {
        if(nums.length <=index){
            return false;
        }

        if(nums[index] == 6){
            return true;
        }
        return array6(nums,index+1);
    }


}