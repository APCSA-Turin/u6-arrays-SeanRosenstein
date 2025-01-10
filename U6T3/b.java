public class b {
    public static void main(String[] args) {
        Person p1 = new Person("Adam", 12);
        Person p2 = new Person("Barb", 15);
        Person p3 = new Person("Cathy", 14);
        Person p4 = new Person("Fred", 16);

        Person[] people = {p1,p2,p3,p4};
        
        for (Person n : people) {
            String upper = n.getName().toUpperCase();
            n.setName(upper);
            n.introduce();
        }
    }
}