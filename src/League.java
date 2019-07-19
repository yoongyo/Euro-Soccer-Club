import java.util.ArrayList;
import java.util.Scanner;

public class League {
	String name;
	int number;
	String nation;
	ArrayList<String> teams = new ArrayList<String>();
	
	
	public String setName(String name) {
		this.name = name;
		System.out.println(this.name);
		return name;
	}
	
	public void setNumber(int number) {
		this.number = number;
		System.out.println(this.number);
	}
	
	public void setNation(String nation) {
		this.nation = nation;
	}
	
	public String makeTeam() {
		Scanner maketeam = new Scanner(System.in);
		String teamName = maketeam.next();
		teams.add(teamName);
		return teamName;
	}
	public void getTeam() {
		int totalElements = teams.size();
		  for (int index = 0; index < totalElements; index++) {
		   System.out.println(teams.get(index));
		  }
	}
}

