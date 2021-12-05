package com.company;

import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
     //2.8
        System.out.println(isStrangePair("ratio", "orator"));
        System.out.println(isStrangePair("sparkling", "groups"));
        System.out.println(isStrangePair("bush", "hubris"));
        System.out.println(isStrangePair("", ""));

        System.out.println("");
        System.out.println("");
    //4.1
        processor(10,7,  "hello my name is Bessie and this is my essay");

        System.out.println("");
    //4.2
        split("()()()");
        split("((()))");
        split("((()))(())()()(()())");
        split("((())())(()(()()))");

        System.out.println("");
    //4.3
        System.out.println(toCamelCase("hello_edabit"));
        System.out.println(toSnakeCase("helloEdabit"));
        System.out.println(toCamelCase("is_modal_open"));
        System.out.println(toSnakeCase("getColor"));

        System.out.println("");
    //4.4
        System.out.println(overTime(new double[]{9, 17, 30, 1.5}));
        System.out.println(overTime(new double[]{16, 18, 30, 1.8}));
        System.out.println(overTime(new double[]{13.25, 15, 30, 1.5}));

        System.out.println("");
    //4.5
        System.out.println(BMI("205 pounds", "73 inches"));
        System.out.println(BMI("55 kilos", "1.65 meters"));
        System.out.println(BMI("154 pounds", "2 meters"));

        System.out.println("");
    //4.6
        System.out.println(bugger(39));
        System.out.println(bugger(999));
        System.out.println(bugger(4));

        System.out.println("");
    //4.7
        System.out.println(toStarShorthand("abbccc"));
        System.out.println(toStarShorthand("77777geff"));
        System.out.println(toStarShorthand("abc"));
        System.out.println(toStarShorthand(""));

        System.out.println("");
    //4.8
        System.out.println(doesRhyme("Sam I am!", "Green eggs and ham."));
        System.out.println(doesRhyme("Sam I am!", "Green eggs and HAM."));
        System.out.println(doesRhyme("You are off to the races", "a splendid day."));
        System.out.println(doesRhyme("and frequently do?", "you gotta move."));

        System.out.println("");
    //4.9
        System.out.println(trouble(451999277, 417772899));
        System.out.println(trouble(1222345, 12345));
        System.out.println(trouble(666789, 12345667));
        System.out.println(trouble(33789,12345337));

        System.out.println("");
    //4.10
        System.out.println(countUniqueBooks("AZYWABBCATTTA", 'A'));
        System.out.println(countUniqueBooks("$AA$BBCATT$C$$B$", '$'));
        System.out.println(countUniqueBooks("ZZABCDEF", 'Z'));

        System.out.println("");
    //5.1
        encrypt("Hello");
        System.out.println(decrypt(new int[]{ 72, 33, -73, 84, -12, -3, 13, -13, -68 }));
        encrypt("Sunshine");

        System.out.println("");
    //5.2
        System.out.println(canMove("Rook", "A8", "H8"));
        System.out.println(canMove("Bishop", "A7", "G1"));
        System.out.println(canMove("Queen", "C4", "D6"));

        System.out.println("");
    //5.3
        System.out.println(canComplete("butl", "beautiful"));
        System.out.println(canComplete("butlz", "beautiful"));
        System.out.println(canComplete("tulb", "beautiful"));
        System.out.println(canComplete("bbutl", "beautiful"));

        System.out.println("");
    //5.4
        System.out.println(sumDigProd(new int[]{16,28}));
        System.out.println(sumDigProd(new int[]{0}));
        System.out.println(sumDigProd(new int[]{1,2,3,4,5,6}));

        System.out.println("");
    //5.5
        sameVowelGroup(new String[]{ "toe", "ocelot", "maniac"});
        sameVowelGroup(new String[]{ "many", "carriage", "emit", "apricot", "animal"});
        sameVowelGroup(new String[]{ "hoops", "chuff", "bot", "bottom"});

        System.out.println("");
    //5.6
        System.out.println(validateCard("1234567890123456"));
        System.out.println(validateCard("1234567890123452"));

        System.out.println("");
    //5.8
        System.out.println(getSha256Hash("password123"));
        System.out.println(getSha256Hash("Fluffy@home"));
        System.out.println(getSha256Hash("Hey dude!"));

        System.out.println("");
    //5.9
        System.out.println(correctTitle("jOn SnoW, kINg IN thE noRth."));
        System.out.println(correctTitle("sansa stark, lady of winterfell."));
        System.out.println(correctTitle("TYRION LANNISTER, HAND OF THE QUEEN."));

        System.out.println("");
    //5.10
        System.out.println(hexLattice(7));
    }

    //2.8
    public static boolean isStrangePair(String s1, String s2) {
        if (s1=="" & s2=="") return false ;
        return (s1.length()>0 && s2.length()>0)? s1.charAt(0)==s2.charAt(s2.length()-1) && s2.charAt(0)==s1.charAt(s1.length()-1) : false;

    }
    //4.1
    public static void processor(int n, int k, String s) {
        String[] strArr = s.split("\\s");
        int len = 0;
        for(String s1 : strArr){
            if(len+s1.length() <= k){
                if(len!=0){
                    System.out.print(' ' + s1);
                }
                else{
                    System.out.print(s1);
                }
                len+=s1.length();

            }
            else{
                System.out.print('\n'+s1);
                len=s1.length();
            }
        }
    }
    //4.2
    public static void split(String s) {
        ArrayList<String> arrLS = new ArrayList<>();
        String s1 = "";
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            s1+=ch;
            if(ch=='('){
                stack.push(ch);
            }
            else{
                stack.pop();
            }
            if(stack.isEmpty()){
                arrLS.add(s1);
                s1="";
            }
        }

        System.out.println(arrLS);

    }
    //4.3
    public static String toCamelCase(String s) {
        String s1 = "";
        Boolean nextUp = false;
        for(char ch : s.toCharArray()){
            if(ch=='_'){
                nextUp = true;
            }
            else{
                if(nextUp){
                    s1+=Character.toUpperCase(ch);
                }
                else{
                    s1+=ch;
                }
                nextUp=false;
            }
        }
        return s1;
    }

    public static String toSnakeCase (String s) {
        String s1 = "";
        for(char ch : s.toCharArray()){
            if(Character.isUpperCase(ch)){
                s1+='_';
                s1+=Character.toLowerCase(ch);
            }
            else{
                s1+=ch;
            }
        }
        return s1;
    }
    //4.4
    public static String overTime(double[] arr) {
        double cash = 0;
        for(double i=arr[0]; i<arr[1]; i=(int)i+1){
            if(i<17){
                cash+=((int)(i+1)-i)*arr[2];
            }
            else{
                cash+=((int)(i+1)-i)*arr[2]*arr[3];
            }
        }

        return "$"+String.format("%.2f",cash);
    }
    //4.5
    public static String BMI(String s1, String s2) {
        String[] arrS1 = s1.split(" ");
        String[] arrS2 = s2.split(" ");
        double weight = Double.valueOf(arrS1[0]);
        if(arrS1[1].equals("pounds")){
            weight /= 2.20462;
        }

        double growth = Double.valueOf(arrS2[0]);
        if(arrS2[1].equals("inches")){
            growth /= 39.37;
        }

        double index = weight/(growth*growth);

        if(index < 18.5){
            return String.format("%.1f Underweight", index);
        }
        else if(index < 24.9){
            return String.format("%.1f Normal weight", index);
        }

        return String.format("%.1f Overweight", index);
    }
    //4.6
    public static int bugger(int num) {
        String s;
        int counter = 0;
        while(num>9){
            s = Integer.toString(num);
            num = 1;
            for(char ch : s.toCharArray()){
                num*=Integer.parseInt(String.valueOf(ch));
            }
            counter++;
        };
        return counter;
    }
    //4.7
    public static String toStarShorthand(String s) {
        if(s.length()==0) return s;
        String s1="";
        for(int i=0; i<s.length(); i++){
            int counter = 1;
            int j=i+1;
            for(; j<s.length() && s.charAt(j)==s.charAt(i); j++){
                counter++;
                i++;
            }
            s1+=s.charAt(i);
            if(counter!=1){
                s1+="*";
                s1+=Integer.toString(counter);
            }
        }
        return s1;
    }
    //4.8
    public static Boolean doesRhyme(String s1, String s2) {
        s1 = s1.replaceAll("[^aeiouAEIOU ]", "").toLowerCase();
        s2 = s2.replaceAll("[^aeiouAEIOU ]", "").toLowerCase();
        String[] sArr1 = s1.split(" ");
        String[] sArr2 = s2.split(" ");
        return sArr1[sArr1.length-1].equals(sArr2[sArr2.length-1]);
    }

    public static Boolean trouble(long n1, long n2) {
        String s1 = Long.toString(n1);
        String s2 = Long.toString(n2);
        HashSet<Long> hs1 = new HashSet<>();
        HashSet<Long> hs2 = new HashSet<>();

        for(int i=0; i<s1.length(); i++){
            int counter = 1;
            int j=i+1;
            for(; j<s1.length(); j++){
                if(s1.charAt(i) == s1.charAt(j)){
                    counter++;
                    i++;
                }
            }
            if(counter>2){
                hs1.add(Long.parseLong(String.valueOf(s1.charAt(i))));
            }
        }
    //4.9
        for(int i=0; i<s2.length(); i++){
            int counter = 1;
            int j=i+1;
            for(; j<s2.length(); j++){
                if(s2.charAt(i) == s2.charAt(j)){
                    counter++;
                    i++;
                }
            }
            if(counter>1){
                hs2.add(Long.parseLong(String.valueOf(s2.charAt(i))));
            }
        }

        HashSet<Long> result = new HashSet<>(hs1);
        result.retainAll(hs2);

        return result.size()>0;
    }
    //4.10
    public static int countUniqueBooks(String s, char ch) {
        int first = -1;
        int end = -1;
        for(int i=0; i<s.length() ; i++){
            if(s.charAt(i) == ch){
                if(first==-1){
                    first = i;
                }
                end = i;
            }
        }

        if(first==end || first == end-1) return 0;

        HashSet<Character> result = new HashSet<>();

        for(char chS : s.substring(first+1,end-1).toCharArray()){
            if(ch!=chS) result.add(chS);
        }
        return result.size();
    }
    //5.1
    public static int[] encrypt(String s) {
        int[] result = new int[s.length()];
        result[0] = s.charAt(0);
        for(int i=1; i<s.length(); i++){
            result[i] = s.charAt(i) - s.charAt(i-1);
        }

        System.out.print("[ ");
        for(int ch :result){
            System.out.print( ch + " ");
        }
        System.out.println("]");

        return result;
    }


    public static String decrypt(int[] arr) {
        String result = "";
        result+=(char)arr[0];
        for(int i=1; i<arr.length; i++){
            result += (char)(result.charAt(i-1)+arr[i]);
        }
        return result;
    }
    //5.2
    public static Boolean canMove(String name, String start, String finish) {
        char let = finish.charAt(0);
        char num = finish.charAt(1);
        char sLet = start.charAt(0);
        char sNum = start.charAt(1);
        if(let<'A' || let>'H' || num<'1' || num >'8') return false;

        if(name.equals("Pawn")) {
            if (start.charAt(0) == finish.charAt(0)) {
                if (start.charAt(1) == '2') {
                    return finish.charAt(1) == '3' || finish.charAt(1) == '4';
                } else {
                    return finish.charAt(1) == finish.charAt(1) + 1 && finish.charAt(1) < '9';
                }
            }
        }
        else if(name.equals("Knight")){
            if(Math.abs(let-sLet)>2 || Math.abs(num - sNum) > 2 ) return false;
            if(let==sLet-2){
                return num == sNum-1 || num == sNum+1;
            }
            if(let==sLet-1){
                return num == sNum-2 || num == sNum+2;
            }
            if(let==sLet+2){
                return num == sNum-1 || num == sNum+1;
            }
            if(let==sLet+1){
                return num == sNum-2 || num == sNum+2;
            }
            return false;
        }
        else if(name.equals("Rook")){
            return let==sLet || num==sNum;
        }
        else if(name.equals("Queen")) {
            return let==sLet || num==sNum || Math.abs(num-sNum)==Math.abs(let-sLet);
        }
        else if(name.equals("Bishop")){
            return Math.abs(num-sNum)==Math.abs(let-sLet);
        }
        return false;
    }
    //5.3
    public static Boolean canComplete(String s1, String s2){
        String sRep = "[^";
        for(char ch:s1.toCharArray()){
            sRep+=ch;
        }
        sRep+="]";
        s2 = s2.replaceAll(sRep, "");

        int prevNum=-1;
        int nextNum;
        for(char ch:s1.toCharArray()){
            nextNum=s2.indexOf(ch);
            if(nextNum<=prevNum) return false;
            prevNum = nextNum;
        }
        return true;
    }
    //5.4
    public static int sumDigProd(int[] n){
        int num=0;
        for(int i : n){
            num+=i;
        }

        while(num>10){
            String s = Integer.toString(num);
            num=1;
            for(char ch : s.toCharArray()){
                num*=Integer.parseInt(String.valueOf(ch));
            }
        };

        return num;
    }
    //5.5
    public static void sameVowelGroup(String[] sArr){
        ArrayList<String> arr = new ArrayList<>();

        for(String s : sArr){
            arr.add(s.replaceAll("[^eyuioaEYUIOA]","").toLowerCase());
        }

        HashSet<Character> chSet = new HashSet<Character>();
        for(char ch:arr.get(0).toCharArray()){
            chSet.add(Character.toLowerCase(ch));
        }

        System.out.print("[ " + sArr[0] + " ");

        for(int i=1; i<sArr.length; i++){
            HashSet<Character> chSetTmp = new HashSet<Character>();
            for(char ch : arr.get(i).toCharArray()){
                chSetTmp.add(ch);
            }
            if(chSet.equals(chSetTmp)){
                System.out.print(sArr[i] + " ");
            }
        }
        System.out.println("]");
    }
    //5.6
    public static Boolean validateCard(String sNum) {
        int len = sNum.length();
        if (len < 14 || len > 19) return false;

        int controlNum = Integer.parseInt(String.valueOf(sNum.charAt(sNum.length()-1)));

        StringBuffer newStr = new StringBuffer(sNum.substring(0, sNum.length() - 1)).reverse();
        String retS = "";
        for (int i = 0; i < newStr.length(); i++) {
            if (i % 2 == 0) {
                int num = Integer.parseInt(String.valueOf(newStr.charAt(i))) * 2;
                if (num > 9) {
                    num = Integer.toString(num).charAt(0) - '0' + Integer.toString(num).charAt(1) - '0';
                }
                retS += Integer.toString(num);
            } else {
                retS += newStr.charAt(i);
            }
        }
        int sum = 0;
        for(char ch : retS.toCharArray()){
            sum+=Integer.parseInt(String.valueOf(ch));
        }

        int n = String.valueOf(sum).charAt(1)-'0';
        return controlNum == (10-n);
    }
    //5.8
    public static String getSha256Hash(String base) {
        try{
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(base.getBytes("UTF-8"));
            StringBuffer hexString = new StringBuffer();

            for (int i = 0; i < hash.length; i++) {
                String hex = Integer.toHexString(0xff & hash[i]);
                if(hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }

            return hexString.toString();
        } catch(Exception ex){
            throw new RuntimeException(ex);
        }
    }
    //5.9
    public static String correctTitle(String s) {
        String[] strArr = s.split(" ");
        String retS = "";
        for(String str : strArr){
            str = str.toLowerCase();
            if(str.equals("and") || str.equals("the") || str.equals("of") || str.equals("in")){
                retS += str;
            }
            else{
                retS += Character.toUpperCase(str.charAt(0));
                retS += str.substring(1);
            }
            retS+=" ";
        }
        return retS.substring(0,retS.length()-1);
    }
    //5.10
    public static String hexLattice(int n) {
        int num = 1;
        int i = 1;
        String res = "";
        String str2 = "";
        while (n > num) {
            i++;
            num = 3 * i * (i - 1) + 1;
        }
        int l = i;
        if (n != num)
            res = "invalid";
        else {
            while (l < i * 2 - 1) {
                for (int a = 0; a < i * 2 - 1 - l; a++)
                    res += " ";
                for (int b = 0; b < l; b++)
                    res += " o";
                res += "\n";
                l++;
            }
            while (l >= i) {
                for (int a = 0; a < i * 2 - 1 - l; a++)
                    res += " ";
                for (int b = l; b > 0; b--)
                    res += " o";
                res += " \n";
                l--;
            }
        }
        return res;
    }

}
