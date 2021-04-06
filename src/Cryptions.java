public class Cryptions {

    public static int[] encrypt(int[] array, Key key){
        int e=key.getKey1();
        int n=key.getKey2();
        int array2[]=new int[array.length];
        String binaryReverse=Utils.getReverseBinaryRepresentation(e);
        for(int i=0;i<array.length;i++)
        {
            array2[i]=Utils.getModulo(array[i],binaryReverse,n);
        }
        return array2;
    }

    public static int[] decrypt(int[] array, Key key){
        int d=key.getKey1();
        int n=key.getKey2();
        String binaryReverse=Utils.getReverseBinaryRepresentation(d);
        int array2[]=new int[array.length];
        for(int i=0;i<array.length;i++)
        {
        array2[i]=Utils.getModulo(array[i],binaryReverse,n);
        }
        return array2;
    }



}
