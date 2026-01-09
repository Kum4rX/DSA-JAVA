class Solution {
    public int threeSumMulti(int[] arr, int target) {
        Arrays.sort(arr);
        int MOD = 1_000_000_007;
        long ans = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int left = i + 1;
            int right = n - 1;
            int need = target - arr[i];

            while (left < right) {
                int sum = arr[left] + arr[right];

                if (sum < need) {
                    left++;
                } else if (sum > need) {
                    right--;
                } else {
                    if (arr[left] == arr[right]) {
                        long count = right - left + 1;
                        ans += count * (count - 1) / 2;
                        ans %= MOD;
                        break;
                    } else {
                        long countL = 1, countR = 1;
                        while (left + 1 < right && arr[left] == arr[left + 1]) {
                            countL++;
                            left++;
                        }
                        while (right - 1 > left && arr[right] == arr[right - 1]) {
                            countR++;
                            right--;
                        }
                        ans += countL * countR;
                        ans %= MOD;
                        left++;
                        right--;
                    }
                }
            }
        }
        return (int) ans;
    }
}
