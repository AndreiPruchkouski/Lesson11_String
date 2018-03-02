package by.htp.strings;

public class Task32 {

	public static void main(String[] args) {
//		Подсчитать, сколько раз заданное слово входит в текст.
		
		String text = "   Here you cancancan  Here you see some here youhere text with some testtext ";
		String word = "you";
		int number = 0;
		
		text = text.trim(); // убрали пробелы
		String a[ ] = text.split(" ");
		
		for(int i = 0; i < a.length; i++) {
			if(a[i].compareToIgnoreCase(word) == 0) {
				number++;
			}
			
		}
		System.out.println(number);

	}

}
