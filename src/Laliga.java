public class Laliga extends League implements Participation{
	
	// 생성자
	public Laliga(String name) {
		this.name = setName(name);
	}
	
	public static void main(String[] args) {
		// 생성자로 객체 생성
		Laliga laliga = new Laliga("Laliga");
	}
	
	public int champions_participation_Num() {
		return 5;
	}
}
