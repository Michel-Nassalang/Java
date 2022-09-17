package Codage_TP;

import java.util.Scanner;

public class TP7 {
    public static void polynome(int r){
        int n = (int) (Math.pow(2, r) - 1);
        int k = n-r;
        System.out.println("Le code de Hamming est de longueur: "+ n + " et de dimension " + k + ".");
        int el = (int) (Math.pow(2, r));
        System.out.println("Veuillez donner successivement au maximum "+ el + " mots de code de longueur " + n + ": ");
        String[] Tab = new String[el];
        int[] nb = new int[el];
        for (int i = 0; i < el; i++) {
            Scanner scan = new Scanner(System.in);
                String bins = scan.next();
                boolean isValid = true;
                if(bins.length() != n){ // on vérifie la longueur
                    isValid = false;
                }
                for (int j = 0; j < bins.length() - 1; j++) { // on vérifie si on a que des bits
                    if (bins.charAt(j) != '1' && bins.charAt(j) != '0') {
                        isValid = false;
                    }
                }
                if (isValid) {
                    Tab[i] = bins;
                }else{
                    System.out.println("Le mot que vous avez saisi est incorrect.");
                }
            if (Tab[i] != null) {
                int nbe = 0;
                for (int index = 0; index < Tab[i].length(); index++) {
                    if (Tab[i].charAt(index) == '1') {
                        nbe++;
                    }
                }
                nb[i] = nbe;
            }
        } // fin ajout de mot de code
        int coef[] = new int[n];
        for (int l = 0; l < n; l++) {
            int c = 0;
            for (int j = 0; j < el; j++){
                if(nb[j] == l){
                    c++;
                }
            }
            coef[l] = c;
        }
        String[] terme = new String[n];
        System.out.print("Le polynome énumérateur de poids est: ");
        for (int t = 0; t < n-1; t++) {
            if(t==0){
                terme[t] = String.valueOf(coef[t]);
            }else{
                terme[t] = coef[t] + "x^" + t;
            }
            if(coef[t] != 0){
                System.out.print(terme[t] + " + ");
            }
        }
        System.out.print(terme[n]);
    }
    public static void main(String[] args) {
        System.out.print("Veuillez donner r pour définir la longueur du code de Hamming: ");
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        polynome(r);
    }
}
