public class Review01 {
    public static void main(String args[]){
        Student st1, st2, st3;
        st1 = new Student("2201", "Sato", 1981, 2, 10);
        st3 = new Student("2202", "Goto", 1982, 10, 15);
        System.out.println(st1.getId() + " : " + st1.getName() + "さん");
        st2 = st1;
        System.out.println(st2.getId() + " : " + st2.getName() + "さん");
        st1.setName("Kato");
        System.out.println(st2.getId() + " : " + st2.getName() + "さん");
        System.out.println(st3.getId() + " : " + st3.getName() + "さん");
    }
}
