
public class Java_midExam {

	public static void main(String[] args) {
	    // 問1
	    String data = "中満悠人"; 
	    System.out.println(data);
	    System.out.println("");
	
	    // 問2
	    int sum = 0;
	    for (int i = 1; i <= 10; i++) {
            sum += 0.1; 
        }
	    System.out.println(sum == 1);
	    System.out.println(sum);
	    System.out.println("");

	    // 問3
	    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
	    for (int num : arr) { // line 1
	    	if (num % 2 == 0) {
                System.out.print(num + " "); // line 2 
	    	}
	     // line 3
	    }
	    System.out.println("");
	    System.out.println("");
	    
	    // 問4
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
