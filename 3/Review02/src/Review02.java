public class Review02 {
    private static Group grp; //グループ(参照)
    public static void main(String args[]){
        grp = new Group("2TX", 50); //グループを生成する
        grp.addStudent(new Student("2201", "Sato", 1981, 2, 10)); //学生追加
        grp.addStudent(new Student("2202", "Goto", 1982, 10, 15));//学生追加
        dispMembers();
        Student st = grp.findStudent("Goto"); //「Goto」を探す
        if(st != null){ //見つかったか？
            System.out.println("Goto(" + st.getId() + ") は存在します");
        }
        grp.addStudent(new Student("2203", "Kato", 1980, 5, 9)); //学生追加
        dispMembers(); //一覧出力(19行目のﾒｿｯﾄﾞ呼出し)
    }
    public static void dispMembers(){ //所属生徒一覧を出力するﾒｿｯﾄﾞ
        System.out.println("[" + grp.getName() + "のメンバ]");
        Student members[] = grp.getMembers(); //メンバを取得する
        for(int i = 0; i < members.length; i++){ //メンバ数のループ*6
            System.out.println("¥t" + members[i].getName());
        }
    }
}
