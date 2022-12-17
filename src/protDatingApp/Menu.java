package protDatingApp;
import model.*;
import java.util.Scanner;
import java.util.Vector;

public class Menu {
	static Scanner scan = new Scanner(System.in);
	static Vector<User> dataList = new Vector<>();
	static Vector<maleUser> maleList = new Vector<>();
	static Vector<femaleUser> femaleList = new Vector<>();
	
	static void Greet() {
		System.out.println("_░▒███████\r\n"
				+ "░██▓▒░░▒▓██\r\n"
				+ "██▓▒░__░▒▓██___██████\r\n"
				+ "██▓▒░____░▓███▓__░▒▓██     __      __       .__                               \r\n"
				+ "██▓▒░___░▓██▓_____░▒▓██   /  \\    /  \\ ____ |  |   ____  ____   _____   ____  \r\n"
				+ "██▓▒░_______________░▒▓██ \\   \\/\\/   // __ \\|  | _/ ___\\/  _ \\ /     \\_/ __ \\ \r\n"
				+ "_██▓▒░______________░▒▓██  \\        /\\  ___/|  |_\\  \\__(  <_> )  Y Y  \\  ___/ \r\n"
				+ "__██▓▒░____________░▒▓██    \\__/\\  /  \\___  >____/\\___  >____/|__|_|  /\\___  >\r\n"
				+ "___██▓▒░__________░▒▓██          \\/       \\/          \\/            \\/     \\/ \r\n"
				+ "____██▓▒░________░▒▓██      =================================================\r\n"
				+ "_____██▓▒░_____░▒▓██                TO LUTHFI'S PROTOTYPE DATING APP!!!\r\n"
				+ "______██▓▒░__░▒▓██\r\n"
				+ "_______█▓▒░░▒▓██\r\n"
				+ "_________░▒▓██\r\n"
				+ "_______░▒▓██\r\n"
				+ "_____░▒▓██");
		
		Util.PressEnter();
		Util.CLS();
		MainMenu();
		
	}
	
	static void InputData() {
		Util.CLS();
		System.out.println("  _                   _         _       _        \r\n"
				+ " (_)                 | |       | |     | |       \r\n"
				+ "  _ _ __  _ __  _   _| |_    __| | __ _| |_ __ _ \r\n"
				+ " | | '_ \\| '_ \\| | | | __|  / _` |/ _` | __/ _` |\r\n"
				+ " | | | | | |_) | |_| | |_  | (_| | (_| | || (_| |\r\n"
				+ " |_|_| |_| .__/ \\__,_|\\__|  \\__,_|\\__,_|\\__\\__,_|\r\n"
				+ "         | |                                     \r\n"
				+ "         |_| ");
		
		System.out.println("\nWhat is your name?");
		String name = scan.nextLine();
		System.out.println("How old are you? (19-26)");
		Integer age = scan.nextInt(); scan.nextLine();
		System.out.println("What is your current occupation?");
		String occ = scan.nextLine();
		System.out.println("What's your favourite hobby?");
		String hobby = scan.nextLine();
		System.out.println("What's your favourite music genre? (Please input something simple as this program has quite the limitations ^^)");
		String music = scan.nextLine();
		System.out.println("What are you currently majoring in?");
		String major = scan.nextLine();
		System.out.println("Which campus do you go to?");
		String campus = scan.nextLine();
		User user1 = new User(name, age, occ, hobby, music, major, campus);
		System.out.println("What is your gender?(M/F)");
		String gen = scan.nextLine();
		if(gen.compareTo("M") == 0) {
			System.out.println("What gender are you interested in? (M/F)");
			String gendint = scan.nextLine();
			System.out.println("What age are you looking for? (We will approximate a range for you.)");
			int ageint = scan.nextInt();scan.nextLine();
			System.out.println("What occupation are you looking for in your match?");
			String occint = scan.nextLine();
			System.out.println("What particular hobby are you looking for in your match?");
			String hobbyint = scan.nextLine();
			System.out.println("What music genre would you like to listen to together with your match?");
			String musicint = scan.nextLine();
			maleUser male1 = new maleUser(name, age, occ, hobby, music, major, campus, gendint, ageint, occint, hobbyint, musicint);
			maleList.add(male1);
		}else {
			System.out.println("What gender are you interested in? (M/F)");
			String gendint = scan.nextLine();
			System.out.println("What age are you looking for? (We will approximate a range for you.)");
			int ageint = scan.nextInt();scan.nextLine();
			System.out.println("What occupation are you looking for in your match?");
			String occint = scan.nextLine();
			System.out.println("What particular hobby are you looking for in your match?");
			String hobbyint = scan.nextLine();
			System.out.println("What music genre would you like to listen to together with your match?");
			String musicint = scan.nextLine();
			femaleUser female1 = new femaleUser(name, age, occ, hobby, music, major, campus, gendint, ageint, occint, hobbyint, musicint);
			femaleList.add(female1);
		}
		dataList.add(user1);
		
		Util.PressEnter();
		MainMenu();
	}
	
	static void ViewCandid() {
		Util.CLS();
		System.out.println(" __      ___               _                _____                _ _     _       _            \r\n"
				+ " \\ \\    / (_)             (_)              / ____|              | (_)   | |     | |           \r\n"
				+ "  \\ \\  / / _  _____      ___ _ __   __ _  | |     __ _ _ __   __| |_  __| | __ _| |_ ___  ___ \r\n"
				+ "   \\ \\/ / | |/ _ \\ \\ /\\ / / | '_ \\ / _` | | |    / _` | '_ \\ / _` | |/ _` |/ _` | __/ _ \\/ __|\r\n"
				+ "    \\  /  | |  __/\\ V  V /| | | | | (_| | | |___| (_| | | | | (_| | | (_| | (_| | ||  __/\\__ \\\r\n"
				+ "     \\/   |_|\\___| \\_/\\_/ |_|_| |_|\\__, |  \\_____\\__,_|_| |_|\\__,_|_|\\__,_|\\__,_|\\__\\___||___/\r\n"
				+ "                                    __/ |                                                     \r\n"
				+ "                                   |___/  \n\n");
		if(dataList.isEmpty()) {
			System.out.println("Please input the data first using the first option in the main menu, before proceeding!");
		}else {
			System.out.println("Which Data List would you like to see?");
			System.out.println("1. ALL GENDERS");
			System.out.println("2. Males");
			System.out.println("3. Females");
			System.out.println("4. Return to Main Menu");
			int listOpt = scan.nextInt();scan.nextLine();
			switch(listOpt) {
				case 1:{
					Util.CLS();
					for (int i = 0; i < dataList.size(); i++) {
						  User user = dataList.get(i);
						  System.out.println("Data No. "+(i+1));
						  System.out.println("=========================================");
						  System.out.println("Name: " + user.getName());
						  System.out.println("Age: " + user.getAge());
						  System.out.println("Major: " + user.getMajor());
						  System.out.println("Campus: " + user.getCampus());
						  System.out.println("Occupation: " + user.getOcc());
						  System.out.println("Hobby: " + user.getHobby());
						  System.out.println("Music: " + user.getMusic());
						  System.out.println("---");
						  System.out.println("=========================================\n");
						}
					Util.PressEnter();
					ViewCandid();
					break;
				}case 2:{
					Util.CLS();
					for (int i = 0; i < maleList.size(); i++) {
						  maleUser muser = maleList.get(i);
						  System.out.println("Data No. "+(i+1));
						  System.out.println("=========================================");
						  System.out.println("Name: " + muser.getName());
						  System.out.println("Age: " + muser.getAge());
						  System.out.println("Major: " + muser.getMajor());
						  System.out.println("Campus: " + muser.getCampus());
						  System.out.println("Occupation: " + muser.getOcc());
						  System.out.println("Hobby: " + muser.getHobby());
						  System.out.println("Music: " + muser.getMusic());
						  System.out.println("---");
						  System.out.println("=========================================\n");
						}
					Util.PressEnter();
					ViewCandid();
					break;
				}case 3:{
					Util.CLS();
					for (int i = 0; i < femaleList.size(); i++) {
						  femaleUser fuser = femaleList.get(i);
						  System.out.println("Data No. "+(i+1));
						  System.out.println("=========================================");
						  System.out.println("Name: " + fuser.getName());
						  System.out.println("Age: " + fuser.getAge());
						  System.out.println("Major: " + fuser.getMajor());
						  System.out.println("Campus: " + fuser.getCampus());
						  System.out.println("Occupation: " + fuser.getOcc());
						  System.out.println("Hobby: " + fuser.getHobby());
						  System.out.println("Music: " + fuser.getMusic());
						  System.out.println("---");
						  System.out.println("=========================================\n");
						}
					Util.PressEnter();
					ViewCandid();
					break;
				}case 4:{
					MainMenu();
					break;
				}
			}
		}
		Util.PressEnter();
		MainMenu();
	}
	
	static void Match() {
		System.out.println("  ______ _           _ _               __  __       _       _                     \r\n"
				+ " |  ____(_)         | (_)             |  \\/  |     | |     | |                    \r\n"
				+ " | |__   _ _ __   __| |_ _ __   __ _  | \\  / | __ _| |_ ___| |__   ___  ___       \r\n"
				+ " |  __| | | '_ \\ / _` | | '_ \\ / _` | | |\\/| |/ _` | __/ __| '_ \\ / _ \\/ __|      \r\n"
				+ " | |    | | | | | (_| | | | | | (_| | | |  | | (_| | || (__| | | |  __/\\__ \\_ _ _ \r\n"
				+ " |_|    |_|_| |_|\\__,_|_|_| |_|\\__, | |_|  |_|\\__,_|\\__\\___|_| |_|\\___||___(_|_|_)\r\n"
				+ "                                __/ |                                             \r\n"
				+ "                               |___/                             ");
	    
		for (int i = 0; i < dataList.size(); i++) {
			  User user = dataList.get(i);
			  System.out.println("Data No. "+(i+1));
			  System.out.println("=========================================");
			  System.out.println("Name: " + user.getName());
			  System.out.println("Age: " + user.getAge());
			  System.out.println("Major: " + user.getMajor());
			  System.out.println("Campus: " + user.getCampus());
			  System.out.println("Occupation: " + user.getOcc());
			  System.out.println("Hobby: " + user.getHobby());
			  System.out.println("Music: " + user.getMusic());
			  System.out.println("---");
			  System.out.println("=========================================\n");
			}
		System.out.println("Please enter the number of your data's order.");
		int index = scan.nextInt(); scan.nextLine();
		Vector<User> bestMatches = new Vector<>();
	    
	    double bestCompatibilityScore = 0;

	    for (User otherUser : dataList) {
	        double compatibilityScore = Util.calculateCompatibilityScore(dataList.get(index), otherUser);
	        
	        if (compatibilityScore > bestCompatibilityScore) {
	            bestCompatibilityScore = compatibilityScore;
	            bestMatches.clear();
	        }

	        if (compatibilityScore == bestCompatibilityScore) {
	            bestMatches.add(otherUser);
	        }
	    }

	    System.out.println("Congratulations! We found the perfect match for you!");
	    for (int i = 0; i < bestMatches.size(); i++) {
			  User user = bestMatches.get(i);
			  System.out.println("Match No. "+(i+1));
			  System.out.println("=========================================");
			  System.out.println("Name: " + user.getName());
			  System.out.println("Age: " + user.getAge());
			  System.out.println("Major: " + user.getMajor());
			  System.out.println("Campus: " + user.getCampus());
			  System.out.println("Occupation: " + user.getOcc());
			  System.out.println("Hobby: " + user.getHobby());
			  System.out.println("Music: " + user.getMusic());
			  System.out.println("=========================================\n");
			}
		Util.PressEnter();
		Util.CLS();
	}
	
	static void DelData() {
		System.out.println("  _____       _      _   _               _____        _          /\\       /\\ \r\n"
				+ " |  __ \\     | |    | | (_)             |  __ \\      | |        |/\\|     |/\\|\r\n"
				+ " | |  | | ___| | ___| |_ _ _ __   __ _  | |  | | __ _| |_ __ _      ______   \r\n"
				+ " | |  | |/ _ \\ |/ _ \\ __| | '_ \\ / _` | | |  | |/ _` | __/ _` |    |______|  \r\n"
				+ " | |__| |  __/ |  __/ |_| | | | | (_| | | |__| | (_| | || (_| |              \r\n"
				+ " |_____/ \\___|_|\\___|\\__|_|_| |_|\\__, | |_____/ \\__,_|\\__\\__,_|              \r\n"
				+ "                                  __/ |                                      \r\n"
				+ "                                 |___/                                       ");
		if(dataList.isEmpty()) {
			System.out.println("Please input the data first using the first option in the main menu, before proceeding!");
		}else {
		System.out.println("\n\n We're sad to see you go!");
		System.out.println("However, please input your name so we can wipe your data from the system");
		String input = scan.nextLine();
			for (int i = 0; i < dataList.size(); i++) {	
				String currentName = dataList.get(i).getName();
		      		if (currentName.equals(input)) {
		      			dataList.remove(i);
		      			for(int j=0; j<maleList.size();j++) {
		      				if(currentName.equals(input)) {
		      					maleList.remove(j);
		      				}
		      			}
		      			
		      			for(int j=0; j<femaleList.size();j++) {
		      				if(currentName.equals(input)) {
		      					femaleList.remove(j);
		      				}
		      			}
		      		}	
		    	}
			Util.PressEnter();
			MainMenu();
		}
	}
	
	static void MainMenu() {
		System.out.println("========================================");
		System.out.println("              MAIN MENU!!!");
		System.out.println("========================================");
		System.out.println("1. Input Data.");
		System.out.println("2. View Candidates.");
		System.out.println("3. MATCH!");
		System.out.println("4. Delete Data.");
		System.out.println("5. Exit.");
		System.out.println("----------------------------------------");
		System.out.println("Input option:");
		int key = scan.nextInt();scan.nextLine();
		while(key<=0||key>=6) {
			System.out.println("Please Input a Correct Option.");
			key = scan.nextInt();scan.nextLine();
		}

		switch (key) {
			case 1: {
				Util.CLS();
				InputData();
				break;
			}
			case 2: {
				Util.CLS();
				ViewCandid();
				break;
			}
			case 3: {
				Util.CLS();
				Match();
				break;
			}
			case 4: {
				Util.CLS();
				DelData();
				break;
			}
			case 5: {
				Util.CLS();
				System.out.println("  ____                   _                \r\n"
						+ " |  _ \\                 | |               \r\n"
						+ " | |_) |_   _  ___      | |__  _   _  ___ \r\n"
						+ " |  _ <| | | |/ _ \\     | '_ \\| | | |/ _ \\\r\n"
						+ " | |_) | |_| |  __/     | |_) | |_| |  __/\r\n"
						+ " |____/ \\__, |\\___|     |_.__/ \\__, |\\___|\r\n"
						+ "         __/ |                  __/ |     \r\n"
						+ "        |___/                  |___/      ");
			}	
		}
	}
}
