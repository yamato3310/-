public class Group {
    private String name; //グループ名
    private Student members[]; //所属する学生群
    private int memberCnt = 0; //学生の人数

    //グループ名と所属する学生の最大数を決めるコンストラクタ
    public Group(String name, int maxCnt) {
        this.name = name; //グループ名の設定
        members = new Student[maxCnt]; //Student配列の要素を生成
    }

    //グループ名を返すメソッド(Getter)
    public String getName() {
        return name;
    }

    //所属する学生群(配列)のコピーを返すメソッド
    public Student[] getMembers() {
        Student mCopy[] = new Student[memberCnt]; //ピッタリサイズの配列を生成
        System.arraycopy(members, 0, mCopy, 0, memberCnt);
        return mCopy; //↑配列のコピー*2
    }

    //所属する学生を追加するメソッド
    public void addStudent(Student st){
        members[memberCnt] = st;
        memberCnt++;
    }
    //所属する学生を検索する(名前で)メソッド
    public Student findStudent(String name){
        int i;
        for(i = 0; i < memberCnt; i++){
            if(members[i].getName().equals(name) == true){ //名前を比較する*3
                return members[i]; //見つかったら返す
            }
        }
        return null; //見つからなかったらnullを返す
    }
}