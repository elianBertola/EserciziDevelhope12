public class Eccezione {
    public boolean checkNumber(int number, int maxNumber, int minNumber) {
        if (number >= minNumber && number <= maxNumber) {
            return true;
        } else {
            throw new ArithmeticException(number + " non e in rango");
        }
    }
}
