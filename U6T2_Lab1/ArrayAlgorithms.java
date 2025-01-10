// public class ArrayAlgorithms {

//     public static String[] stringToArray(String myStr) {
//         String[] str = new String[myStr.length() - 1];
//         for (int i = 0; i < myStr.length() - 1; i++) {
//             str[i] = myStr.substring(i, i + 1);
//         }
//         return str;

//     }

//     /**
//      * This method checks each Person in the people array, and if they
//      * are an adult (at least 18 years old), they introduce themselves
//      * (i.e. by calling the introduce() method)
//      *
//      * PRECONDITION: people.length > 0
//      */
//     public static void introduceAdults(String[] people) {
//         for (int i = 0; i < people.length; i++) {
//             if (people[i].getAge() >= 18) {
//                 people[i].introduce();
//             }
//         }
//     }

//     /**
//      * Prints each String in wordList, on its own line, in reverse order;
//      * the characters of each string are also reversed.
//      *
//      * PRECONDITION: wordList.length > 0
//      */
//     public static void reversePrint(String[] wordList) {
//         for (int i = wordList.length - 1; i >= 0; i--) {
//             for (int x = wordList[i].length() - 1; x >= 0; x--) {
//                 System.out.print(wordList[i].charAt(x));
//             }
//             System.out.println("");
//         }
//     }

//     public static int[] combine(int[] arr1, int[] arr2) {
//         int combinedLength = arr1.length + arr2.length;
//         int[] output = new int[combinedLength];
//         for (int i = 0; i < arr1.length; i++) {
//             output[i] = arr1[i];
//         }
//         for (int i = arr1.length; i < combinedLength; i++) {
//             output[i] = arr2[i - arr1.length];
//         }
//         return output;
//     }

// }
