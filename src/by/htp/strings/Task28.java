package by.htp.strings;

public class Task28 {

	public static void main(String[] args) {
		
//		Преобразовать текст так, чтобы только первые буквы каждого предложения
//		были заглавными.

		String text = ". hello.     hello. 5hello";
		
		StringBuilder sb = new StringBuilder();
		sb.append(text);
		System.out.println(sb.toString());
		
		boolean dotTriggered = false;
		
		for (int i = 0; i < sb.length(); i++) {
			if(sb.charAt(i) == '.') {
				dotTriggered = true;
			}
			if((Character.isLetter(sb.charAt(i)) || Character.isDigit(sb.charAt(i))) && dotTriggered == true) {
				sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
				dotTriggered = false;
			}
		}
		
		System.out.println(sb.toString());
	}

}
