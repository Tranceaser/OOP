package hust.soict.dsai.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class GarbageCreator {
	public static void main(String[] args) throws IOException {
		String filename = "E:\\University\\Kì 2023.2\\OOP\\Lab\\OOP\\OtherProjects\\src\\hust\\soict\\dsai\\lab01";
		long startTime, endTime;

		List<String> inputLines = Files.readAllLines(Paths.get(filename));
		startTime = System.currentTimeMillis();
		String outputString = "";

		for (String line : inputLines) {
			outputString += line;
		}
		endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
	}
}
