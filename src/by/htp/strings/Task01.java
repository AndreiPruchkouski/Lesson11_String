package by.htp.strings;

public class Task01 {

	public static void main(String[] args) {
		// В каждом слове текста k-ю букву заменить заданным символом. Если k
		// больше длины слова, корректировку не выполнять.

		String text = "Here you cancancan see some text with some testtext ";
		char tochange = '#';
		int counter = 0;
		int k = 3;
		boolean alreadyTriggered = false;

		StringBuilder sb = new StringBuilder();
		sb.append(text);
		System.out.println(sb.toString());

		for (int i = 0; i < sb.length(); i++) {
			if (sb.charAt(i) != ' ') {
				counter++;
				if (counter % k == 0 && alreadyTriggered == false) {
					sb.setCharAt(i, tochange);
					alreadyTriggered = true;
				}
			} else {
				alreadyTriggered = false;
				counter = 0;
			}
		}

		System.out.println(sb.toString());

	}

}
