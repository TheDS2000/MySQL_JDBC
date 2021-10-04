import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {

		
			ConnectComponent comp = new ConnectComponent();

			Scanner sc=new Scanner(System.in);
			if (comp.tryConnection()) {
				System.out.println("College Database:");
				System.out.println("The attempt to Connection was a SUCCESS");
				
			} else {
				System.out.println("Demo m2c1:");
				System.out.println("The attempt to Connection FAILED");
			}
			while(true)
			{
				System.out.println("MENU : ");
				System.out.println("1. Display Teacher table");
				System.out.println("2. Insert Into Teacher table");
				System.out.println("3. Update Teacher table");
				System.out.println("4. Delete From Teacher table");
				System.out.println("Enter Your Choice : ");
				int ch=sc.nextInt();
				
				switch(ch)
				{
				case 1:comp.printTeachers();
				break;
				case 2:comp.insertTeachers();
				break;
				case 3:comp.updateTeachers();
				break;
				case 4:comp.deleteTeachers();
				break;
				}
				
			}
			
		
	}

}

/*Result:
 * College Database:
The attempt to Connection was a SUCCESS
MENU : 
1. Display Teacher table
2. Insert Into Teacher table
3. Update Teacher table
4. Delete From Teacher table
Enter Your Choice : 
1
ID: 1, Name: Sushmita Pathak, Subject: Science, Salary: 10000
ID: 2, Name: Neha Mandge, Subject: History, Salary: 10000
ID: 4, Name: Dinesh Shaha, Subject: English, Salary: 15000
ID: 5, Name: Simar Seth, Subject: Maths, Salary: 20000
ID: 8, Name: Rajesh Shaha, Subject: English, Salary: 25000
ID: 100, Name: Sonali sharma, Subject: Hindi, Salary: 18000
MENU : 
1. Display Teacher table
2. Insert Into Teacher table
3. Update Teacher table
4. Delete From Teacher table
Enter Your Choice : 
3
Enter id to update : 
Id : 
100
Name : 
Sonakshi
Subject : 
English
Salary : 
10000
Updating records into the table...
Updated record into the table...
MENU : 
1. Display Teacher table
2. Insert Into Teacher table
3. Update Teacher table
4. Delete From Teacher table
Enter Your Choice : 
1
ID: 1, Name: Sushmita Pathak, Subject: Science, Salary: 10000
ID: 2, Name: Neha Mandge, Subject: History, Salary: 10000
ID: 4, Name: Dinesh Shaha, Subject: English, Salary: 15000
ID: 5, Name: Simar Seth, Subject: Maths, Salary: 20000
ID: 8, Name: Rajesh Shaha, Subject: English, Salary: 25000
ID: 100, Name: Sonakshi, Subject: English, Salary: 10000
MENU : 
1. Display Teacher table
2. Insert Into Teacher table
3. Update Teacher table
4. Delete From Teacher table
Enter Your Choice : 
2
Enter values to insert : 
Id : 
12
Name : 
Megha
Subject : 
Science
Salary : 
5000
Inserting records into the table...
Inserted records into the table...
MENU : 
1. Display Teacher table
2. Insert Into Teacher table
3. Update Teacher table
4. Delete From Teacher table
Enter Your Choice : 
4
Enter id to delete : 
Id : 
100
Deleted record from the table...
MENU : 
1. Display Teacher table
2. Insert Into Teacher table
3. Update Teacher table
4. Delete From Teacher table
Enter Your Choice : 
1
ID: 1, Name: Sushmita Pathak, Subject: Science, Salary: 10000
ID: 2, Name: Neha Mandge, Subject: History, Salary: 10000
ID: 4, Name: Dinesh Shaha, Subject: English, Salary: 15000
ID: 5, Name: Simar Seth, Subject: Maths, Salary: 20000
ID: 8, Name: Rajesh Shaha, Subject: English, Salary: 25000
ID: 12, Name: Megha, Subject: Science, Salary: 5000
MENU : 
1. Display Teacher table
2. Insert Into Teacher table
3. Update Teacher table
4. Delete From Teacher table
Enter Your Choice : 
*/
