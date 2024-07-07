class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        
        int bottles = numBottles;
        int carry = 0;
        
        while (numBottles + carry >= numExchange) {
            int newBottles = (numBottles + carry) / numExchange;
            carry = (numBottles + carry) % numExchange;
            bottles += newBottles;
            numBottles = newBottles;
        }
        return bottles;
    }
}
