package company;

public class ObjectSample {

	public static void main(String[] args) {
		// インスタンスの生成
		var employee = new Employee("鈴木", "営業部", "課長", 100);
		
		
		// インスタンスメソッドの呼び出し
		employee.report();
		employee.report(2);	

	}

}
