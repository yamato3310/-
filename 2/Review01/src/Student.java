public class Student {
    private String id; //学籍番号
    private String name; //氏名
    private int bYear, bMonth, bDay; //誕生年・月・日

    public Student(String id, String name, int bYear, int bMonth, int bDay) {
        this.id = id; //各フィールドに値を代入*4
        this.name = name;
        this.bYear = bYear;
        this.bMonth = bMonth;
        this.bDay = bDay;
    }

    //学籍番号を返すメソッド(Getter)
    public String getId(){ return id; }
    //氏名を返すメソッド(Getter)
    public String getName(){ return name; }
    //氏名を変更するメソッド(Setter)
    public void setName(String name){
        this.name = name;
    }
    //誕生日を整形した文字列で返すメソッド
    public String getBirthDayString(){
        String buf;
        buf = bYear + "/";
        buf = buf + bMonth + "/";
        buf = buf + bDay;
        return buf;
    }
    //引数に渡された日付時点での年齢を計算して返すメソッド
    public int calcAge(int compYear, int compMonth, int compDay){
        int age = compYear - bYear; //とりあえず誕生日後の年齢
        if(compMonth*100+compDay < bMonth*100+bDay){ //誕生日前の場合
            age--; //年齢を調整
        }
        return age;
    }

}
