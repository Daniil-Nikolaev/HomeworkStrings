import java.util.Scanner;

public class StringFormater {
    //1.
    void longest(String str1, String str2, String str3) {
        String longest = str1;
        if (str1.length() > str2.length() && str1.length() > str3.length()) {
            longest = str1;
        }
        if (str2.length() > str1.length() && str2.length() > str3.length()) {
            longest = str2;
        }
        if (str3.length() > str1.length() && str3.length() > str2.length()) {
            longest = str3;
        }
        System.out.println("Самая длинная строка:"+longest+",ее длина "+longest.length());
    }
    void shortest (String str1, String str2, String str3) {
        String shortest = str2;
        if (str1.length() < str2.length() && str1.length() < str3.length()) {
            shortest = str1;
        }
        if (str2.length()<str1.length() && str2.length() < str3.length()) {
            shortest = str2;
        }
        if (str3.length() < str1.length() && str3.length() < str2.length()) {
            shortest = str3;
        }
        System.out.println("Самая короткая строка:"+shortest+",ее длина "+shortest.length());
    }
    //5.
    void duplicate(String str) {
        char[] strArr=str.toCharArray();
        for(int i=0;i<strArr.length;i++) {
            System.out.print(strArr[i]);
            System.out.print(strArr[i]);
        }
    }
    //6.
    void palindromes(String[] str) {
        System.out.println("Выберите слово для проверки: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt()-1;
        if (number>str.length) {
            System.out.println("Ошибка");
        }else{
            char[] wordToChar=str[number].toCharArray();
            for(int i=0;i<wordToChar.length/2;i++) {
                if(wordToChar[i]!=wordToChar[wordToChar.length-i-1]) {
                    System.out.println("Слово "+str[number]+ " не является палиндромом");
                    break;
                }else{
                    System.out.println("Слово "+str[number]+ " является палиндромом");
                }
            }
        }
    }
}
