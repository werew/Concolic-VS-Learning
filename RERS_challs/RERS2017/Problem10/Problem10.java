import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem10 {
	static BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

	private String[] inputs = {"B","E","C","A","D"};

	public String a41 = "i";
	public int a13 = 13;
	public int a175 = 10;
	public int a161 = 13;
	public int a196 = 10;
	public int a11 = 10;
	public boolean cf = true;
	public String a137 = "g";
	public String a69 = "i";
	public int a165 = 9;
	public int a141 = 12;
	public int a187 = 7;
	public String a179 = "h";
	public String a168 = "h";
	public String a19 = "e";
	public String a55 = "g";
	public String a149 = "h";
	public int a49 = 4;
	public String a62 = "h";
	public int a26 = 12;
	public String a114 = "i";
	public int a3 = 11;
	public String a73 = "h";
	public String a188 = "h";
	public int a16 = 8;
	public int a50 = 11;
	public String a97 = "g";
	public String a68 = "e";
	public int a65 = 11;
	public int a148 = 6;
	public int a126 = 9;
	public int a170 = 15;
	public int a173 = 7;
	public String a152 = "g";
	public int a169 = 2;

	private void errorCheck() {
	    if((((a169 == 4) && (a41.equals("f"))) && (a62.equals("f")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(0);
	    }
	    if((((a126 == 11) && (a173 == 12)) && (a62.equals("e")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(1);
	    }
	    if((((a196 == 6) && (a50 == 8)) && (a62.equals("h")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(2);
	    }
	    if((((a3 == 8) && (a114.equals("i"))) && (a62.equals("i")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(3);
	    }
	    if((((a137.equals("e")) && (a114.equals("h"))) && (a62.equals("i")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(4);
	    }
	    if((((a152.equals("g")) && (a173 == 8)) && (a62.equals("e")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(5);
	    }
	    if((((a16 == 9) && (a50 == 14)) && (a62.equals("h")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(6);
	    }
	    if((((a65 == 8) && (a50 == 12)) && (a62.equals("h")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(7);
	    }
	    if((((a187 == 5) && (a161 == 10)) && (a62.equals("g")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(8);
	    }
	    if((((a41.equals("f")) && (a173 == 7)) && (a62.equals("e")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(9);
	    }
	    if((((a141 == 11) && (a50 == 10)) && (a62.equals("h")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(10);
	    }
	    if((((a3 == 12) && (a114.equals("i"))) && (a62.equals("i")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(11);
	    }
	    if((((a196 == 4) && (a50 == 8)) && (a62.equals("h")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(12);
	    }
	    if((((a179.equals("h")) && (a161 == 13)) && (a62.equals("g")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(13);
	    }
	    if((((a16 == 3) && (a50 == 14)) && (a62.equals("h")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(14);
	    }
	    if((((a41.equals("e")) && (a173 == 7)) && (a62.equals("e")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(15);
	    }
	    if((((a26 == 17) && (a161 == 14)) && (a62.equals("g")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(16);
	    }
	    if((((a187 == 8) && (a161 == 10)) && (a62.equals("g")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(17);
	    }
	    if((((a65 == 11) && (a50 == 12)) && (a62.equals("h")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(18);
	    }
	    if((((a161 == 16) && (a173 == 5)) && (a62.equals("e")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(19);
	    }
	    if((((a55.equals("f")) && (a41.equals("e"))) && (a62.equals("f")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(20);
	    }
	    if((((a175 == 12) && (a50 == 9)) && (a62.equals("h")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(21);
	    }
	    if((((a69.equals("g")) && (a114.equals("f"))) && (a62.equals("i")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(22);
	    }
	    if((((a165 == 10) && (a41.equals("i"))) && (a62.equals("f")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(23);
	    }
	    if((((a188.equals("i")) && (a41.equals("g"))) && (a62.equals("f")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(24);
	    }
	    if((((a168.equals("i")) && (a161 == 11)) && (a62.equals("g")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(25);
	    }
	    if((((a11 == 7) && (a50 == 11)) && (a62.equals("h")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(26);
	    }
	    if((((a3 == 13) && (a114.equals("i"))) && (a62.equals("i")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(27);
	    }
	    if((((a126 == 13) && (a173 == 12)) && (a62.equals("e")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(28);
	    }
	    if((((a49 == 8) && (a161 == 9)) && (a62.equals("g")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(29);
	    }
	    if((((a65 == 5) && (a50 == 12)) && (a62.equals("h")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(30);
	    }
	    if((((a170 == 13) && (a50 == 15)) && (a62.equals("h")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(31);
	    }
	    if((((a196 == 8) && (a50 == 8)) && (a62.equals("h")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(32);
	    }
	    if((((a187 == 10) && (a161 == 10)) && (a62.equals("g")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(33);
	    }
	    if((((a126 == 9) && (a173 == 12)) && (a62.equals("e")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(34);
	    }
	    if((((a148 == 2) && (a161 == 12)) && (a62.equals("g")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(35);
	    }
	    if((((a161 == 11) && (a173 == 5)) && (a62.equals("e")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(36);
	    }
	    if((((a169 == 3) && (a41.equals("f"))) && (a62.equals("f")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(37);
	    }
	    if((((a165 == 13) && (a41.equals("i"))) && (a62.equals("f")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(38);
	    }
	    if((((a97.equals("i")) && (a114.equals("e"))) && (a62.equals("i")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(39);
	    }
	    if((((a11 == 14) && (a50 == 11)) && (a62.equals("h")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(40);
	    }
	    if((((a16 == 5) && (a50 == 14)) && (a62.equals("h")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(41);
	    }
	    if((((a175 == 13) && (a50 == 9)) && (a62.equals("h")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(42);
	    }
	    if((((a168.equals("e")) && (a161 == 11)) && (a62.equals("g")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(43);
	    }
	    if((((a169 == 6) && (a41.equals("f"))) && (a62.equals("f")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(44);
	    }
	    if((((a187 == 9) && (a161 == 10)) && (a62.equals("g")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(45);
	    }
	    if((((a26 == 13) && (a173 == 9)) && (a62.equals("e")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(46);
	    }
	    if((((a165 == 15) && (a41.equals("h"))) && (a62.equals("f")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(47);
	    }
	    if((((a149.equals("g")) && (a173 == 11)) && (a62.equals("e")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(48);
	    }
	    if((((a187 == 6) && (a161 == 10)) && (a62.equals("g")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(49);
	    }
	    if((((a141 == 12) && (a50 == 10)) && (a62.equals("h")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(50);
	    }
	    if((((a3 == 11) && (a114.equals("i"))) && (a62.equals("i")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(51);
	    }
	    if((((a16 == 8) && (a50 == 14)) && (a62.equals("h")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(52);
	    }
	    if((((a141 == 7) && (a50 == 10)) && (a62.equals("h")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(53);
	    }
	    if((((a137.equals("h")) && (a114.equals("h"))) && (a62.equals("i")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(54);
	    }
	    if((((a152.equals("h")) && (a114.equals("g"))) && (a62.equals("i")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(55);
	    }
	    if((((a165 == 11) && (a41.equals("h"))) && (a62.equals("f")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(56);
	    }
	    if((((a49 == 7) && (a161 == 9)) && (a62.equals("g")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(57);
	    }
	    if((((a55.equals("g")) && (a41.equals("e"))) && (a62.equals("f")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(58);
	    }
	    if((((a16 == 4) && (a50 == 14)) && (a62.equals("h")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(59);
	    }
	    if((((a26 == 13) && (a161 == 14)) && (a62.equals("g")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(60);
	    }
	    if((((a141 == 6) && (a50 == 10)) && (a62.equals("h")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(61);
	    }
	    if((((a55.equals("h")) && (a41.equals("e"))) && (a62.equals("f")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(62);
	    }
	    if((((a175 == 8) && (a50 == 9)) && (a62.equals("h")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(63);
	    }
	    if((((a165 == 9) && (a41.equals("i"))) && (a62.equals("f")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(64);
	    }
	    if((((a141 == 8) && (a50 == 10)) && (a62.equals("h")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(65);
	    }
	    if((((a170 == 10) && (a50 == 15)) && (a62.equals("h")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(66);
	    }
	    if((((a11 == 11) && (a50 == 11)) && (a62.equals("h")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(67);
	    }
	    if((((a55.equals("e")) && (a41.equals("e"))) && (a62.equals("f")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(68);
	    }
	    if((((a26 == 16) && (a173 == 9)) && (a62.equals("e")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(69);
	    }
	    if((((a196 == 9) && (a50 == 8)) && (a62.equals("h")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(70);
	    }
	    if((((a26 == 10) && (a173 == 9)) && (a62.equals("e")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(71);
	    }
	    if((((a49 == 4) && (a161 == 9)) && (a62.equals("g")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(72);
	    }
	    if((((a161 == 13) && (a173 == 5)) && (a62.equals("e")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(73);
	    }
	    if((((a148 == 3) && (a161 == 12)) && (a62.equals("g")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(74);
	    }
	    if((((a65 == 6) && (a50 == 12)) && (a62.equals("h")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(75);
	    }
	    if((((a68.equals("h")) && (a173 == 6)) && (a62.equals("e")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(76);
	    }
	    if((((a68.equals("i")) && (a173 == 6)) && (a62.equals("e")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(77);
	    }
	    if((((a170 == 17) && (a50 == 15)) && (a62.equals("h")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(78);
	    }
	    if((((a26 == 15) && (a173 == 9)) && (a62.equals("e")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(79);
	    }
	    if((((a148 == 8) && (a161 == 12)) && (a62.equals("g")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(80);
	    }
	    if((((a141 == 10) && (a50 == 10)) && (a62.equals("h")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(81);
	    }
	    if((((a49 == 10) && (a161 == 9)) && (a62.equals("g")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(82);
	    }
	    if((((a170 == 15) && (a50 == 15)) && (a62.equals("h")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(83);
	    }
	    if((((a13 == 15) && (a173 == 10)) && (a62.equals("e")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(84);
	    }
	    if((((a165 == 16) && (a41.equals("h"))) && (a62.equals("f")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(85);
	    }
	    if((((a148 == 7) && (a161 == 12)) && (a62.equals("g")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(86);
	    }
	    if((((a179.equals("e")) && (a161 == 13)) && (a62.equals("g")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(87);
	    }
	    if((((a187 == 4) && (a161 == 10)) && (a62.equals("g")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(88);
	    }
	    if((((a73.equals("f")) && (a50 == 13)) && (a62.equals("h")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(89);
	    }
	    if((((a19.equals("g")) && (a161 == 16)) && (a62.equals("g")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(90);
	    }
	    if((((a175 == 11) && (a50 == 9)) && (a62.equals("h")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(91);
	    }
	    if((((a165 == 12) && (a41.equals("h"))) && (a62.equals("f")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(92);
	    }
	    if((((a126 == 10) && (a173 == 12)) && (a62.equals("e")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(93);
	    }
	    if((((a149.equals("h")) && (a173 == 11)) && (a62.equals("e")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(94);
	    }
	    if((((a169 == 2) && (a41.equals("f"))) && (a62.equals("f")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(95);
	    }
	    if((((a175 == 10) && (a50 == 9)) && (a62.equals("h")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(96);
	    }
	    if((((a141 == 5) && (a50 == 10)) && (a62.equals("h")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(97);
	    }
	    if((((a196 == 10) && (a50 == 8)) && (a62.equals("h")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(98);
	    }
	    if((((a168.equals("f")) && (a161 == 11)) && (a62.equals("g")))){
	    	cf = false;
	    	Errors.__VERIFIER_error(99);
	    }
	}private  void calculateOutputm35(String input) {
    if(((a161 == 10) && (((input.equals("D")) && (cf && (a62.equals("e")))) && (a173 == 5)))) {
    	cf = false;
    	a62 = "h";
    	a73 = "e";
    	a50 = 13; 
    	System.out.println("Y");
    } 
    if(((input.equals("E")) && ((a173 == 5) && (((a161 == 10) && cf) && (a62.equals("e")))))) {
    	cf = false;
    	a41 = "h";
    	a173 = 7; 
    	System.out.println("U");
    } 
}
private  void calculateOutputm37(String input) {
    if((((a161 == 12) && ((input.equals("C")) && (cf && (a173 == 5)))) && (a62.equals("e")))) {
    	cf = false;
    	a41 = "g";
    	a62 = "f";
    	a188 = "f"; 
    	System.out.println("Z");
    } 
    if(((a173 == 5) && ((a62.equals("e")) && ((cf && (input.equals("E"))) && (a161 == 12))))) {
    	cf = false;
    	a114 = "g";
    	a62 = "i";
    	a152 = "e"; 
    	System.out.println("Z");
    } 
    if(((((a173 == 5) && (cf && (a161 == 12))) && (a62.equals("e"))) && (input.equals("B")))) {
    	cf = false;
    	a50 = 11;
    	a62 = "h";
    	a11 = 7; 
    	System.out.println("S");
    } 
}
private  void calculateOutputm1(String input) {
    if(((a161 == 10) && cf)) {
    	calculateOutputm35(input);
    } 
    if(((a161 == 12) && cf)) {
    	calculateOutputm37(input);
    } 
}
private  void calculateOutputm40(String input) {
    if(((a68.equals("e")) && ((a62.equals("e")) && ((cf && (a173 == 6)) && (input.equals("B")))))) {
    	cf = false;
    	a62 = "g";
    	a161 = 9;
    	a49 = 9; 
    	System.out.println("Y");
    } 
    if((((input.equals("D")) && (((a62.equals("e")) && cf) && (a173 == 6))) && (a68.equals("e")))) {
    	cf = false;
    	a62 = "f";
    	a41 = "g";
    	a188 = "h"; 
    	System.out.println("X");
    } 
    if(((a68.equals("e")) && ((a62.equals("e")) && (((input.equals("A")) && cf) && (a173 == 6))))) {
    	cf = false;
    	a173 = 12;
    	a126 = 7; 
    	System.out.println("Y");
    } 
}
private  void calculateOutputm41(String input) {
    if(((a62.equals("e")) && (((a68.equals("f")) && ((input.equals("C")) && cf)) && (a173 == 6)))) {
    	cf = false;
    	a161 = 9;
    	a62 = "g";
    	a49 = 5; 
    	System.out.println("V");
    } 
    if((((a68.equals("f")) && ((a62.equals("e")) && ((input.equals("E")) && cf))) && (a173 == 6))) {
    	cf = false;
    	 
    	System.out.println("T");
    } 
}
private  void calculateOutputm2(String input) {
    if((cf && (a68.equals("e")))) {
    	calculateOutputm40(input);
    } 
    if(((a68.equals("f")) && cf)) {
    	calculateOutputm41(input);
    } 
}
private  void calculateOutputm46(String input) {
    if(((a173 == 7) && ((((a41.equals("h")) && cf) && (input.equals("E"))) && (a62.equals("e"))))) {
    	cf = false;
    	a62 = "h";
    	a73 = "e";
    	a50 = 13; 
    	System.out.println("Y");
    } 
}
private  void calculateOutputm47(String input) {
    if(((((cf && (a62.equals("e"))) && (a41.equals("i"))) && (a173 == 7)) && (input.equals("C")))) {
    	cf = false;
    	a62 = "h";
    	a50 = 14;
    	a16 = 7; 
    	System.out.println("T");
    } 
    if((((((a173 == 7) && cf) && (a41.equals("i"))) && (a62.equals("e"))) && (input.equals("A")))) {
    	cf = false;
    	a50 = 11;
    	a62 = "h";
    	a11 = 12; 
    	System.out.println("U");
    } 
}
private  void calculateOutputm3(String input) {
    if(((a41.equals("h")) && cf)) {
    	calculateOutputm46(input);
    } 
    if((cf && (a41.equals("i")))) {
    	calculateOutputm47(input);
    } 
}
private  void calculateOutputm48(String input) {
    if(((input.equals("D")) && ((((a62.equals("e")) && cf) && (a152.equals("e"))) && (a173 == 8)))) {
    	cf = false;
    	a62 = "h";
    	a50 = 8;
    	a196 = 6; 
    	System.out.println("Z");
    } 
    if(((a173 == 8) && ((a62.equals("e")) && (((input.equals("C")) && cf) && (a152.equals("e")))))) {
    	cf = false;
    	a173 = 5;
    	a161 = 12; 
    	System.out.println("Z");
    } 
}
private  void calculateOutputm49(String input) {
    if((((a152.equals("f")) && (((a173 == 8) && cf) && (input.equals("E")))) && (a62.equals("e")))) {
    	cf = false;
    	a62 = "f";
    	a41 = "i";
    	a165 = 16; 
    	System.out.println("V");
    } 
    if(((a152.equals("f")) && ((a173 == 8) && (((input.equals("C")) && cf) && (a62.equals("e")))))) {
    	cf = false;
    	a173 = 12;
    	a126 = 11; 
    	System.out.println("U");
    } 
    if(((input.equals("B")) && (((cf && (a62.equals("e"))) && (a173 == 8)) && (a152.equals("f"))))) {
    	cf = false;
    	a114 = "f";
    	a62 = "i";
    	a69 = "f"; 
    	System.out.println("U");
    } 
}
private  void calculateOutputm51(String input) {
    if(((a173 == 8) && ((input.equals("C")) && (((a62.equals("e")) && cf) && (a152.equals("h")))))) {
    	cf = false;
    	a62 = "g";
    	a161 = 14;
    	a26 = 15; 
    	System.out.println("T");
    } 
    if(((a62.equals("e")) && (((a173 == 8) && ((a152.equals("h")) && cf)) && (input.equals("A"))))) {
    	cf = false;
    	a149 = "e";
    	a173 = 11; 
    	System.out.println("U");
    } 
}
private  void calculateOutputm52(String input) {
    if((((a173 == 8) && ((a152.equals("i")) && ((a62.equals("e")) && cf))) && (input.equals("C")))) {
    	cf = false;
    	a50 = 11;
    	a62 = "h";
    	a11 = 9; 
    	System.out.println("T");
    } 
    if(((((input.equals("E")) && ((a173 == 8) && cf)) && (a152.equals("i"))) && (a62.equals("e")))) {
    	cf = false;
    	a41 = "f";
    	a62 = "f";
    	a169 = 5; 
    	System.out.println("V");
    } 
}
private  void calculateOutputm4(String input) {
    if(((a152.equals("e")) && cf)) {
    	calculateOutputm48(input);
    } 
    if(((a152.equals("f")) && cf)) {
    	calculateOutputm49(input);
    } 
    if(((a152.equals("h")) && cf)) {
    	calculateOutputm51(input);
    } 
    if((cf && (a152.equals("i")))) {
    	calculateOutputm52(input);
    } 
}
private  void calculateOutputm54(String input) {
    if((((a26 == 11) && (((a173 == 9) && cf) && (input.equals("C")))) && (a62.equals("e")))) {
    	cf = false;
    	a26 = 17; 
    	System.out.println("V");
    } 
}
private  void calculateOutputm55(String input) {
    if(((((cf && (a62.equals("e"))) && (input.equals("A"))) && (a173 == 9)) && (a26 == 12))) {
    	cf = false;
    	a62 = "g";
    	a179 = "i";
    	a161 = 13; 
    	System.out.println("U");
    } 
    if((((a62.equals("e")) && ((a26 == 12) && ((a173 == 9) && cf))) && (input.equals("C")))) {
    	cf = false;
    	a173 = 10;
    	a13 = 14; 
    	System.out.println("T");
    } 
}
private  void calculateOutputm57(String input) {
    if(((a173 == 9) && ((input.equals("C")) && ((a62.equals("e")) && (cf && (a26 == 14)))))) {
    	cf = false;
    	a62 = "f";
    	a41 = "g";
    	a188 = "e"; 
    	System.out.println("X");
    } 
}
private  void calculateOutputm60(String input) {
    if(((a26 == 17) && ((input.equals("E")) && ((cf && (a62.equals("e"))) && (a173 == 9))))) {
    	cf = false;
    	a62 = "h";
    	a50 = 15;
    	a170 = 16; 
    	System.out.println("Y");
    } 
}
private  void calculateOutputm5(String input) {
    if((cf && (a26 == 11))) {
    	calculateOutputm54(input);
    } 
    if((cf && (a26 == 12))) {
    	calculateOutputm55(input);
    } 
    if(((a26 == 14) && cf)) {
    	calculateOutputm57(input);
    } 
    if(((a26 == 17) && cf)) {
    	calculateOutputm60(input);
    } 
}
private  void calculateOutputm61(String input) {
    if(((a13 == 12) && ((a62.equals("e")) && ((input.equals("B")) && (cf && (a173 == 10)))))) {
    	cf = false;
    	a161 = 9;
    	a62 = "g";
    	a49 = 9; 
    	System.out.println("Y");
    } 
    if(((a13 == 12) && ((((a173 == 10) && cf) && (input.equals("D"))) && (a62.equals("e"))))) {
    	cf = false;
    	a41 = "g";
    	a62 = "f";
    	a188 = "h"; 
    	System.out.println("X");
    } 
    if(((input.equals("A")) && ((a62.equals("e")) && (((a173 == 10) && cf) && (a13 == 12))))) {
    	cf = false;
    	a50 = 15;
    	a62 = "h";
    	a170 = 11; 
    	System.out.println("Y");
    } 
}
private  void calculateOutputm62(String input) {
    if((((((input.equals("C")) && cf) && (a62.equals("e"))) && (a173 == 10)) && (a13 == 14))) {
    	cf = false;
    	a50 = 14;
    	a62 = "h";
    	a16 = 6; 
    	System.out.println("Z");
    } 
}
private  void calculateOutputm64(String input) {
    if(((((input.equals("E")) && (cf && (a62.equals("e")))) && (a173 == 10)) && (a13 == 16))) {
    	cf = false;
    	a62 = "h";
    	a50 = 11;
    	a11 = 8; 
    	System.out.println("Z");
    } 
    if((((input.equals("D")) && ((cf && (a13 == 16)) && (a62.equals("e")))) && (a173 == 10))) {
    	cf = false;
    	a62 = "f";
    	a41 = "e";
    	a55 = "h"; 
    	System.out.println("S");
    } 
    if(((a13 == 16) && ((a62.equals("e")) && (((a173 == 10) && cf) && (input.equals("B")))))) {
    	cf = false;
    	a41 = "e";
    	a62 = "f";
    	a55 = "g"; 
    	System.out.println("V");
    } 
    if((((a62.equals("e")) && ((a13 == 16) && (cf && (a173 == 10)))) && (input.equals("C")))) {
    	cf = false;
    	a68 = "f";
    	a62 = "g";
    	a161 = 15; 
    	System.out.println("Z");
    } 
}
private  void calculateOutputm6(String input) {
    if(((a13 == 12) && cf)) {
    	calculateOutputm61(input);
    } 
    if((cf && (a13 == 14))) {
    	calculateOutputm62(input);
    } 
    if((cf && (a13 == 16))) {
    	calculateOutputm64(input);
    } 
}
private  void calculateOutputm65(String input) {
    if(((a149.equals("e")) && ((input.equals("B")) && ((cf && (a62.equals("e"))) && (a173 == 11))))) {
    	cf = false;
    	a114 = "f";
    	a62 = "i";
    	a69 = "f"; 
    	System.out.println("U");
    } 
    if(((input.equals("E")) && ((((a173 == 11) && cf) && (a62.equals("e"))) && (a149.equals("e"))))) {
    	cf = false;
    	a173 = 9;
    	a26 = 14; 
    	System.out.println("V");
    } 
}
private  void calculateOutputm68(String input) {
    if((((a149.equals("i")) && ((input.equals("C")) && ((a173 == 11) && cf))) && (a62.equals("e")))) {
    	cf = false;
    	a161 = 9;
    	a62 = "g";
    	a49 = 5; 
    	System.out.println("V");
    } 
    if(((a173 == 11) && (((cf && (a62.equals("e"))) && (input.equals("E"))) && (a149.equals("i"))))) {
    	cf = false;
    	a62 = "i";
    	a114 = "f";
    	a69 = "h"; 
    	System.out.println("T");
    } 
}
private  void calculateOutputm7(String input) {
    if(((a149.equals("e")) && cf)) {
    	calculateOutputm65(input);
    } 
    if((cf && (a149.equals("i")))) {
    	calculateOutputm68(input);
    } 
}
private  void calculateOutputm69(String input) {
    if(((a62.equals("e")) && (((a126 == 7) && ((a173 == 12) && cf)) && (input.equals("B"))))) {
    	cf = false;
    	a126 = 13; 
    	System.out.println("W");
    } 
    if((((input.equals("E")) && ((cf && (a126 == 7)) && (a62.equals("e")))) && (a173 == 12))) {
    	cf = false;
    	a179 = "g";
    	a62 = "g";
    	a161 = 13; 
    	System.out.println("W");
    } 
}
private  void calculateOutputm8(String input) {
    if(((a126 == 7) && cf)) {
    	calculateOutputm69(input);
    } 
}
private  void calculateOutputm78(String input) {
    if((((((a55.equals("i")) && cf) && (a41.equals("e"))) && (a62.equals("f"))) && (input.equals("C")))) {
    	cf = false;
    	a114 = "i";
    	a62 = "i";
    	a3 = 14; 
    	System.out.println("V");
    } 
    if(((((a62.equals("f")) && ((a55.equals("i")) && cf)) && (input.equals("E"))) && (a41.equals("e")))) {
    	cf = false;
    	a68 = "f";
    	a62 = "e";
    	a173 = 6; 
    	System.out.println("T");
    } 
}
private  void calculateOutputm9(String input) {
    if(((a55.equals("i")) && cf)) {
    	calculateOutputm78(input);
    } 
}
private  void calculateOutputm82(String input) {
    if((((a62.equals("f")) && ((cf && (a41.equals("f"))) && (a169 == 5))) && (input.equals("E")))) {
    	cf = false;
    	a114 = "h";
    	a62 = "i";
    	a137 = "f"; 
    	System.out.println("V");
    } 
    if(((input.equals("C")) && ((a62.equals("f")) && (((a41.equals("f")) && cf) && (a169 == 5))))) {
    	cf = false;
    	a50 = 15;
    	a62 = "h";
    	a170 = 14; 
    	System.out.println("T");
    } 
}
private  void calculateOutputm10(String input) {
    if(((a169 == 5) && cf)) {
    	calculateOutputm82(input);
    } 
}
private  void calculateOutputm84(String input) {
    if(((input.equals("A")) && (((a188.equals("e")) && (cf && (a62.equals("f")))) && (a41.equals("g"))))) {
    	cf = false;
    	a188 = "g"; 
    	System.out.println("U");
    } 
    if((((a41.equals("g")) && ((a62.equals("f")) && (cf && (a188.equals("e"))))) && (input.equals("C")))) {
    	cf = false;
    	a62 = "i";
    	a114 = "h";
    	a137 = "i"; 
    	System.out.println("T");
    } 
}
private  void calculateOutputm85(String input) {
    if(((((a188.equals("f")) && ((a62.equals("f")) && cf)) && (input.equals("C"))) && (a41.equals("g")))) {
    	cf = false;
    	a62 = "g";
    	a161 = 12;
    	a148 = 4; 
    	System.out.println("T");
    } 
    if((((input.equals("A")) && ((a62.equals("f")) && (cf && (a188.equals("f"))))) && (a41.equals("g")))) {
    	cf = false;
    	a188 = "g"; 
    	System.out.println("U");
    } 
}
private  void calculateOutputm86(String input) {
    if(((a62.equals("f")) && (((cf && (input.equals("B"))) && (a188.equals("g"))) && (a41.equals("g"))))) {
    	cf = false;
    	a62 = "i";
    	a114 = "f";
    	a69 = "f"; 
    	System.out.println("U");
    } 
    if((((a62.equals("f")) && ((a188.equals("g")) && ((a41.equals("g")) && cf))) && (input.equals("E")))) {
    	cf = false;
    	a41 = "i";
    	a165 = 16; 
    	System.out.println("V");
    } 
}
private  void calculateOutputm87(String input) {
    if(((((cf && (input.equals("D"))) && (a188.equals("h"))) && (a41.equals("g"))) && (a62.equals("f")))) {
    	cf = false;
    	a161 = 9;
    	a62 = "g";
    	a49 = 9; 
    	System.out.println("Y");
    } 
}
private  void calculateOutputm11(String input) {
    if((cf && (a188.equals("e")))) {
    	calculateOutputm84(input);
    } 
    if((cf && (a188.equals("f")))) {
    	calculateOutputm85(input);
    } 
    if((cf && (a188.equals("g")))) {
    	calculateOutputm86(input);
    } 
    if(((a188.equals("h")) && cf)) {
    	calculateOutputm87(input);
    } 
}
private  void calculateOutputm89(String input) {
    if(((input.equals("E")) && (((cf && (a62.equals("f"))) && (a165 == 9)) && (a41.equals("h"))))) {
    	cf = false;
    	a168 = "f";
    	a62 = "g";
    	a161 = 11; 
    	System.out.println("U");
    } 
    if((((a165 == 9) && (((input.equals("C")) && cf) && (a62.equals("f")))) && (a41.equals("h")))) {
    	cf = false;
    	a41 = "i";
    	a165 = 11; 
    	System.out.println("Z");
    } 
}
private  void calculateOutputm90(String input) {
    if(((((cf && (input.equals("B"))) && (a165 == 10)) && (a41.equals("h"))) && (a62.equals("f")))) {
    	cf = false;
    	a68 = "e";
    	a62 = "e";
    	a173 = 6; 
    	System.out.println("W");
    } 
    if((((input.equals("E")) && ((a165 == 10) && (cf && (a62.equals("f"))))) && (a41.equals("h")))) {
    	cf = false;
    	a50 = 8;
    	a62 = "h";
    	a196 = 5; 
    	System.out.println("W");
    } 
}
private  void calculateOutputm93(String input) {
    if((((a41.equals("h")) && ((cf && (a62.equals("f"))) && (input.equals("C")))) && (a165 == 13))) {
    	cf = false;
    	a41 = "g";
    	a188 = "f"; 
    	System.out.println("Z");
    } 
    if(((a165 == 13) && ((input.equals("E")) && (((a41.equals("h")) && cf) && (a62.equals("f")))))) {
    	cf = false;
    	a41 = "g";
    	a188 = "f"; 
    	System.out.println("Z");
    } 
    if(((((input.equals("B")) && (cf && (a41.equals("h")))) && (a165 == 13)) && (a62.equals("f")))) {
    	cf = false;
    	a41 = "i"; 
    	System.out.println("U");
    } 
}
private  void calculateOutputm94(String input) {
    if((((a62.equals("f")) && ((input.equals("C")) && (cf && (a165 == 14)))) && (a41.equals("h")))) {
    	cf = false;
    	a161 = 14;
    	a62 = "g";
    	a26 = 10; 
    	System.out.println("T");
    } 
    if(((a62.equals("f")) && ((a41.equals("h")) && (((a165 == 14) && cf) && (input.equals("E")))))) {
    	cf = false;
    	a19 = "f";
    	a62 = "g";
    	a161 = 16; 
    	System.out.println("V");
    } 
}
private  void calculateOutputm12(String input) {
    if((cf && (a165 == 9))) {
    	calculateOutputm89(input);
    } 
    if(((a165 == 10) && cf)) {
    	calculateOutputm90(input);
    } 
    if(((a165 == 13) && cf)) {
    	calculateOutputm93(input);
    } 
    if((cf && (a165 == 14))) {
    	calculateOutputm94(input);
    } 
}
private  void calculateOutputm99(String input) {
    if((((a165 == 11) && ((input.equals("E")) && ((a62.equals("f")) && cf))) && (a41.equals("i")))) {
    	cf = false;
    	a41 = "g";
    	a188 = "f"; 
    	System.out.println("Z");
    } 
    if(((((input.equals("C")) && (cf && (a62.equals("f")))) && (a165 == 11)) && (a41.equals("i")))) {
    	cf = false;
    	a41 = "g";
    	a188 = "f"; 
    	System.out.println("Z");
    } 
}
private  void calculateOutputm101(String input) {
    if((((a41.equals("i")) && ((cf && (a165 == 14)) && (input.equals("E")))) && (a62.equals("f")))) {
    	cf = false;
    	a62 = "h";
    	a50 = 15;
    	a170 = 16; 
    	System.out.println("Y");
    } 
    if(((a62.equals("f")) && ((a165 == 14) && ((input.equals("B")) && (cf && (a41.equals("i"))))))) {
    	cf = false;
    	a62 = "e";
    	a149 = "g";
    	a173 = 11; 
    	System.out.println("Y");
    } 
}
private  void calculateOutputm102(String input) {
    if(((((cf && (a62.equals("f"))) && (a165 == 16)) && (a41.equals("i"))) && (input.equals("C")))) {
    	cf = false;
    	a41 = "g";
    	a188 = "f"; 
    	System.out.println("X");
    } 
}
private  void calculateOutputm13(String input) {
    if(((a165 == 11) && cf)) {
    	calculateOutputm99(input);
    } 
    if(((a165 == 14) && cf)) {
    	calculateOutputm101(input);
    } 
    if(((a165 == 16) && cf)) {
    	calculateOutputm102(input);
    } 
}
private  void calculateOutputm104(String input) {
    if(((((a62.equals("g")) && ((a161 == 9) && cf)) && (a49 == 5)) && (input.equals("E")))) {
    	cf = false;
    	a19 = "f";
    	a161 = 16; 
    	System.out.println("Y");
    } 
}
private  void calculateOutputm105(String input) {
    if((((a49 == 6) && (((a62.equals("g")) && cf) && (input.equals("C")))) && (a161 == 9))) {
    	cf = false;
    	a161 = 12;
    	a148 = 4; 
    	System.out.println("T");
    } 
    if(((a161 == 9) && (((input.equals("A")) && (cf && (a49 == 6))) && (a62.equals("g"))))) {
    	cf = false;
    	a50 = 14;
    	a62 = "h";
    	a16 = 10; 
    	System.out.println("U");
    } 
}
private  void calculateOutputm108(String input) {
    if((((a161 == 9) && ((input.equals("C")) && ((a49 == 9) && cf))) && (a62.equals("g")))) {
    	cf = false;
    	a62 = "i";
    	a114 = "f";
    	a69 = "f"; 
    	System.out.println("U");
    } 
}
private  void calculateOutputm110(String input) {
    if(((((cf && (a49 == 11)) && (a62.equals("g"))) && (a161 == 9)) && (input.equals("A")))) {
    	cf = false;
    	a62 = "f";
    	a41 = "g";
    	a188 = "g"; 
    	System.out.println("U");
    } 
    if((((((a62.equals("g")) && cf) && (a161 == 9)) && (input.equals("C"))) && (a49 == 11))) {
    	cf = false;
    	a62 = "e";
    	a152 = "e";
    	a173 = 8; 
    	System.out.println("T");
    } 
}
private  void calculateOutputm14(String input) {
    if(((a49 == 5) && cf)) {
    	calculateOutputm104(input);
    } 
    if(((a49 == 6) && cf)) {
    	calculateOutputm105(input);
    } 
    if(((a49 == 9) && cf)) {
    	calculateOutputm108(input);
    } 
    if(((a49 == 11) && cf)) {
    	calculateOutputm110(input);
    } 
}
private  void calculateOutputm111(String input) {
    if((((a62.equals("g")) && ((cf && (a161 == 10)) && (a187 == 3))) && (input.equals("E")))) {
    	cf = false;
    	a62 = "e";
    	a152 = "i";
    	a173 = 8; 
    	System.out.println("Y");
    } 
}
private  void calculateOutputm115(String input) {
    if(((((a187 == 7) && (cf && (a161 == 10))) && (a62.equals("g"))) && (input.equals("A")))) {
    	cf = false;
    	a187 = 10; 
    	System.out.println("Y");
    } 
    if(((((a161 == 10) && (cf && (a62.equals("g")))) && (a187 == 7)) && (input.equals("C")))) {
    	cf = false;
    	a68 = "f";
    	a62 = "e";
    	a173 = 6; 
    	System.out.println("T");
    } 
    if((((input.equals("E")) && (((a62.equals("g")) && cf) && (a187 == 7))) && (a161 == 10))) {
    	cf = false;
    	a62 = "i";
    	a114 = "h";
    	a137 = "g"; 
    	System.out.println("V");
    } 
}
private  void calculateOutputm15(String input) {
    if((cf && (a187 == 3))) {
    	calculateOutputm111(input);
    } 
    if((cf && (a187 == 7))) {
    	calculateOutputm115(input);
    } 
}
private  void calculateOutputm121(String input) {
    if(((((cf && (a62.equals("g"))) && (a161 == 11)) && (a168.equals("g"))) && (input.equals("C")))) {
    	cf = false;
    	a179 = "h";
    	a161 = 13; 
    	System.out.println("U");
    } 
    if((((((a62.equals("g")) && cf) && (a161 == 11)) && (input.equals("B"))) && (a168.equals("g")))) {
    	cf = false;
    	a62 = "i";
    	a114 = "f";
    	a69 = "f"; 
    	System.out.println("U");
    } 
    if(((input.equals("E")) && ((a161 == 11) && ((a62.equals("g")) && ((a168.equals("g")) && cf))))) {
    	cf = false;
    	a68 = "g";
    	a161 = 15; 
    	System.out.println("V");
    } 
}
private  void calculateOutputm122(String input) {
    if(((a161 == 11) && ((a168.equals("h")) && ((cf && (input.equals("C"))) && (a62.equals("g")))))) {
    	cf = false;
    	a62 = "i";
    	a114 = "g";
    	a152 = "i"; 
    	System.out.println("W");
    } 
}
private  void calculateOutputm16(String input) {
    if((cf && (a168.equals("g")))) {
    	calculateOutputm121(input);
    } 
    if(((a168.equals("h")) && cf)) {
    	calculateOutputm122(input);
    } 
}
private  void calculateOutputm126(String input) {
    if(((((a62.equals("g")) && ((a161 == 12) && cf)) && (a148 == 4)) && (input.equals("C")))) {
    	cf = false;
    	a41 = "i";
    	a62 = "f";
    	a165 = 11; 
    	System.out.println("Z");
    } 
}
private  void calculateOutputm17(String input) {
    if(((a148 == 4) && cf)) {
    	calculateOutputm126(input);
    } 
}
private  void calculateOutputm130(String input) {
    if(((a179.equals("f")) && (((input.equals("C")) && (cf && (a62.equals("g")))) && (a161 == 13)))) {
    	cf = false;
    	a161 = 9;
    	a49 = 6; 
    	System.out.println("X");
    } 
}
private  void calculateOutputm131(String input) {
    if((((a62.equals("g")) && (((input.equals("C")) && cf) && (a161 == 13))) && (a179.equals("g")))) {
    	cf = false;
    	a41 = "h";
    	a62 = "e";
    	a173 = 7; 
    	System.out.println("W");
    } 
}
private  void calculateOutputm133(String input) {
    if(((((a62.equals("g")) && (cf && (a161 == 13))) && (a179.equals("i"))) && (input.equals("E")))) {
    	cf = false;
    	a50 = 9;
    	a62 = "h";
    	a175 = 9; 
    	System.out.println("V");
    } 
    if((((input.equals("B")) && ((a62.equals("g")) && ((a161 == 13) && cf))) && (a179.equals("i")))) {
    	cf = false;
    	a168 = "h";
    	a161 = 11; 
    	System.out.println("U");
    } 
}
private  void calculateOutputm18(String input) {
    if((cf && (a179.equals("f")))) {
    	calculateOutputm130(input);
    } 
    if((cf && (a179.equals("g")))) {
    	calculateOutputm131(input);
    } 
    if(((a179.equals("i")) && cf)) {
    	calculateOutputm133(input);
    } 
}
private  void calculateOutputm134(String input) {
    if(((a161 == 14) && (((a26 == 10) && (cf && (input.equals("E")))) && (a62.equals("g"))))) {
    	cf = false;
    	a62 = "e";
    	a68 = "f";
    	a173 = 6; 
    	System.out.println("T");
    } 
    if((((a26 == 10) && ((a62.equals("g")) && (cf && (input.equals("C"))))) && (a161 == 14))) {
    	cf = false;
    	a114 = "e";
    	a62 = "i";
    	a97 = "g"; 
    	System.out.println("V");
    } 
}
private  void calculateOutputm136(String input) {
    if((((a62.equals("g")) && ((a26 == 14) && ((input.equals("A")) && cf))) && (a161 == 14))) {
    	cf = false;
    	a62 = "h";
    	a50 = 10;
    	a141 = 8; 
    	System.out.println("X");
    } 
    if((((a62.equals("g")) && (((a161 == 14) && cf) && (input.equals("D")))) && (a26 == 14))) {
    	cf = false;
    	a62 = "e";
    	a173 = 9;
    	a26 = 13; 
    	System.out.println("W");
    } 
    if(((a161 == 14) && ((input.equals("E")) && ((cf && (a26 == 14)) && (a62.equals("g")))))) {
    	cf = false;
    	a62 = "i";
    	a114 = "i";
    	a3 = 10; 
    	System.out.println("T");
    } 
    if((((((a26 == 14) && cf) && (a161 == 14)) && (input.equals("C"))) && (a62.equals("g")))) {
    	cf = false;
    	a161 = 9;
    	a49 = 5; 
    	System.out.println("V");
    } 
}
private  void calculateOutputm137(String input) {
    if((((a161 == 14) && ((a62.equals("g")) && (cf && (input.equals("C"))))) && (a26 == 15))) {
    	cf = false;
    	a50 = 9;
    	a62 = "h";
    	a175 = 7; 
    	System.out.println("Z");
    } 
}
private  void calculateOutputm19(String input) {
    if(((a26 == 10) && cf)) {
    	calculateOutputm134(input);
    } 
    if((cf && (a26 == 14))) {
    	calculateOutputm136(input);
    } 
    if(((a26 == 15) && cf)) {
    	calculateOutputm137(input);
    } 
}
private  void calculateOutputm139(String input) {
    if(((a68.equals("e")) && (((a62.equals("g")) && (cf && (input.equals("D")))) && (a161 == 15)))) {
    	cf = false;
    	a73 = "f";
    	a62 = "h";
    	a50 = 13; 
    	System.out.println("V");
    } 
    if(((((input.equals("E")) && ((a161 == 15) && cf)) && (a62.equals("g"))) && (a68.equals("e")))) {
    	cf = false;
    	a62 = "e";
    	a68 = "f";
    	a173 = 6; 
    	System.out.println("T");
    } 
    if(((a68.equals("e")) && ((a161 == 15) && (((a62.equals("g")) && cf) && (input.equals("C")))))) {
    	cf = false;
    	a161 = 9;
    	a49 = 5; 
    	System.out.println("V");
    } 
}
private  void calculateOutputm140(String input) {
    if((((input.equals("E")) && ((cf && (a68.equals("f"))) && (a161 == 15))) && (a62.equals("g")))) {
    	cf = false;
    	a62 = "h";
    	a50 = 15;
    	a170 = 10; 
    	System.out.println("V");
    } 
    if(((a161 == 15) && ((input.equals("C")) && (((a68.equals("f")) && cf) && (a62.equals("g")))))) {
    	cf = false;
    	a41 = "h";
    	a62 = "f";
    	a165 = 9; 
    	System.out.println("T");
    } 
    if((((a68.equals("f")) && ((a161 == 15) && (cf && (input.equals("A"))))) && (a62.equals("g")))) {
    	cf = false;
    	a62 = "f";
    	a41 = "g";
    	a188 = "g"; 
    	System.out.println("U");
    } 
    if(((((a68.equals("f")) && ((a161 == 15) && cf)) && (a62.equals("g"))) && (input.equals("D")))) {
    	cf = false;
    	a114 = "i";
    	a62 = "i";
    	a3 = 13; 
    	System.out.println("Z");
    } 
}
private  void calculateOutputm141(String input) {
    if(((((input.equals("C")) && (cf && (a161 == 15))) && (a68.equals("g"))) && (a62.equals("g")))) {
    	cf = false;
    	a62 = "f";
    	a41 = "g";
    	a188 = "f"; 
    	System.out.println("X");
    } 
    if((((((a68.equals("g")) && cf) && (a161 == 15)) && (a62.equals("g"))) && (input.equals("B")))) {
    	cf = false;
    	a50 = 9;
    	a62 = "h";
    	a175 = 13; 
    	System.out.println("T");
    } 
}
private  void calculateOutputm142(String input) {
    if(((((cf && (a68.equals("i"))) && (a161 == 15)) && (a62.equals("g"))) && (input.equals("C")))) {
    	cf = false;
    	a161 = 12;
    	a148 = 4; 
    	System.out.println("T");
    } 
    if(((input.equals("A")) && ((a161 == 15) && ((a62.equals("g")) && (cf && (a68.equals("i"))))))) {
    	cf = false;
    	a152 = "f";
    	a62 = "e";
    	a173 = 8; 
    	System.out.println("U");
    } 
}
private  void calculateOutputm20(String input) {
    if((cf && (a68.equals("e")))) {
    	calculateOutputm139(input);
    } 
    if((cf && (a68.equals("f")))) {
    	calculateOutputm140(input);
    } 
    if(((a68.equals("g")) && cf)) {
    	calculateOutputm141(input);
    } 
    if((cf && (a68.equals("i")))) {
    	calculateOutputm142(input);
    } 
}
private  void calculateOutputm143(String input) {
    if(((((a161 == 16) && ((a62.equals("g")) && cf)) && (input.equals("C"))) && (a19.equals("f")))) {
    	cf = false;
    	a68 = "f";
    	a62 = "e";
    	a173 = 6; 
    	System.out.println("T");
    } 
    if((((a161 == 16) && ((cf && (a62.equals("g"))) && (a19.equals("f")))) && (input.equals("E")))) {
    	cf = false;
    	 
    	System.out.println("V");
    } 
}
private  void calculateOutputm145(String input) {
    if(((((a161 == 16) && (cf && (input.equals("A")))) && (a62.equals("g"))) && (a19.equals("i")))) {
    	cf = false;
    	a173 = 9;
    	a62 = "e";
    	a26 = 16; 
    	System.out.println("Z");
    } 
    if(((input.equals("C")) && (((a19.equals("i")) && ((a161 == 16) && cf)) && (a62.equals("g"))))) {
    	cf = false;
    	a62 = "e";
    	a68 = "f";
    	a173 = 6; 
    	System.out.println("T");
    } 
    if(((a62.equals("g")) && ((((a161 == 16) && cf) && (a19.equals("i"))) && (input.equals("E"))))) {
    	cf = false;
    	a19 = "f"; 
    	System.out.println("V");
    } 
}
private  void calculateOutputm21(String input) {
    if((cf && (a19.equals("f")))) {
    	calculateOutputm143(input);
    } 
    if((cf && (a19.equals("i")))) {
    	calculateOutputm145(input);
    } 
}
private  void calculateOutputm147(String input) {
    if((((((a62.equals("h")) && cf) && (a196 == 5)) && (input.equals("C"))) && (a50 == 8))) {
    	cf = false;
    	a62 = "f";
    	a41 = "i";
    	a165 = 14; 
    	System.out.println("V");
    } 
    if((((a50 == 8) && (((input.equals("E")) && cf) && (a62.equals("h")))) && (a196 == 5))) {
    	cf = false;
    	a114 = "i";
    	a62 = "i";
    	a3 = 8; 
    	System.out.println("W");
    } 
}
private  void calculateOutputm149(String input) {
    if(((input.equals("C")) && (((cf && (a196 == 7)) && (a50 == 8)) && (a62.equals("h"))))) {
    	cf = false;
    	a50 = 12;
    	a65 = 5; 
    	System.out.println("U");
    } 
    if((((a196 == 7) && ((a50 == 8) && ((a62.equals("h")) && cf))) && (input.equals("A")))) {
    	cf = false;
    	a41 = "f";
    	a62 = "f";
    	a169 = 3; 
    	System.out.println("U");
    } 
    if(((a50 == 8) && ((a196 == 7) && ((cf && (input.equals("E"))) && (a62.equals("h")))))) {
    	cf = false;
    	a41 = "h";
    	a62 = "f";
    	a165 = 10; 
    	System.out.println("Y");
    } 
    if((((((input.equals("D")) && cf) && (a50 == 8)) && (a196 == 7)) && (a62.equals("h")))) {
    	cf = false;
    	a62 = "e";
    	a68 = "i";
    	a173 = 6; 
    	System.out.println("Y");
    } 
}
private  void calculateOutputm22(String input) {
    if((cf && (a196 == 5))) {
    	calculateOutputm147(input);
    } 
    if((cf && (a196 == 7))) {
    	calculateOutputm149(input);
    } 
}
private  void calculateOutputm153(String input) {
    if((((a62.equals("h")) && ((cf && (input.equals("C"))) && (a50 == 9))) && (a175 == 6))) {
    	cf = false;
    	a62 = "e";
    	a68 = "f";
    	a173 = 6; 
    	System.out.println("T");
    } 
    if(((a62.equals("h")) && ((input.equals("E")) && ((a175 == 6) && (cf && (a50 == 9)))))) {
    	cf = false;
    	a62 = "g";
    	a19 = "f";
    	a161 = 16; 
    	System.out.println("V");
    } 
    if(((a62.equals("h")) && (((cf && (input.equals("B"))) && (a175 == 6)) && (a50 == 9)))) {
    	cf = false;
    	a62 = "g";
    	a161 = 9;
    	a49 = 4; 
    	System.out.println("Y");
    } 
}
private  void calculateOutputm154(String input) {
    if((((a50 == 9) && (((a175 == 7) && cf) && (input.equals("C")))) && (a62.equals("h")))) {
    	cf = false;
    	a62 = "f";
    	a41 = "g";
    	a188 = "f"; 
    	System.out.println("Z");
    } 
    if(((a50 == 9) && ((a175 == 7) && (((input.equals("E")) && cf) && (a62.equals("h")))))) {
    	cf = false;
    	a62 = "g";
    	a68 = "i";
    	a161 = 15; 
    	System.out.println("Z");
    } 
}
private  void calculateOutputm156(String input) {
    if(((input.equals("C")) && (((cf && (a62.equals("h"))) && (a50 == 9)) && (a175 == 9)))) {
    	cf = false;
    	a62 = "e";
    	a41 = "i";
    	a173 = 7; 
    	System.out.println("X");
    } 
}
private  void calculateOutputm23(String input) {
    if((cf && (a175 == 6))) {
    	calculateOutputm153(input);
    } 
    if(((a175 == 7) && cf)) {
    	calculateOutputm154(input);
    } 
    if((cf && (a175 == 9))) {
    	calculateOutputm156(input);
    } 
}
private  void calculateOutputm169(String input) {
    if(((((a50 == 11) && ((a11 == 8) && cf)) && (input.equals("A"))) && (a62.equals("h")))) {
    	cf = false;
    	a62 = "f";
    	a41 = "g";
    	a188 = "g"; 
    	System.out.println("U");
    } 
    if((((a62.equals("h")) && ((cf && (a50 == 11)) && (a11 == 8))) && (input.equals("C")))) {
    	cf = false;
    	a62 = "g";
    	a161 = 12;
    	a148 = 4; 
    	System.out.println("T");
    } 
    if(((((a62.equals("h")) && (cf && (a50 == 11))) && (a11 == 8)) && (input.equals("E")))) {
    	cf = false;
    	a50 = 10;
    	a141 = 10; 
    	System.out.println("Y");
    } 
}
private  void calculateOutputm170(String input) {
    if(((a11 == 9) && (((input.equals("E")) && (cf && (a50 == 11))) && (a62.equals("h"))))) {
    	cf = false;
    	a149 = "i";
    	a62 = "e";
    	a173 = 11; 
    	System.out.println("T");
    } 
    if(((a11 == 9) && ((a50 == 11) && (((input.equals("C")) && cf) && (a62.equals("h")))))) {
    	cf = false;
    	a62 = "g";
    	a161 = 9;
    	a49 = 5; 
    	System.out.println("V");
    } 
}
private  void calculateOutputm171(String input) {
    if(((a62.equals("h")) && (((cf && (a11 == 10)) && (a50 == 11)) && (input.equals("E"))))) {
    	cf = false;
    	a62 = "e";
    	a173 = 9;
    	a26 = 12; 
    	System.out.println("Z");
    } 
    if(((((a50 == 11) && ((a62.equals("h")) && cf)) && (input.equals("D"))) && (a11 == 10))) {
    	cf = false;
    	a62 = "g";
    	a161 = 10;
    	a187 = 3; 
    	System.out.println("Y");
    } 
}
private  void calculateOutputm173(String input) {
    if(((a11 == 12) && (((a62.equals("h")) && ((input.equals("B")) && cf)) && (a50 == 11)))) {
    	cf = false;
    	a114 = "f";
    	a62 = "i";
    	a69 = "f"; 
    	System.out.println("U");
    } 
    if(((input.equals("E")) && (((a50 == 11) && ((a11 == 12) && cf)) && (a62.equals("h"))))) {
    	cf = false;
    	a179 = "f";
    	a62 = "g";
    	a161 = 13; 
    	System.out.println("V");
    } 
}
private  void calculateOutputm174(String input) {
    if(((((cf && (a62.equals("h"))) && (input.equals("D"))) && (a50 == 11)) && (a11 == 13))) {
    	cf = false;
    	a50 = 8;
    	a196 = 9; 
    	System.out.println("W");
    } 
    if(((a62.equals("h")) && ((((input.equals("C")) && cf) && (a11 == 13)) && (a50 == 11)))) {
    	cf = false;
    	a50 = 15;
    	a170 = 12; 
    	System.out.println("V");
    } 
    if(((a62.equals("h")) && ((a11 == 13) && ((a50 == 11) && ((input.equals("E")) && cf))))) {
    	cf = false;
    	a68 = "f";
    	a62 = "e";
    	a173 = 6; 
    	System.out.println("T");
    } 
}
private  void calculateOutputm25(String input) {
    if((cf && (a11 == 8))) {
    	calculateOutputm169(input);
    } 
    if((cf && (a11 == 9))) {
    	calculateOutputm170(input);
    } 
    if(((a11 == 10) && cf)) {
    	calculateOutputm171(input);
    } 
    if(((a11 == 12) && cf)) {
    	calculateOutputm173(input);
    } 
    if(((a11 == 13) && cf)) {
    	calculateOutputm174(input);
    } 
}
private  void calculateOutputm176(String input) {
    if(((a50 == 12) && (((cf && (a65 == 4)) && (input.equals("E"))) && (a62.equals("h"))))) {
    	cf = false;
    	a41 = "e";
    	a62 = "f";
    	a55 = "i"; 
    	System.out.println("T");
    } 
    if(((input.equals("C")) && ((a50 == 12) && ((a65 == 4) && (cf && (a62.equals("h"))))))) {
    	cf = false;
    	a161 = 9;
    	a62 = "g";
    	a49 = 5; 
    	System.out.println("V");
    } 
}
private  void calculateOutputm26(String input) {
    if((cf && (a65 == 4))) {
    	calculateOutputm176(input);
    } 
}
private  void calculateOutputm181(String input) {
    if((((input.equals("B")) && (((a50 == 13) && cf) && (a62.equals("h")))) && (a73.equals("e")))) {
    	cf = false;
    	a173 = 10;
    	a62 = "e";
    	a13 = 12; 
    	System.out.println("W");
    } 
    if(((input.equals("E")) && ((a73.equals("e")) && ((a62.equals("h")) && (cf && (a50 == 13)))))) {
    	cf = false;
    	a62 = "e";
    	a173 = 9;
    	a26 = 11; 
    	System.out.println("W");
    } 
}
private  void calculateOutputm183(String input) {
    if((((input.equals("E")) && (((a73.equals("h")) && cf) && (a62.equals("h")))) && (a50 == 13))) {
    	cf = false;
    	a114 = "e";
    	a62 = "i";
    	a97 = "f"; 
    	System.out.println("Y");
    } 
}
private  void calculateOutputm27(String input) {
    if((cf && (a73.equals("e")))) {
    	calculateOutputm181(input);
    } 
    if((cf && (a73.equals("h")))) {
    	calculateOutputm183(input);
    } 
}
private  void calculateOutputm187(String input) {
    if(((input.equals("C")) && ((a50 == 14) && ((a16 == 6) && (cf && (a62.equals("h"))))))) {
    	cf = false;
    	a152 = "h";
    	a62 = "e";
    	a173 = 8; 
    	System.out.println("Z");
    } 
    if(((((a50 == 14) && (cf && (input.equals("E")))) && (a16 == 6)) && (a62.equals("h")))) {
    	cf = false;
    	a62 = "g";
    	a161 = 9;
    	a49 = 11; 
    	System.out.println("Z");
    } 
}
private  void calculateOutputm188(String input) {
    if(((((input.equals("C")) && ((a50 == 14) && cf)) && (a16 == 7)) && (a62.equals("h")))) {
    	cf = false;
    	a62 = "e";
    	a173 = 10;
    	a13 = 16; 
    	System.out.println("Z");
    } 
}
private  void calculateOutputm191(String input) {
    if(((a50 == 14) && (((cf && (input.equals("E"))) && (a62.equals("h"))) && (a16 == 10)))) {
    	cf = false;
    	a41 = "i";
    	a62 = "f";
    	a165 = 16; 
    	System.out.println("V");
    } 
    if((((a16 == 10) && ((cf && (a50 == 14)) && (a62.equals("h")))) && (input.equals("C")))) {
    	cf = false;
    	a62 = "g";
    	a161 = 9;
    	a49 = 10; 
    	System.out.println("V");
    } 
    if(((a62.equals("h")) && ((a16 == 10) && ((a50 == 14) && (cf && (input.equals("B"))))))) {
    	cf = false;
    	a114 = "f";
    	a62 = "i";
    	a69 = "f"; 
    	System.out.println("U");
    } 
}
private  void calculateOutputm28(String input) {
    if((cf && (a16 == 6))) {
    	calculateOutputm187(input);
    } 
    if(((a16 == 7) && cf)) {
    	calculateOutputm188(input);
    } 
    if(((a16 == 10) && cf)) {
    	calculateOutputm191(input);
    } 
}
private  void calculateOutputm193(String input) {
    if((((a50 == 15) && ((cf && (a170 == 11)) && (a62.equals("h")))) && (input.equals("E")))) {
    	cf = false;
    	a62 = "g";
    	a179 = "g";
    	a161 = 13; 
    	System.out.println("W");
    } 
}
private  void calculateOutputm194(String input) {
    if((((a170 == 12) && (((a50 == 15) && cf) && (input.equals("E")))) && (a62.equals("h")))) {
    	cf = false;
    	a50 = 9;
    	a175 = 6; 
    	System.out.println("Y");
    } 
}
private  void calculateOutputm196(String input) {
    if((((((a62.equals("h")) && cf) && (a50 == 15)) && (a170 == 14)) && (input.equals("E")))) {
    	cf = false;
    	a50 = 11;
    	a11 = 13; 
    	System.out.println("T");
    } 
    if(((a62.equals("h")) && ((((a50 == 15) && cf) && (input.equals("C"))) && (a170 == 14)))) {
    	cf = false;
    	a73 = "h";
    	a50 = 13; 
    	System.out.println("V");
    } 
}
private  void calculateOutputm198(String input) {
    if(((a62.equals("h")) && ((input.equals("A")) && ((cf && (a170 == 16)) && (a50 == 15))))) {
    	cf = false;
    	a62 = "e";
    	a41 = "h";
    	a173 = 7; 
    	System.out.println("S");
    } 
    if(((((a50 == 15) && ((input.equals("E")) && cf)) && (a170 == 16)) && (a62.equals("h")))) {
    	cf = false;
    	a73 = "e";
    	a50 = 13; 
    	System.out.println("W");
    } 
    if((((a170 == 16) && (((a50 == 15) && cf) && (input.equals("B")))) && (a62.equals("h")))) {
    	cf = false;
    	a173 = 5;
    	a62 = "e";
    	a161 = 10; 
    	System.out.println("Z");
    } 
}
private  void calculateOutputm29(String input) {
    if((cf && (a170 == 11))) {
    	calculateOutputm193(input);
    } 
    if(((a170 == 12) && cf)) {
    	calculateOutputm194(input);
    } 
    if((cf && (a170 == 14))) {
    	calculateOutputm196(input);
    } 
    if(((a170 == 16) && cf)) {
    	calculateOutputm198(input);
    } 
}
private  void calculateOutputm200(String input) {
    if((((input.equals("D")) && ((cf && (a62.equals("i"))) && (a97.equals("f")))) && (a114.equals("e")))) {
    	cf = false;
    	a62 = "e";
    	a152 = "g";
    	a173 = 8; 
    	System.out.println("U");
    } 
    if((((a97.equals("f")) && ((cf && (a62.equals("i"))) && (a114.equals("e")))) && (input.equals("C")))) {
    	cf = false;
    	a62 = "g";
    	a68 = "e";
    	a161 = 15; 
    	System.out.println("T");
    } 
    if(((((cf && (input.equals("E"))) && (a62.equals("i"))) && (a114.equals("e"))) && (a97.equals("f")))) {
    	cf = false;
    	a62 = "g";
    	a19 = "f";
    	a161 = 16; 
    	System.out.println("V");
    } 
}
private  void calculateOutputm201(String input) {
    if(((a62.equals("i")) && ((input.equals("E")) && ((a114.equals("e")) && (cf && (a97.equals("g"))))))) {
    	cf = false;
    	a161 = 10;
    	a62 = "g";
    	a187 = 7; 
    	System.out.println("Y");
    } 
}
private  void calculateOutputm30(String input) {
    if(((a97.equals("f")) && cf)) {
    	calculateOutputm200(input);
    } 
    if((cf && (a97.equals("g")))) {
    	calculateOutputm201(input);
    } 
}
private  void calculateOutputm203(String input) {
    if(((a62.equals("i")) && ((((a114.equals("f")) && cf) && (a69.equals("f"))) && (input.equals("C"))))) {
    	cf = false;
    	a179 = "g";
    	a62 = "g";
    	a161 = 13; 
    	System.out.println("W");
    } 
}
private  void calculateOutputm205(String input) {
    if((((((input.equals("A")) && cf) && (a62.equals("i"))) && (a69.equals("h"))) && (a114.equals("f")))) {
    	cf = false;
    	a69 = "g"; 
    	System.out.println("T");
    } 
    if(((a69.equals("h")) && ((a62.equals("i")) && ((a114.equals("f")) && ((input.equals("E")) && cf))))) {
    	cf = false;
    	a50 = 12;
    	a62 = "h";
    	a65 = 4; 
    	System.out.println("T");
    } 
    if(((a114.equals("f")) && ((a69.equals("h")) && ((input.equals("C")) && (cf && (a62.equals("i"))))))) {
    	cf = false;
    	a161 = 9;
    	a62 = "g";
    	a49 = 5; 
    	System.out.println("V");
    } 
    if(((a62.equals("i")) && ((input.equals("D")) && ((cf && (a69.equals("h"))) && (a114.equals("f")))))) {
    	cf = false;
    	a50 = 8;
    	a62 = "h";
    	a196 = 4; 
    	System.out.println("W");
    } 
}
private  void calculateOutputm206(String input) {
    if(((a69.equals("i")) && ((input.equals("C")) && (((a114.equals("f")) && cf) && (a62.equals("i")))))) {
    	cf = false;
    	a62 = "f";
    	a41 = "i";
    	a165 = 11; 
    	System.out.println("Z");
    } 
    if(((input.equals("D")) && ((a69.equals("i")) && (((a62.equals("i")) && cf) && (a114.equals("f")))))) {
    	cf = false;
    	a50 = 12;
    	a62 = "h";
    	a65 = 11; 
    	System.out.println("T");
    } 
}
private  void calculateOutputm31(String input) {
    if((cf && (a69.equals("f")))) {
    	calculateOutputm203(input);
    } 
    if(((a69.equals("h")) && cf)) {
    	calculateOutputm205(input);
    } 
    if((cf && (a69.equals("i")))) {
    	calculateOutputm206(input);
    } 
}
private  void calculateOutputm207(String input) {
    if(((a114.equals("g")) && ((a152.equals("e")) && (((a62.equals("i")) && cf) && (input.equals("A")))))) {
    	cf = false;
    	a62 = "g";
    	a168 = "g";
    	a161 = 11; 
    	System.out.println("U");
    } 
    if(((a114.equals("g")) && (((cf && (a62.equals("i"))) && (a152.equals("e"))) && (input.equals("C"))))) {
    	cf = false;
    	a114 = "f";
    	a69 = "i"; 
    	System.out.println("T");
    } 
}
private  void calculateOutputm209(String input) {
    if((((a114.equals("g")) && ((cf && (a152.equals("i"))) && (input.equals("C")))) && (a62.equals("i")))) {
    	cf = false;
    	a50 = 8;
    	a62 = "h";
    	a196 = 7; 
    	System.out.println("W");
    } 
}
private  void calculateOutputm32(String input) {
    if(((a152.equals("e")) && cf)) {
    	calculateOutputm207(input);
    } 
    if(((a152.equals("i")) && cf)) {
    	calculateOutputm209(input);
    } 
}
private  void calculateOutputm211(String input) {
    if(((input.equals("C")) && ((a62.equals("i")) && ((cf && (a137.equals("f"))) && (a114.equals("h")))))) {
    	cf = false;
    	a62 = "g";
    	a161 = 14;
    	a26 = 14; 
    	System.out.println("T");
    } 
    if((((a114.equals("h")) && ((a137.equals("f")) && ((input.equals("E")) && cf))) && (a62.equals("i")))) {
    	cf = false;
    	a62 = "f";
    	a41 = "h";
    	a165 = 14; 
    	System.out.println("V");
    } 
}
private  void calculateOutputm212(String input) {
    if(((a62.equals("i")) && (((cf && (input.equals("C"))) && (a137.equals("g"))) && (a114.equals("h"))))) {
    	cf = false;
    	a62 = "e";
    	a68 = "f";
    	a173 = 6; 
    	System.out.println("T");
    } 
    if((((input.equals("A")) && (((a114.equals("h")) && cf) && (a137.equals("g")))) && (a62.equals("i")))) {
    	cf = false;
    	a62 = "g";
    	a161 = 12;
    	a148 = 2; 
    	System.out.println("Y");
    } 
    if(((input.equals("E")) && ((a137.equals("g")) && ((a114.equals("h")) && (cf && (a62.equals("i"))))))) {
    	cf = false;
    	a19 = "f";
    	a62 = "g";
    	a161 = 16; 
    	System.out.println("V");
    } 
}
private  void calculateOutputm214(String input) {
    if(((a137.equals("i")) && (((cf && (a62.equals("i"))) && (a114.equals("h"))) && (input.equals("C"))))) {
    	cf = false;
    	a41 = "h";
    	a62 = "f";
    	a165 = 13; 
    	System.out.println("Z");
    } 
}
private  void calculateOutputm33(String input) {
    if((cf && (a137.equals("f")))) {
    	calculateOutputm211(input);
    } 
    if((cf && (a137.equals("g")))) {
    	calculateOutputm212(input);
    } 
    if(((a137.equals("i")) && cf)) {
    	calculateOutputm214(input);
    } 
}
private  void calculateOutputm216(String input) {
    if(((input.equals("E")) && (((cf && (a62.equals("i"))) && (a114.equals("i"))) && (a3 == 10)))) {
    	cf = false;
    	a62 = "e";
    	a68 = "f";
    	a173 = 6; 
    	System.out.println("T");
    } 
    if(((input.equals("A")) && (((a3 == 10) && ((a114.equals("i")) && cf)) && (a62.equals("i"))))) {
    	cf = false;
    	a173 = 12;
    	a62 = "e";
    	a126 = 10; 
    	System.out.println("T");
    } 
    if((((a114.equals("i")) && ((a62.equals("i")) && (cf && (a3 == 10)))) && (input.equals("C")))) {
    	cf = false;
    	a161 = 9;
    	a62 = "g";
    	a49 = 5; 
    	System.out.println("V");
    } 
}
private  void calculateOutputm220(String input) {
    if((((((a114.equals("i")) && cf) && (input.equals("E"))) && (a62.equals("i"))) && (a3 == 14))) {
    	cf = false;
    	a62 = "g";
    	a19 = "i";
    	a161 = 16; 
    	System.out.println("Y");
    } 
}
private  void calculateOutputm34(String input) {
    if((cf && (a3 == 10))) {
    	calculateOutputm216(input);
    } 
    if((cf && (a3 == 14))) {
    	calculateOutputm220(input);
    } 
}



public  void calculateOutput(String input) {
 	cf = true;
    if((cf && (a62.equals("e")))) {
    	if((cf && (a173 == 5))) {
    		calculateOutputm1(input);
    	} 
    	if(((a173 == 6) && cf)) {
    		calculateOutputm2(input);
    	} 
    	if(((a173 == 7) && cf)) {
    		calculateOutputm3(input);
    	} 
    	if((cf && (a173 == 8))) {
    		calculateOutputm4(input);
    	} 
    	if(((a173 == 9) && cf)) {
    		calculateOutputm5(input);
    	} 
    	if(((a173 == 10) && cf)) {
    		calculateOutputm6(input);
    	} 
    	if((cf && (a173 == 11))) {
    		calculateOutputm7(input);
    	} 
    	if(((a173 == 12) && cf)) {
    		calculateOutputm8(input);
    	} 
    } 
    if((cf && (a62.equals("f")))) {
    	if((cf && (a41.equals("e")))) {
    		calculateOutputm9(input);
    	} 
    	if((cf && (a41.equals("f")))) {
    		calculateOutputm10(input);
    	} 
    	if(((a41.equals("g")) && cf)) {
    		calculateOutputm11(input);
    	} 
    	if((cf && (a41.equals("h")))) {
    		calculateOutputm12(input);
    	} 
    	if(((a41.equals("i")) && cf)) {
    		calculateOutputm13(input);
    	} 
    } 
    if(((a62.equals("g")) && cf)) {
    	if((cf && (a161 == 9))) {
    		calculateOutputm14(input);
    	} 
    	if((cf && (a161 == 10))) {
    		calculateOutputm15(input);
    	} 
    	if((cf && (a161 == 11))) {
    		calculateOutputm16(input);
    	} 
    	if(((a161 == 12) && cf)) {
    		calculateOutputm17(input);
    	} 
    	if((cf && (a161 == 13))) {
    		calculateOutputm18(input);
    	} 
    	if((cf && (a161 == 14))) {
    		calculateOutputm19(input);
    	} 
    	if(((a161 == 15) && cf)) {
    		calculateOutputm20(input);
    	} 
    	if(((a161 == 16) && cf)) {
    		calculateOutputm21(input);
    	} 
    } 
    if(((a62.equals("h")) && cf)) {
    	if(((a50 == 8) && cf)) {
    		calculateOutputm22(input);
    	} 
    	if(((a50 == 9) && cf)) {
    		calculateOutputm23(input);
    	} 
    	if((cf && (a50 == 11))) {
    		calculateOutputm25(input);
    	} 
    	if((cf && (a50 == 12))) {
    		calculateOutputm26(input);
    	} 
    	if((cf && (a50 == 13))) {
    		calculateOutputm27(input);
    	} 
    	if(((a50 == 14) && cf)) {
    		calculateOutputm28(input);
    	} 
    	if((cf && (a50 == 15))) {
    		calculateOutputm29(input);
    	} 
    } 
    if((cf && (a62.equals("i")))) {
    	if(((a114.equals("e")) && cf)) {
    		calculateOutputm30(input);
    	} 
    	if(((a114.equals("f")) && cf)) {
    		calculateOutputm31(input);
    	} 
    	if((cf && (a114.equals("g")))) {
    		calculateOutputm32(input);
    	} 
    	if(((a114.equals("h")) && cf)) {
    		calculateOutputm33(input);
    	} 
    	if((cf && (a114.equals("i")))) {
    		calculateOutputm34(input);
    	} 
    } 

    errorCheck();
    if(cf)
    	throw new IllegalArgumentException("Current state has no transition for this input!");
}


public static void main(String[] args) throws Exception {
	// init system and input reader
	Problem10 eca = new Problem10();

	// main i/o-loop
	while(true) {
		//read input
		String input = stdin.readLine();

		 if((input.equals("B")) && (input.equals("E")) && (input.equals("C")) && (input.equals("A")) && (input.equals("D")))
			throw new IllegalArgumentException("Current state has no transition for this input!");
		try {
			//operate eca engine output = 
			eca.calculateOutput(input);
		} catch(IllegalArgumentException e) {
			System.err.println("Invalid input: " + e.getMessage());
		}
	}
}
}