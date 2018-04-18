public class Runner {
    public static void main(String[] args) {
        System.out.println(equalIsNot("isisnotno7Not"));
    }

    public static boolean hasTeen(int a, int b, int c) {
        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19)){
            return true;
        } else {
            return false;
        }
    }

    public static String altPairs(String str){
        boolean increment3 = false;
        int i = 0;
        String output = "";
        while (i < str.length()){
            output += str.charAt(i);
            if (increment3){
                i += 3;
            } else {
                i++;
            }
            increment3 = !increment3;
        }
        return output;
    }

    public static String middleTwo(String str){
        int halfLength = str.length()/2 - 1;
        String output = "";
        output += str.charAt(halfLength);
        output += str.charAt(halfLength + 1);
        return output;
    }

    public static int start1(int[] a, int[] b) {
        int output = 0;
        if (a.length != 0) {
            if(a[0] == 1){
                output++;
            }
        }
        if(b.length != 0){
            if (b[0] == 1) {
                output++;
            }
        }

        return output;
    }


    public static int greenTicket(int a, int b, int c){
        if(a == b && b == c){
            return 20;
        } else if(a == b){
            return 10;
        } else if (a == c){
            return 10;
        } else if (b == c){
            return 10;
        } else {
            return 0;
        }
    }


    public static int blackjack(int a, int b){
        int aDifference = 21 - a;
        int bDifference = 21 - b;
        if (aDifference < 0 && bDifference < 0){
            return 0;
        } else if (aDifference < 0){
            return b;
        } else if (bDifference < 0) {
            return a;
        } else if (aDifference < bDifference){
            return a;
        } else {
            return b;
        }
    }

    public static boolean bobthere(String str){
        if (str.length() < 3) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (i == str.length() - 3){
                if (str.charAt(str.length() - 3) == 'b' && str.charAt(str.length() - 1) == 'b') {
                    return true;
                } else {
                    return false;
                }
            } else {
                if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') {
                    return true;
                }
            }
        }
        return false;
    }

    public static int[] notAlone(int[] nums, int val){
        for (int i = 1; i < nums.length - 1; i++){
            if (nums[i] == val && nums[i - 1] != nums[i + 1] && val != nums[i + 1] && val != nums[i-1]){
                if(nums[i - 1] < nums[i+1]){
                    nums[i] = nums[i+1];
                } else {
                    nums[i] = nums[i-1];
                }
            }
        }
        return nums;
    }

    public static boolean equalIsNot(String str){
        if (str.length() == 0){
            return true;
        }
        int notCount = 0;
        int isCount = 0;
        for(int i = 0; i < str.length() - 2; i++){
            if(str.substring(i, i+2).equals("is")){
                isCount+=1;
            }
            if (str.substring(i, i+3).equals("not")){
                notCount+=1;
            }
        }
        if(str.substring(str.length() - 2, str.length()).equals("is")){
            isCount += 1;
        }
        return isCount == notCount;
    }

    public static boolean canBalance(int[] nums){
        float totalSum = 0;
        for (int i = 0; i < nums.length; i++){
            totalSum += nums[i];
        }
        float partialSum = 0;
        for (int i = 0; i < nums.length; i++){
            partialSum += nums[i];
            if (partialSum == totalSum/2){
                return true;
            } else if (partialSum > totalSum/2) {
                return  false;
            }
        }
        return false;
    }

}
