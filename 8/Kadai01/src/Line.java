public class Line {
    Point[] pt;

    Line(int sx, int sy, int ex, int ey) {
        this.pt = new Point[2];
        pt[0] = new Point(sx, sy);
        pt[1] = new Point(ex, ey);
    }

    public void draw(Canvas canvas) {
        int x, y, n, width, height, wabs, habs, wflg, hflg;
        width = pt[1].getX() - pt[0].getX(); //幅を計算
        height = pt[1].getY() - pt[0].getY(); //高さを計算
        wabs = Math.abs(width); //幅の絶対値
        habs = Math.abs(height); //高さの絶対値
        wflg=1; //ｘ座標の描画順フラグ
        hflg=1; //ｙ座標の描画順フラグ
        if ( width<0) wflg=-1;
        if ( height < 0) hflg = -1;
        if( wabs > habs ){ //幅の方が大きい(絶対値で)
            for(n = 0; n <= wabs; n++){ //幅を基準にしてループ
                x = pt[0].getX() + n * wflg; //点を打つべき座標を計算
                y = pt[0].getY() + (int)(habs * n / wabs) * hflg;
                System.out.println ("***点の描画：" + x + ":" + y);
                canvas.draw(x, y); //キャンバスに点を打つ
            }
        }else{ //高さの方が大きいか等しい
            for(n = 0; n <= habs; n++){ //高さを基準にしてループ
                y = pt[0].getY() + n * hflg; //点を打つべき座標を計算
                x = pt[0].getX() + (int)(wabs * n / habs) * wflg;
                System.out.println ("+++点の描画：" + x +":" + y);
                canvas.draw(x, y); //キャンバスに点を打つ
            }
        }
    }
}
