class Solution {
    public int largestAltitude(int[] gain) {
        int maxAltitude = 0;

        for(int i = 0; i < gain.length; i++) {

            int current = 0;

            for(int j = 0; j <= i; j++) {
                current = current + gain[j];
            }
            if(current > maxAltitude) {
                maxAltitude = current;
            }
        }
        return maxAltitude;
        
    }
}