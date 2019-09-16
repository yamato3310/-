package view;
import controller.StudentApp; //StudentAppクラスを利用
import model.Student; //Studentクラスを利用
import java.io.*; //入力処理のために必要
public class ConsoleView {
    private BufferedReader bin = //↓キー入力処理のためのｽﾄﾘｰﾑ
            new BufferedReader(new InputStreamReader(System.in));
    public void display() throws IOException{ //メインメニュー表示メソッド*5
        while(true){
            System.out.println("####### 学生管理メニュー#######");
            System.out.println(" 1.学生の追加");
            System.out.println(" 2.学生の削除");
            System.out.println(" 3.学生の一覧表示");
            System.out.println(" 9.終了");
            System.out.print(" >>選択して下さい：");
            int no = Integer.parseInt(bin.readLine());
            System.out.println();
            switch(no){ //入力された値に応じて分岐
                case 1: //学生追加メニュー
                    addStudentView(); //38行目のメソッド呼び出し
                    break;
                case 2: //学生削除メニュー
                    deleteStudentView(); //50行目のメソッド呼び出し
                    break;
                case 3: //学生一覧表示メニュー
                    listStudentView(); //60行目のメソッド呼び出し
                    break;
                case 9: //終了メニュー
                    return; //処理を終了して戻る
            }
        }
    }
    private void addStudentView() throws IOException{ //学生追加処理表示
        String id, name;
        System.out.print(" 学籍番号：");
        id = bin.readLine();
        System.out.print(" 学生氏名：");
        name = bin.readLine();
        if(StudentApp.addStudent(id, name) == false){ //ｺﾝﾄﾛｰﾗに処理依頼
            System.err.println(" !!!データが一杯なため追加できません!!!");
        }
        System.out.println();
    }
    private void deleteStudentView() throws IOException{ //学生削除表示
        String id;
        System.out.print(" 学籍番号：");
        id = bin.readLine();
        if(StudentApp.deleteStudent(id) == false){ //ｺﾝﾄﾛｰﾗに処理依頼
            System.err.println(" !!!該当する学生が見つかりません!!!");
        }
        System.out.println();
    }
    private void listStudentView(){ //学生一覧表示
        Student wTbl[] = StudentApp.getStudentTbl(); //ｺﾝﾄﾛｰﾗから学生取得
        for(int i = 0; i < wTbl.length; i++){ //学生数ぶんループ
            System.out.println(" [" +wTbl[i].getId()+ "] " + wTbl[i].getName());
        } //↑学籍番号と氏名を出力
        System.out.println();
    }
}