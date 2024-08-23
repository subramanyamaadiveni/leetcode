class Solution {
    public String mergeAlternately(String word1, String word2) {
        int s1=0;
        int s2=0;
        int e1=word1.length();
        int e2=word2.length();
        String str="";
        while(s1<=e1||s2<=e2){
            if(s1<e1){
                str+=word1.charAt(s1);

            }
            if(s2<e2){
                str+=word2.charAt(s2);

            }
            s1++;
            s2++;

        }
        return str;
    }
}