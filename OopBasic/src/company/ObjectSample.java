package company;

public class ObjectSample {
	
	
	public static void main(String[] args) {
		// ----変更(ここから) ----
		//　インスタンスの作成
		var department = new Department("営業部", "xx", 1000000);
		var sales = new Sales("鈴木", department, "課長", 100);
		
		
		//　インスタンスメソッドの呼び出し
		sales.report();
		sales.report(2);
		sales.joinMeeting();
		// ---- 変更(ここまで) ----
		
		
		//　1行空ける
		System.out.println("");
		
		
		//　インスタンスの作成
		var devDepartment = new Department("開発部", "yy", 0);
		var engineer = new Engineer("田中", devDepartment, "一般社員", 88, "Java"); //　変更
		
		
		// インスタンスメソッドの呼び出し
		engineer.report();
		engineer.joinMeeting();
		engineer.developSoftware(); //　追記
		
		// １行空ける
		System.out.println("");
		
		// ポリモーフィズムの確認
		Employee projectmanager = new Engineer("佐藤", devDepartment, "PM", 99, "java");
		
		
		// インスタンスメソッドの呼び出し
		projectmanager.report();
		projectmanager.joinMeeting();
		if(projectmanager instanceof Engineer) {
			// developSpftwareメソッドを呼び出す
			((Engineer)projectmanager).developSoftware();
		}
		//　---- 追記（ここから） ----
		// １行空ける
		System.out.println("");
		
		
		// アルバイトインスタンスの作成
		var parttimeWorker = new ParttimeWorker("太田", department);
	
	
		// 実装したメソッドの呼び出し
		((Workable) sales).work();
		((Workable) engineer).work();
		((Workable)projectmanager).work();
		((Workable) parttimeWorker).work();
		// ---- 追記(ここまで)　----
	
	}

}
