package com.pracatice.Exception;

import java.io.FileNotFoundException;

public class ThrowsCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			boolean isExist = findFile();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	private static boolean findFile() {
		// TODO Auto-generated method stub
		return false;
	}

}
