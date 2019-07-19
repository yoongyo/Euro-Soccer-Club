import java.util.Scanner;

// 상속
public class PremierLeague extends League implements Participation{
	
	// 메서드 오버로드 
	public void setName() {
		this.name = "PremierLeague";
		System.out.println(this.name);
	}
	
	
	public static void main(String[] args) {
		PremierLeague premier = new PremierLeague();
		premier.setName();
		premier.setNumber(20);
		premier.setNation("UK");
	}
	
	public int champions_participation_Num() {
		return 4;
	}
}
