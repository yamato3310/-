public class ScholarStudent extends Student2 {	//「奨学生」ｸﾗｽ(学生の一種)
	private char reportEval;			//特別レポートの評価
	
	//各属性(Studentから継承したものも含めて)に値をセットするメソッド
	public ScholarStudent(String name, double attendRatio, char reportEval){
		super(1,name, attendRatio, score, '\u00C6');
//		this.name = name;				//氏名(継承)の代入
//		this.attendRatio = attendRatio;		//出席率(継承)の代入
//		this.reportEval = reportEval;		//レポート評価の代入
	}
	
	public char getReportEval(){ return reportEval; }//レポート評価を返すメソッド

	public String toString(){			//情報を整形して返すｵｰﾊﾞﾗｲﾄﾞﾒｿｯﾄﾞ
		String base = super.toString();		//継承したﾒｿｯﾄﾞを呼び出す
		return "奨 学 生 " + base + " 評価: " + reportEval;
	}									//↑レポート評価を連結して返す
	
	public boolean canNextGrade(){			//進級可能かどうか判断するﾒｿｯﾄﾞ
		if(attendRatio >= 0.8 && reportEval == 'A'){//出席率80%以上かつﾚﾎﾟ評価A
			return true;				//進級可能！
		}
		return false;
	}
}
