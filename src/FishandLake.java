class Fish{
	int weight;
}
class Lake{
	Fish fish;
	void setFish(Fish s){
		fish = s;
	}
	void eat(int n){
		fish.weight = fish.weight + n;
	}
}
public class FishandLake{
	public static void main(String[] args) {
		Fish niqiu = new Fish();
		System.out.println("Äàöú£º" +niqiu.weight);
		Lake taihu  = new Lake();
		taihu.setFish(niqiu);
		taihu.eat(10);
		System.out.println("Äàöú£º" +niqiu.weight);
		System.out.println("Ì«ºşÀïµÄÄàöú£º" +taihu.fish.weight);
		Lake lake = new Lake();
		lake.setFish(niqiu);
		lake.eat(250);
		System.out.println("Äàöú£º" + niqiu.weight);
		System.out.println("´óÃ÷ºşÅÏÀïµÄÄàöú£º" +lake.fish.weight);
		System.out.println("Ì«ºşÀïµÄÄàöú£º" +taihu.fish.weight);
	}
}


