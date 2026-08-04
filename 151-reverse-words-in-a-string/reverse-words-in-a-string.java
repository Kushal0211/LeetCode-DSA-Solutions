class Solution {
    public String reverseWords(String s) {
        
        char arr[] = s.toCharArray();

        reverse(arr,0,s.length()-1);
        reverseWords(arr);
        return cleanSpaces(arr);
    }

    public void reverse(char arr[], int left, int right){
        while(left<right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
   
    public void reverseWords(char arr[]){

        int n = arr.length;
        int start = 0;
        int end = 0;
        while(start<n){
            while(start<n && arr[start] == ' '){
                start++;
            }
            end = start;
            while(end < n && arr[end] != ' '){
                end++;
            }
            reverse(arr,start,end-1);
            start = end;
        }
    }
                    
    public String cleanSpaces(char[] arr){
        int n = arr.length;
        int i = 0;
        int j = 0;

        while(i<n){
            while(i<n && arr[i] == ' '){
                i++;
            }

            while(i<n && arr[i] != ' '){
                arr[j++] = arr[i++];
            }

            while(i<n && arr[i] == ' '){
                i++;
            }

            if(i<n){
                arr[j++] = ' ';
            }
        }
        
        return new String(arr,0,j);
    }
}