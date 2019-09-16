public class Student2 { //「学生」クラス
	protected int type; //種類(0:一般学生 1:奨学生とする)
	protected String name; //氏名
	protected double attendRatio; //出席率
	protected int score; //期末試験得点
	protected char reportEval; //特別レポートの評価
	//↓値をセットするコンストラクタ
	public Student2(int type, String name, double attendRatio,int score,
					char reportEval){
		this.type = type; //以下３つは種類・氏名・出席率
		this.name = name;
		this.attendRatio = attendRatio;
		if(type == 0){ //一般学生の場合のみ
			this.score = score; //期末試験得点をセット
		}else{ //奨学生の場合のみ
			this.reportEval = reportEval; //特別レポートの評価をセット
		}
	}
	public String getName(){ return name; } //氏名を返すメソッド
	public int getScore(){ return score; } //得点を返すメソッド
	public char getReportEval(){ return reportEval; }
	//↑ﾚﾎﾟｰﾄ評価を返すメソッド
	public String toString(){ //情報を文字列化して返すメソッド
		if(type == 0){ //一般学生の場合
			return "一般学生【" + name+ "】得点: " + score + "点";
		}else{ //奨学生の場合
			return "奨学 生【" + name+ "】評価: " + reportEval;
		}
	}
	public boolean canNextGrade(){ //進級可能かどうか判断するメソッド
		if(type == 0){ //一般学生の場合
			if(attendRatio >= 0.75 && score >= 60){ return true; }
		}else{ //奨学生の場合
			if(attendRatio >= 0.8 && reportEval == 'A'){ return true; }
		}
		return false;
	}
}