import jdk.jshell.execution.Util;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean generate=false;
        int key1=0;
        int key2=0;
        Key key = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ha titkosítani akar írjon False-t, ha visszafejteni akkor True-t");
        boolean cryption = scanner.nextBoolean();
        if(!cryption){
            System.out.println("Ha meglévő kulcsot akar használni írjon False-t, ha generálni akar, True-t");
            generate = scanner.nextBoolean();
        }
        if(!generate){
            System.out.println("Adja meg a kulcs első értékét: ");
            key1=scanner.nextInt();
            System.out.println("Adja meg a kulcs második értékét: ");
            key2=scanner.nextInt();
            key=new Key(key1,key2);
        }
        System.out.println("Adja meg, hogy mennyi üzenetet akar titkosítani/visszafejteni: ");
        int messageNumber = scanner.nextInt();
        int messageArray[]=new int[messageNumber];
        for(int i=0;i<messageNumber;i++)
        {
            System.out.println("Adja meg az "+(i+1)+". üzenetet:");
            messageArray[i]=scanner.nextInt();
        }

        if(!cryption && generate){
            KeySet keySet=KeyGenerator.Generate();
            int encrypted1[]=Cryptions.crypt(messageArray,keySet.getPublicKey());
            System.out.println(keySet);
            System.out.println(Arrays.toString(encrypted1));
        }
        if(!cryption && !generate){
            int encrypted2[]=Cryptions.crypt(messageArray,key);
            System.out.println(Arrays.toString(encrypted2));
        }
        if(cryption){
            int decrypted[]=Cryptions.crypt(messageArray,key);
            System.out.println(Arrays.toString(decrypted));
        }




    }
}
