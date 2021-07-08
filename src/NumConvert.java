import java.util.Scanner;

public class NumConvert {

	// one digit toChar
	static String oneDigitToChar(String num) {

		int digit = Integer.parseInt(num);
		String result = new String();

		if (digit == 1) {
			result = "Yek";
		} else if (digit == 2) {
			result = "Do";
		} else if (digit == 3) {
			result = "Seh";
		} else if (digit == 4) {
			result = "Chahar";
		} else if (digit == 5) {
			result = "Panj";
		} else if (digit == 6) {
			result = "Shesh";
		} else if (digit == 7) {
			result = "Haft";
		} else if (digit == 8) {
			result = "Hasht";
		} else if (digit == 9) {
			result = "Noh";
		} else if (digit == 0) {
			result = "Sefr";
		}
		return result;
	}

	// two digits toChar
	static String twoDigitsToChar(String num) {

		int digit = Integer.parseInt(num);
		String result = new String();
		String rDigit = String.valueOf(num.charAt(1));

		switch (digit) {
			case 10:
				result = "Dah";
				break;
			case 11:
				result = "Yazdah";
				break;
			case 12:
				result = "Davazdah";
				break;
			case 13:
				result = "Sizdah";
				break;
			case 14:
				result = "Chahardah";
				break;
			case 15:
				result = "Panzdah";
				break;
			case 16:
				result = "Shanzdah";
				break;
			case 17:
				result = "Hefdah";
				break;
			case 18:
				result = "Hejdah";
				break;
			case 19:
				result = "Noozdah";
				break;
			default:

				switch (digit / 10) {
					case 0:
						result = oneDigitToChar(rDigit);
						break;
					case 2:
						switch (digit % 10) {
							case 0:
								result = "Bist";
								break;
							case 1:
								result = "Bist o " + oneDigitToChar(rDigit);
								break;
							case 2:
								result = "Bist o " + oneDigitToChar(rDigit);
								break;
							case 3:
								result = "Bist o " + oneDigitToChar(rDigit);
								break;
							case 4:
								result = "Bist o " + oneDigitToChar(rDigit);
								break;
							case 5:
								result = "Bist o " + oneDigitToChar(rDigit);
								break;
							case 6:
								result = "Bist o " + oneDigitToChar(rDigit);
								break;
							case 7:
								result = "Bist o " + oneDigitToChar(rDigit);
								break;
							case 8:
								result = "Bist o " + oneDigitToChar(rDigit);
								break;
							case 9:
								result = "Bist o " + oneDigitToChar(rDigit);
								break;
						}
						break;
					case 3:
						switch (digit % 10) {
							case 0:
								result = "Si";
								break;
							case 1:
								result = "Si o " + oneDigitToChar(rDigit);
								break;
							case 2:
								result = "Si o " + oneDigitToChar(rDigit);
								break;
							case 3:
								result = "Si o " + oneDigitToChar(rDigit);
								break;
							case 4:
								result = "Si o " + oneDigitToChar(rDigit);
								break;
							case 5:
								result = "Si o " + oneDigitToChar(rDigit);
								break;
							case 6:
								result = "Si o " + oneDigitToChar(rDigit);
								break;
							case 7:
								result = "Si o " + oneDigitToChar(rDigit);
								break;
							case 8:
								result = "Si o " + oneDigitToChar(rDigit);
								break;
							case 9:
								result = "Si o " + oneDigitToChar(rDigit);
								break;
						}
						break;
					case 4:
						switch (digit % 10) {
							case 0:
								result = "Chehel";
								break;
							case 1:
								result = "Chehel o " + oneDigitToChar(rDigit);
								break;
							case 2:
								result = "Chehel o " + oneDigitToChar(rDigit);
								break;
							case 3:
								result = "Chehel o " + oneDigitToChar(rDigit);
								break;
							case 4:
								result = "Chehel o " + oneDigitToChar(rDigit);
								break;
							case 5:
								result = "Chehel o " + oneDigitToChar(rDigit);
								break;
							case 6:
								result = "Chehel o " + oneDigitToChar(rDigit);
								break;
							case 7:
								result = "Chehel o " + oneDigitToChar(rDigit);
								break;
							case 8:
								result = "Chehel o " + oneDigitToChar(rDigit);
								break;
							case 9:
								result = "Chehel o " + oneDigitToChar(rDigit);
								break;
						}
						break;
					case 5:
						switch (digit % 10) {
							case 0:
								result = "Panjah";
								break;
							case 1:
								result = "Panjah o " + oneDigitToChar(rDigit);
								break;
							case 2:
								result = "Panjah o " + oneDigitToChar(rDigit);
								break;
							case 3:
								result = "Panjah o " + oneDigitToChar(rDigit);
								break;
							case 4:
								result = "Panjah o " + oneDigitToChar(rDigit);
								break;
							case 5:
								result = "Panjah o " + oneDigitToChar(rDigit);
								break;
							case 6:
								result = "Panjah o " + oneDigitToChar(rDigit);
								break;
							case 7:
								result = "Panjah o " + oneDigitToChar(rDigit);
								break;
							case 8:
								result = "Panjah o " + oneDigitToChar(rDigit);
								break;
							case 9:
								result = "Panjah o " + oneDigitToChar(rDigit);
								break;
						}
						break;
					case 6:
						switch (digit % 10) {
							case 0:
								result = "Shast";
								break;
							case 1:
								result = "Shast o " + oneDigitToChar(rDigit);
								break;
							case 2:
								result = "Shast o " + oneDigitToChar(rDigit);
								break;
							case 3:
								result = "Shast o " + oneDigitToChar(rDigit);
								break;
							case 4:
								result = "Shast o " + oneDigitToChar(rDigit);
								break;
							case 5:
								result = "Shast o " + oneDigitToChar(rDigit);
								break;
							case 6:
								result = "Shast o " + oneDigitToChar(rDigit);
								break;
							case 7:
								result = "Shast o " + oneDigitToChar(rDigit);
								break;
							case 8:
								result = "Shast o " + oneDigitToChar(rDigit);
								break;
							case 9:
								result = "Shast o " + oneDigitToChar(rDigit);
								break;
						}
						break;
					case 7:
						switch (digit % 10) {
							case 0:
								result = "Haftad";
								break;
							case 1:
								result = "Haftad o " + oneDigitToChar(rDigit);
								break;
							case 2:
								result = "Haftad o " + oneDigitToChar(rDigit);
								break;
							case 3:
								result = "Haftad o " + oneDigitToChar(rDigit);
								break;
							case 4:
								result = "Haftad o " + oneDigitToChar(rDigit);
								break;
							case 5:
								result = "Haftad o " + oneDigitToChar(rDigit);
								break;
							case 6:
								result = "Haftad o " + oneDigitToChar(rDigit);
								break;
							case 7:
								result = "Haftad o " + oneDigitToChar(rDigit);
								break;
							case 8:
								result = "Haftad o " + oneDigitToChar(rDigit);
								break;
							case 9:
								result = "Haftad o " + oneDigitToChar(rDigit);
								break;
						}
						break;
					case 8:
						switch (digit % 10) {
							case 0:
								result = "Hashtad";
								break;
							case 1:
								result = "Hashtad o " + oneDigitToChar(rDigit);
								break;
							case 2:
								result = "Hashtad o " + oneDigitToChar(rDigit);
								break;
							case 3:
								result = "Hashtad o " + oneDigitToChar(rDigit);
								break;
							case 4:
								result = "Hashtad o " + oneDigitToChar(rDigit);
								break;
							case 5:
								result = "Hashtad o " + oneDigitToChar(rDigit);
								break;
							case 6:
								result = "Hashtad o " + oneDigitToChar(rDigit);
								break;
							case 7:
								result = "Hashtad o " + oneDigitToChar(rDigit);
								break;
							case 8:
								result = "Hashtad o " + oneDigitToChar(rDigit);
								break;
							case 9:
								result = "Hashtad o " + oneDigitToChar(rDigit);
								break;
						}
						break;
					case 9:
						switch (digit % 10) {
							case 0:
								result = "Navad";
								break;
							case 1:
								result = "Navad o " + oneDigitToChar(rDigit);
								break;
							case 2:
								result = "Navad o " + oneDigitToChar(rDigit);
								break;
							case 3:
								result = "Navad o " + oneDigitToChar(rDigit);
								break;
							case 4:
								result = "Navad o " + oneDigitToChar(rDigit);
								break;
							case 5:
								result = "Navad o " + oneDigitToChar(rDigit);
								break;
							case 6:
								result = "Navad o " + oneDigitToChar(rDigit);
								break;
							case 7:
								result = "Navad o " + oneDigitToChar(rDigit);
								break;
							case 8:
								result = "Navad o " + oneDigitToChar(rDigit);
								break;
							case 9:
								result = "Navad o " + oneDigitToChar(rDigit);
								break;
						}
						break;
				}
		}

		return result;
	}

	// three digit toChar
	static String threeDigitsToChar(String num) {

		int digit = Integer.parseInt(num);
		String rDigit = String.valueOf(num.charAt(1)) + String.valueOf(num.charAt(2));
		String result = new String();

		switch (digit / 100) {
			case 0:
				result = twoDigitsToChar(rDigit);
				break;
			case 1:
				if (digit % 100 == 0) {
					result = "Sad";
				} else {
					result = "Sad o " + twoDigitsToChar(rDigit);
				}
				break;
			case 2:
				if (digit % 100 == 0) {
					result = "Divist";
				} else {
					result = "Divist o " + twoDigitsToChar(rDigit);
				}
				break;
			case 3:
				if (digit % 100 == 0) {
					result = "Sisad";
				} else {
					result = "Sisad o " + twoDigitsToChar(rDigit);
				}
				break;
			case 4:
				if (digit % 100 == 0) {
					result = "Chaharsad";
				} else {
					result = "Chaharsad o " + twoDigitsToChar(rDigit);
				}
				break;
			case 5:
				if (digit % 100 == 0) {
					result = "Pansad";
				} else {
					result = "Pansad o " + twoDigitsToChar(rDigit);
				}
				break;
			case 6:
				if (digit % 100 == 0) {
					result = "Sheshsad";
				} else {
					result = "Sheshsad o " + twoDigitsToChar(rDigit);
				}
				break;
			case 7:
				if (digit % 100 == 0) {
					result = "Haftsad";
				} else {
					result = "Haftsad o " + twoDigitsToChar(rDigit);
				}
				break;
			case 8:
				if (digit % 100 == 0) {
					result = "Hashtsad";
				} else {
					result = "Hashtsad o " + twoDigitsToChar(rDigit);
				}
				break;
			case 9:
				if (digit % 100 == 0) {
					result = "Nohsad";
				} else {
					result = "Nohsad o " + twoDigitsToChar(rDigit);
				}
				break;
		}

		return result;
	}

	// toChar
	static void toChar(String num) {

		int digit = num.length();
		String result = new String();
		String[] temp = new String[12];

		for (int i = 0; i < 12; i++) {
			temp[i] = "0";
		}

		int j = 11;

		for (int i = digit - 1; i >= 0; i--) {
			temp[j] = String.valueOf(num.charAt(i));
			j--;
		}

		String temp2, temp3, milliardOTest = new String(), millionOTest = new String(), hezarOTest = new String();

		for (int i = 3; i < 12; i++) {
			milliardOTest += temp[i];
		}
		for (int i = 6; i < 12; i++) {
			millionOTest += temp[i];
		}
		for (int i = 9; i < 12; i++) {
			hezarOTest += temp[i];
		}

		for (int i = 0; i < 12; i += 3) {
			temp2 = temp[i] + temp[i + 1] + temp[i + 2];
			temp3 = temp[i] + temp[i + 1];

			if (!temp2.equals("000")) {
				switch (i) {
					case 0:
						result += threeDigitsToChar(temp2) + " Milliard";
						if (!milliardOTest.equals("000000000")) {
							result += " o ";
						}
						break;
					case 3:
						result += threeDigitsToChar(temp2) + " Million";
						if (!millionOTest.equals("000000")) {
							result += " o ";
						}
						break;
					case 6:
						if (temp3.equals("00") && temp[i + 2].equals("1")) {
							result += "Hezar";
							if (!hezarOTest.equals("000")) {
								result += " o ";
							}
						} else {
							result += threeDigitsToChar(temp2) + " Hezar";
							if (!hezarOTest.equals("000")) {
								result += " o ";
							}

						}
						break;
					case 9:
						result += threeDigitsToChar(temp2);
						break;
				}
			}
		}
		int flag = 0;
		for (int k = 0; k < 12; k++) {
			if (temp[k].equals("0")) {
				flag = 1;
			} else {
				flag = 0;
				break;
			}
		}
		if (flag == 1) {
			result += "Sefr";
		}
		System.out.println(result);

	}

	// toNum
	static long toNum(String num) {

		long result = 0;
		long temp = 0;

		String[] numArr = num.split(" ");

		for (int i = 0; i < numArr.length; i++) {

			if (numArr[i].equals("o")) {
				continue;
			}
			if (numArr[i].equals("Milliard") || numArr[i].equals("Million")) {
				temp *= stringToNum(numArr[i]);
				result += temp;
				temp = 0;
			}
			if (numArr[i].equals("Hezar")) {
				if (temp == 0) {
					temp = stringToNum(numArr[i]);
					result += temp;
					temp = 0;
				} else {
					temp *= stringToNum(numArr[i]);
					result += temp;
					temp = 0;
				}
			}
			if (!numArr[i].equals("Milliard") && !numArr[i].equals("Million") && !numArr[i].equals("Hezar")) {
				temp += stringToNum(numArr[i]);
			}

		}

		result += temp;

		return result;
	}

	// Changes string to number and is used in toNum() function
	static int stringToNum(String num) {

		int result = 0;

		switch (num) {
			case "Sefr":
				result = 0;
				break;
			case "Yek":
				result = 1;
				break;
			case "Do":
				result = 2;
				break;
			case "Seh":
				result = 3;
				break;
			case "Chahar":
				result = 4;
				break;
			case "Panj":
				result = 5;
				break;
			case "Shesh":
				result = 6;
				break;
			case "Haft":
				result = 7;
				break;
			case "Hasht":
				result = 8;
				break;
			case "Noh":
				result = 9;
				break;
			case "Dah":
				result = 10;
				break;
			case "Yazdah":
				result = 11;
				break;
			case "Davazdah":
				result = 12;
				break;
			case "Sizdah":
				result = 13;
				break;
			case "Chahardah":
				result = 14;
				break;
			case "Panzdah":
				result = 15;
				break;
			case "Shanzdah":
				result = 16;
				break;
			case "Hefdah":
				result = 17;
				break;
			case "Hejdah":
				result = 18;
				break;
			case "Noozhad":
				result = 19;
				break;
			case "Bist":
				result = 20;
				break;
			case "Si":
				result = 30;
				break;
			case "Chehel":
				result = 40;
				break;
			case "Panjah":
				result = 50;
				break;
			case "Shast":
				result = 60;
				break;
			case "Haftad":
				result = 70;
				break;
			case "Hashtad":
				result = 80;
				break;
			case "Navad":
				result = 90;
				break;
			case "Sad":
				result = 100;
				break;
			case "Divist":
				result = 200;
				break;
			case "Sisad":
				result = 300;
				break;
			case "Chaharsad":
				result = 400;
				break;
			case "Pansad":
				result = 500;
				break;
			case "Sheshsad":
				result = 600;
				break;
			case "Haftsad":
				result = 700;
				break;
			case "Hashtsad":
				result = 800;
				break;
			case "Nohsad":
				result = 900;
				break;
			case "Hezar":
				result = 1000;
				break;
			case "Million":
				result = 1000000;
				break;
			case "Milliard":
				result = 1000000000;
				break;
		}

		return result;
	}

	// Searching in String array
	static int searchArr(String[] str, String key) {

		int index;
		for (index = 0; index < str.length; index++) {
			if (str[index].equals(key)) {
				return index;
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// number-to-character or character-to-number command
		System.out.println(
				"Please enter the command:\n('0' for converting number to letters and '1' for converting letters to number)");
		int command = Integer.parseInt(sc.nextLine());

		String num = new String();

		// '0' for number-to-character & '1' for character-to-number
		if (command == 0) {
			System.out.println("Please enter your number:");
			num = sc.nextLine();

			// greater than 12 digits error
			while (true) {
				if (num.length() > 12) {
					System.out.println("Entery has more than 12 digits. Please Enter your number again:");
					num = sc.nextLine();
				} else {
					break;
				}
			}
			toChar(num);
		} else if (command == 1) {
			System.out.println("Please enter your number (in lettesrs):");
			num = sc.nextLine();

			System.out.println(toNum(num));
		} else {
			System.out.println("Wrong command!");
		}

		sc.close();
	}
}