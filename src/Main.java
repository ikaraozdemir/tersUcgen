import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int stepNum;
        //Kullanıcıdan input alalım
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayısı giriniz: ");
        stepNum = input.nextInt();
        //Büyüklüğü girilen basamak sayısına bağlı olan ve
        // ikişer olarak azalan yıldızlardan oluşan ters üçgen oluşturalım.
        for (int i = (stepNum*2); i>=0 ;i-=2){
            for (int j = 1; j<i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}