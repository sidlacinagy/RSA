public class KeyGenerator {

    public static KeySet Generate(){
        int privateKey;
        int publicKey;
        int p= Utils.generateUniquePrime(1);
        int q= Utils.generateUniquePrime(p);
        int phi=(p-1)*(q-1);
        int n=p*q;
        publicKey= Utils.generatePublicKey(phi);
        privateKey = Utils.generatePrivateKey(publicKey, phi);
        KeySet keySet=new KeySet(publicKey,privateKey,n);
        return keySet;
    }
}
