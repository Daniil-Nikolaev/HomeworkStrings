import java.util.Arrays;

public class StringsArr {
    String str1 = null;
    String str2 = null;
    String str3 = null;

    //2.
    void sort(String str1, String str2, String str3) {
        String[] arr = {str1, str2, str3};
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j].length() > arr[j + 1].length()) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    //3.
     void middle (String str1, String str2, String str3) {
         String[] arr = {str1, str2, str3};
         int mid = (str1.length() + str2.length() + str3.length()) / 3;
         for (int i = 0; i < arr.length; i++) {
             if (arr[i].length() < mid) {
                 System.out.println(arr[i]+" - ее длина: "+arr[i].length());
             }
         }
     }
     //4.
    void different(String str1, String str2, String str3) {
        String[] arr = {str1, str2, str3};
        for (int i = 0; i <arr.length; i++) {
            char[] wordToChar = arr[i].toCharArray();
            for (int j = 1; j < wordToChar.length-1; j++) {
                if (wordToChar[j] == wordToChar[j - 1]) {
                    break;
                } else {
                    System.out.println(arr[i]);
                    break;
                }
            }

        }
    }
}
