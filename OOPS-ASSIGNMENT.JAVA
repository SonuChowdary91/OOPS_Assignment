import java.util.*;
class HotelManagement
{
	
	private int customerid;
	private String customername;
	private int age;
	private String gender;
	private String aadharno;
	private String phonno;
	private int advancepaid;
	private String nationality;
	HotelManagement(int customerid,String customername,int age,String gender,String aadharno,String phonno,int advancepaid,String nationality)
	{
		this.customerid=customerid;
		this.customername=customername;
		this.age=age;
		this.gender=gender;
		this.aadharno=aadharno;
		this.phonno=phonno;
		this.advancepaid=advancepaid;
		this.nationality=nationality;
	}
	public int getCustomerid()
	{
		return customerid;
	}
	public String getCustomerName()
	{
		return customername;
	}
	public int  getAge()
	{
		return age;
	}
	public String getGender()
	{
		return gender;
	}
	public String getAadharno()
	{
		return aadharno;
	}
	public String getPhonno()
	{
		return phonno;
	}
	public int advancePaid()
	{
		return advancepaid ;
	}
	public String getNationality()
	{
		return nationality;
	}
	public String toString()
	{
		return "Cust_id : "+customerid+" \n"+"Cust_name : "+customername+" \n"+"Age= : "+age+" \n"+"Gender : "+gender+" \n"+"Adharno : "+aadharno+" \n"+"Phon_num : "+phonno+" \n"+"Advance_paid : "+advancepaid+" \n"+"Nationality : "+nationality;
	}
}
class Manager
{
	public static void main(String args[])
	{
		List<HotelManagement> c=new ArrayList<HotelManagement>();
		int choice;
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		do
		{   
			System.out.println("--------------------------------------------------");
			System.out.println("1.Book a room");
			System.out.println("2.View customer information");
			System.out.println("3.Update customers details");
			System.out.println("4.Cancel a booking");
			System.out.println("5.View all bookings made");
			System.out.println("0.Exit");
			System.out.print("Enter your choice : ");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:
					System.out.print("Enter customer id : ");
					int customerid1=sc.nextInt();
					System.out.print("Enter customername : ");
					String cname=sc1.nextLine();
					System.out.print("Enter customer age : ");
					int age=sc.nextInt();
					System.out.print("Enter customer gender : ");
					String gender=sc1.nextLine();
					System.out.print("Enter customer aadhar number : ");
					String aadharno=sc1.nextLine();
					System.out.print("Enter customer phone number  : ");
					String phonno=sc1.nextLine();
					System.out.print("Enter advance payment made by customer : ");
					int advancepaid=sc.nextInt();
					System.out.print("Enter customer nationality : ");
					String nationality=sc1.nextLine();
					c.add(new HotelManagement(customerid1,cname,age,gender,aadharno,phonno,advancepaid,nationality));
				break;
				case 2:
					boolean found=false;
					System.out.print("Enter customer id : ");
					int customeridd=sc.nextInt();
					System.out.println("--------------------------------------------------");
				 	Iterator<HotelManagement> i=c.iterator();
					while(i.hasNext())
					{
						HotelManagement e=i.next();
						if(e.getCustomerid()==customeridd)
						{
							System.out.println(e);
							found=true;
						}
					}
					if(!found)
					{
						System.out.println("Record not found");
					}
					System.out.println("--------------------------------------------------");
					
				break;
				case 3:
					found=false;
					System.out.print("Enter customer id to update deatils : ");
					customeridd=sc.nextInt();
					System.out.println("--------------------------------------------------");
				 	ListIterator<HotelManagement>li=c.listIterator();
					while(li.hasNext())
					{
						HotelManagement e=li.next();
						if(e.getCustomerid()==customeridd)
						{
							System.out.print("Enter new customername : ");
							cname=sc1.nextLine();
							System.out.print("Enter new customer age : ");
							age=sc.nextInt();
							System.out.print("Enter updated customer gender : ");
							gender=sc1.nextLine();
							System.out.print("Enter new customer aadhar number : ");
							aadharno=sc1.nextLine();
							System.out.print("Enter new customer phone number  : ");
							phonno=sc1.nextLine();
							System.out.print("Enter new advance payment made by customer : ");
							advancepaid=sc.nextInt();
							System.out.print("Enter new customer nationality : ");
							nationality=sc1.nextLine();
							li.set(new HotelManagement(customeridd,cname,age,gender,aadharno,phonno,advancepaid,nationality));
							found=true;
						}
					}
					if(!found)
					{
						System.out.println("Record not found");
					}
					else
					{
						System.out.println("Information of customer has been succesfully updated");
					}
				break;
				case 4:
					found=false;
					System.out.print("Enter customer id whose booking to be cancelled : ");
					customeridd=sc.nextInt();
					System.out.println("--------------------------------------------------");
				 	i=c.iterator();
					while(i.hasNext())
					{
						HotelManagement e=i.next();
						if(e.getCustomerid()==customeridd)
						{
							i.remove();
							found=true;
						}
					}
					if(!found)
					{
						System.out.println("Record not found");
					}
					else
					{
						System.out.println("Booking cancelled successfully");
					}
					System.out.println("--------------------------------------------------");
				break;
				case 5:
					System.out.println("--------------------------------------------------");
					i=c.iterator();
					while(i.hasNext())
					{
						HotelManagement e=i.next();
						System.out.println(e);
					}
					System.out.println("--------------------------------------------------");
				break;
				
					
					
			}

			
		}
		while(choice!=0);
	}
}