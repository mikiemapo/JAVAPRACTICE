package ExceptionsAndErrors;

class OddCalc {

    public int sumOddNumbers(int a, int b) throws EvenNumberException {
        if (a % 2 == 0) {
            throw new EvenNumberException("First input was even!");
        } else if (b % 2 == 0) {
            throw new EvenNumberException("Second input was even!");
        }
        return a + b;
    }

    public int sumDifferentOddNumbers(int a, int b) throws EvenNumberException, DuplicateInputException {
        if (a % 2 == 0 || b % 2 == 0) {
            throw new EvenNumberException("One or more input was even");
        }
        if (a == b) {
            throw new DuplicateInputException();
        }
        return a + b;
    }

}
