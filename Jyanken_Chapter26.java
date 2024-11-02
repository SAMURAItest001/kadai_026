package kadai_026;
//getMyChoice、getRandomのなかみ
public class Jyanken_Chapter26 {

	public static void main(String[] args) { //自分自身　命令	
		// TODO 自動生成されたメソッド・スタブ
		
		//じゃんけんクラスのインスタンスを作成 
		Jyanken_Chapter26 Jyanken = new Jyanken_Chapter26(); 
		//Jyanken_Chapter26 Jyanken→クローン、new→カタログ
		//Jyankenmachine_Chapter26→実体化させたい
		
		JyankenExec_Chapter26 Jyankenmachine = new JyankenExec_Chapter26();
		
		//自分のじゃんけんの手を入力する
		String me = Jyankenmachine.getMyChoice();
		
		//対戦相手のじゃんけんの手が選ばれる
		String you = Jyankenmachine.getRandom();
		
		//じゃんけんの結果を出力する
		Jyankenmachine.playGame(me,you); //me,youは水と米
	}
}

