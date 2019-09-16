abstract public class Student2 {
    protected String name; //氏名*1
    protected double attendRatio; //出席率
    public String getName(){ return name; }//氏名を返す
    public String toString(){ //情報を整形して文字列化して返す
        return "【" + name + "】"; //氏名を括弧で囲った文字列を返す
    }
    public abstract boolean canNextGrade(); //進級可能かどうか返す(抽象ﾒｿｯﾄﾞ)
}
