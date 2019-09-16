public class Kadai01 {
    private static Canvas canvas;
    private static Line lines[];
    public static void main(String args[]) {
        canvas = new Canvas(20,12); //幅20文字、高さ12文字のキャンバスを生成
        lines = new Line[5]; //Lineクラスのオブジェクト配列を生成
        lines[0] = new Line(10,1,1,10); //(10,1)と(1,10)を結ぶ直線を生成
        lines[1] = new Line(10,1,19,10); //(10,1)と(19,10)を結ぶ直線を生成
        lines[2] = new Line(1,10,19,10); //(1,10)と(19,10)を結ぶ直線を生成
        for(int i = 0; i < 3; i++){
            lines[i].draw(canvas); //キャンバスに直線を描く
        }
        canvas.display(); //キャンバス全体を画面に出力する
    }
}
