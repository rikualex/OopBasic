package company;

// 抽象クラスに変更
public class Employee implements Workable {
	// フィールド
	protected final String name;
	protected final Department department;//　protectedに変更
	private final String position;
	private final int employeeId;
	//　コンストラクター
	public Employee(String name, Department department, String position, int employeeId) {
		this.name =name;
		this.department = department;
		this.position = position;
		this.employeeId = employeeId;
		
	}
	
	
	//　報告メソッド
	public void report(int times) {
		System.out.println(times +"回目の報告をします。　役職:"+ position +"、名前:"+ name);
		
	}
	
	//　報告メソッド（オーバーロード）
	public void report() {
		report(1);
	
	}
	
	
	// 抽象メソッドに変更
	//　会議に参加するメソッド
	public void joinMeeting() {
		department.meeting();
		System.out.println("→上記の会議に参加します。　部署:" + department.getName() +"名前：" + name);
		
	}
	
	//　働くメソッドを実装
	@Override 
	public void work(){
		System.out.println("正社員として働きます。名前："+ name + slogan);
		
	}
}
