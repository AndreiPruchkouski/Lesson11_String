package by.htp.strings;

public class Task07 {
	// Из текста удалить все символы, кроме пробелов, не являющиеся буквами. Между
	// последовательностями подряд идущих букв оставить хотя бы один пробел.

	public static void main(String[] args) {

		String text = "1 Some num    bers 1a2b3c and symbols      #a@b$c%d";

		StringBuilder sb = new StringBuilder();
		sb.append(text);
		System.out.println("Original string ---> '" + sb.toString() + "'");

		for (int i = 0; i < sb.length(); i++) {

			if (Character.isLetter(sb.charAt(i)) == false) {
				if (sb.charAt(i) != ' ') {
					sb.deleteCharAt(i);
					i = 0;
				}
			}
		}
		
		System.out.println("After filter non letters\n" + sb.toString());
		
		for (int i = 0;i < sb.length()-1; i++) {
			if(sb.charAt(i) != ' ' && Character.isLetter(sb.charAt(i+1)) == true) {
				sb.insert(i+1, ' ');
				i++;
			}
		}

		System.out.println("After adding extra spaces\n" + sb.toString());

	}
}
