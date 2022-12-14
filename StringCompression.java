//package com.java.w3schools.blog.java.programs;

 class StringCompression {

 public static void main(String[] args) {

  String inputString = "aaabbccccd";
  String outputString = "";

  int count = 1;
  for (int i = 0; i < inputString.length(); i++) {

   // resetting to 1 for every new character (counting current character).
   count = 1;
   while (i < inputString.length() - 1 && inputString.charAt(i) == inputString.charAt(i + 1)) {
    count++;
    i++;
   }
   outputString = outputString + inputString.charAt(i) + count;
  }
  System.out.println("Input data string : " + inputString);
  System.out.println("Output data string after applying data compression technique : " + outputString);

 }

}
