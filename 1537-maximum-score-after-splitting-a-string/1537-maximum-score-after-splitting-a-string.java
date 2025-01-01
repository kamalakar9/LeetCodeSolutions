class Solution {
    public int maxScore(String s) {
        
        int totalOnes = 0;
        for(char c : s.toCharArray()){
            if(c == '1'){
                totalOnes++;
            }
        }
        int zeros = 0, ones = totalOnes, maxScore = 0;
        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i) == '0'){
                zeros++;
            }
            else{
                ones--;
            }
            maxScore = Math.max(maxScore, zeros + ones);
        }      
         return maxScore;
    }
}