public class Cryptions {

    public static int[] crypt(int[] array, Key key){
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

}
