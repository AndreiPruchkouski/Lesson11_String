package by.htp.strings;

public class Task24 {

	public static void main(String[] args) {

		// Определить сумму всех целых чисел, встречающихся в заданном тексте.

		String text = "1 %d 22 t4test10";

		StringBuilder temp = new StringBuilder();
		int summ = 0;

		for(char symbol : text.toCharArray()) {

			if (Character.isDigit(symbol)) {
				temp.append(symbol);
			} else if (temp.length() > 0) {				
				summ += Integer.parseInt(temp.toString());
				temp = new StringBuilder();
			}

		}
		if (temp.length() > 0) {
			summ += Integer.parseInt(temp.toString());
		}

		System.out.println(summ);

	}
	
	
	//Using regex
	/*public static void main(String[] args) {
        int sum = 0;
        for (String number : "1 %d 221 t4test10".split("[^\\d]+")) {
            sum += Integer.parseInt(number);
        }
        System.out.println(sum);
    }*/
	
	
	//Using streams
/*	public static void main(String[] args) {
        System.out.println(
            Arrays.stream("1 %d 221 t4test10".split("[^\\d]+")).mapToInt(Integer::parseInt).sum());
    }*/

	
}
