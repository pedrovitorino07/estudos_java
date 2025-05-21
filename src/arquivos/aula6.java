package arquivos;

import java.io.File;
import java.util.Scanner;

public class aula6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a file path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        // nome do arquivo
        System.out.println("getName: " + path.getName());
        // pasta que está o arquivo
        System.out.println("getParent: " + path.getParent());
        // caminho completo do arquivo
        System.out.println("getPath: " + path.getPath());

        sc.close();
    }
}
