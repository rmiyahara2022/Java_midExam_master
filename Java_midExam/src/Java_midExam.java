
public class Java_midExam {

	public static void main(String[] args) {
	    // 問1 (正解）
	    String data = "中満悠人"; 
	    System.out.println(data);
	    System.out.println("");
	
	    // 問2（不正解）
	    // int型であるため、0.1の足し算結果がsumに蓄積されず0となる
	    int sum = 0;
	    for (int i = 1; i <= 10; i++) {
            sum += 0.1; 
        }
	    System.out.println(sum == 1);
	    System.out.println(sum);
	    System.out.println("");

	    // 問3（正解）
	    // num++の場合はnumの表示後に足し算が実行されるのでarrに代入時の値がそのまま表示される
	    // ++numの場合はnumの表示前に足し算が実行されるのでarrに代入した値にそれぞれ1加算されて表示される
	    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
	    for (int num : arr) { // line 1
	    	if (num % 2 == 0) {
                System.out.print(num + " "); // line 2 
	    	}
	     // line 3
	    }
	    System.out.println("");
	    System.out.println("");
	    
	    // 問4（正解）
	    // 変数quarterのスペルミス
	    int month = 9;
	    String japaneseMonth = "";
	    String quarter = "";
	    if (month == 9) {
	    	japaneseMonth = "長月";
	    } else if (month >= 7 && month <= 9) {
	    	quarter="第二四半期";
	    }
	    System.out.println(japaneseMonth + " " + quarter); 
	}
}
