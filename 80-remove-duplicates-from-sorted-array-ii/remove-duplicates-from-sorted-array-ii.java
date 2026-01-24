class Solution {
    public int removeDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for (int num : nums) {
        int count = 0;

        for(int x : list) {
            if(x == num) count++;
        }
        if(count < 2) {
            list.add(num);
        }
    }
        for (int i = 0; i < list.size(); i++) {
        nums[i] = list.get(i);
    }
        return list.size();

    }
}