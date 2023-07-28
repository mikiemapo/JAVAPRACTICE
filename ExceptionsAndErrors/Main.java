package ExceptionsAndErrors;

class Main {
    public static void main(String[] args) {
        OddCalc calc = new OddCalc();
        try {
            // int sum = calc.sumOddNumbers(1, 4);
            int sum = calc.sumDifferentOddNumbers(3, 3);
            System.out.println(sum);
        } catch (EvenNumberException e) {
            e.printStackTrace();
        } catch (DuplicateInputException e) {
            e.printStackTrace();
        }
    }
}
