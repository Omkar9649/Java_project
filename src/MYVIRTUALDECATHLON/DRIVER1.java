package MYVIRTUALDECATHLON;
/*TWO ERROR SOLVED

 * 1)NOW ABLE TO WRITE OWNER NAME 10 DIGIT-GIVE CONDITION 99999999 AND 999999999
 * 2)DIFFERENT METHOD GET CALL WHEN WE PRESS END SHOPPING.
 * METHODS GET CALL
 * 1)MAIN,2)PRICE OF SEASON,TENNIS BALL 3)CRICKET OPTIONS -BECAUSE OF BREAK WAS NOT THERE
 */

import java.util.*;

class OWNER
{
	private String name;
	private long phnum;
	public String getName() 
	{
		return name;
	}
	
	public long getPhnum() 
	{
		return phnum;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setPhnum(long phnum)
	{
		this.phnum = phnum;
	}
	
	
	/* CAN WE USE PRIVATE MEMBERS OF SUPER CLASS IN SUB CLASS?
	   ANS: NO. FOR EXPLANATION REFER LINE 153
	 */
}

class CUSTOMER
{   
	static ArrayList a= new ArrayList();
	
	Scanner cu=new Scanner(System.in);
	//use "cu" for general ref var of scanner
	//use cusname,cusnum for specific details
	//cus for CUSTOMER CLASS OBJECT CREATION
	public void cusName()
	{
		System.out.println("PLEASE ENTER YOUR NAME:");
		System.out.println("=============");
		String cusname=cu.nextLine();
		a.add(0,cusname);		
	}	
	public void cusNum()
	{
		 CUSTOMER  cus1=new CUSTOMER();
	  try 
	  {
		System.out.println("PLEASE ENTER YOUR MOBILE NUM:");
		System.out.println("=============");
		long cusnum=cu.nextLong();
		if (cusnum>999999999 && cusnum<9999999999l)
		{	
		a.add(1,cusnum);
		}
		else
		{
			cus1.cusNum();
		}
	  }
		
	  catch (InputMismatchException e1) 
	  {
		  System.out.println("PLEASE ENTER VALID MOBILE NUMBER:");
		  System.out.println("=============");
		 
		  cus1.cusNum();
		  
			
	  }
	 }
	
	public void cusEmail()
	{
		System.out.println("PLEASE ENTER YOUR EMAIL ID:");
		System.out.println("=============");
		Scanner cu1=new Scanner(System.in);
		String cusemail=cu1.nextLine();
		a.add(2,cusemail);		
	}
	
	public void cusAdd()
	{
		System.out.println("PLEASE ENTER YOUR ADDRESS:");
		System.out.println("=============");
		Scanner cu2=new Scanner(System.in);
		String cusadd=cu2.nextLine();
		a.add(3,cusadd);		
	}
	
	

	public void customerDetails()
	{
		CUSTOMER cus=new CUSTOMER();
	  cus.cusName();
	  cus.cusNum();
	  cus.cusEmail();
	  cus.cusAdd();
	  System.out.println("=============");
	  System.out.println("PLEASE CHECK YOUR DETAILS:");
	  System.out.println("NAME:"+a.get(0));
	  System.out.println("PHONE NUMBER:"+a.get(1));
	  System.out.println("EMAILID:"+a.get(2));
	  System.out.println("ADDRESS:"+a.get(3));
	  
	}
}	


interface PRICE1
{
	public void price();
}


class PRICE extends OWNER implements PRICE1
{
	//PRO: OBJECT  CREATION OF PRICE
	public void price()
    {
	   System.out.println("PLEASE ENTER ALL THE DETAILS BEFORE PAYMENT");
	   CUSTOMER cu1=new CUSTOMER();
	   OWNER OW=new OWNER();
	   cu1.customerDetails();
	   System.out.println("=============");
	   System.out.println("PAYMENT OPTIONS AVAILABLE");
	   System.out.println("1)UPI");
	   System.out.println("2)NET BANKING");
	   System.out.println("=============");
	   Scanner PR=new Scanner(System.in);
	   int pchoice=PR.nextInt();
	   switch (pchoice)
	   {
	       case 1:System.out.println("PAYMENT SUCCESSFUL");
                  System.out.println("YOU WILL SOON GET THE PRODUCT AT YOUR ADDRESS ");
                  System.out.println("ENJOY YOUR SPORT WITH THE PRODUCT");
                  System.out.println("=============");
                  Scanner PR1= new Scanner(System.in);
                  System.out.println("IF YOU WANT TO BUY MORE PRODUCT PRESS 1");
                  System.out.println("IF YOU ARE DONE WITH THE SHOPPING PRESS 2");
                 int pchoice1= PR1.nextInt();
                 if (pchoice1==1)
                 {
                	 DRIVER1.main(new String[0]);
         	       
			     }
               else if(pchoice1==2)
                { 
            	   OW.setName("OMKAR.B.GODAGE");
                   OW.setPhnum(702129557);
                   /*System.out.println("OWNER NAME:"+OW.name);*/
                   System.out.println("=============");
                   System.out.println("SHOP OWNER NAME:"+OW.getName());
                   System.out.println("SHOPE OWNER CONTACT NUMBER:"+OW.getPhnum());
                   System.out.println("=============");  
            	   System.out.println("THANK YOU FOR SHOPPING WITH US");
             	  System.out.println("HAVE A GREAT DAY!");
                 System.out.println("=============");  
                 
                
			    }
	              
		   break;
		   
	       case 2:System.out.println("PAYMENT SUCCESSFUL");
	              System.out.println("YOU WILL SOON GET THE PRODUCT AT YOUR ADDRESS ");
                  System.out.println("ENJOY YOUR SPORT WITH THE PRODUCT");
                  System.out.println("=============");
                  Scanner PR2= new Scanner(System.in);
                  System.out.println("IF YOU WANT TO BUY MORE PRODUCT PRESS 1");
                  System.out.println("IF YOU ARE DONE WITH THE SHOPPING PRESS 2");
                  int pchoice2= PR2.nextInt();
                  if (pchoice2==1)
                  {
                	  DRIVER1.main(new String[0]);
				  }
                  else if(pchoice2==2)
                  { 
                	  OW.setName("OMKAR.B.GODAGE");
                      OW.setPhnum(7021295575l);
                      System.out.println("=============");
                      System.out.println("SHOP OWNER NAME:"+OW.getName());
                      System.out.println("SHOP OWNER CONTACT NUMBER :"+OW.getPhnum());
                      System.out.println("=============");
                	  System.out.println("THANK YOU FOR SHOPPING WITH US");
                	  System.out.println("HAVE A GREAT DAY!");
                      System.out.println("=============");
                      
                     
                      
				  }
               
	       break;

	      default:System.out.println("PLEASE SELECT VALID OPTION");
	              PRICE1 PR3=new PRICE();//UPCASTING
	             
	              PR3.price();
	              
		   break;
	   }	   
	
    }
}



class Cricketbat 
{

	public void seasonBat() 
	{
		 
		Cricketbat  co2= new Cricketbat();
		 PRICE PRO2=new PRICE();
		System.out.println("1).BATTER HEIGHT:3ft-4ft");
		System.out.println("2).BATTER HEIGHT:4ft-5ft");
		System.out.println("3).BATTER HEIGHT:5ft-ABOVE");
		System.out.println("PLEASE CHOOSE YOUR HEIGHT RANGE FROM ABOVE LIST:");
		Scanner cr3=new Scanner(System.in);
		int choice3=cr3.nextInt();
		switch (choice3)
		{
		case 1:System.out.println("YOU HAVE SELECTED BATTER HEIGHT RANGE=3ft-4ft");
	           System.out.println("PRICE OF YOUR BAT IS  RS.1000");
	           System.out.println("PLEASE PRESS 1 TO BUY");
	           System.out.println("=============");
	           Scanner cr4=new Scanner(System.in);
	           int choice4=cr4.nextInt();
	           if (choice4==1) 
	           {
				   PRO2.price();
		       }
	           else
	           {   System.out.println("YOU HAVE SELECETED WRONG OPTION");
	               System.out.println("PLEASE FOLLOW THE PROCESS AGAIN");
	        	   co2.seasonBat();
	        	   
	           }
			break;
			
		case 2:System.out.println("YOU HAVE SELECTED BATTER HEIGHT RANGE=4ft-5ft");
               System.out.println("PRICE OF YOUR BAT IS  RS.1500");
               System.out.println("PLEASE PRESS 1 TO BUY");
               System.out.println("=============");
               Scanner cr5=new Scanner(System.in);
               int choice5=cr5.nextInt();
                if (choice5==1) 
               {
			     PRO2.price();
	           }
                 else
               {
                  System.out.println("YOU HAVE SELECETED WRONG OPTION");
  	              System.out.println("PLEASE FOLLOW THE PROCESS AGAIN");
     	          co2.seasonBat();
     	   
               }
		    break;
		    
		case 3:System.out.println("YOU HAVE SELECTED BATTER HEIGHT RANGE=5ft-ABOVE");
               System.out.println("PRICE OF YOUR BAT IS  RS.2000");
               System.out.println("PLEASE PRESS 1 TO BUY");
               Scanner cr6=new Scanner(System.in);
               int choice6=cr6.nextInt();
               if (choice6==1) 
              {
			    PRO2.price();
	           }
               else
              {
            	 System.out.println("YOU HAVE SELECETED WRONG OPTION");
	             System.out.println("PLEASE FOLLOW THE PROCESS AGAIN");
     	         co2.seasonBat();
     	   
              }
		       break;



		       default:System.out.println("PLEASE SELECT CORRECT OPTION");
                co2.seasonBat();
	         	break;
		}
		
}
	
	public void tennisBat() 
	{
		Cricketbat  co3= new Cricketbat();
		 PRICE PRO3=new PRICE();
		System.out.println("1).BATTER HEIGHT:3ft-4ft");
		System.out.println("2).BATTER HEIGHT:4ft-5ft");
		System.out.println("3).BATTER HEIGHT:5ft-ABOVE");
		System.out.println("PLEASE CHOOSE YOUR HEIGHT RANGE FROM ABOVE LIST:");
		
		
		Scanner cr7=new Scanner(System.in);
		int choice7=cr7.nextInt();
		switch (choice7)
		{
		case 1:System.out.println("YOU HAVE SELECTED BATTER HEIGHT RANGE=3ft-4ft");
	           System.out.println("PRICE OF YOUR BAT IS  RS.1000");
	           System.out.println("PLEASE PRESS 1 TO BUY");
	           System.out.println("=============");
	           Scanner cr8=new Scanner(System.in);
	           int choice8=cr8.nextInt();
	           if (choice8==1) 
	           {
				   PRO3.price();
		       }
	           else
	           {   System.out.println("YOU HAVE SELECETED WRONG OPTION");
	               System.out.println("PLEASE FOLLOW THE PROCESS AGAIN");
	        	   co3.tennisBat();
	        	   
	           }
			break;
			
		case 2:System.out.println("YOU HAVE SELECTED BATTER HEIGHT RANGE=4ft-5ft");
               System.out.println("PRICE OF YOUR BAT IS  RS.1500");
               System.out.println("PLEASE PRESS 1 TO BUY");
               System.out.println("=============");
               Scanner cr9=new Scanner(System.in);
               int choice9=cr9.nextInt();
                if (choice9==1) 
               {
			     PRO3.price();
	           }
                 else
               {
                  System.out.println("YOU HAVE SELECETED WRONG OPTION");
  	              System.out.println("PLEASE FOLLOW THE PROCESS AGAIN");
     	          co3.tennisBat();
     	   
               }
		    break;
		    
		case 3:System.out.println("YOU HAVE SELECTED BATTER HEIGHT RANGE=5ft-ABOVE");
               System.out.println("PRICE OF YOUR BAT IS  RS.2000");
               System.out.println("PLEASE PRESS 1 TO BUY");
               Scanner cr10=new Scanner(System.in);
               int choice10=cr10.nextInt();
               if (choice10==1) 
              {
			    PRO3.price();
	           }
               else
              {
            	 System.out.println("YOU HAVE SELECETED WRONG OPTION");
	             System.out.println("PLEASE FOLLOW THE PROCESS AGAIN");
     	         co3.tennisBat();
     	   
              }
		       break;



		       default:System.out.println("PLEASE SELECT CORRECT OPTION");
                co3.tennisBat();
	         	break;
	   }
	
	
	}
}

class Cricketball
{
	
	public void seasonBall() 
	{
		Cricketball co6=new Cricketball();
		PRICE PRO4=new PRICE();
		
		System.out.println("PRICE OF LEATHER BALL IS  RS.2000");
		System.out.println("PLEASE PRESS 1 TO BUY");
		System.out.println("=============");
		Scanner cr12=new Scanner(System.in);
		int choice12=cr12.nextInt();
		 if (choice12==1) 
         {
		    PRO4.price();
          }
          else
         {
       	    System.out.println("YOU HAVE SELECETED WRONG OPTION");
            System.out.println("PLEASE CHOOSE CORRECT OPTION");
            System.out.println("=============");
	         co6.seasonBall();
	   
         }
		
	}
	
	public void softtennisBall() 
	{
		Cricketball co7=new Cricketball();
		PRICE PRO5=new PRICE();
		
		System.out.println("PRICE OF SOFT TENNIS BALL IS  RS.60");
		System.out.println("PLEASE PRESS 1 TO BUY");
		System.out.println("=============");
		Scanner cr13=new Scanner(System.in);
		int choice13=cr13.nextInt();
		 if (choice13==1) 
         {
		    PRO5.price();
          }
          else
         {
       	    System.out.println("YOU HAVE SELECETED WRONG OPTION");
            System.out.println("PLEASE CHOOSE CORRECT OPTION");
            System.out.println("=============");
	         co7.softtennisBall();
	   
         }
		
	}
	
	public void hardtennisBall() 
	{
		Cricketball co8=new Cricketball();
		PRICE PRO6=new PRICE();
		
		System.out.println("PRICE OF HARD TENNIS BALL IS  RS.100");
		System.out.println("PLEASE PRESS 1 TO BUY");
		System.out.println("=============");
		Scanner cr14=new Scanner(System.in);
		int choice14=cr14.nextInt();
		 if (choice14==1) 
         {
		    PRO6.price();
          }
          else
         {
       	    System.out.println("YOU HAVE SELECETED WRONG OPTION");
            System.out.println("PLEASE CHOOSE CORRECT OPTION");
            System.out.println("=============");
	         co8.seasonBall();
	   
         }
		
	}
	
	
	
}

abstract class Gloves1
{
	abstract public void wicketKeeping();
	
}

class Gloves extends Gloves1
{
	
	//Scanner cr16= new Scanner(System.in);
	
	PRICE PRO7=new PRICE();
	@Override
	public void wicketKeeping() //override the method and use concept of abstraction
	{ 
		Gloves1 co10= new Gloves();
		
		Scanner cr16= new Scanner(System.in);
		System.out.println("PLEASE SELECT YOUR SUITABLE SIZE OF WICKETKEEPING GLOVES FROM FOLLOWING LIST:");
		System.out.println("1)SMALL(LENGTH-4.9 iN)");
		System.out.println("2)MEDIUM(LENGTH-5.9 iN)");
		System.out.println("3)LARGE(LENGTH-6.9 iN)");
		System.out.println("4)XLARGE(LENGTH-7.9 iN)");
		System.out.println("=============");
		int choice16=cr16.nextInt();
		switch (choice16) 
		{
		case 1:System.out.println("YOU CHOSE 'SMALL' SIZE");
		       System.out.println("PRICE OF YOUR GLOVES IS RS.600");
		       System.out.println("=============");
		       PRO7.price();
		 break;      
		
		case 2:System.out.println("YOU CHOSE 'MEDIUM' SIZE");
		       System.out.println("PRICE OF YOUR GLOVES IS RS.700");
		       System.out.println("=============");
	           PRO7.price();
	    break;
	    
		case 3:System.out.println("YOU CHOSE 'LARGE' SIZE");
		       System.out.println("PRICE OF YOUR GLOVES IS RS.800");
		       System.out.println("=============");
	           PRO7.price();
	    break;
	    
		case 4:System.out.println("YOU CHOSE 'XLARGE' SIZE");
		       System.out.println("PRICE OF YOUR GLOVES IS RS.900");
		       System.out.println("=============");
               PRO7.price();
        break;
	    
		default:System.out.println("INVALID SELECTION");
		        System.out.println("PLEASE CHOOSE CORRECT OPTION");
		        System.out.println("=============");
		        co10.wicketKeeping();
	    break;
		}
	}
	
	public void seasonGloves()
	{ 
		Scanner cr17= new Scanner(System.in);
		Gloves co11=new Gloves();
		System.out.println("PLEASE SELECT YOUR SUITABLE SIZE OF WICKETKEEPING GLOVES FROM FOLLOWING LIST:");
		System.out.println("1)SMALL(LENGTH-4.9 iN)");
		System.out.println("2)MEDIUM(LENGTH-5.9 iN)");
		System.out.println("3)LARGE(LENGTH-6.9 iN)");
		System.out.println("4)XLARGE(LENGTH-7.9 iN)");
		System.out.println("=============");
		int choice17=cr17.nextInt();
		switch (choice17) 
		{
		case 1:System.out.println("YOU CHOSE 'SMALL' SIZE");
		       System.out.println("PRICE OF YOUR GLOVES IS RS.650");
		       System.out.println("=============");
		       PRO7.price();
		 break;      
		
		case 2:System.out.println("YOU CHOSE 'MEDIUM' SIZE");
		       System.out.println("PRICE OF YOUR GLOVES IS RS.750");
		       System.out.println("=============");
	           PRO7.price();
	    break;
	    
		case 3:System.out.println("YOU CHOSE 'LARGE' SIZE");
		       System.out.println("PRICE OF YOUR GLOVES IS RS.850");
		       System.out.println("=============");
	           PRO7.price();
	    break;
	    
		case 4:System.out.println("YOU CHOSE 'XLARGE' SIZE");
		       System.out.println("PRICE OF YOUR GLOVES IS RS.950");
		       System.out.println("=============");
               PRO7.price();
        break;
	    
		default:System.out.println("INVALID SELECTION");
		        System.out.println("PLEASE CHOOSE CORRECT OPTION");
		        System.out.println("=============");
		        co11.seasonGloves();
	    break;
		}
	}
	
	public void tennisGloves()
	{ 
		Scanner cr18= new Scanner(System.in);
		Gloves co12=new Gloves();
		System.out.println("PLEASE SELECT YOUR SUITABLE SIZE OF WICKETKEEPING GLOVES FROM FOLLOWING LIST:");
		System.out.println("1)SMALL(LENGTH-4.9 iN)");
		System.out.println("2)MEDIUM(LENGTH-5.9 iN)");
		System.out.println("3)LARGE(LENGTH-6.9 iN)");
		System.out.println("4)XLARGE(LENGTH-7.9 iN)");
		System.out.println("=============");
		int choice18=cr18.nextInt();
		switch (choice18) 
		{
		case 1:System.out.println("YOU CHOSE 'SMALL' SIZE");
		       System.out.println("PRICE OF YOUR GLOVES IS RS.450");
		       System.out.println("=============");
		       PRO7.price();
		 break;      
		
		case 2:System.out.println("YOU CHOSE 'MEDIUM' SIZE");
		       System.out.println("PRICE OF YOUR GLOVES IS RS.500");
		       System.out.println("=============");
	           PRO7.price();
	    break;
	    
		case 3:System.out.println("YOU CHOSE 'LARGE' SIZE");
		       System.out.println("PRICE OF YOUR GLOVES IS RS.550");
		       System.out.println("=============");
	           PRO7.price();
	    break;
	    
		case 4:System.out.println("YOU CHOSE 'XLARGE' SIZE");
		       System.out.println("PRICE OF YOUR GLOVES IS RS.600");
		       System.out.println("=============");
               PRO7.price();
        break;
	    
		default:System.out.println("INVALID SELECTION");
		        System.out.println("PLEASE CHOOSE CORRECT OPTION");
		        System.out.println("=============");
		        co12.tennisGloves();
	    break;
		}
	}
	
	
}

class Helmate
{     
	public static void kidHelmate()
	{   PRICE PRO8= new PRICE();
		System.out.println("=============");
		System.out.println("PRICE OF YOUR KIDS CRICKET HELMATE IS RS.1499");
		System.out.println("=============");	
		PRO8.price();	
	}
	
	public  static void adultHelmate() 
	{
		PRICE PRO9= new PRICE();
		Scanner cr19=new Scanner(System.in);
		System.out.println("=============");
		System.out.println("PLEASE SELECT SIZE OF YOUR HELMATE");
		System.out.println("1).MEDIUM");
		System.out.println("2).LARGE");
		System.out.println("=============");
		int choice20=cr19.nextInt();
			switch (choice20) 
			{
			case 1:System.out.println("PRICE OF YOUR CRICKET HELMATE IS RS.1599");
				  PRO9.price();
		    break;

			case 2:System.out.println("PRICE OF YOUR CRICKET HELMATE IS RS.1599");
			       PRO9.price();
			break;   
			
			default:System.out.println("INVALID SELECTION");
	                System.out.println("PLEASE CHOOSE CORRECT OPTION");
	                System.out.println("=============");
	                adultHelmate();
				break;
			}
	}	
}

class Cricket 
{
	/* CO=OBJECT WE CREATED IN CRICKET FOR EVERY PRODUCT
	   CR=FOR SCANNER REF VARIABLE(FROM 1 TO WHAT EVERY IS THERE 
	   CHOICE=ASSIGNING USER INPUT OF SCANNER
	 */
	public void requirment ()
	{
		Gloves co9= new Gloves();
		Scanner cr1=new Scanner(System.in);
		System.out.println("PLEASE CHOOSE YOUR REQUIRMENT FROM FOLLOWING:");
		System.out.println("1).BAT");
		System.out.println("2).BALL");
	    System.out.println("3).GLOVES");
		System.out.println("4).HELMET");
		System.out.println("=============");
		Cricketbat co1=new Cricketbat();//OBJECT FOR BAT CLASS
		Cricketball co5=new Cricketball();//OBJECT FOR BALL CLASS
		
		Cricket co=new Cricket ();//OBJECT FOR CRICKET CLASS
		int choice = cr1.nextInt();
		if(choice==1)
		{
		  Scanner cr2=new Scanner(System.in);
	      System.out.println("PLEASE SELECT TYPE OF YOUR BAT: ");
		  System.out.println("1).SEASON ");
		  System.out.println("2).TENNIS");
		  System.out.println("=============");
		  int choice1=cr2.nextInt();
		  switch (choice1) 
		   {
		     case 1:System.out.println("BRAND AVAILABLE:FLX");
				    System.out.println("=============");
				    System.out.println("WE HAVE USED THE BEST ENGLISH WILLOW FOR THE EVERY BAT WE MANUFACTURE.");
				    System.out.println("WHICH IS SOFT AND LIGHTWEIGHT AS COMPARTED TO KASHMIR WILLOW.");
				    System.out.println("=============");
		    	    co1.seasonBat();
		            
			 break;
			 
		     case 2:System.out.println("BRAND AVAILABLE:FLX");
			        System.out.println("=============");
			        System.out.println("WE HAVE USED COMMON POPULAR WOOD .");
			        System.out.println("WHICH IS HIGHLY DURABLE AND IDEAL FOR SOFT AS WELL AS HARD TENNIS BALL CRICKET");
			        System.out.println("=============");
	    	        co1.tennisBat();
	    	  break;

		    default:System.out.println("=============");
		    	    System.out.println("YOU HAVE SELECTED WRONG OPTION ");
		            System.out.println("PLEASE FOLLOW THE PROCESS AGAIN");
		            System.out.println("=============");
			        co.requirment();
			 break;
		   }
		  
		} else if(choice==2)
		{
			Scanner cr11=new Scanner(System.in);
			System.out.println("PLEASE SELECT TYPE OF YOUR CRICKET BALL: ");
			System.out.println("1).SEASON BALL ");
		    System.out.println("2).SOFT TENNIS BALL");
		    System.out.println("3).HARD TENNIS BALL");
		    System.out.println("=============");
		    int choice11=cr11.nextInt();
			  switch (choice11) 
			   {
			     case 1:System.out.println("BRAND AVAILABLE:FLX");
					    System.out.println("=============");
					    System.out.println("WE PROVIDE THE SIZE OF LEATHER BALL ACCORDING TO STANDARDS SET BY ICC ");
					    System.out.println("=============");
			    	    co5.seasonBall();
			            
				 break;
				 
			     case 2:System.out.println("BRAND AVAILABLE:FLX");
				        System.out.println("=============");
				        System.out.println("WE HAVE DEVELOPED THIS SOFT TENNIS BALL FOR");
				        System.out.println("REGULAR USAGE IN GULLY'S,SMALL SPACES,OPEN GROUNDS");
				        System.out.println("=============");
		    	        co5.softtennisBall();
		    	 break;
		    	        
			     case 3:System.out.println("BRAND AVAILABLE:FLX");
			            System.out.println("=============");			            
			            System.out.println("WE HAVE DEVELOPED THIS HARD TENNIS BALL FOR REGULAR USAGE IN OPEN GROUNDS");
			            System.out.println("=============");
	    	            co5.hardtennisBall();
	    	     break;

			    default:System.out.println("=============");
			    	    System.out.println("YOU HAVE SELECTED WRONG OPTION ");
			            System.out.println("PLEASE FOLLOW THE PROCESS AGAIN");
			            System.out.println("=============");
				        co.requirment();
				 break;
			   }
			  
		}else if (choice==3) 
		{
			Scanner cr15=new Scanner(System.in);
		   System.out.println("PLEASE SELECT TYPE OF YOUR CRICKET GLOVES: ");
		   System.out.println("1).BATTING GLOVES(SEASON)");
		   System.out.println("2).WICKET KEEPING GLOVES");
		   System.out.println("3).GOLOVES FOR TENNIS CRICKET");
		   System.out.println("=============");
		   int choice15=cr1.nextInt();
		   switch (choice15)
		   {
		     case 1:System.out.println("BRAND AVAILABLE:FLX");
	                System.out.println("=============");			            
	                System.out.println("OUR TEAM OF ENGINEERS AND DESIGNERS DEVELOPED THIS TECHNICAL KEEPING GLOVES");
	                System.out.println("FOR REGULAR USAGE DURING CRICEKT PRACTICE AND COMPETITIVE MATCHES");
	                System.out.println("=============");
	               // co9.seasonGloves();
	                
			
			 break;
			 
		     case 2:System.out.println("BRAND AVAILABLE:FLX");
                    System.out.println("=============");			            
                    System.out.println("OUR TEAM OF ENGINEERS AND DESIGNERS DEVELOPED THIS TECHNICAL KEEPING GLOVES");
                    System.out.println("FOR REGULAR USAGE DURING CRICEKT PRACTICE AND COMPETITIVE MATCHES");
                    System.out.println("=============");
                    co9.wicketKeeping();
		
		 break;
		 
		     case 3:System.out.println("BRAND AVAILABLE:FLX");
                    System.out.println("=============");			            
                     System.out.println("OUR TEAM OF ENGINEERS AND DESIGNERS DEVELOPED THIS TECHNICAL KEEPING GLOVES");
                    System.out.println("FOR REGULAR USAGE DURING CRICEKT PRACTICE AND COMPETITIVE MATCHES");
                   System.out.println("=============");
                  co9.tennisGloves();
	
	     break;
			 

		default:System.out.println("=============");
			    System.out.println("YOU HAVE SELECTED WRONG OPTION ");
                System.out.println("PLEASE FOLLOW THE PROCESS AGAIN");
                System.out.println("=============");
                co.requirment();
			break;
		}
		   
	    }else if (choice==4) 
	    {
	    	Scanner cr19= new Scanner(System.in);
	    	
	    	System.out.println("PLEASE SELECT THE TYPE OF CRICKET HELMATE:");
	    	System.out.println("1).KID CRICEKT HELMATE(AGE-5 YEAR TO 14 YEAR)");
	    	System.out.println("2).ADULT CRICEKT HELMATE(AGE-14 YEAR AND ABOVE)");
	    	System.out.println("=============");
	        int choice19=cr19.nextInt();
	        
	        switch (choice19) 
	        { 
			  case 1:System.out.println("BRAND AVAILABLE:FLX");
                     System.out.println("=============");			            
                     System.out.println("OUR CRICKET PASSIONATE TEAM HAS DEVELOPED THIS LIGHT AND COMFORTABLE KIDS CRICKET HELMATE ");
                     System.out.println("TO PROTECT YOU WHILE YOU PLAY YOUR FIRST SHOT BY AGAINST LEATHER BALL ");
                     System.out.println("=============");
                     Helmate.kidHelmate();
				
				break;
				
			  case 2:System.out.println("BRAND AVAILABLE:FLX");
                     System.out.println("=============");			            
                    System.out.println("OUR CRICKET PASSIONATE TEAM HAS DEVELOPED THIS HELMATEN FOR ");
                     System.out.println("SAFE AND COMFORTABLE USAGE FOR REGULAR CRICKET PRACTICE");
                     System.out.println("=============");

               break;      
			  default:System.out.println("=============");
				      System.out.println("YOU HAVE SELECTED WRONG OPTION ");
                      System.out.println("PLEASE FOLLOW THE PROCESS AGAIN");
                      System.out.println("=============");
                      co.requirment();
				break;
			}
			
		}else if (choice!=1 ||choice!=2 ||choice!=3 ||choice!=4 )
		{
			System.out.println("PLEASE SELECT VALID INPUT ");
			 co.requirment();
			
		}
		
	}
	
}

	

public class DRIVER1 
{
	public static void main(String[]args) 
	{ 
		System.out.println("WELCOME TO VIRTUAL SPORTS SHOP");
		try 
		{
		 Scanner s=new Scanner(System.in);
		 System.out.println("CHOOSE YOUR PASSION SPORT FROM FOLLOWING SPORTS");
		 System.out.println("1).CRICKET");
		/* System.out.println("2).FOOTBALL");
		 System.out.println("3).HIKING");
		 System.out.println("4).TREKKING");
		 System.out.println("5).RUNNING");
		 System.out.println("6).SWIMMING");*/
		 System.out.println("=============");
		
		 int choice=s.nextInt();
		 if(choice==1)
		 {
			System.out.println("YOUR PASSION SPORT IS CRICKET");
			Cricket ref=new Cricket();
			ref.requirment();	
	     }else if (choice!=1)
	     {
	    	 System.out.println("INVALID SELECTION.");
	    	 System.out.println("PLEASE SELECT CORRECT OPTION.");
	    	 System.out.println("=============");
	    	 DRIVER1.main(new String[0]);
		 }
		}
		catch (InputMismatchException e)
		{
			System.out.println("INVALID INPUT");
			DRIVER1.main(new String[0]);
		}
		
	 }

}




