public class Key {
    private int Key1;
    private int Key2;

    public int getKey1() {
        return Key1;
    }

    public int getKey2() {
        return Key2;
    }

    public void setKey1(int key1) {
        Key1 = key1;
    }

    public void setKey2(int key2) {
        Key2 = key2;
    }

    public Key(int a, int b) {
        Key1=a;
        Key2=b;
    }

    @Override
    public String toString() {
        return "("+ Key1 + "," + Key2+")";
    }
}
