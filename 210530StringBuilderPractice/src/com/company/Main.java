package com.company;

public class Main {

    public static void main(String[] args) {
	    StringBuilder sb = new StringBuilder();
	    sb.append("Hi");
	    sb.append("ka");
	    sb.append("ru");
	    sb.insert(2, "ra");
        System.out.println(sb);
    }
}
