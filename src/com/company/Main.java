package com.company;

import java.io.IOException;


public class Main {

    public static void main(String[] args) {


        String filePath = args[0];

        Reader reader = new Reader(filePath);

        Parser parser = new Parser();


        try {
            int i = parser.parseArray(reader.readFile());

            System.out.println(i);

        } catch (IOException e) {

            System.out.println("File not exist or no access!");

        }

    }
}
