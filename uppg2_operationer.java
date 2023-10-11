package Uppg2_Operationer;

import java.util.Scanner;

public class uppg2_operationer {
    public static void main(String[] args) {
        try (Scanner tangentbord = new Scanner(System.in)) {

        System.out.println("Ange ett tal: ");
        double heltal = tangentbord.nextDouble();
        
        long avrundat_tal = (long) (heltal / 100.0)*100;
        if ((heltal - avrundat_tal)>= 50){
          avrundat_tal+=100;
        } else if ((heltal-avrundat_tal)<50){
          avrundat_tal=avrundat_tal+1-1;
        }

        System.out.println("Ditt tal avrundat till närmast tusental är: "+avrundat_tal);

        tangentbord.nextLine();

        System.out.println("Mata in täljare och nämnare: ");
        double täljare = tangentbord.nextDouble();
        double nämnare = tangentbord.nextDouble();

        double svar = täljare/nämnare;
        int svar2 = (int)svar;
        double svar3 = (svar-svar2)*nämnare;
        int svar4 = (int)svar3;

        System.out.println(svar2+" + "+svar4+"/"+nämnare);
    }
}
}
