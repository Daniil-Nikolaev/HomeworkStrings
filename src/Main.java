import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 3 строки");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String str3 = sc.nextLine();

        StringFormater stringFormater = new StringFormater();
        //1.
        stringFormater.longest(str1,str2,str3);
        stringFormater.shortest(str1,str2,str3);
        //2.
        StringsArr arr = new StringsArr();
        arr.sort(str1,str2,str3);
        //3.
        arr.middle(str1,str2,str3);
       //4.
        arr.different(str1,str2,str3);
        //5.
        stringFormater.duplicate(str1);
        //6.
        System.out.println("Введите строку для поиска палиндрома:");
        String string=sc.nextLine();
        String[] stringToWords = string.split(" ");
        stringFormater.palindromes(stringToWords);




    }
}