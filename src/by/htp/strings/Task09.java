package by.htp.strings;

public class Task09 {

	public static void main(String[] args) {
//		Определить, сколько раз повторяется в тексте каждое слово, которое встре-
//		чается в нем.
		
		String text = "   Here you cancancan  Here see some here here text with some testtext ";
		text = text.trim(); // убрали пробелы
		System.out.println(text); 
		
		String a[ ] = text.split(" ");
		System.out.println();
		
		int[] index = new int[a.length]; //массив под индексы
		
		
		for(int j = 0; j < a.length; j++) {
			int number = 1;
			for(int i = 0; i < a.length; i++) {
				if(a[i].compareToIgnoreCase(a[j]) == 0 && i != j) {
					number++;
				}
				index[j] = number;
			}
	
		}
		System.out.println();
		
		for(int i = 0 ; i < a.length; i++) {
			if (!a[i].isEmpty()) {
				System.out.println("Слово " + a[i] + " упоминается " + index[i] + " раз");
			}
		}
		
	}

}
