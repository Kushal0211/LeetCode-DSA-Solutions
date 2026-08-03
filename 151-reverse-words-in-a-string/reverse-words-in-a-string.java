class Solution {
    public String reverseWords(String s) {
        List<String> words = new ArrayList<>();

        int i = 0;
        int n = s.length();

        while(i<n){
            while(i<n && s.charAt(i)== ' '){
                i++;
            }
            int start = i;

            while(i<n && s.charAt(i) != ' '){
                i++;
            }

            if(start < i){
                words.add(s.substring(start,i));
            }
        }

        Collections.reverse(words);
        return String.join(" ",words);
    }
}