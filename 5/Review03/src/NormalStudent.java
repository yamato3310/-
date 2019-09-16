public class NormalStudent extends Student2 { //「一般学生」ｸﾗｽ(学生の一種)
    private int score; //期末試験の得点
    //各属性(Student2から継承したものも含めて)に値をセットするメソッド
    public NormalStudent(String name, double attendRatio, int score){
        this.name = name; //氏名(継承)の代入 *3
        this.attendRatio = attendRatio; //出席率(継承)の代入
        this.score = score; //期末試験得点の代入
    }
    public int getScore(){ return score; } //期末試験得点を返すメソッド
    public String toString(){ //情報を整形して返すｵｰﾊﾞﾗｲﾄﾞﾒｿｯﾄﾞ
        String base = super.toString(); //継承したﾒｿｯﾄﾞを呼び出す*4
        return "一般学生" + base + " 得点: " + score + "点";
    } //↑得点を連結して返す
    public boolean canNextGrade(){ //進級可能かどうか判断するﾒｿｯﾄﾞ
        if(attendRatio >= 0.75 && score >= 60){ //出席率75%以上かつ得点60点以上
            return true; //進級可能！
        }
        return false;
    }
}
