public class Review03 {
    public static void main(String args[]){
        NormalStudent ns1 = new NormalStudent("Sato", 0.76, 80);//一般学生
        ScholarStudent ss1 = new ScholarStudent("Goto", 0.78, 'A');//奨学生
        System.out.print(ns1.toString()); //一般学生の情報出力
        if(ns1.canNextGrade() == true){ //進級可能かどうか？
            System.out.println("¥t→進級可");
        }else{
            System.out.println("¥t→進級不可");
        }
        System.out.print(ss1.toString()); //奨学生の情報出力
        if(ss1.canNextGrade() == true){ //進級可能かどうか？
            System.out.println("¥t→進級可");
        }else{
            System.out.println("¥t→進級不可");
        }
    }
}