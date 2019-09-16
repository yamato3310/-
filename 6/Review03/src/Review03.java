public class Review03{
	private static Student2 st[] = new Student2[3]; //Student2参照型配列
	public static void main(String args[]){
		Object objAry[] = new Object[3]; //Objectｸﾗｽの参照型配列
		objAry[0] = new NormalStudent("Sato", 0.76, 80); //一般学生を生成
		objAry[1] = new ScholarStudent("Goto", 0.78, 'A'); //奨学生を生成
		objAry[2] = new NormalStudent("Kato", 0.68, 75); //一般学生を生成
		for(int i = 0; i < objAry.length; i++){ //全要素に対するループ
			System.out.print(objAry[i].toString());
		}
		NormalStudent norm = (NormalStudent)objAry[0];
		System.out.println(norm.getScore());
	}
}
