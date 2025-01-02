class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n = words.length;
        int q = queries.length;
        int[] isVowel = new int[n];
        for (int i = 0; i < n; i++) {
            String word = words[i];
            if (isVowel(word.charAt(0)) && isVowel(word.charAt(word.length() - 1))) {
                isVowel[i] = 1;
            }
        }
        int[] prefixSum = new int[n];
        prefixSum[0] = isVowel[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + isVowel[i];
        }
        int[] result = new int[q];
        for (int i = 0; i < q; i++) {
            int l = queries[i][0];
            int r = queries[i][1];
            if (l == 0) {
                result[i] = prefixSum[r];
            } else {
                result[i] = prefixSum[r] - prefixSum[l - 1];
            }
        }

        return result;
    }

     private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}