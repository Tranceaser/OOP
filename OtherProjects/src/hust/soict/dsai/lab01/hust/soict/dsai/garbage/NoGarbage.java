package hust.soict.dsai.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class NoGarbage {
	public static void main(String[] args) throws IOException {
		String filename = "E:\\University\\Kì 2023.2\\OOP\\Lab\\OOP\\OtherProjects\\src\\hust\\soict\\dsai\\lab01";
		long startTime, endTime;

		List<String> inputLines = Files.readAllLines(Paths.get(filename));
		startTime = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder();

		for (String line : inputLines) {
			sb.append(line);
		}

		endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
	}
}