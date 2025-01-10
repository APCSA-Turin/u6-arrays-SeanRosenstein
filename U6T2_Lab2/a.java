package U6T2_Lab2;

public class a {

    public static String[] stringToArray(String myStr) {
        String[] str = new String[myStr.length() - 1];
        for (int i = 0; i < myStr.length() - 1; i++) {
            str[i] = myStr.substring(i, i + 1);
        }
        return str;

    }

    /**
     * This method checks each Person in the people array, and if they
     * are an adult (at least 18 years old), they introduce themselves
     * (i.e. by calling the introduce() method)
     *
     * PRECONDITION: people.length > 0
     */
    // public static void introduceAdults(String[] people) {
    // for (int i = 0; i < people.length; i++) {
    // if (people[i].getAge() >= 18) {
    // people[i].introduce();
    // }
    // }
    // }

    /**
     * Prints each String in wordList, on its own line, in reverse order;
     * the characters of each string are also reversed.
     *
     * PRECONDITION: wordList.length > 0
     */
    public static void reversePrint(String[] wordList) {
        for (int i = wordList.length - 1; i >= 0; i--) {
            for (int x = wordList[i].length() - 1; x >= 0; x--) {
                System.out.print(wordList[i].charAt(x));
            }
            System.out.println("");
        }
    }

    public static int[] combine(int[] arr1, int[] arr2) {
        int combinedLength = arr1.length + arr2.length;
        int[] output = new int[combinedLength];
        for (int i = 0; i < arr1.length; i++) {
            output[i] = arr1[i];
        }
        for (int i = arr1.length; i < combinedLength; i++) {
            output[i] = arr2[i - arr1.length];
        }
        return output;
    }

    public static void bookEnd(int[] nums, int num) {
        nums[0] = num;
        nums[nums.length - 1] = num;
    }

    public static void multiplyBy(int[] numlist, int multiplier) {
        for (int i = 0; i < numlist.length; i++) {
            numlist[i] = numlist[i] * multiplier;
        }
    }

    public static int[] multiplyByNoModify(int[] numList, int multiplier) {
        int[] multiplied = new int[numList.length];
        for (int i = 0; i < numList.length; i++) {

            multiplied[i] = numList[i] * multiplier;
        }
        return multiplied;

    }

    public static void addExclamation(String[] wordList) {
        for (int i = 0; i < wordList.length; i++) {
            String word = wordList[i];
            String lastChar = word.substring(word.length() - 1);
            if (!lastChar.equals("!")) {
                wordList[i] = wordList[i] + "!";
            }
        }
    }

    public static boolean[] isFreezing(int[] tempList) {
        boolean[] freezing = new boolean[tempList.length];
        for (int i = 0; i < freezing.length; i++) {
            if (tempList[i] <= 32) {
                freezing[i] = true;
            } else {
            }
            freezing[i] = false;
        }
        return freezing;
    }



    public static void shiftLeft (int[] numList){
        int firstNum = numList[0];
        for (int i = 1 ; i<numList.length ; i++){
            numList[i-1]=numList[i];
        }
        numList[numList.length-1]=firstNum;
    }

    public static void shiftRight (int[] numList){
        int lastNum = numList[numList.length-1];
        for (int i = numList.length-1 ; i>=1 ; i--){
            numList[i]=numList[i-1];
        }
        numList[0]=lastNum;
    }

    
public static void reverse1 (int[] numList) {
    int[] copy = new int[numList.length];
    for (int i = 0; i < numList.length; i++) {
    copy[i] = numList[i];
    }
    for (int i = 0; i < numList.length; i++) {
    int index = numList.length - i - 1;
    numList[index] = copy[i];
    }
}

public static void reverse2 (int[] numList) {
for (int i = 0 ; i<numList.length/2 ; i++){
    int temp = numList[i];
    int index = numList.length-i-1;
    numList[i]=numList[index];
    numList[index]=temp;
    }
}

}