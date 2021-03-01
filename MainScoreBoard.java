package com.pkg1.scores;

public class MainScoreBoard extends Bowler
{
	
	public static void main(String[] args) 
	{
		
		
		Bowler Bowl = new Bowler();
		int bonus=0;
		for(int i=0;i<=8;i++)
		{
			System.out.println("Frame No is..." + i);
	
			
			
			System.out.println("Enter the Firstball...");
			int value1 = sc.nextInt();
			if(value1==10)
			{
				System.out.println("IT'S IS A STRIKE");
				System.out.println("......");
				firstball[i]=value1;
				secondball[i]=0;
				frames[i]="X";
				 bonus++;
			}
			else
			{
				System.out.println("Enter the SecondBall...");
				int value2 = sc.nextInt();
				firstball[i]=value1;
				secondball[i]=value2;
				if(firstball[i]+secondball[i]==10)
				{
					System.out.println("IT'S A SPARE...");
					System.out.println("............");
					frames[i] =value1 + " " +"/";
					
				}
				else
				{
					frames[i] =value1 + " "+value2;
				}
				
			}
		}
		
			Bowl .bonusVal(bonus);
			
			
			System.out.println("FINAL OUTPUT IS..");
			System.out.println();
			
			for(int i=0;i<=9;i++)
			{
				
				System.out.print("FirstBall is :" +i + " = " + firstball[i] + " | ");
				
			}
			System.out.println();
			System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			for(int i=0;i<=10;i++)
			{
				
				System.out.print("Secondball is :"+ i  +" = "+secondball[i] + " | ");
				
			}
			System.out.println();
			System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------");
			
			
			int scoreval=Bowl.getScore();
			
			System.out.println(" STRUCTURE Of BOWLER FRAMES");
			System.out.println();
			for(int k=0;k<=11;k++)
			{
				System.out.print(frames[k] + " | " + " ");
			}
			
			System.out.println();
			System.out.println("...............................................................................................................................................");
			for(int i=0;i<=9;i++)
			{
				System.out.print("Scorevalus is :"+i + " = " +score[i]+" | ");
			}
			System.out.println();
			System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------");
			
			System.out.println("Total score is..." + scoreval);
			
			
		}

	}





