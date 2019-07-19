public class ChampionsLeague {
	
	// 인터페이스 사용
	public void participationNum(Participation participation) {
		System.out.println("participation : " + participation.champions_participation_Num());
	}
	
	public static void main(String[] args) {
        ChampionsLeague champions = new ChampionsLeague();
        PremierLeague premierLeague = new PremierLeague();
        Laliga laliga = new Laliga("Laliga");
        champions.participationNum(premierLeague);
        champions.participationNum(laliga);
    }
}
