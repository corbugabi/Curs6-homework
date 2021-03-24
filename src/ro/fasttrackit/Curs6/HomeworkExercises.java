package ro.fasttrackit.Curs6;

import java.util.Random;

public class HomeworkExercises {
    public static void main(String[] args) {
        System.out.println(sum(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println(countImpare(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        numereUp(new int[]{12,45,66,21,6,124,35,73} , 50);
        donatii(5000000);
        campanieDonatii(5000000, 100);
        split("Ana.are.mere.rosii.si.verzi");
    }

    public static void split(String fraza){
        System.out.println("----------------");
        String[] tokens =  fraza.split(".", 2);
            for(String token: tokens) {

                System.out.println(token);
            }
    }

    public static void campanieDonatii(int targetDonatii, int maximDonatii){
        System.out.println("----------------");
        int countDonatii=0;
        int numarDonatii=0;
        while(maximDonatii>0) {
            Random random = new Random();
            int rand = random.nextInt();
            countDonatii += rand;
            numarDonatii++;
            maximDonatii--;
        }
            System.out.println("Compania este inchisa." + "Donatii totale:" + numarDonatii + "." + " Suma stransa este: " + countDonatii);

        }



    public static void donatii(int targetDonatii){
        System.out.println("----------------");
        int countDonatii=0;
        while(countDonatii<=targetDonatii) {
            Random random = new Random();
            int rand = random.nextInt();
            countDonatii += rand;
        }
        System.out.println("Succes");
    }

    public static void numereUp(int elemente[],int numar){
        System.out.println("----------------");
        for(int element : elemente){
            if (element>numar){
                System.out.println(element);
            }
            }
    }

    public static int countImpare(int numere[]){
        System.out.println("----------------");
        int count=0;
        for(int numar : numere){
            if(numar%2 !=0){
                count++;
            }
        }
        return count;
    }

    public static int sum(int elemente[]) {
        System.out.println("----------------");
        int suma = 0;
        for (int elem : elemente) {
            suma += elem;

        }
        return suma;
    }
}