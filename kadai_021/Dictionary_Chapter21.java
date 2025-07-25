package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	HashMap<String,String> dictionary = new HashMap<String,String>();
	public Dictionary_Chapter21(){
	dictionary.put("apple","りんご");
	dictionary.put("peach","桃");
	dictionary.put("banana","バナナ");
	dictionary.put("lemon","レモン");
	dictionary.put("pear","なし");
	dictionary.put("kiwi","キウイ");
	dictionary.put("strawberry","いちご");
	dictionary.put("grape","ぶどう");
	dictionary.put("muscat","マスカット");
	dictionary.put("cherry","さくらんぼ");
	}
	public void search(String[] words) {
		for(String word : words) {
			if(dictionary.containsKey(word)) {
				System.out.println(word + "の意味は" + dictionary.get(word));
			} else {
				System.out.println(word + "は辞書に存在しません");
			}
		}
	}
	
}
