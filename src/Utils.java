import java.math.BigInteger;
import java.lang.Math;


public class Utils {

    final static int maxPrime = 2000;
    final static int minPrime = 15;
    final static int maxPublicKey =13;
    final static int minPublicKey = 3;

    public static int generateUniquePrime(int p) {
        int prime;
        while (true) {
            int count = 0;
            double x = Math.random();
            double y = maxPrime * x;
            double z = Math.ceil(y);
            prime = (int) z;
            if (prime >= minPrime) {
                for (int i = 1; i <= prime; i++) {
                    int mod = prime % i;
                    if (mod == 0) {
                        count++;
                    }
                }
                if (count == 2 && prime > 1 && prime != p) {
                    return prime;
                }
            }
        }

    }

    public static int generatePublicKey(int phi) {
        BigInteger b1 = BigInteger.valueOf(phi);
        int random;
        while (true) {
            double x = Math.random();
            double y = maxPublicKey * x;
            double z = Math.ceil(y);
            random = (int) z;
            BigInteger b2 = BigInteger.valueOf(random);

            BigInteger gcd = b1.gcd(b2);
            if (gcd.equals(BigInteger.valueOf(1)) && random>=minPublicKey) {
                return random;
            }
        }

    }

    public static int generatePrivateKey(int e, int phi) {
        for (int i = 0; true; i++) {
            if ((i * e) % phi == 1) {
                return i;
            }
        }
    }

    public static int getModulo(int base, String biRepRev, int mod){
        long prod=1;
        long a=base%mod;
        long b=(a*a)%mod;
        for(int i=0;i<biRepRev.length();i++){
            if(biRepRev.charAt(i)=='1'){
                prod=((prod*a))%mod;
            }
            a=b%mod;
            b=(a*a)%mod;
        }
        int fin= (int) (prod%mod);
        return fin;
    }
public static String getReverseBinaryRepresentation(int number)
{
    String binaryReverse=Integer.toBinaryString(number);
    StringBuilder stringBuilder=new StringBuilder();
    binaryReverse=stringBuilder.append(binaryReverse).reverse().toString();
    return binaryReverse;
}
}
