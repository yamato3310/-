public class Renshu04 {
	
	//↓FolderInfoクラスの参照を追加
	
	public static void main(String args[]){		
		
		FolderInfo folder = new FolderInfo ("My Documents");
		
		folder.addFile( new FileInfo ("sample.txt",1024));
		folder.addFile( new FileInfo ("test.doc",16380));
	
		dispFolderInfo();
	}

	public static void dispFolderInfo() {

	}

}