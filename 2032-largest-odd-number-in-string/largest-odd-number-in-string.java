class Solution {
    public String largestOddNumber(String num) {
        
        StringBuilder res = new StringBuilder();

        for(int i = num.length()-1; i>=0 ;i--){

            int digit = num.charAt(i) - '0';

            if(digit%2 !=0){
                res.append(num.substring(0,i+1));
                return new String(res);
            }
        }

        return new String(res);
    }
}