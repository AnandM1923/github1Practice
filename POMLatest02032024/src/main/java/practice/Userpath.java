package practice;

import java.io.File;

public class Userpath {

	public static void main(String[] args) {
		File fis=new File(System.getProperty("user.dir")+"/POMLatest02032024/DataFiles/prop.properties");
		System.out.println(fis);

	}

}
