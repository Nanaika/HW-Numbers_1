package com.company;

import java.io.*;

public class Reader {


    private String filePath;

    Reader(String path) {
        this.filePath = path;
    }


    public int[] readFile() throws IOException {

        String[] nums;
        String line;


        BufferedReader br = new BufferedReader(new FileReader(filePath));

        line = br.readLine();

        nums = line.split(" ");

        int[] numbers = new int[nums.length];


        for (int i = 0; i < nums.length; i++) {

            numbers[i] = Integer.parseInt(nums[i]);

        }


        br.close();


        return numbers;
    }


}
