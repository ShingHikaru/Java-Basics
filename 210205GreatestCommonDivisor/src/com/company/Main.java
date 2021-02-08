public class Main {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(12, 20));
    }

//    private static int getGreatestCommonDivisor (int firstNum, int secondNum) {
//        BigInteger b1 = BigInteger.valueOf(firstNum);
//        BigInteger b2 = BigInteger.valueOf(secondNum);
//        BigInteger gcd = b1.gcd(b2);
//        return gcd.intValue();
//    }

    public static int getGreatestCommonDivisor(int firstNum, int secondNum) {
        for (int i=0; i<firstNum && i<secondNum; i++) {
            if ((firstNum % i == 0) && (secondNum % i == 0)) {
                int gcd = i;
                return gcd;
            }else{
                return -1;
            }
            }return -1;
        }
    }
