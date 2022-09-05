package com.sanhosh.com;

public class MyChar {

	private char ch;

	public MyChar(char ch) {
		this.ch = ch;
	}

	public boolean isVowel() {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U')
			return true;

		return false;
	}

	public boolean isDigit() {
		// if(ch=='0' || ch=='1'||ch=='2'||ch=='3'||ch=='4'||ch=='5'
		// ||ch=='6'||ch=='7'||ch=='8'||ch=='9')
		if (ch >= 48 && ch <= 57)
			return true;

		return false;
	}

	public boolean isAlphabet() {
		if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122))
			return true;
		return false;
	}

	public boolean isConsonant() {
		// if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122))
		// if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch ==
		// 'A' || ch == 'E' || ch == 'I'
		// || ch == 'O' || ch == 'U'))
		if (isAlphabet() && !isVowel())
			return true;

		return false;

	}

	public void printLowerCaseAlphabets() {
		for (char ch = 97; ch <= 122; ch++)
			System.out.println(ch);

	}

	public void printUpperCaseAlphabets() {
		for (char ch = 65; ch <= 90; ch++)
			System.out.println(ch);

	}

}
