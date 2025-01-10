public class ArrayAlgorithms {

    private ArrayAlgorithms() { }

    public static int[] multiplyByNoModify(int[] numList, int multiplier) {
        int[] multiplied = numList;
        for (int i = 0; i < numList.length; i++) {
            multiplied[i] = numList[i] * multiplier;
        }
        return multiplied;
    }
    public class ContainsPositive {
        public static boolean containsPositive(int[] numList) {
            for (int n : numList) {
                if (n > 0) {
                    return true;
                }
            }
            return false;
        }
    
    }
    


    public class LongestString {
        public static String longestString(String[] stringList) {
            String output = "";
            for (String n : stringList){
                if (n.length()>=output.length()){
                    output=n;
                }
            }
            return output;
          }
        
    }
    

    public static String[] makeLowercase(String[] wordList) {

    }






    public static int endsInExclamations(String[] stringList) {

    }


  public static void makeUppercase(String[] wordList){

}

public static int[] arrayMaximums(int[] intArr1, int[] intArr2) {

}


public static int countConsecutiveDoubles(int[] numList) {

}

public static int longestStreak(int[] nums) {

}




}
