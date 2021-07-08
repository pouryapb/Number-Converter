import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NumConvert {

	private static final Logger LOGGER = Logger.getLogger(NumConvert.class.getName());
	private static final String HEZAR = "Hezar";
	private static final String MILLION = "Million";
	private static final String MILLIARD = "Milliard";

	// one digit toChar
	static String oneDigitToChar(String num) {

		var digit = Integer.parseInt(num);
		var result = "";

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

		var digit = Integer.parseInt(num);
		var result = "";
		var rDigit = String.valueOf(num.charAt(1));
		var firstDigitFromRight = digit % 10;

		switch (digit / 10) {
			case 0:
				result = oneDigitToChar(rDigit);
				break;
			case 1:
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
						break;
				}
				break;
			case 2:
				if (firstDigitFromRight == 0)
					result = "Bist";
				else
					result = "Bist o " + oneDigitToChar(rDigit);
				break;
			case 3:
				if (firstDigitFromRight == 0)
					result = "Si";
				else
					result = "Si o " + oneDigitToChar(rDigit);
				break;
			case 4:
				if (firstDigitFromRight == 0)
					result = "Chehel";
				else
					result = "Chehel o " + oneDigitToChar(rDigit);
				break;
			case 5:
				if (firstDigitFromRight == 0)
					result = "Panjah";
				else
					result = "Panjah o " + oneDigitToChar(rDigit);
				break;
			case 6:
				if (firstDigitFromRight == 0)
					result = "Shast";
				else
					result = "Shast o " + oneDigitToChar(rDigit);
				break;
			case 7:
				if (firstDigitFromRight == 0)
					result = "Haftad";
				else
					result = "Haftad o " + oneDigitToChar(rDigit);
				break;
			case 8:
				if (firstDigitFromRight == 0)
					result = "Hashtad";
				else
					result = "Hashtad o " + oneDigitToChar(rDigit);
				break;
			case 9:
				if (firstDigitFromRight == 0)
					result = "Navad";
				else
					result = "Navad o " + oneDigitToChar(rDigit);
				break;
			default:
				break;
		}

		return result;
	}

	// three digit toChar
	static String threeDigitsToChar(String num) {

		var digit = Integer.parseInt(num);
		var rDigit = String.valueOf(num.charAt(1)) + String.valueOf(num.charAt(2));
		var result = "";

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
			default:
				break;
		}

		return result;
	}

	// toChar
	static void toChar(String num) {

		var digit = num.length();
		var result = new StringBuilder();
		var temp = new String[12];

		for (var i = 0; i < 12; i++) {
			temp[i] = "0";
		}

		var j = 11;

		for (var i = digit - 1; i >= 0; i--) {
			temp[j] = String.valueOf(num.charAt(i));
			j--;
		}

		String temp2;
		String temp3;
		var milliardOTest = new StringBuilder();
		var millionOTest = new StringBuilder();
		var hezarOTest = new StringBuilder();

		for (var i = 3; i < 12; i++) {
			milliardOTest.append(temp[i]);
		}
		for (var i = 6; i < 12; i++) {
			millionOTest.append(temp[i]);
		}
		for (var i = 9; i < 12; i++) {
			hezarOTest.append(temp[i]);
		}

		for (var i = 0; i < 12; i += 3) {
			temp2 = temp[i] + temp[i + 1] + temp[i + 2];
			temp3 = temp[i] + temp[i + 1];

			if (!temp2.equals("000")) {
				switch (i) {
					case 0:
						result.append(threeDigitsToChar(temp2) + " " + MILLIARD);
						if (!milliardOTest.toString().equals("000000000")) {
							result.append(" o ");
						}
						break;
					case 3:
						result.append(threeDigitsToChar(temp2) + " " + MILLION);
						if (!millionOTest.toString().equals("000000")) {
							result.append(" o ");
						}
						break;
					case 6:
						if (temp3.equals("00") && temp[i + 2].equals("1")) {
							result.append(HEZAR);
							if (!hezarOTest.toString().equals("000")) {
								result.append(" o ");
							}
						} else {
							result.append(threeDigitsToChar(temp2) + " " + HEZAR);
							if (!hezarOTest.toString().equals("000")) {
								result.append(" o ");
							}

						}
						break;
					case 9:
						result.append(threeDigitsToChar(temp2));
						break;
					default:
						break;
				}
			}
		}
		var flag = 0;
		for (var k = 0; k < 12; k++) {
			if (temp[k].equals("0")) {
				flag = 1;
			} else {
				flag = 0;
				break;
			}
		}
		if (flag == 1) {
			result.append("Sefr");
		}
		var out = result.toString();
		LOGGER.log(Level.INFO, out);

	}

	// toNum
	static long toNum(String num) {

		long result = 0;
		long temp = 0;

		String[] numArr = num.split(" ");

		for (var i = 0; i < numArr.length; i++) {

			if (numArr[i].equals("o")) {
				continue;
			}
			if (numArr[i].equals(MILLIARD) || numArr[i].equals(MILLION)) {
				temp *= stringToNum(numArr[i]);
				result += temp;
				temp = 0;
			}
			if (numArr[i].equals(HEZAR)) {
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
			if (!numArr[i].equals(MILLIARD) && !numArr[i].equals(MILLION) && !numArr[i].equals(HEZAR)) {
				temp += stringToNum(numArr[i]);
			}

		}

		result += temp;

		return result;
	}

	// Changes string to number and is used in toNum() function
	static int stringToNum(String num) {

		var result = 0;

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
			case HEZAR:
				result = 1000;
				break;
			case MILLION:
				result = 1000000;
				break;
			case MILLIARD:
				result = 1000000000;
				break;
			default:
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

		var sc = new Scanner(System.in);

		// number-to-character or character-to-number command
		LOGGER.log(Level.INFO,
				"Please enter the command:\n('0' for converting number to letters and '1' for converting letters to number)");
		var command = Integer.parseInt(sc.nextLine());

		var num = "";

		// '0' for number-to-character & '1' for character-to-number
		if (command == 0) {
			LOGGER.log(Level.INFO, "Please enter your number:");
			num = sc.nextLine();

			// greater than 12 digits error
			while (true) {
				if (num.length() > 12) {
					LOGGER.log(Level.INFO, "Entery has more than 12 digits. Please Enter your number again:");
					num = sc.nextLine();
				} else {
					break;
				}
			}
			toChar(num);
		} else if (command == 1) {
			LOGGER.log(Level.INFO, "Please enter your number (in lettesrs):");
			num = sc.nextLine();
			var out = String.valueOf(toNum(num));
			LOGGER.log(Level.INFO, out);
		} else {
			LOGGER.log(Level.INFO, "Wrong command!");
		}

		sc.close();
	}
}