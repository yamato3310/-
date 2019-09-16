package controller;
import model.Student;
import view.ConsoleView;
import java.io.*; //例外処理のために必要
public class StudentApp {
    private static int studentCnt = 0; //学生数
    private static ConsoleView view; //ビュー
    private static Student[] studentTbl; //学生配列
    public static void main(String args[]) throws IOException{ //メイン
        studentTbl = new Student[10]; //配列生成
        view = new ConsoleView(); //ビュー生成
        view.display(); //ﾒﾆｭｰ表示を依頼
    }
    public static boolean addStudent(String id, String name){ //学生追加
        if(studentCnt >= 10){ return false; } //配列が一杯なら失敗
        studentTbl[studentCnt] = new Student(id, name); //学生の生成と登録
        studentCnt++; //学生数を＋１
        return true; //追加成功
    }
    public static boolean deleteStudent(String id){ //学生削除
        int idx = findStudent(id); //該当学生を検索
        if(idx == -1){ return false; } //見つからなければ失敗
        for(int i = idx+1; i < studentCnt; i++){ //見つけた位置以降を前に詰める
            studentTbl[i-1] = studentTbl[i];
        }
        studentCnt--; //学生数を－１
        return true; //削除成功
    }
    private static int findStudent(String id){ //学生検索
        for(int i = 0; i < studentCnt; i++){ //学生数ぶんループ
            if(studentTbl[i].getId().equals(id) == true){//学籍番号が一致？
                return i; //見つけた位置を返す
            }
        }
        return -1; //見つからない場合
    }
    public static Student[] getStudentTbl(){
        Student wTbl[] = new Student[studentCnt]; //返却用の配列を生成
        System.arraycopy(studentTbl,0, wTbl,0, studentCnt); //配列をコピー
        return wTbl; //コピーを返す
    }
}

