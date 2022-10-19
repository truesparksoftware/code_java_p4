package exception;

import java.io.File;
import java.io.IOException;
//static/ compile time /checked exception
// dynamic/runtime / unchecked exception
class FileHandle {
	public void fileCheck() {

		try {
			// Creating an object of a file
			File f0 = new File("D:FileOperationExample.txt");
			if (f0.createNewFile()) {
				System.out.println("File " + f0.getName() + " is created successfully.");
			} else {
				System.out.println("File is already exist in the directory.");
			}
		} catch (IOException exception) {
			System.out.println("An unexpected error is occurred.");
			exception.printStackTrace();
		}
	}
}

public class FileHandlingCode {
	public static void main(String[] args) {
		FileHandle fileHandle = new FileHandle();
		fileHandle.fileCheck();
	}
}
