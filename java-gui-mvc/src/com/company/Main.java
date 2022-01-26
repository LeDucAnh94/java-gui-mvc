package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Model m = new Model();
        View v = new View();
        Controller c = new Controller(m,v);
    }
}
