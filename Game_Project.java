/*Shane Ramphal
 * Febuary 1st 2020
 * This program is an escape room which includes 2 tasks. 
 */


import java.util.InputMismatchException;
import java.util.Scanner;

public class Game_Project {

	public static void print(String p) { // allows me to print without typing out System.out.prinln
		System.out.println(p);
	}

	public static void instructions() { // creates a method to easily print the instructions.
		print("Work through each task to complete the escape room. As you go on, the tasks get more difficult and the amount of chances you get goes down. Each problem you encounter can give you a certain amount of points.\nIf you fail a task, the amount of points you get for that task decreases.");
		print("enter any character to go back");
		System.out.flush();
	}

	// creates a method which prints 300 asterisks which i can use to separate
	// different parts of my code
	public static void separate() {
		String s = "*";
		print(s.repeat(300));
	}

	// creates a method which prints the menu
	public static void menu() {
		print("Welcome to Escape the Island!");
		print("Enter 1 to start");
		print("Enter 2 for instructons");
	}

	// creates a method which prints the volcano ASCII art.
	public static void island() {

		System.out.println(
				"                                                                                                                                                                                                        ");
		System.out.println(
				"                                                                                                                                                                                                        ");
		System.out.println(
				"************************************************************************************************************************************************,                                                       ");
		System.out.println(
				"*****************************************************************************************************************************************                                                               ");
		System.out.println(
				"***********************************************************************************************************************************,.                                                                   ");
		System.out.println(
				"********************************************************************************************************************************                                                                        ");
		System.out.println(
				"**********************************************************************************************************************                                                                                  ");
		System.out.println(
				"**/////*****//**//************************************************************************************/*****/********                                                                                   ");
		System.out.println(
				"                .////////////////////////////////////////////////////////////////////////////////////*.      .**////*                                                                                   ");
		System.out.println(
				"                    ,///////////////////////////////////////////////////////////////////////*   ..,,                                                                                                    ");
		System.out.println(
				"                                /////////////////////////////////////////////////////////,                                                                                                              ");
		System.out.println(
				"                                   .,**///////////////////////////////////////////*                                                                                                                     ");
		System.out.println(
				"                                           ///////////(((((////////((////////////,                                                                                                                      ");
		System.out.println(
				"                                            ////(((((////(((/////(/////////////,                                                                                                                        ");
		System.out.println(
				"                                              .((((((((((((((((((((((((/(((((,                                                                                                                          ");
		System.out.println(
				"                                                    *((((((((((((((((((.  .                                                                                                                             ");
		System.out.println(
				"                                                ,       ((((((((((((((,  *,    .                                                                                                                        ");
		System.out.println(
				"                                                       ///(((((((((((((     ,                                                                                                                           ");
		System.out.println(
				"                                                      /((((((((((((((((                                                                                                                                 ");
		System.out.println(
				"                                                    ((((((((((((((((((((                                                                                                                                ");
		System.out.println(
				"                                                   /((((((((((((((((((((#/                                                                                                                              ");
		System.out.println(
				"                                                   /((((((((((((((((((((((#.                                                                                                                            ");
		System.out.println(
				"                                                  /(((((((((##(((((((((#(((#                                                                                                                            ");
		System.out.println(
				"                                                ((###(##((####((((#(((%%(((((                                                                                                                           ");
		System.out.println(
				"                                              (######(##((##(##(((%%((#%%%%(%(                                                                                                                          ");
		System.out.println(
				"                                            .###(##(((##&#####%((#%%(#%%%%%%%%%#                                                                                                                        ");
		System.out.println(
				"                                           /###(###########%%%#((%%%%%%%%%%%%%%%%%/                                                                                                                     ");
		System.out.println(
				"                                          /############%##%%%#(#%##%%%%%%%%%%%%%%%%/                                                                                                                    ");
		System.out.println(
				"                                        .#############%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%            *#/                                                                                                     ");
		System.out.println(
				"                                      .######%#####%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%         /#####(                                                                                                   ");
		System.out.println(
				"                                *****########%#%#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%.      *########%                                                                                                 ");
		System.out.println(
				",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,*/#####%####%%%%%#((#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%,***/**(##%#%%%%,,,...,,,,,.  .,,,,.    ..      .,,,,.    ...,.     ...         .,,.    ..             .,...  .,");
		System.out.println(
				",,,,,,,,,,,,,,,,,,,,,,*****,,,,,,,,/######%##%%%%%%**//**%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%**#*##(##%%%%%%%#*/*/**,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
		System.out.println(
				",,,,,,,,,,,,,,,,,,*#(,,,/***********//#%%%%%%%%%%%%%%##%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#%&##/#(%%%%%%%%%%%%%/****,,,,,,,,,***,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
		System.out.println(
				",,,,,,,,,,,,,****#%#%%#*/*******/#(###%%%%%%%##%%%%%%(%%%%%%%%%%%%%%%%%%%#%%%%%%%%%%%%%%%%(#((%(%%%%(%%%%#*(***************/******************,,*********************************,,,,,,,,,,,,,,,,,,,,,,,");
		System.out.println(
				",,,,,,,,,*****/(/(((#*#%#******/(#(#(**((#%/%%%%(#%#%/*%(**%%%%%%%%(/******((%%%%%*/%#&%&%(*((#%%%%****((//**********#%#***********************************************************************,,,,,,,,,");
		System.out.println(
				",,,,,,,*************************/((******(*/%%%%#/***/****%%%%%##(#**##*#%**%%%/******((///***************************************************************************************************///,,,,,,,");
		System.out.println(
				",,,,,,*****************************************************//(/********/*********************************************************************************************************///////(///*,,,,,,,,,,,");
		System.out.println(
				",,,,,,,/***************************************************************(*************************************************************************************************////(////(*,,,,,,,,,,,,,,,,,,,,");
		System.out.println(
				",,,,,,,,//********************************(%%#*************************(****************************************************************************///////////////////(///(*,,,,,,,,,,,,,,,,,,,,,,,,,,,");
		System.out.println(
				",,,,,,,,,,*/(//*******************************************************#(**********************************************************************///(////////////(///////*,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
		System.out.println(
				",,,,,,,,,,,,,,/////************************************************************************************************///*****************/////////**,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
		System.out.println(
				",,,,,,,,,,,,,,,,,*(////**************************************************************/////////(////////////(/////////(///////////////(///**,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
		System.out.println(
				",,,,,,,,,,,,,,,,,,,,,,*/(///////(/////(//////(///////////////////*************/////(///**,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
		System.out.println(
				",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,*////(////////(/*,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
		System.out.println(
				",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
		System.out.println(
				",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
		System.out.println(
				",.......................................................................................................................................................................................................");
		System.out.println(
				"                                                                                                                                                                                                        ");
	}

	// Creates a method which prints the triangle for task 1 part 3
	public static void triangle() {
		System.out.println(
				"                                                                                                                                                                                                        ");
		System.out.println(
				"                                                                                                                                                                                                        ");
		System.out.println(
				"                                                                                                 %@@&                                                                                                   ");
		System.out.println(
				"                                                                                                 @@@@@                                                                                                  ");
		System.out.println(
				"                                                                                               ,@@@@@@@*                                                                                                ");
		System.out.println(
				"                                                                                              (@@@@(@&&@%                                                                                               ");
		System.out.println(
				"                                                                                             &@%&@* @@,#@@                                                                                              ");
		System.out.println(
				"                                                                                            @@(.@@  #@% .@@*                                                                                            ");
		System.out.println(
				"                                                                                          ,@@, /@@  .@@.  @@#                                                                                           ");
		System.out.println(
				"                                                                                         (@@   &@(   %@(   #@@                                                                                          ");
		System.out.println(
				"                                                                                        &@&   .@@.   ,@@    *@@.                                                                                        ");
		System.out.println(
				"                                                                                       @@(    *@@     &@*     @@%                                                                                       ");
		System.out.println(
				"                                                                                     .@@*     %@#     /@@      %@@                                                                                      ");
		System.out.println(
				"                                                                                    (@@       @@,      @@.      ,@@,                                                                                    ");
		System.out.println(
				"                                                                                   %@@       .@@       #@@        @@(                                                                                   ");
		System.out.println(
				"                                                                                  @@#        #@%        @@         %@@                                                                                  ");
		System.out.println(
				"                                                                                .@@*         @@/        &@&         *@@.                                                                                ");
		System.out.println(
				"                                                                               /@@.          @@          @@           @@(                                                                               ");
		System.out.println(
				"                                                                              %@@           (@&          @@#           @@&                                                                              ");
		System.out.println(
				"                                                                             @@%            @@(          .@@            *@@.                                                                            ");
		System.out.println(
				"                                                                           ,@@,             @@.           @@/            .@@/                                                                           ");
		System.out.println(
				"                                                                          *@@.             /@@            *@@              &@&                                                                          ");
		System.out.println(
				"                                                                         %@&               &@#             @@*              (@@.                                                                        ");
		System.out.println(
				"                                                                        @@%                @@.             (@&                @@*                                                                       ");
		System.out.println(
				"                                                                      .@@*                *@@              .@@.                &@%                                                                      ");
		System.out.println(
				"                                                                     *@@                  %@&               #@%                 (@@                                                                     ");
		System.out.println(
				"                                                                    #@@                   @@,               ,@@                  ,@@*                                                                   ");
		System.out.println(
				"                                                                   @@%                   ,@@                 &@(                   @@%                                                                  ");
		System.out.println(
				"                                                                  @@(,***//(((###%%&&&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@                                                                 ");
		System.out.println(
				"                                                                *@@//*****,,,,,......    @@*                  @@/                    ,@@*                                                               ");
		System.out.println(
				"                                                               #@@                      .@@                   /@@                      @@%                                                              ");
		System.out.println(
				"                                                              &@%                       /@@                    @@,                      #@@                                                             ");
		System.out.println(
				"                                                             @@*                        &@/                    #@&                       ,@@*                                                           ");
		System.out.println(
				"                                                           ,@@,                        .@@.                     @@.                        @@#                                                          ");
		System.out.println(
				"                                                          %@@                          *@@                      &@%                         #@@                                                         ");
		System.out.println(
				"                                                         &@&                           &@#                       @@                          *@@                                                        ");
		System.out.println(
				"                                                       .@@/                            @@,                       @@(                           @@#                                                      ");
		System.out.println(
				"                                                      ,@@,                            .@@                        ,@@                            &@@                                                     ");
		System.out.println(
				"                                                     #@@                              %@%                         @@*                            *@@,                                                   ");
		System.out.println(
				"                                                    &@&                               @@*                         /@@                             .@@/                                                  ");
		System.out.println(
				"                                                   @@(                                @@                           @@.                              &@@                                                 ");
		System.out.println(
				"                                                 ,@@.                                #@&                           (@@                               /@@.                                               ");
		System.out.println(
				"                                                (@@                                  @@(                            @@                                 @@/                                              ");
		System.out.println(
				"                                               &@&                                   @@                             %@&                                 @@&                                             ");
		System.out.println(
				"                                              @@#                                   (@@                             .@@                                  /@@.                                           ");
		System.out.println(
				"                                            ,@@,                                    &@#                              &@#                                  .@@*                                          ");
		System.out.println(
				"                                           (@@                                      @@                               ,@@                                    &@&                                         ");
		System.out.println(
				"                                          %@&                                      /@@                                @@/                                    #@@                                        ");
		System.out.println(
				"                                         @@(                                       %@%                                /@&                                      @@*                                      ");
		System.out.println(
				"                                       .@@*                                        @@.                                 @@*                                      @@%                                     ");
		System.out.println(
				"                                      (@@                                         *@@                                  (@%                                       #@@                                    ");
		System.out.println(
				"                                     %@@****/////////((((((((((((#########%%%%%%%%@@@&&&&&&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,                                  ");
		System.out.println(
				"                                    @@#,,,,,,,,,,,,,,,,,,.........................@@*                                   %@#                                         @@%                                 ");
		System.out.println(
				"                                  .@@,                                           ,@@.                                   .@@.                                         #@@                                ");
		System.out.println(
				"                                 /@@.                                            /@&                                     &@/                                          ,@@,                              ");
		System.out.println(
				"                                &@@                                              @@/                                     *@@                                            @@#                             ");
		System.out.println(
				"                               @@#                                              .@@.                                      @@,                                            %@@                            ");
		System.out.println(
				"                             ,@@,                                               *@@                                       (@@                                             *@@,                          ");
		System.out.println(
				"                            *@@.                                                &@(                                        @@.                                              @@(                         ");
		System.out.println(
				"                           &@&                                                  @@,                                        #@@                                               %@@                        ");
		System.out.println(
				"                          @@%                                                  ,@@                                          @@                                                *@@                       ");
		System.out.println(
				"                        .@@/                                                   &@%                                          &@%                                                 @@(                     ");
		System.out.println(
				"                       *@@                                                     @@*                                           @@                                                  &@&                    ");
		System.out.println(
				"                      #@@                                                     .@@                                            @@(                                                  /@@.                  ");
		System.out.println(
				"                     @@%                                                      %@&                                            ,@@                                                   .@@/                 ");
		System.out.println(
				"                    @@/                                                       @@/                                             @@*                                                    &@@                ");
		System.out.println(
				"                  *@@.                                                        @@                                              /@&                                                     (@@               ");
		System.out.println(
				"                 #@@                                                         (@@                                               @@,                                                     .@@/             ");
		System.out.println(
				"                &@%                                                          &@(                                               (@%                                                       @@%            ");
		System.out.println(
				"               @@/                                                           @@                                                .@@.                                                       (@@           ");
		System.out.println(
				"             ,@@,                                                           /@@                                                 %@#                                                        ,@@,         ");
		System.out.println(
				"            #@@                                                             %@#                                                 ,@@                                                          @@%        ");
		System.out.println(
				"           &@&                                                              @@.                                                  &@(                                                          %@@       ");
		System.out.println(
				"         .@@(                                                              *@@.                                                  /@@                                                           .@@*     ");
		System.out.println(
				"         /&((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((/.     ");
		System.out.println(
				"                                                                                                                                                                                                        ");
	}

	// prints ascii art for the final game.
	public static void newTurn() {
		System.out.println(
				" /$$   /$$ /$$$$$$$$ /$$      /$$       /$$$$$$$$ /$$   /$$ /$$$$$$$  /$$   /$$       /$$$$$$$  /$$$$$$$$  /$$$$$$  /$$$$$$ /$$   /$$  /$$$$$$ ");
		System.out.println(
				"| $$$ | $$| $$_____/| $$  /$ | $$      |__  $$__/| $$  | $$| $$__  $$| $$$ | $$      | $$__  $$| $$_____/ /$$__  $$|_  $$_/| $$$ | $$ /$$__  $$");
		System.out.println(
				"| $$$$| $$| $$      | $$ /$$$| $$         | $$   | $$  | $$| $$  \\ $$| $$$$| $$      | $$  \\ $$| $$      | $$  \\__/  | $$  | $$$$| $$| $$  \\__/");
		System.out.println(
				"| $$ $$ $$| $$$$$   | $$/$$ $$ $$         | $$   | $$  | $$| $$$$$$$/| $$ $$ $$      | $$$$$$$ | $$$$$   | $$ /$$$$  | $$  | $$ $$ $$|  $$$$$$ ");
		System.out.println(
				"| $$  $$$$| $$__/   | $$$$_  $$$$         | $$   | $$  | $$| $$__  $$| $$  $$$$      | $$__  $$| $$__/   | $$|_  $$  | $$  | $$  $$$$ \\____  $$");
		System.out.println(
				"| $$\\  $$$| $$      | $$$/ \\  $$$         | $$   | $$  | $$| $$  \\ $$| $$\\  $$$      | $$  \\ $$| $$      | $$  \\ $$  | $$  | $$\\  $$$ /$$  \\ $$");
		System.out.println(
				"| $$ \\  $$| $$$$$$$$| $$/   \\  $$         | $$   |  $$$$$$/| $$  | $$| $$ \\  $$      | $$$$$$$/| $$$$$$$$|  $$$$$$/ /$$$$$$| $$ \\  $$|  $$$$$$/");
		System.out.println(
				"|__/  \\__/|________/|__/     \\__/         |__/    \\______/ |__/  |__/|__/  \\__/      |_______/ |________/ \\______/ |______/|__/  \\__/ \\______/ ");

	}

// prints out the beginning text slowly. 
	// interrupted exception allows you to to add thread.sleep
	public static void begin() throws InterruptedException {
		// String start creates a variable for the beginning text.
		String start = "While you are on an aerial tour of the world-famous \"Volcano Island\" disaster strikes.\nAs you are flying over the vast rainforest to the east of the volcano you suddenly hear a loud bang.\nThe helicopter suddenly starts spinning uncontrollably.\nBefore you could even think you pass out.\nWhen you wake up, you're completely alone.\nYou appear to be the only survivor.\n";
		char[] letters = start.toCharArray(); // converts the string to a character array. A character array in this
												// case allows you to easily print out each character one by one
		// this creates a for loop. Here, a for loop is used to print each character in
		// the array one by one. It starts from the first character which is at 0, and
		// ends at the last character which can be found by using letters.length
		for (int i = 0; i < letters.length; i++) {
			System.out.print(letters[i]);
			Thread.sleep(45); // 45 ms delay between each character.
		}
	}

//prints out the goal slowly. This works the same as the beginning text
	public static void goal() throws InterruptedException {
		String start = "Your goal is to gather all the supplies you need and escape the island. This includes food, water and shelter, making tools for your escape, and finally escaping ";
		char[] letters = start.toCharArray();
		for (int i = 0; i < letters.length; i++) {
			System.out.print(letters[i]);
			Thread.sleep(45); // 45 ms delay between each character.
		}
	}

	// prints out the task 1 text slowly. This works the same as the beginning text
	public static void task1txt() throws InterruptedException {
		String start = "Your first task is to locate food, water, shelter, and the materials you need in order to escape.\nYou estimate the time of day to be late evening, making it about 18 hours since you've eaten anything. Luckily,\nAs you walk a few meters from where you woke up, you find oranges, bananas, and watermelons.\nWhich should you eat first?\n\nIf you answer wrong twice, you lose.\nAnswer correctly on your first try to get the most points. ";
		char[] letters = start.toCharArray();
		for (int i = 0; i < letters.length; i++) {
			System.out.print(letters[i]);
			Thread.sleep(45); // 45 ms delay between each character.
		}
	}

	// prints out the task 1 part 2 text slowly. This works the same as the
	// beginning text
	public static void task1twotxt() throws InterruptedException {
		String start = "Now that you have food, you need a freshwater source.\nLuckily you remember that your pilot was telling you about a riddle that the locals use to find the direction of the river.\nIf you answer wrong three times you lose.\nAnswer on your first try to get the most points\n"
				+ "It goes \"Following it would take you back in time, but suddenly to tomorrow.\" ";
		char[] letters = start.toCharArray();
		for (int i = 0; i < letters.length; i++) {
			System.out.print(letters[i]);
			Thread.sleep(45); // 45 ms delay between each character.
		}
	}

	// prints out the task 1 part 3 text slowly. This works the same as the
	// beginning text
	public static void task1threetxt() throws InterruptedException {
		String start = "Now that you have enough resources to survive, You can now get the tools and materials you need to escape.\nYou locate a sharp rock you can use as an axe,\nand there's lots of wood as you're in a jungle.\nA fire smoke signal won't be of any use as there is a giant smoking volcano on the island.\nBecause of this, you decide to make a raft.\nAll you need to do is some simple problems in your head to determine how to build your raft.\nYou have 8 chances to get these right.";
		char[] letters = start.toCharArray();
		for (int i = 0; i < letters.length; i++) {
			System.out.print(letters[i]);
			Thread.sleep(45); // 45 ms delay between each character.
		}
		
	}

	// prints out the task 2 text slowly. This works the same as the beginning text
	public static void task2txt() throws InterruptedException {
		Scanner in = new Scanner(System.in); // creates a scanner which allows for user input
		String start = "Now you can finally move on to your last task. Leave the island.\nThere's another island not too far from here that's safe from the eruption of the volcano.\nyou should have no difficulty finding the island as it is visible from the shore.\nHowever, you need to watch out for one thing.\nThe waters surrounding this island is full of sharks.\n\nAs you start to sail away from the island the swarms of sharks surround your raft.\n";
		char[] letters = start.toCharArray();
		for (int i = 0; i < letters.length; i++) {
			System.out.print(letters[i]);
			Thread.sleep(45); // 45 ms delay between each character.
		}
		System.out.println(",,,,,,,,*******/(#%%%%%%%%%%%%###(((((/*,,,,,....                                  ............,,,,,,,,,,,,,,,,,,,,,,......,,,,,,,,,,,,.........,...............................,,,,,,,,,,,,,,,,,,,,,,,,");
		System.out.println(",,,,,,,,,,,,,***//((#%%%%%#(##((//***,,,,,..........                                ...........,.,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,..........................,,,,,,,,,,,,,,,,,,,,,,,");
		System.out.println("****,,,,..,,,,,,,,*//////((//*******,,,,,..........                                  .............,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,.....................,,,,,,,,,,,,,,,,,,,,,,,,");
		System.out.println("////***,,,...,.....,,,,*,*,*****,,,,,,,,.,...........                            . ... .........,,,,,,,,,,,,,,,*****,***************,*,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,......,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
		System.out.println(",,,,,*//***,,,,,,,,,,,,*****///***,,,.,,,,,...........                            . ............,,,,,,,,,,,,,*************************************,,*,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,*,,,,,,,,,,,,,,,,,");
		System.out.println(".....,*/(/**,,,,,,,**,,**//////(**/*,.,,......,...........                     . ..............,,,,,,,,,,,,,,*************************************************,**,,*,,,,,,,,,******************,,,,*,,*,");
		System.out.println("......,***,............,,**,,,,**,,***,,,,,,,,,..........  .             .       ...............,,,,,,,,,,,*,*******************************************************************************************");
		System.out.println(".... .........         .         ...............................             ......................,,,,,,,,***,*****************************************************************************************");
		System.out.println("..........                                               ......                 . ...................,,,,,,,,,,,,,,*,***********************************************************************************");
		System.out.println("......... ..           .   .   .   .       .               ..                     .....................,,,,,,,,,,,,,,,,,,,,*****,*,*********************************************************************");
		System.out.println(",.......              ...............   .  .....                                    .....................,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,*************************************************************");
		System.out.println("......               ............................                                    . ..................,.,,,,......,,,,,,,,,,,,,,,,,,,,,,,,,,*********************************************************");
		System.out.println(",......               .............................   ...                                .....................................,,,,,,,,,,,,,,,,,*********************************************************");
		System.out.println("****,,,.....       . ...........................................                     .   ....................................,.,,,,,,,,,,,,,,,,,,****************************************************,,*");
		System.out.println(".,*,...         .   . ................................................                  .......................................,,,.,,,,,,,,,,,,,,,,,,***************************************************");
		System.out.println(" .                   ..............................................................  . ...................................................,,,,,,,,,,,,,,,**********************************************/");
		System.out.println("...                        ...................................................................................................................,,,,,,,,,,,,,,,,,,,,,****************************,*,,*****");
		System.out.println("......         .             .             ......................,.....,,,,,.,.,,,.............,...............................................,,,,,,,,,,,,,,,,,********//***//*******,,,,,,,,,,,,,,,,,,");
		System.out.println("....................... .. .... .          ...  ...................,.,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,.......................,,,,,,,..............,,,,,,,,,,,,,,,,**//******///////*****,,,**,,,,,,,,,,,,,");
		System.out.println("........................................ .....................,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,...,.,.......,.,,,,,..,,,,,,,,,,.............,,,,,,,,,,,,,,,,,,,,,,,,,,,***//******,,,,,,********,,,");
		System.out.println(",,,,,,........................................................,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,.,,,,,,,,,,,,,,,,,,,......,,,,,,,,,.,,............,...,,,,,,,,,,,,,,......,,,,,********,,,,,**,,,,,,,,,,");
		System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,.,,,.......................,,,,,,,,,.,,,,,,,,,,,,,,,,,,,,,..........,,,,,,,,,,,,.........,.......,.,,,.....................,,,,,,..........,,,,***,,,,,,,,,,,,,,,,,***,,");
		System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,.......,,.,..,,...,,,,,,,,,,,,,,,,,,.............,,,,,,,,,,,,...........................................,,,,,,,,,,,,,,,,,,****,,****,,,,,,,,,,,,,,*,,");
		System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,.,.,.....,,,,,,,,,,,,,,,,,...,,,,,,,,,,,,,,,,,,,,,,,,,,,,,.,,.................................,,,,,,,,,,,,,,,,...,,,,,,,,,*********,,,,,,,,,,,");
		System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,***//***********,,,,,,,,,,...,..,,,,,,,,,,,,,,,,.,,,,,,,,***,,,,,,,,,,,,,,,,,,,,,,,,,,,,,......,...................,,,,,,,,,,*******,,,,,,,,,,,.........,,,,,,,,,,,..");
		System.out.println(",**/////****,,,,,,,,,,,********/*/***////////////***,,,,,,,*****,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,.,,,,,,....,,,,,,,,,,,.,......,,,,,,,,,,,,,****************,,,,............,,,,,,,");
		System.out.println(",,**********,,,,,,,,,,****///******,,,********///***,,,*,,***************,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,...................,,,,,,,,......,,,,,,,,,,,,,,,,************,,,...............,,.,");
		System.out.println("...........,,,,,,*****************,,,***,,,,,,,*,,,,,,,,,,,,,,,,,,,**///********,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,.....................,,,,,,,...........,,,,,,,....,,,,,,,,,,,,,,,,.....,,....,.,,,..");
		System.out.println(".............,,,,,,,,,**********************,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,*********,,,,,,,,,,,,,,,,,,,,,,,,,...............................,.,......................................,.........,,,,,,,,,,");
		System.out.println("...........,.,,...,,,,,,,,,,,,,,,,,,**************,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,...............................................................................,,,..,,,");
		System.out.println("......,,,,,,,,,,,,,,..............,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,.,,..,,,,,,,,,,,,,,,,,,,,,,,,...................................................,,,,.,,,....................................");
		System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,.,.,.................,,,,,,,,,,,,,,,,.............................................................................,,,,,,,,,,,,....................................");
		System.out.println("...........,.,,,,,,,,,,,,,,,,,,,,,,,,,,,.,,,,,............................................   ...........................................................,,,***,,,,,.....................................");
		System.out.println(".....,.,...,,,.....,,,,,,,,,,,,*****,**,,,,,,,,,,,...............................................................,...................,............,,,,,***,****,,,,,,,..................................");
		System.out.println("....,,,.........,..,,,,,,,,,,,,****************,,,,.........................,,,,,,,............................,,,,,,..............................,,,,,,,,,,,,,,,,,,,,.................................");
		System.out.println(",,,,,,,,...,,......,,,,,,,,,,***************,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,.,,........................,.,,,,,.............................,,,,,,,,,,,,,.,..,,..................................");
		System.out.println("..................,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,.,.,,,,,,.,,,,,,,,,,..,,,,,,,,,,,,.....,..........................,,,,..................................,,,,,,,,,,,,,,,,,,,,,.,,,.......................");
		System.out.println("...........................................................,.,,,,,.......................,.............................,.....................,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,.............  . .");
		System.out.println("   .. .....   .. ....................................................   .....      ..... .. .......    ....................................,,,,,,,,,,,,,,,,**,**,************,,,,,,,,,,,,........ ......");
		System.out.println(".................................................................                                  ..........................................,,,,,,,,,,,,,,,,,,*,*,*******,,,,,,,.......................");
		System.out.println("....................................................................                                     ...................................,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,......... . ..............");
		System.out.println("....................................................................                                         ........  ... ................,.,..,....,,,,,,,,,,,,,,,,,,,,,,,,,............ . . . . .....");
		System.out.println("................................................ .....   ...     ..                                                                 .  ...................,,,,,,,,,,,,,,,.,,,,,...............  ........");
		System.out.println("...................................................... ..  ... .       .     .                                                               ...........................................................");
		System.out.println("............................... .. .. ..........                                                                                                ........................................................");
		System.out.println(".......................... . . ..  . . .                                                                                                     .................................     . . ....... .........");
		System.out.println(",...................... .. . .  .. .    .  .                                                                     (&&(#%/                          .... .................................................");
		System.out.println(",,,,........................ . . .   .     . . .                                                                *#((*,*(.                                  . ..  .......................................");
		System.out.println(",,,....................                                                                                       ..*,/**/%.                                     .      ......     .........................");
		System.out.println(",,...................... .                                                                                 ,##(((%&#&/                                                   .         .....................");
		System.out.println("......................   .                                                                                %&%%##%/&@&*                                                                  .  .............");
		System.out.println(",,.................. . .                                                                                .#@&&&%#(%&%&&#.                                    ..                 ... .. .. ...............");
		System.out.println(".....................                                                                                   /&&@&%&#((%&(/,*,                        .............                        ..................");
		System.out.println(",,....................                                                                                  (&@@&@@&%((#@@@%#*              ..................,..*.                     ....................");
		System.out.println(",,,,,.............. .                                                                                   (%%&%%@&@&##%##%%#       ........................,***,                     .  .................,");
		System.out.println(",,,,................                                                                                    (&&/##@@@@@&&&&%%.,*(((((//##,,........,.....,(//*****                       ................,,,");
		System.out.println(",,,,,........... ...                                                                                    (%%%%####&@&&&&&&&@@@@@@@@%&&&%@&%*,... .(#/////***//                        . ..............,,,");
		System.out.println(",,,,,,..............                                                                                    /%%&%%%%%%##########((##&@&&&#.....,(%#(/////****/#*                       .  ..............,,,,");
		System.out.println("*,,,,,,............    (&&/                                                                             *%&&%%%%####%%%&&&&&@&&%,,....,#%#((///////***(##,                            .............,,,,,");
		System.out.println("((///**///*******///*//(@@@&#***,,,,,,.............                                               .*(#%&@@@@&%######/,..,*,,,,,.,(#%#((///////////(%%%*                          . ..............,,,,,,,");
		System.out.println("##((///(////*/((((//(///%&@&&%///(///(/(((/////(((/***//*.,/****,,,,,,.......................,,***(#(*****////**,,........,/#%##((////////////#%&&&%%, .   .. .     . .. .......*&&&#,,,,,,,,,,,,,,,,***");
		System.out.println("#%##%########(#/(###(#((%@@@&&#%(////******,,,.,.,....,,,/*,,,****,,...,****////***,,,.,,,,*##((*,,,.,..............,/#%%##(/////////////(%%&&%,./*.********,,,,,,,,,,,,,****/**/%&&&&&((((((((((#%%%%##");
		System.out.println("%%#####(((((((####%%####%@@@@&&(%(//(###((((/,.,****,,**,,.......,*/////******,,/%%//(#%&&&&%%(*.,,*,,,,..,,.,,/%%%####(((////////((#&&&&&@&#&&#(#*.(***,,****,**/*/*/((((((((((/%&&&&@@&((///((((((((##");
		System.out.println("#%%%%%%(%&%##%%%##((////#@@@@@@&%*///****/////////**,,,,,*,*****//(/*((((((((#%%%%#%%%%%%&%&&&&&&(,...,.,(#%%#####%##((((((((##%&&&&@&@@@@&@@@&&&%&&%&%%%##(((//*/(////(((//(((((%&&&&@@@&(((((#(###%#%%");
		System.out.println("%%%%%%##%#####(%%&##&(#%#%@@@@@@@&%##%(/##(//(/,,,,*/*..,//*..,///((#%%%%%%&##%%%%%%&%#%#(,,,. .,.,(%%%%###((((###########%&&&&&@@&@@@&&&&&&&@&&&&&&&&&&%%%####%%#(/(#///(((##(/(@@@@@@@@@&#####%%%%%#%%");
		System.out.println("%######%%%###(#%%#%%%@&&@@@@@@@%@@&&#%%%%#(((((((%##((/#%%#(##%%%#&%@&%%%###(##%#&%#/////**/*#%&&&&%%%%############%%&&&&&@&@&&&&&&&%%%%%%##%%&&&&&%&&&&&&%%%%&%%%#((#(((((/(%#(&@@@@@@@@@@&((####%###%%");
		System.out.println("##%########%#######%#%%%&@@@@@@@@@@@@@&&#%##*/*,,*////*/(##%&%#(%/#%&%%&&&%%##((((((/(((#&&&%&&@@&&%%%((/,/*#%%&&&&&&%%%#####(((//#(##%%###%#%###%##%%#%%%####%%%##(((((#((((#%%@@@@@@@@@@@@@@&&&%%%%%%%");
		System.out.println("#%%%%%%%##((((#((%((###%%&&@@@@&&@@@@#%&&&%&%(/,,,,,***/((#%%&&&%%#%(#%##%%###(###%&@&&&&&&&(%&&&&%%&&&&&&%%%##(/,,,,,*//////((((//(###########(#(#((((((((#####///(##((%%%&%&&@@@@@&&&&@@&&&&&&&%%%#%%%");
		System.out.println("#%########((%&%#////((((##%%%%&&&&&&&&&&%%##%#%(/*/*//*/((((#%##(#######(((##(###%%&&&&&%&&&&&%#####%#%%(###//((((((#(((//(#######(//((//(##((###%%#%#%#%%%&%%%%%%%%#%&@&@@&&%%%&@@&&@@@&%%%%%%%%%%&&&&&");
		System.out.println("%%%%%%%%%(#####%%%((##(#####%%%%%%%%%##(#(##%%##(#((((*////(#((//((//////*///**//******,****.,,***,,,,,,*/,,,****///(////**/////***,,*(#%%%######%%%##(##(((#(//(/((((((/(((((/(#%%#%%%%%&&&&&&&&&&&&&&&");
		System.out.println("%%####(#%%(%%##(##(((###%###%%%%%%###(((#(((######(#((/(///((//////,/((((//(((*,***,/((##((//*(((///(((///(##/(((/****,*,,,,*/#%%%%%#%%###(/(((////*,*#####%%#//(//((//((((/(#((##%#%%&&%&&&&&&&%%&&&&&&");
		System.out.println("%%%%%%%%%%####(((((((((((((##%%%%%###(((/////((((((###((##((///*//**//***/(/////(####(((/*/**,/###((/*/(/**//***/*((#%#%%(/(##(///*,*,,,,,,*,**,**,*///*,**///////***(###%%#%###((#%%%%%%%%%%&%%%%%%%%%%");
		System.out.println("&%%%%%%########(((((((((////((########(//////(/(/((((/((((((((((#(####((((((###(((#%###(((///(/(%(##(((((((/**,.,..,*////(#(/(((/**/**/(###%%%%%%%%####%##%%%####%#((#%%%%%%%%&&#(%%%%%&&%&&%###(#%%%%%%");
		System.out.println("%%%#####(((###((((((((((((((((((//(((((((((((((((((((##(((((#((/((####((((((##((((((#(((((((((@@@&&&&%%%#*..***,.,*///*///(((/((#(%%%%%%%%#######%%#(########%%%%%%%######%%%%%%%(#%%%%%%%%%%%%##%%%%%%&");
		System.out.println("%%#####%%####(((#(#(((######(#(((((((((########(((((((((((////*//(((/(((((//(((((//((///(/,,/(#%@@@@@@@&&%*.*##(((///((/((((#((/**,,,****//(((#((/***,*******/(##%%##%&%%%%###(##%&&&&&&&&&%#######%%%&&");
		System.out.println("%%%%%%############(((((##(##(((((((##(#((//////////(//(///////*///////*****//((///((((((((((((///#&@@@@@@&&&&&%*/%(((######%%%##(#((////((//***/****//#((#%%###%%%%%##((((#######&&&&&&@&&%%%%%%&%%#%%%%");
		System.out.println("##########%%%##((((((/(((//*/((//(/(((((((((((((/((((/((((((((((///((((//((((//////(((((((((((((###%@@@@@@@@&&&&&&%#%((//(/(//**(#(####(##########(((((///(##(////////(((###%##(%%%%%%&&&%&&&%%%%%%%&&&&");
		System.out.println("########(((#(((((((((//(///(##//*//(((((///(/////(((((///////((((/(/////(#(//(((/////*/////**/((((##%@@@@@@@@@@&&&&&&%%%%%%&&%(#%#%#((#(#(###((###%##(###%%#(((#%%%%%%%#####(/*/####%%%%%%%%%%%%&%%#%%%%");
		System.out.println("%%%%%%%#######((((((((((((((###/((//(((/(((((((((###(((/////********////(#(//(,*/((//((////((((((((((&@@@@@@@@@@@&&&&&&&&&%%%%%%%%%%%%%%%&&%%#%#(((//((((((((#######(#######((#%%#%%#%#%%##%%%%%%&&%%%%%");
		System.out.println("######%%########%##((((((((/((/////(/////////*/((((((///*//((/////**/////////(///*/**/***,*///****/**#@@@@@@@@@@@@@@@@@&&&%&%%#((//*.*//////(((((((((/////*/*///(((((((####%%#####%%&&%%%%##%%%%&%%&####");
		System.out.println("#%#%%%%%#############((#((((/*/((//##(///*//((#(((((/(/((((((((((/((/(((/*/((//#(/*****//(///*/(((((#@@@@@@@@@@@@@@@@@@@@@@@@%%&@@&@&&%%##/*((/(,/#((////**//***/**/(/////(/////////(####%%%%%%%%%&&%%%%");
		System.out.println("%%%%%%%%%%############%######((#(##%%&%&%%%####(#(###(((((((((((((#((#((#/##(#%%%##%%#((//((##%%&&&&&&@@@@@@@@@@@@@&@@@@&#/#&(%&@@@%@&@&&##**(##%&&%/#%##((((#(/***/*/**/////(///((/((##########%%%#%%%&");
		System.out.println("%%%%%%#%%%%%##((##%%%%%%%%%%%%#%%%%%%###(#########(((///////(#############(#########%%##(#####%%%&&&&&@@@&@@@@@@&@&@@@&&&%(&(%%&&%%*#&##(###%(,(%/#*#((/((((((,(((((///************///((((####%#%%&&&&&&");
		System.out.println("&%%%%####%%&&&&%%##%%#####(#((####(#((((((//((((//////(#((#(((((((((////*///((////*///(((###%%&&&%&%&&@@@&@&@@&&#&%&&#((##%##%%%%%%%%#(#((##%%(((((/,*//***/(((/*,/////**(/(((//(((/((((######%#%%%%%%&%");
		System.out.println("%%&%%%%%%%%#####((####(((((////((((/((//((((###((((((((((((/////(/*////*,*/(/(////////((((((/((##%%#&&&@@@@@@@&&(#(#%#%#%%%%#%#(%%%%##%##((#((((#(((/(//(//(####%%###(#(#####(((((((((((####%%%%%%%%%&&&");
		System.out.println("&&&%%%%%%%%%#####%%%%%###%%###%%%%##########(((((###(((((////(##((((##(((########((((((((((/(#######%&&%&&&&%&&&%%%%%%%&&&&%%#(((#//,,,/(////**/*((((((/(((((#%#(*****/(//***//*/(###############%%%%%%&");
		System.out.println("&&&&%%%%%%%%&&&&%%%%#%%%%&%%&%%%%%%%####%%%%###((((#####%#####(((((############((((#(##((((/((((#%%%###%&&&&&&&&&&%#%&%%%%%%%%%#######(((//##(##((#((((((((###(((///((///((///(((((###(((#%((((%&&%%%&&&");
		System.out.println("&&&%%%&&&&%%%%%%%#%%%%%%#%####(########((############((((((((((#####((#((((((((#(##############%%%%%%%%%&&&&&&&&&&&&&&&%%%%%#######((((((((((#(((#(##/%(#%%%%##%%%########%%#%##########(#%%%%%&&%%&@@@@");
		System.out.println("&&&&&&&&%%%&&&&&%&%%%%#######%######%%%%%%%%%%%#####(((((((#((((((///(////(((((##(((((((((((((((####%&&&&&&&&&&&&%%%%%%%%%%########(/**((#%%#####%%##(############(((((####(((####%%%%##(#%%&&&&&&&&&&&&");
		System.out.println("&&&&&%%%&%%%%%%%&%%%&&&&&%%%%%%##%%%%%%%%##%%%%%%%%%###%((#####(((#####(#(#((#(/(((###((/(%#(####%%%%%%%&&&&%%%&&&%%%&%%###(((((%%%%%%%((/((#(((//((/(/(((//////*/*//((////(//(((####%%%%%%%%%%&&&&&&&&&");
		System.out.println("&&&&&&&&&&&&&&&%%&%%%%%%%%%%&&&&%%%#####%%%%%%%%%%%%%%%%#####(##((((##%##(((#((#####%#####(((###%%%%%%%%%%%%%%%%%%%%%&%&&&%#(((((((//(/***/((/*****,**/////*****////////(##%%%%#%%#######%%%%%&&&&&&&&&&");
		System.out.println("&&@&&@@&&&&&&&&&&&&&%%%%%%%&%%%%&&&&&%###%%%%%%&%%#%#####%%%%%%%%%%%##((((%%%%&%###%%%%%%%%%#%#%%%%&&&&%&%%&%%#######%&&%%%%#%%%%#(((//(##%%%###%##((#######%##%###%%%%%%%%&%%%%%%#%%%%&%%%%%%&&&&&%%&&&");
		System.out.println("&&&&&&&&&&&&&&&&&&%%%%%%%%%%%%%%%%%%%&&&%%%%%%%%%%%%%%%%#%%##%%%%%%%%%%%%#%%%%%%%%%&%%%%%%%%##%####%%%&%%#(((####%&&&&&&&&%%#%%%%%&&&&&%%######%%%%%%%%%%%%####%%%%#%%%%%%%##%%%%%%%%%%%%%%%%%%&%%&&%&&&");
		System.out.println("&&&&&&&&&&%&&&&&&&&&%%%%%%%%%%#%%%%%%%%%%%%%%%%%%%########%%%%%%#(#####%%%%%%%%%%##%%%%%##/(#%%&&&%%%%&&&&%%%%&&&&&&&%%%%%%%%%%%%#(((((((#########(/(//((((((((((####################%%%%%%%%%%%&&&&&&&@");
		System.out.println("&&&&&&&&&&&%&&&&&%&&&&&%%%&%%%%%%%%%%%%%%%&&&&&&&&%&&&&%%#%%###%%%%#(((((((((((####%%&%%&%%%%#########%%%%%%%%&&%%%&&&&&&%%%%%%##%%%####%###((///(((######%%%%#%%%%%%%%%%%%%%#%%%%%%%&&&&&&&&&&&&&&&&&&&");
		System.out.println("&&&&&&&&&&&&%%%&&%&%&%&&&&&&&&%%%%%%&&&&&&%&&&&&%&&&&&&&&&&&&%%%##%##%%%&&&%%%%%%&&%%&%%%%%%&&&&&&%%%%%%%%%%%&&&&%###%%%%%###((//((###%%%%%%&&&&&%%##%%##%%%%%%%%%%%%%%%&&&&&%&&&&&&&&&&&&&&&&&&&&&&@@@@");
		System.out.println("%&&&&&&&&&&&&&&&&&%&%%%&&&%%%%%%%%%%&&&&%%%%%%%%%%%%%%%%%&%&%%%&&%%%%%&&&&%%%%%%#%%%%%#%%%%%&%%&&%%%%&&&&%%%#####((######(###%%%##%&&&&&&&&&&&&&&&&&&&&&&&%%%%&&&&&&%%%%&&&&&&&%&&&&&&%%&&&&&&&&&&%%%%&&");
		System.out.println("&&&%%%%&&&&&&&&&&%%%&&&&%&%%%%&%%%%%%&&&&&&&&%%%%%%%%%%%%%%%%%%%%%%%%%%%%&&&&&%%#%######(((((((((((((((######%%%%%%%%%%&%%%%&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&%%&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		System.out.println("&&%%%&&&&&&&&&&&&&&&&&&%%%%%%%%%%%&&&&&&%%&&&&&&&&&&&&%##%%%%%%%%%%%%%%&&&%%&&&&&&&&%%#%%&&&%%%%%%%%%%%&&&&&%%%%%&&&%%%&&&&&%&&&&&&&&&&&&%%%%%%%%%%%%%%%&&&&&%%&&%%%%%&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
	
		print("\nEnter any key to continue\n");
		in.nextLine();
		
		String start2 = "\n\nOne of the Sharks Speaks to you!. He challenges you to a game of pig! If you lose, you get eaten, if you win, they let you go. You accept the challenge. The first to 60 points wins.\n\n";
		char[] letters2 = start2.toCharArray();
		for (int i = 0; i < letters2.length; i++) {
			System.out.print(letters2[i]);
			Thread.sleep(45); // 45 ms delay between each character.
		}
		print("\nEnter any key to continue\n");
		in.nextLine();
		
		print("");
		separate();
		print("Pig:\nPlayers will roll a dice and the number of points they get will be the sum of all the numbers they rolled.\nPlayers can role as many times as they like however if they roll a one,\nthey will not get any points for their turn. ");
		print("\nEnter any key to continue\n");
		in.nextLine();
		String start3 = "\n\nJust as your about to start, the shark adds a twist to the game. If you roll a 1, not only do you lose your points,\nbut you also have to solve a math problem to stay in the game.If you get the problem wrong, you lose.\n\n";
		char[] letters3 = start3.toCharArray();
		for (int i = 0; i < letters3.length; i++) {
			System.out.print(letters3[i]);
			Thread.sleep(45); // 45 ms delay between each character.
		}
		print("\nEnter any key to continue\n");
		in.nextLine();
	}
	


	// prints out the winning text slowly. This works the same as the beginning text
	public static void wintxt() throws InterruptedException {
		String start = "You Won!\nYou have successfully beaten the sharks and have escaped the island!\nAs you make it to the shore of the neighboring island,\nsome of the people there see your condition and immediately offer you help.";
		char[] letters = start.toCharArray();
		for (int i = 0; i < letters.length; i++) {
			System.out.print(letters[i]);
			Thread.sleep(45); // 45 ms delay between each character.
		}
	}
	
	public static void congrats() {
		System.out.println("  ______                                                      __                __              __      __                               ");
		System.out.println(" /      \\                                                    /  |              /  |            /  |    /  |                              ");
		System.out.println("/$$$$$$  |  ______   _______    ______    ______   ______   _$$ |_    __    __ $$ |  ______   _$$ |_   $$/   ______   _______    _______ ");
		System.out.println("$$ |  $$/  /      \\ /       \\  /      \\  /      \\ /      \\ / $$   |  /  |  /  |$$ | /      \\ / $$   |  /  | /      \\ /       \\  /       |");
		System.out.println("$$ |      /$$$$$$  |$$$$$$$  |/$$$$$$  |/$$$$$$  |$$$$$$  |$$$$$$/   $$ |  $$ |$$ | $$$$$$  |$$$$$$/   $$ |/$$$$$$  |$$$$$$$  |/$$$$$$$/ ");
		System.out.println("$$ |   __ $$ |  $$ |$$ |  $$ |$$ |  $$ |$$ |  $$/ /    $$ |  $$ | __ $$ |  $$ |$$ | /    $$ |  $$ | __ $$ |$$ |  $$ |$$ |  $$ |$$      \\ ");
		System.out.println("$$ \\__/  |$$ \\__$$ |$$ |  $$ |$$ \\__$$ |$$ |     /$$$$$$$ |  $$ |/  |$$ \\__$$ |$$ |/$$$$$$$ |  $$ |/  |$$ |$$ \\__$$ |$$ |  $$ | $$$$$$  |");
		System.out.println("$$    $$/ $$    $$/ $$ |  $$ |$$    $$ |$$ |     $$    $$ |  $$  $$/ $$    $$/ $$ |$$    $$ |  $$  $$/ $$ |$$    $$/ $$ |  $$ |/     $$/ ");
		System.out.println(" $$$$$$/   $$$$$$/  $$/   $$/  $$$$$$$ |$$/       $$$$$$$/    $$$$/   $$$$$$/  $$/  $$$$$$$/    $$$$/  $$/  $$$$$$/  $$/   $$/ $$$$$$$/  ");
		System.out.println("                              /  \\__$$ |                                                                                                 ");
		System.out.println("                              $$    $$/                                                                                                  ");
		System.out.println("                               $$$$$$/                                                                                                   ");
	}

	// creates a query for the first part of task 1
	// interrupted exception is needed here because of the use of the task 1 text
	// method
	public static int task1(int points) throws InterruptedException {
		Scanner in = new Scanner(System.in); // creates a scanner which allows for user input
		int r1count = 2; // creates a variable which keeps track of the amount of chances the player has
							// per try
		int wrongcount = 0; // keeps track of the total amount of times they get the answer wrong
		// r1 creates a variable which is used to run the loop. as long as r1 = 0, the
		// loop will run
		int r1 = 0;
		// creates a do while loop. This allows every thing inside the loop to happen at
		// least once and to repeat.
		do {
			String choice = in.nextLine(); // creates a string variable and assigns it to the users input
			// if the user does not enter watermelons and watermelon:
			if (!choice.equalsIgnoreCase("watermelons") && !choice.equalsIgnoreCase("watermelon")) {
				// tell the player that they are incorrect
				print("Incorrect");
				// add 1 to to their chance counter
				r1count--;
				// add 1 to the total amount of times they got the answer wrong
				wrongcount++;
				// tell the player the amount of lives they have left
				print("You have " + r1count + " chances remaining");
			}
			// if they get the answer wrong 4 times, display a hint
			if (wrongcount == 4) {
				print("Hint: its not very acidic");
				// if they get the answer wrong 5 times, display another hint
			} else if (wrongcount >= 5) {
				print("Hint: its named after something we all need in order to survive");
			}
			// if they run out of chances:
			if (r1count == 0) {
				// tell the player that they failed
				print("You failed! press any key to try again or type EXIT to exit");
				// rest the life counter
				r1count = 2;
				// allows the user to either restart or exit the game.
				String c1 = in.nextLine();
				if (c1.equalsIgnoreCase("exit")) {
					print("Thank you for playing");
					System.exit(0);// exits the games
				} else {
					// prints the separate method I created earlier
					separate();
					// prints the task 1 text again
					task1txt();
					// continues the loop
					continue;
				}
			}
			// if the user enters watermelon or watermlons:
			if (choice.equalsIgnoreCase("watermelons") || choice.equalsIgnoreCase("watermelon")) {
				// If the amount of times they got the question wrong is...
				switch (wrongcount) {
				// 0: gives the user 100 points
				case 0:
					print("Correct! You got 100 points!");
					points = 100;
					break;
				// 1: gives the user 50 points
				case 1:
					print("Correct! You got 50 points!");
					points = 50;
					break;
				// 2 gives the user 25 points
				case 2:
					print("Correct! You got 25 points!");
					points = 25;
					break;
				// >2: gives the user 0 points
				default:
					points = 0;
					print("Correct!");

				}
				r1 = 1; // breaks the loop
			}
		} while (r1 == 0);
		// returns the amount of points gained to the main loop.
		return points;
	}

	/*
	 * creates another loop for the second part of task 1. this is pretty much the
	 * same except for some minor differences that i will comment on
	 */
	public static int task1two(int points) throws InterruptedException {
		Scanner in = new Scanner(System.in);
		int wrongcount = 6;
		int r1 = 0;
		do {
			String choice = in.nextLine();
			if (!choice.equalsIgnoreCase("west")) {
				print("Incorrect");
				wrongcount--;
				System.out.println("You have " + wrongcount + " chances remaining");
			}

			if (wrongcount == 2) {
				print("Hint: its one of the cardinal directions");
			} else if (wrongcount == 1) {
				print("Hint: where does the sun set?");
			}

			if (wrongcount == 0) {
				print("You failed! press any key to try again or type EXIT to exit");
				String c2 = in.nextLine();
				if (c2.equalsIgnoreCase("exit")) {
					print("Thank you for playing");
					System.exit(0);
				} else {
					/*
					 * if the user fails, the points will = -1. in the main loop i have an if
					 * statement which if the points is -1, the game restarts from the first part of
					 * task1.
					 */
					separate();
					points = -1;
					r1 = 1;
				}
			}

			if (choice.equalsIgnoreCase("west")) {
				switch (wrongcount) {
				case 6:
					print("Correct! You got 100 points!");
					points = 100;
					break;
				case 5:
					print("Correct! You got 50 points!");
					points = 50;
					break;
				case 4:
					print("Correct! You got 25 points!");
					points = 25;
					break;
				default:
					points = 0;
					print("Correct!");

				}
				r1 = 1;
			}
		} while (r1 == 0);
		return points;
	}

	/*
	 * creates a query for the third part of task 1 this works exactly the same as
	 * task 1 part 2
	 */
	public static int task1three(int points) throws InterruptedException {
		separate();
		triangle(); // prints the triangle ACII art i created earlier
		print("Your first question is: How many triangles are there?\nEnter an integer number");

		Scanner in = new Scanner(System.in);
		int wrongcount = 8;
		int r1 = 0;
		boolean intInput = false;
		int choice = 0;
		do {
			/*
			 * this makes sure that the user enters a integer. To do this I used a try-catch
			 * statement. If the user enters a integer, it breaks out of the loop and
			 * continues the code. If the user does not enter an integer, it prints "please
			 * try again
			 */

			do {
				try {
					choice = in.nextInt();
					intInput = true;
				} catch (InputMismatchException e) { // if this error occurs, print: please enter an integer
					print("Please enter an integer");
					in.next();
				}
			} while (intInput == false);
			if (choice != 18) {
				print("Incorrect");
				wrongcount--;
				System.out.println("You have " + wrongcount + " chance(s) left");
				if (wrongcount == 5) {
					print("Hint: the lines dont separate each triangle");
				} else if (wrongcount == 4) {
					print("Hint: the number is below 20");
				} else if (wrongcount < 4) {
					if (choice < 18) // after they get the answer wrong 4 times, start telling the player if the
										// number is higher or lower.
						print("higher");
					else if (choice > 18)
						print("lower");
				}
			}
			if (wrongcount == 0) { // you have 8 tries to get this right
				print("You failed! press any key to try again or type EXIT to exit");
				in.nextLine();
				String c3 = in.nextLine();
				if (c3.equalsIgnoreCase("exit")) {
					print("Thank you for playing");
					System.exit(0);
				} else {
					separate();
					points = -1;
					r1 = 1;
				}
			}

			if (choice == 18) {
				switch (wrongcount) {
				case 8:
					print("Correct! You got 100 points!");
					points = 100;
					break;
				case 7:
					print("Correct! You got 50 points!");
					points = 50;
					break;
				case 6:
					print("Correct! You got 25 points!");
					points = 25;
					break;
				default:
					points = 0;
					print("Correct!");

				}
				r1 = 1;
			}
		} while (r1 == 0);
		return points;
	}

	/*
	 * This creates a query for task one part four. this works exactly the same as
	 * task one part three
	 */
	public static int task1four(int points) {
		separate();
		print("Your second question is: If a hen and a half lay an egg and a half in a day and a half,\nhow many eggs will half a dozen hens lay in half a dozen days?\n\n(Answer with an integer number)");

		Scanner in = new Scanner(System.in);
		int wrongcount = 8;
		int r1 = 0;
		boolean intInput2 = false;
		int choice = 0;
		do {
			do {
				try {
					choice = in.nextInt();
					intInput2 = true;
				} catch (InputMismatchException e) { // if this error occurs, print: please enter an integer
					print("Please enter an integer");
					in.next();
				}
			} while (intInput2 == false);
			if (choice != 24) {
				print("Incorrect");
				wrongcount--;
				System.out.println("You have " + wrongcount + " chance(s) remaining");

			}
			if (wrongcount == 5) {
				print("Hint: think of the words as numbers");
			} else if (wrongcount == 4) {
				print("Hint: the number is below 30 and above 15");
			} else if (wrongcount < 4) {
				if (choice < 24)
					print("higher");
				else if (choice > 24)
					print("lower");
			}

			if (wrongcount == 0) { // you have 8 tries to get this right
				print("You failed! press any key to try again");
				in.nextLine();
				points = -1;
				r1 = 1;
			}

			if (choice == 24) {
				switch (wrongcount) {
				case 8:
					print("Correct! You got 100 points!");
					points = 100;
					break;
				case 7:
					print("Correct! You got 50 points!");
					points = 50;
					break;
				case 6:
					print("Correct! You got 25 points!");
					points = 25;
					break;
				default:
					points = 0;
					print("Correct!");

				}
				r1 = 1;
			}
		} while (r1 == 0);
		return points;
	}

	// This creates a method which rolls the dice in my final task.
	public static int roll() {
		// creates a variable called die and assigns it to a random number between 1 and
		// 6
		int die = (int) (6 * Math.random()) + 1;
		// returns the value of the die (1-6) to the main method
		return die;
	}

	// This creates a method which creates a random math problem and returns the
	// answer to the main loop
	public static String math() {
		int a = (int) (100 * Math.random()) + 100;
		int b = (int) (10 * Math.random()) + 10;
		int c = (int) (5 * Math.random()) + 1;

		// assigns the variable question to a number between 1 and 3
		int question = (int) (3 * Math.random()) + 1;
		// creates a variable for the answer
		int ans = 0;
		// if question is equal to...
		switch (question) {
		// 1: print the math problem below and solve the math problem below
		case 1:
			System.out.println("Your question is: " + a + "x" + b + "-" + c);
			ans = a * b - c;
			break;
		// 2: print the math problem below and solve the math problem below
		case 2:
			System.out.println("Your question is: " + b + "-" + c + "x" + a);
			ans = b - c * a;
			break;
		// 3: print the math problem below and solve the math problem below
		case 3:
			System.out.println("Your question is: " + c + "x" + a + "-" + b);
			ans = c * a - b;
			break;
		}
		// converts the integer answer into a string
		String rAns = Integer.toString(ans);
		// returns the string answer into the main loop
		return rAns;
	}

	public static void main(String[] args) throws InterruptedException {
		Scanner in = new Scanner(System.in); // Creates a scanner which allows for user input

		// creates a variable to keep track of total points
		int points = 0;
		// creates a variable which runs the game in a code
		int start = 1;
		// creates a variable for the users input
		String select = "";
		do {
			// prints the menu which I created before
			menu();
			java.util.Date date = new java.util.Date(); // prints the current date and time
			System.out.println("Date and time: " + date);
			// sets select as the users input
			select = in.nextLine();
			if (select.equalsIgnoreCase("2")) {
				// print the instructions if the user enters 2
				instructions();
				in.nextLine();
				continue;

			}
			if (select.equalsIgnoreCase("1")) {
				// starts the game if the user enters 1
				island(); // ASCII art
				begin();// Slow print
				print("\nEnter any character to continue");
				in.nextLine();
			} else {
				// if the user enters an invalid character, print this
				separate();
				print("invalid entry, please try agian\n");
				continue;
			}

			print("\n");
			goal(); // print the goal of the game
			print("\nEnter any character to continue");
			in.nextLine();
			int task1 = 1;
			// creates a do while loop for the first task, if you fail anywhere in task 1,
			// you will restart here
			do {
				task1txt();
				print("");
				// makes the total points = to the points gained in task 1 part 1
				points = points + task1(points);
				// prints your total points
				System.out.println("Total points: " + points);
				// updates and prints the current date and time
				date = new java.util.Date();
				System.out.println("Date and time:" + date);
				print("");
				separate();

				// prints the text for task 1 part 2
				task1twotxt();
				print("");
				// creates a variable which is equal to the points gained in task 1 part 2
				int points2 = task1two(points);
				// if the points are equal to negative one, restart task 1, otherwise move on
				if (points2 == -1) {
					points = 0;
					continue;
				} else {
					// adds the points gained in task 1 part 2 to the total points
					points = points + points2;
					// prints date time and total points
					date = new java.util.Date();
					System.out.println("Date and time:" + date);
					System.out.println("Total points: " + points);
					print("");
					separate();
				}

				// prints the text for task 1 psrt3
				task1threetxt();
				print("");
				// variable that keeps track of points gained
				// (Same as last part)
				int points3 = task1three(points);
				if (points3 == -1) {
					points = 0;
					continue;
				} else {
					points = points + points3;
					date = new java.util.Date();
					System.out.println("Date and time:" + date);
					System.out.println("Total points: " + points);
					print("");
				}

				// (Same as last parts)
				int points4 = task1four(points);
				if (points4 == -1) {
					points = 0;
					continue;
				} else {
					points = points + points4;
					date = new java.util.Date();
					System.out.println("Date and time:" + date);
					System.out.println("Total points: " + points);
					print("");
					separate();
					break;
				}
			} while (task1 == 1);

			// Creates a variable which is used to run task 2 in a loop
			int task2 = 1;
			do {

				task2txt();
				int playerPoints = 0; // keeps track of the players points
				int sharkPoints = 0;// keeps track of the sharks points
				int lastRoll = 0; // keeps track of what the last roll was
				String winner = ""; // creates a variable for the winner of the game

				// while the points of the shark and the player are both below 60
				while (playerPoints < 60 && sharkPoints < 60) {
					separate();
					newTurn();// ASCII art
					separate();
					// updates date and time
					date = new java.util.Date();
					// prints date, time, player score, and the players last roll
					System.out.println("Date and time:" + date);
					System.out.println("Player Score: " + playerPoints);
					System.out.println("Shark Score: " + sharkPoints);
					System.out.println("Your Last roll: " + lastRoll);
					// prompts the player to roll
					print("It is your turn to roll. Press any key to roll");
					in.nextLine();
					int tempPscore = playerPoints;
					int play = 1; // allows the game to run in a loop

					while (play == 1) {

						// Rolls the dice
						int die = roll();;
						// tells the user what they rolled
						System.out.println("You rolled " + die + " points");
						// sets last roll to the last roll
						lastRoll = die;

						// if the player rolls a 1
						if (die == 1) {
							// they get 4 chances
							int wrongcount = 4;
							// creates a variable to keep track of if the user has failed
							boolean fail = false;
							print("You rolled a 1! Solve this math problem in order to continue to game.");
							// resets the players points
							playerPoints = 0;
							// uses the math method to generate a random math problem
							String ans = math();
							print("");
							String input = in.nextLine();

							// if the user gets the answer wrong
							while (!input.equals(ans)) {
								// reduce the amount of chances
								wrongcount--;
								// if the amount of chances the user gets reaches 0, they fail
								if (wrongcount == 0) {
									fail = true;
									break;
								}
								// print the amount of chances the user has left
								print("Incorrect! Try again");
								System.out.println("You have " + wrongcount + " tries remaining");
								input = in.nextLine();

							}

							// if the user failed, ask the m to play again or exit
							if (fail == true) {
								print("You failed! press any key to try again or type EXIT to exit the game.");
								String choiceFail = in.nextLine();

								if (choiceFail.equalsIgnoreCase("EXIT")) {
									print("Thank you for playing Escape The Island.");
									System.exit(0);
								} else {
									playerPoints = 0;
									sharkPoints = 0;
									lastRoll = 0;
									play = 2;
									break;
								}

							}
							// if the user gets the question correct, continue the game
							if (input.equals(ans)) {
								print("Correct! You can continue the game");
								break;

							}

						}

						// asks the user to roll or hold
						print("Do you want to roll (r) or hold (h)");
						String playerChoice = in.nextLine();
						// adds the number the player just rolled to their total points
						playerPoints += die;

						// if the player chooses to hold, move on to the shark loop
						if (playerChoice.equalsIgnoreCase("h")) {
							print("You chose to hold");
							if (playerPoints >= 60) {
								winner = "Player";
								break;
							} else {
								break;
							}
						}
						// if the player points is greater than or equal to 60, end the game
						if (playerPoints >= 60) {
							winner = "Player";
							break;
						}
					}
					if (play == 1) {
						print("It is now the sharks turn to roll");
					}
					int sharkRolls = 0;
					while (play == 1) {
						sharkRolls++;

						int sDie = roll();
						System.out.println("The Shark rolled " + sDie + "points");
						sharkPoints = sharkPoints + sDie;
						if (sDie == 1) {
							sharkPoints = 0;
							print("The shark solved his problem");
							break;

							// if the shark rolls up to 7 times, makes the shark hold
						}
						if (sharkRolls == 7) {
							// if the shark has more or equal to 60 points, end the game
							if (sharkPoints >= 60) {
								winner = "Shark";
								break;
							} else {
								print("The shark chose to hold");
								break;
							}
						}

					}

				}
				// print who the winner is
				System.out.println("\nThe winner is " + winner+"\n");
				// if the shark wins, the player fails. Ask them to try again or exit
				if (winner.equals("Shark")) {
					print("You Lost! press any key to try again or type EXIT to exit");
					String choiceFail = in.nextLine();

					// exit if the player chooses to exit
					if (choiceFail.equalsIgnoreCase("EXIT")) {
						print("Thank you for playing Escape The Island.");
						System.exit(0);
						// restart the game if the player chooses
					} else {
						playerPoints = 0;
						sharkPoints = 0;
						lastRoll = 0;
						continue;
					}
				} else {
					// if the player wins, display the winning text
					wintxt();
					print("");
					separate();
					congrats();
					System.out.println("\n\nTotal Points: " + points);
					// ask them to play again or exit
					print("\nEnter any key to play again\n\nEnter Exit to exit");
					String finalChoice = in.nextLine();
					if (finalChoice.equalsIgnoreCase("EXIT")) {
						print("Thank you for playing Escape The Island.");
						System.exit(0);
					} else {
						//prints the separate method and resets total points
						separate();
						points = 0;
						break;
					}

				}

			} while (task2 == 1);
		} while (start == 1);

	}
}
