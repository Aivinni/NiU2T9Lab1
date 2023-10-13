public class LuckyNumbers {
    public LuckyNumbers() { }

    public int randomIntegerBetween(int min, int max) {
        return (int) (Math.random() * ((max - min) + 1)) + min;
    }
    public String getLuckyNumbers() {
        return (randomIntegerBetween(1, 65) + ", " + randomIntegerBetween(1, 65) + ", " + randomIntegerBetween(1, 65) + ", " + randomIntegerBetween(1, 65) + ", " + randomIntegerBetween(1, 65) + ", " + randomIntegerBetween(1, 30));

    }
}