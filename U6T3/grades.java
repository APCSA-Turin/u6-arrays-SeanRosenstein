public class grades {
    public static void main(String[] args) {
        int[] grades = {75, 80, 82, 78, 92};
        for (int i = 0 ; i <= grades.length-1 ; i++){
            grades[i]+=5;
        }
        for (int n : grades){
            System.out.println(n);
        }
    }
}
