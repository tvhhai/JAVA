//package   com.company.java.string;;
//
////import org.openjdk.jol.vm.VM;
//
//import sun.misc.VM;
//
//import java.nio.charset.Charset;
//import java.nio.charset.CharsetDecoder;
//import java.nio.charset.CharsetEncoder;
//import java.util.Arrays;
//
//public class JavaString {
//    public static void main(String[] args)  {
//        literalStringvsInstantitatedString();
//        System.out.println("------------------------------------------------------------");
//        literalStringPoolDemo();
//        System.out.println("------------------------------------------------------------");
//        stringFromByteArray();
//        System.out.println("------------------------------------------------------------");
//        stringFromByteArrayWithDefaultCharset();
//        System.out.println("------------------------------------------------------------");
//        stringFromByteArrayWithCharset(Charset.forName("US-ASCII"));
//        System.out.println("------------------------------------------------------------");
//        stringFromByteArrayWithCharset(Charset.forName("UTF-8"));
//        System.out.println("------------------------------------------------------------");
//        stringFromCharArray();
//        System.out.println("------------------------------------------------------------");
//        stringFromIntArray();
//        System.out.println("------------------------------------------------------------");
//        stringFromStringBuffer();
//        System.out.println("------------------------------------------------------------");
//        stringFromStringBuilder();
//        System.out.println("------------------------------------------------------------");
//        stringFromSurrogates();
//    }
//
//    private static void literalStringvsInstantitatedString() {
//        // Declare String without using new operator
//        String string1 = "A constant pool string";
//        System.out.println("String string1 = " + string1);
//        System.out.println("string1 memory address : " + VM.current().addressOf(string1));
//
//        // Declare String using new operator
//        String string2 = new String("A dynamic string");
//        System.out.println("String string2 = " + string2);
//        System.out.println("string2 memory address : " + VM.current().addressOf(string2));
//
//        String string3 = string2 + string1;
//        System.out.println("String string3 = " + string3);
//        System.out.println("string3 memory address : " + VM.current().addressOf(string3));
//    }
//
//    private static void literalStringPoolDemo() {
//        String first = "JavaTraining";
//        String second = "JavaTraining";
//        System.out.println(first == second); // True
//        System.out.println("first memory address : " + VM.current().addressOf(first));
//        System.out.println("second memory address : " + VM.current().addressOf(second));
//    }
//
//
//
//    private static void stringFromByteArray() {
//        byte[] b_arr = {71, 101, 101, 107, 115};
//        String s_byte =new String(b_arr); //Geeks
//        System.out.println("String from byte array = " + s_byte);
//    }
//
//    private static void stringFromByteArrayWithDefaultCharset() {
//        byte[] b_arr = {71, 101, 101, 107, 115};
//        Charset cs = Charset.defaultCharset();
//        String s_byte_char = new String(b_arr, cs); //Geeks
//        System.out.println(String.format("String from byte array = ' %s ' with charset %s aliases %s" , s_byte_char, cs.displayName(), cs.aliases()));
//    }
//
//    private static void stringFromByteArrayWithCharset(Charset cs) {
//        byte[] b_arr = {71, 101, 101, 107, 115};
//        String s = new String(b_arr, cs); //Geeks
//
//        System.out.println(String.format("String from byte array = ' %s ' with charset %s aliases %s" , s, cs.displayName(), cs.aliases()));
//    }
//
//    private static void stringFromCharArray() {
//        char char_arr[] = {'G', 'e', 'e', 'k', 's'};
//        String s = new String(char_arr); //Geeks
//        System.out.println("String from char array = " + s);
//    }
//
//    //uni code code point
//    private static void stringFromIntArray() {
//        int[] uni_code = {71, 101, 101, 107, 115};
//        String s = new String(uni_code, 0, 3); //Geek
//        System.out.println("String from int array = " + s);
//    }
//
//    private static void stringFromStringBuffer() {
//        StringBuffer s_buffer = new StringBuffer("Geeks");
//        String s = new String(s_buffer); //Geeks
//        System.out.println("String from string buffer = " + s);
//    }
//
//    private static void stringFromStringBuilder() {
//        StringBuilder s_builder = new StringBuilder("Geeks");
//        String s = new String(s_builder); //Geeks
//        System.out.println("String from string builder = " + s);
//    }
//
//    private static void stringFromSurrogates() {
//        int[] surrogates = {0xD83D, 0xDC7D};
//        String alienEmojiString = new String(surrogates, 0, surrogates.length);
//        System.out.println(alienEmojiString);
//        System.out.println("\uD83D\uDC7D");
//    }
//}
