class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] boxedArr = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            boxedArr[i] = arr[i];
        }
        java.util.Arrays.sort(boxedArr, (a, b) -> {
            int bitCountA = Integer.bitCount(a);
            int bitCountB = Integer.bitCount(b);
            
            if (bitCountA != bitCountB) {
                return Integer.compare(bitCountA, bitCountB);
            }
            return Integer.compare(a, b);
        });

        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = boxedArr[i];
        }
        
        return result;
    }
}
