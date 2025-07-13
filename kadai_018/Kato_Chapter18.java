package kadai_018;

abstract class Kato_Chapter18 {
	String familyName = "加藤";
	String givenName;
	String address = "住所は東京都中野区〇×です";
	
	//名を表すフィールドの値をセットする
	
	
	public void commenIntroduce() {
		System.out.println("名前は" + familyName + givenName);
		System.out.println(address);
	}
	
	public abstract void eachIntroduce();
	
	public void execIntroduce() {
		commenIntroduce();
		eachIntroduce();
		System.out.println();
	};
}
