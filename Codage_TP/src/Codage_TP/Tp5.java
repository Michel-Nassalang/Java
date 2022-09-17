package Codage_TP;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tp5 {

    public static void poids_faible() {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Veuillez donner un mot : ");
            String mot = scan.nextLine();
            System.out.print("Veuillez donner le nombre de bits de poids faible à renvoyer :");
            int num;
            do{
                try {
                    num = scan.nextInt();
                    String len = "";
                    byte[] bytes = mot.getBytes();
                    for (byte b : bytes) {
                        len = len + Integer.toBinaryString(b);
                    }
                    if (num <= len.length()) {
                        break;
                    }else{
                        System.out.print("Veuillez essayer un entier plus petit:");
                    }
                } catch (InputMismatchException e) {
                    System.out.print("Veuillez essayer de donner un entier :");
                    String a = scan.next();
                }
            }while(true);
            byte[] bytes = mot.getBytes();
            System.out.print("Le mot " + mot + " en binaire donne " + bytes.length + " octets : ");
            for (byte b : bytes) {
                System.out.print(" " + b);
            }
            System.out.println(".");
            String code = "";
            for (byte b : bytes) {
                code = code + Integer.toBinaryString(b);
            }
            // String nb = "";
            // for (int index = num-1; index < code.length(); index++) {
            //     nb = nb+code.charAt(index);
            // }
            System.out.println(code);
            String partie = code.substring(code.length()-num);
            System.out.println("Les "+ num + " bits de poids faible sont : " + partie);
        }
    }

    public static void main(String[] args) {
        poids_faible();
    }
}
