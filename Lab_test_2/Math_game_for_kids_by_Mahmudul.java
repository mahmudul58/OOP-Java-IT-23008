///Mahmudul(ID:IT23008)
import java.io.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Math_game_for_kids_by_Mahmudul{
	public static void main(String[] args)
		throws IOException
	{
		File inputFile = new File("gameinput.txt");

		File outputFile = new File("gameoutput.txt");

            PrintWriter writer = new PrintWriter(outputFile);
			Scanner sc =new Scanner(System.in);
		writer.println("Name      Level        Score          Submission Time");
		while(true){
			System.out.print("Enter your name (If you don't paly the game press zero): ");
			String name;
			name=sc.next();
			if(name.charAt(0)=='0') break;
			writer.print(name+"        ");
			System.out.println("Welcome "+name+"\nSelect the level you want to play...");
            System.out.println("For \"Easy\"->1\nFor \"Medium\"->2\nFor \"Hard\"->3");
            System.out.print("Enter the level you want to play : ");
		    int level=sc.nextInt();
			writer.print(level+"        ");
			int score=0,totalScore=0;;
			Scanner file = new Scanner(inputFile);

		 while (file.hasNext()) {

			String qn=file.next();
			String disQn="";
			int ans=0,marks=0;
			for(int i=0;i<qn.length();i++){
				if(qn.charAt(i)!='=') disQn+=qn.charAt(i);
				else if(qn.charAt(i)=='='){
					ans=qn.charAt(i+1)-'0';
					marks=qn.charAt(i+3)-'0';
					totalScore+=marks;
					break;
				}
			}
			disQn+="=?";
			System.out.println(disQn);
			int givenAns=sc.nextInt();
			if(givenAns==ans) score+=marks;
		}
		file.close();
		// Record the submission time
        String time = LocalTime.now().format(DateTimeFormatter.ofPattern("h:mm a"));
		writer.print(score+" out of "+totalScore+"         ");
		writer.println(time);	
	}
		sc.close();
		writer.close();
}
}
