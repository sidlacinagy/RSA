public class KeySet {
    private Key publicKey;
    private Key privateKey;

    public Key getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(Key publicKey) {
        this.publicKey = publicKey;
    }

    public Key getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(Key privateKey) {
        this.privateKey = privateKey;
    }
    public KeySet(int pub, int priv, int n){
        publicKey=new Key(pub, n);
        privateKey=new Key(priv,n);
    }

    @Override
    public String toString() {
        return "publicKey= " + publicKey + "; privateKey= " + privateKey;

    }
}
