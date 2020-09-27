package asd.one;

import java.util.*;

public class TestCount {
private static String[] word4s = new String[]{"work","back","come","deal","desk","book","java","tool","face"};
private static String baseCharacters = "abcdefghijklmnopqrstuvwxyz";
public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
String inWord = "";
while (true){
inWord = scanner.next();
System.out.println(inWord);
String regX = "^[0-9]*$";
if(!inWord.matches(regX)){
if("exit".equals(inWord)){
return;
}else {
System.out.println("请输入数字bai！");
}
} else{
searchWord(inWord, word4s);
}
}
}
public static void searchWord(String inWord ,String[] args){
int wLength = inWord.length();
String[] resultS = copyStringArray();
StringBuffer resultTemp = new StringBuffer();
boolean flag = false;
for (int i = 0; i < wLength; i++) {
String subS = inWord.charAt(i)+"";
int subI = new Integer(subS);
String char1 = baseCharacters.charAt(subI)+"";
String char2 = baseCharacters.charAt(subI+10)+"";
String char3 = "";
if (subI<6) {
char3 = baseCharacters.charAt(subI+20)+"";
}
System.out.println(subI+" 对应字母为：du "+char1+char2+char3);
for (int j = 0; j < resultS.length; j++) {
String rstring = resultS[j];
if(rstring.length()<inWord.length()){
resultS[j] = null;
}
String subString = rstring.charAt(i)+"";
if(!subString.equals(char1)&&!subString.equals(char2)&&!subString.equals(char3)){
resultS[j] = null;
} else {
resultTemp.append(rstring+",");
}
}

String tempS = resultTemp.toString();

if("".equals(tempS)){
System.out.println("没有匹zhi配的单dao词!");
break;
}else{
resultS = tempS.split(",");
if(!flag){
flag = true;
}
}
}
if(flag){
for(int i = 0; i < resultS.length; i++){
System.out.println(resultS[i]);
}
}
}

public static String[] copyStringArray(){
int len = word4s.length;
String[] newStringArray = new String[len];
for (int i = 0; i < len; i++) {
newStringArray[i] = word4s[i];
}
return newStringArray;
}
}


