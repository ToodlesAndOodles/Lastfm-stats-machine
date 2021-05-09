package hello;
import java.util.Scanner;


public class Graphs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		String input = "";
		
		System.out.println("Welcome to:");
		System.out.println(".__                   __      _____                   __          __                          .__    .__               ");
		System.out.println("|  | _____    _______/  |_  _/ ____\\_____     _______/  |______ _/  |_    _____ _____    ____ |  |__ |__| ____   ____  ");
		System.out.println("|  | \\__  \\  /  ___/\\   __\\ \\   __\\/     \\   /  ___/\\   __\\__  \\\\   __\\  /     \\\\__  \\ _/ ___\\|  |  \\|  |/    \\_/ __ \\ ");
		System.out.println("|  |__/ __ \\_\\___ \\  |  |    |  | |  Y Y  \\  \\___ \\  |  |  / __ \\|  |   |  Y Y  \\/ __ \\\\  \\___|   Y  \\  |   |  \\  ___/ ");
		System.out.println("|____(____  /____  > |__| /\\ |__| |__|_|  / /____  > |__| (____  /__|   |__|_|  (____  /\\___  >___|  /__|___|  /\\___  >");
		System.out.println("          \\/     \\/       \\/            \\/       \\/            \\/             \\/     \\/     \\/     \\/        \\/     \\/ ");
		System.out.println("Menu:\n");
		System.out.println("1. Monthly artist stats");
		System.out.println("2. Yearly listening stats");
		System.out.println("3. Top listened to arists, albums, and songs");
		System.out.println("4. All time highest listening years, months, and days");
		input = in.nextLine();
		
		if(input.equals("1")) {
			rating();
		}
		if(input.equals("2")) {
			yearlyStats();
		}
		if(input.equals("3")){
			allTimeTop();
		}
		if(input.equals("4")) {
			allTimeHigh();
		}
	}
	public static void rating() {
		Scanner in = new Scanner(System.in);
		Scanner in2 = new Scanner(System.in);
		Scanner in3 = new Scanner(System.in);
		String month = "";
		double scrobbles = 0;
		double days = 0;
		double daysScrobbled = 0;
		double totalScrobbles = 0;
		double PTS = 0;
		double SPD = 0;
		double PDS = 0;
		double STP = 0;
		
		System.out.println("\nARTIST MONTHLY RATING");
		System.out.println("------------------------------------------------");
		
		System.out.println("Please enter how many scrobbles the artist had");
		scrobbles = in.nextDouble();
		
		
		System.out.println("Please enter what month it was");
		month = in2.nextLine();
		
		switch(month) {
			case "january":
				days = 31;
				break;
			case "february":
				System.out.println("was this year a leap year?");
				month = in3.nextLine();
				if(month.equals("yes")) {
					days = 29;
					break;
				}else {
					days = 28;
					break;
				}
			case "march":
				days = 31;
				break;
			case "april":
				days = 30;
				break;
			case "may":
				days = 31;
				break;
			case "june":
				days = 30;
				break;
			case "july":
				days = 31;
				break;
			case "august":
				days = 31;
				break;
			case "september":
				days = 30;
				break;
			case "october":
				days = 31;
				break;
			case "november":
				days = 30;
				break;
			case "december":
				days = 31;
				break;
		}
		
		
		System.out.println("Please enter how many days the artist was scrobbled");
		daysScrobbled = in.nextDouble();
		
		System.out.println("Please enter how many total scrobbles there were that month");
		totalScrobbles = in.nextDouble();
		
		SPD = scrobbles / days;
		
		PDS = daysScrobbled / days;
		
		PTS = (scrobbles / totalScrobbles) * 10;
		
		STP = SPD * PDS;
		
		STP *= PTS;
		
		double round = Math.round(SPD * 100.0) / 100.0;
		SPD = round;
		
		round = Math.round(PDS * 1000.0) / 1000.0;
		
		PDS = round;
		
		round = Math.round(STP * 100.0) / 100.0;
		
		STP = round;
		
		System.out.println("SPD: " + SPD);
		
		System.out.println("PDS: "  + PDS);
		
		System.out.println("STP Rating: " + STP);
	}
	public static void yearlyStats() {
		System.out.println("2018:\n");
		System.out.println("12063 scrobbles");
		System.out.println("Monthly high: June, 1922 scrobbles");
		System.out.println("Top artist: Kanye West | 682 Scrobbles");
		System.out.println("Top Album: Kendrick Lamar - To Pimp a Butterfly | 280 Scrobbles");
		System.out.println("Top Song: Kendrick Lamar - Wesley's Theory | 42 Scrobbles\n");
		
		System.out.println("2019:\n");
		System.out.println("22681 scrobbles");
		System.out.println("Monthly high: December, 2313 scrobbles");
		System.out.println("Top artist: t e l e p a t h | 1299 Scrobbles");
		System.out.println("Top Album: A L E X - Growing Up, Vol. 2 | 295 Scrobbles");
		System.out.println("Top Song: 18 Carat Affair - Desire | 95 Scrobbles\n");
		
		System.out.println("2020:\n");
		System.out.println("32451 scrobbles");
		System.out.println("Monthly high: September, 3581 scrobbles");
		System.out.println("Top artist: t e l e p a t h | 1411 Scrobbles");
		System.out.println("Top Album: A L E X - Growing Up, Vol. 2 | 389 Scrobbles");
		System.out.println("Top Song: Sufjan Steves - The Only Thing | 73 Scrobbles\n");
	}
	public static void allTimeTop() {
		Scanner in = new Scanner(System.in);
		String input = "";
		
		System.out.println("Which would you like to view?\n");
		System.out.println("1. Top Artists");
		System.out.println("2. Top Albums");
		System.out.println("3. Top Songs");
		
		input = in.nextLine();
		
		if(input.equals("1")) {
			
			System.out.println("Top 10 Artists: \n");
			System.out.println("1. t e l e p a t h, 3165 Scrobbles");
			System.out.println("2. Kanye West, 1729 Scrobbles");
			System.out.println("3. BROCKHAMPTON, 1329 Scrobbles");
			System.out.println("4. Death Grips, 1134 Scrobbles");
			System.out.println("5. Kendrick Lamar, 1110 Scrobbles");
			System.out.println("6. Radiohead, 1064 Scrobbles");
			System.out.println("7. A L E X, 948 Scrobbles");
			System.out.println("8. Aphex Twin, 936 Scrobbles");
			System.out.println("9. 18 Carat Affair, 887 Scrobbles");
			System.out.println("10. Elliott Smiht, 870 Scrobbles");
		}else if(input.equals("2")) {
			System.out.println("Top 10 Albums: \n");
			System.out.println("1. A L E X - Growing Up, Vol. 2,  762 Scrobbles");
			System.out.println("2. t e l e p a t h - Andromeda, 584 Scrobbles");
			System.out.println("3. Sufjan Stevens - Carrie & Lowell, 582 Scrobbles");
			System.out.println("4. Tyler, The Creator - IGOR, 571 Scrobbles");
			System.out.println("5. t e l e p a t h - Path to Lost Eden, 570 Scrobbles");
			System.out.println("6. Kendrick Lamar - To Pimp a Butterfly, 554 Scrobbles");
			System.out.println("7. t e l e p a t h - Antara communication, 529 Scrobbles");
			System.out.println("8. Elliott Smith - Either/Or, 498 Scrobbles");
			System.out.println("9. Frank Ocean - Blonde, 497 Scrobbles");
			System.out.println("10. Kanye West - The Life of Pablo, 482 Scrobbles");
		}else if(input.equals("3")) {
			System.out.println("Top 10 Songs: \n");
			System.out.println("1. 18 Carat Affair - Desire, 122 Scrobbles");
			System.out.println("2. Aphex Twin - Xtal, 109 Scrobbles");
			System.out.println("3. Luxury Elite - S.W.A.K., 103 Scrobbles");
			System.out.println("4. Sufjan Stevens - The Only Thing, 98 Scrobbles");
			System.out.println("5. Burial - Archangel, 94 Scrobbles");
			System.out.println("6. Aphex Twin - #3, 93 Scrobbles");
			System.out.println("7. Tyler, The Creator - NEW MAGIC WAND, 88 Scrobbles");
			System.out.println("8. Sufjan Stevens - Fourth of July, 85 Scrobbles");
			System.out.println("T9. 2814 - Recovery, 83 Scrobbles");
			System.out.println("T9. My Bloody Valentine - When You Sleep, 83 Scrobbles");
			System.out.println("T9. ZOH - Untitled Feeling, 83 Scrobbles");
		}
	}
	public static void allTimeHigh() {
		Scanner in = new Scanner(System.in);
		String input = "";
		
		System.out.println("Please select:\n");
		System.out.println("1. Top years");
		System.out.println("2. Top months");
		System.out.println("3. Top days");
		
		input = in.nextLine();
		
		if(input.equals("1")) {
		
			System.out.println("Top years: \n");
			System.out.println("1. 2020, 32451 Scrobbles");
			System.out.println("2. 2019, 22681 Scrobbles");
			System.out.println("3. 2018, 12063 Scrobbles");
		
		}
		
		if(input.equals("2")) {
			System.out.println("Top 10 Months: \n");
			System.out.println("1. September 2020, 3581 Scrobbles");
			System.out.println("2. November 2020, 3167 Scrobbles");
			System.out.println("3. May 2020, 3060 Scrobbles");
			System.out.println("4. January 2021, 2992 Scrobbles");
			System.out.println("5. October 2020, 2936 Scrobbles");
			System.out.println("6. March 2021, 2917 Scrobbles");
			System.out.println("7. April 2020, 2851 Scrobbles");
			System.out.println("8. December 2020, 2819");
			System.out.println("9. June 2020, 2759 Scrobbles");
			System.out.println("10. April 2021, 2691 Scrobbles");
		}
		if(input.equals("3")) {
			System.out.println("Top 10 Days\n");
			System.out.println("1. April 23rd 2021, 182 Scrobbles");
			System.out.println("T2. May 23rd 2020, 175 Scrobbles");
			System.out.println("T2. June 15th 2020, 175 Scrobbles");
			System.out.println("T3. September 7th 2020, 172 Scrobbles");
			System.out.println("T3. May 20th 2020, 172 Scrobbles");
			System.out.println("T3. November 14th 2020, 172 Scrobbles");
			System.out.println("T4. January 9th 2021, 169 Scrobbles");
			System.out.println("T4. June 11th 2020, 169 Scrobbles");
			System.out.println("T5. March 18th 2021, 160 Scrobbles");
			System.out.println("T5. November 23rd 2020, 160 Scrobbles");
		}
	}
}
