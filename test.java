import java.util.Scanner;

public class test {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print("Lutfen Bir Sayi Giriniz :");
        int number = inp.nextInt();

        int basNumber = 0 , tempNumber = number;
        int basValue;
        int basPow;
        int result = 0;

        while (tempNumber != 0) {
            tempNumber /= 10;
            basNumber++;
        }

        tempNumber = number;
        while (tempNumber != 0){
            basValue = tempNumber % 10;
            basPow = 1;
            for (int i = 1; i <= basNumber; i++){
                basPow *= basValue;
            }
            result += basPow;
            tempNumber /= 10;
        }
        if (result == number){
            System.out.println(number+ " sayisi bir Armstrong sayisidir.");
        }else{
            System.out.println(number+ " sayisi bir Armstrong sayisi degildir.");
        }
        }
    }







