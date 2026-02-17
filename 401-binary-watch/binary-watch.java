class Solution {
    public List<String> readBinaryWatch(int num) {
        List<String> returnList = new ArrayList<String>();
        
        for (int hour = 0; hour < 12; hour++) {
            for (int minute = 0; minute < 60; minute++) {
                if (Integer.bitCount(hour) + Integer.bitCount(minute) == num) {
                    returnList.add(String.format("%d:%02d", hour, minute));
                }
            } 
        }
        return returnList;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.readBinaryWatch(2));
    }
}