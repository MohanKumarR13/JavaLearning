package com.java.exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsKeyword {

	public static void main(String[] args) throws IOException, InterruptedException {
		FileReader fileReader;
		fileReader = new FileReader("C:\\Users\\santhosh\\git\\JavaLearning\\JavaPractice\\Notes\\Day-1.txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		System.out.println(bufferedReader.readLine());
		Thread.sleep(5000);

	}

}
