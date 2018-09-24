package DemoPakage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReadScanner {

	public static void main(String[] args) throws IOException {

		File file = new File("C:\\Users\\abhishek\\Desktop\\Testfile.txt");
		Scanner sc = new Scanner(file);

		while (sc.hasNextLine()) {

			System.out.println(sc.nextLine());

		}

	}

}
