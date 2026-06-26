class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum = 0;
        int digitsum = 0;
        int temp = x;
        while (temp != 0) {
            int digit = temp % 10;
            digitsum = digitsum + digit;
            temp = temp / 10;
        }
        if (x % digitsum == 0) {
            return digitsum;
        } else {
            return -1;
        }
    }
}