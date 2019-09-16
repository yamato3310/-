package model;

public class Student {
    private String id; //学籍番号
    private String name; //氏名
    public Student(String id, String name){ //値代入用のコンストラクタ
        this.id = id;
        this.name = name;
    }
    public String getId(){ //学籍番号を返すメソッド
        return id;
    }
    public String getName(){ //氏名を返すメソッド
        return name;
    }
    public void setName(String name){ //氏名を変更するメソッド
        this.name = name;
    }
}