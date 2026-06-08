package kadai_018;

abstract public class Kato_Chapter18 {
//  フィールド
	public String familyName = "加藤";
	public String givenName  = "";
	public String address    = "東京都中野○×";
	
//	コンストラクタ
//	public Kato_Chapter18(String givenName) {
//		this.givenName = givenName;
//	}
	
//	メソッド	
	abstract public void setGivenName();
	
	public void commonIntroduce() {
		System.out.println("私の名前は" + this.familyName + this.givenName + "です");
		System.out.println("住所は" + this.address + "です");
	
	}
	
	abstract public void eachIntroduce();
	
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
		System.out.println("");
	}
	
}
