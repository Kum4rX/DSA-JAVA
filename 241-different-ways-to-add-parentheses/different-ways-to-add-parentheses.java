class Solution {
    public List<Integer> diffWaysToCompute(String e) {
        List<Integer> r = new ArrayList<>();

        if (!e.contains("+") && !e.contains("-") && !e.contains("*")) {
            r.add(Integer.parseInt(e));
            return r;
        }
        for (int i = 0; i < e.length(); i++) {
            char c = e.charAt(i);
            if (c == '+' || c == '-' || c == '*') {
                List<Integer> l = diffWaysToCompute(e.substring(0, i));
                List<Integer> ri = diffWaysToCompute(e.substring(i + 1));

                for (int a : l) for (int b : ri) {
                    if (c == '+') r.add(a + b);
                    else if (c == '-') r.add(a - b);
                    else r.add(a * b);
                }
            }
        }
        return r;
    }
}