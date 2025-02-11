package String;

public class Aula1 {
    public static void main(String[] args) {

        String original = "abcde FGHIJ abc DEFG   ";

        String s01 = original.toLowerCase(); // transforma em minusculo
        String s02 = original.toUpperCase(); // transforma em maiusculo
        String s03 = original.trim(); // tira o espaço das extremidades
        String s04 = original.substring(2); // mostra a partir do caracter em ()
        String s05 = original.substring(2, 9); // mostra o que está entre os números
        String s06 = original.replace('a', 'x'); // troca o 'a' por 'x'
        String s07 = original.replace("abc", "xy"); // troca o 'abc' por 'xy'
        int i = original.indexOf("bc"); // procura onde aparece o primeiro 'bc'
        int j = original.lastIndexOf("bc"); // procura onde mostra o último 'bc'

        System.out.println("Original: -" + original + "-");
        System.out.println("toLowerCase: -" + s01 + "-");
        System.out.println("toUpperCase: -" + s02 + "-");
        System.out.println("trim: -" + s03 + "-");
        System.out.println("substring(2): -" + s04 + "-");
        System.out.println("substring(2, 9): -" + s05 + "-");
        System.out.println("replace('a', 'x'): -" + s07 + "-");
        System.out.println("replace('abc', 'xy'): -" + s06 + "-");
        System.out.println("Index of 'bc: -" + i + "-");
        System.out.println("Last index of 'bc: -" + j + "-");

        String s = "potato apple lemon";

        String[] vect = s.split(" "); // procura pelo elemento e separa em vetores
        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);
    }
}
