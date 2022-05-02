package textreader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class textreading {

	public static void main(String[] args) throws IOException {
// THE FOLLOWING COMMANDS CAN BE UNCOMMENTED TO WRITE TO THE FILES
		// FOR PERFORMACE REASONS(MAKES LITTLE DIFFERENCE) IT IS KEPT THIS WAY
		
		
//		// CREATED FILES TO STORE THE PHONE NUMBERS
//		// BASED ON THE SERVICE PROVIDERS
//		
//		File file = new File("MTEL.txt");
//		File file2 = new File("9MOBILE.txt");
//		File file3 = new File("GLOBACOM.txt");
//		File file4 = new File("AIRTEL.txt");
//		File file5 = new File("MTN.txt");
		File file6 = new File("SUMMRAY REPORT.txt");
		
//		//CREATED FILEWRITER OBJECT FOR THE FILES 
//		FileWriter fw = new FileWriter(file);
//		FileWriter fw2 = new FileWriter(file2);
//		FileWriter fw3 = new FileWriter(file3);
//		FileWriter fw4 = new FileWriter(file4);
//		FileWriter fw5 = new FileWriter(file5);
		FileWriter fw6 = new FileWriter(file6);
		
//		//CREATED PRINTWRITER FOR THE FILEWRITERS
//		PrintWriter pw = new PrintWriter(fw);
//		PrintWriter pw2 = new PrintWriter(fw2);
//		PrintWriter pw3 = new PrintWriter(fw3);
//		PrintWriter pw4 = new PrintWriter(fw4);
//		PrintWriter pw5 = new PrintWriter(fw5);
		
		PrintWriter pw6 = new PrintWriter(fw6);
		
//		//PRINTED THE HEADINGS OF THE FILES
//		pw.println("The MTEL PHONE NUMBERS");
//		pw.println("----------------------");
//		pw2.println("The 9MOBILE PHONE NUMBERS");
//		pw2.println("-------------------------");
//		pw3.println("The GLOBACOM PHONE NUMBERS");
//		pw3.println("--------------------------");
//		pw4.println("The AIRTEL PHONE NUMBERS");
//		pw4.println("------------------------");
//		pw5.println("The MTN PHONE NUMBERS");
//		pw5.println("----------------------");
		pw6.println("THE SUMMARY REPORT FOR THE PHONENUMBERS");
		pw6.println("---------------------------------------");
		//STRING PATH TO THE FILE CONTAINING THE PHONENUMBERS
		String path = "./PhoneNumbers.txt";
		
		//STRINGS TO HOLD AND MODIFY READ STRINGS
		String line = ""; 
		String line1 = "";
		String line2 = "";
	
		int i = 0, k = 0, l = 0, m = 0, n = 0, sum = 0;
		// i is the number of MTN numbers
		// k is the number of AIRTEL numbers
		// l is the number of GLOBAL numbers
		// m is the number of 9MOBILE numbers
		// n is the number of MTEL numbers
		// sum is the total number of phone numbers
	
		// STRING ARRAY FOR EACH NETWORK PROVIDERS
		String [] mtn = {"0703", "0706", "0803", "0806", "0810", "0813", "0814",
				"0816", "0903", "0906", "0913", "0916", "0704"};
		String [] mtn2 = {"07025", "07026"};
		String [] airtel = {"0701", "0708", "0802", "0808", "0812",
				"0901", "0902", "0904", "0907", "0912"};
		String [] globacom = {"0705", "0805", "0807", "0811",
				"0815", "0905", "0915"};
		String [] ninemobile = {"0809", "0817", "0818", "0909",
				"0908"};
		String [] mtel = {"0804"};
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			
			while((line = br.readLine()) != null){
				
				line1 = line.substring(0,4); //stores the first four digits
				line2 = line.substring(0,5); //stores the first five digits
				
				//comparing the first four or five with the string arrays
				//  declared above
				if (Arrays.asList(mtel).contains(line1)) {
					n = n + 1;
//					pw.println(line);
					
				}
				if (Arrays.asList(ninemobile).contains(line1)) {
					m = m + 1;
//					pw2.println(line);
				}
				if (Arrays.asList(globacom).contains(line1)) {
					l = l + 1;
//					pw3.println(line);
				}
				if (Arrays.asList(airtel).contains(line1)) {
					k = k + 1;
//					pw4.println(line);
				}
				if (Arrays.asList(mtn).contains(line1) || Arrays.asList(mtn2).contains(line2)) {
					 i = i + 1;
//					 pw5.println(line);
				}

				
			}
//			//Returning the sum of all the numbers at the end of each text file
//			pw.println("The total number of MTEL phone numbers: "+ n);
//			pw2.println("The total number of 9MOBILE phone numbers: "+ m);
//			pw3.println("The total number of GLOBACOM phone numbers: "+ l);
//			pw4.println("The total number of AIRTEL phone numbers: "+ k);
//			pw5.println("The total number of MTN phone numbers: "+ i);
			pw6.println("The total number of MTEL phone numbers: "+ n);
			pw6.println("The total number of 9MOBILE phone numbers: "+ m);
			pw6.println("The total number of GLOBACOM phone numbers: "+ l);
			pw6.println("The total number of AIRTEL phone numbers: "+ k);
			pw6.println("The total number of MTN phone numbers: "+ i);
			
//			//Close all files 
//			pw.close();
//			pw2.close();
//			pw3.close();
//			pw4.close();
//			pw5.close();
			pw6.close();
			
			//Returns sum of all numbers, also used to debugging the response returned.
			sum = k + l + m + n + i;
			System.out.println("The total number of AIRTEL phone numbers: " + k);
			System.out.println("The total number of MTN phone numbers: " + i);
			System.out.println("The total number of GLOBALCOM phone numbers: " + l);
			System.out.println("The total number of 9MOBILE phone numbers: " + m);
			System.out.println("The total number of MTEL phone numbers: " + n);
			System.out.println("The total number of phone numbers: " + sum);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

	}

	}
}
