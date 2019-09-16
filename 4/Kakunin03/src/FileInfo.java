public class FileInfo {
	private String fileName;		//ファイル名
	private int fileSize;			//ファイルサイズ
		
	//コンストラクタ
	public FileInfo (String fileName, int fileSize) {
		this.fileName = fileName;
		this.fileSize = fileSize;	
	}
	
	//ファイル名を取得するメソッド
	public String getFileName() {
		return fileName;
	}
	
	//ファイルサイズを取得するメソッド
	public int getFileSize() {
		return fileSize;
	}
	
	//ファイルサイズを追加するメソッド
	public void addFileSize (int addSize) {
		fileSize = fileSize + addSize;		
	}
}
