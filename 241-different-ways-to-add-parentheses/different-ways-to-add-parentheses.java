class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> result = new ArrayList<>();

        if (!expression.contains("+") && !expression.contains("-") && !expression.contains("*")) {
            result.add(Integer.parseInt(expression));
            return result;
        }
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == '+' || c == '-' || c == '*') {
                String left = expression.substring(0, i);
                String right = expression.substring(i + 1);
                
                List<Integer> leftResults = diffWaysToCompute(left);
                List<Integer> rightResults = diffWaysToCompute(right);

                for (int leftVal : leftResults) {
                    for (int rightVal : rightResults) {
                        switch (c) {
                            case '+':
                                result.add(leftVal + rightVal);
                                break;
                            case '-':
                                result.add(leftVal - rightVal);
                                break;
                            case '*':
                                result.add(leftVal * rightVal);
                                break;
                        }
                    }
                }
            }
        }
        return result;
    }
}