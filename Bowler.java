package com.pkg1.scores;

import java.util.Scanner;

public class Bowler implements ScoreBoard
{
	//Created the two array for spin1 and spin2
	//Calculated and Kept the score in another array
	
	static int[] firstball =new int[10];
	static int[] secondball =new int[11];
	static int[] score =new int[11];
	static String[] frames = new String[12];
	
	static Scanner sc = new Scanner(System.in);
	
	//bonusVal() method been used to calculate the 10th frame.
	public  void bonusVal(int val)
	{
		for(int i=9;i<=9;i++)
		{
		if(val<=10)
		{
			System.out.println("enter the ball1");
			int a =sc.nextInt();
			if(a==10)
			{
				System.out.println("strike");
				firstball[i]=a;
				frames[i]="X";
				System.out.println("enter the ball2");
				secondball[i]=sc.nextInt();
				
				frames[i+1]=String.valueOf(secondball[i]);
				
				System.out.println("enter the ball3");
				secondball[i+1]=sc.nextInt();
				
				frames[i+2]=String.valueOf(secondball[i+1]);
			}
			else
			{
				firstball[i]=a;
				frames[i]=String.valueOf(firstball[i]);
				System.out.println("enter the ball2");
				secondball[i]=sc.nextInt();
				if(firstball[i]+secondball[i]==10)
				{
				frames[i+1]="|";
				}
				else
				{
					frames[i+1]=String.valueOf(secondball[i]);
					
					
				}
				System.out.println("enter the ball3");
				secondball[i+1]=sc.nextInt();
				frames[i+2]=String.valueOf(secondball[i+1]);
			}
			
			
		}
		}
		
	}
	
	//getScore[] method used for calculating the score of the each frame
	public  int getScore()
	{
		int ts =0;
		for(int i=0;i<=8;i++)
		{
			
			 if(firstball[i]==10 && secondball[i]==0)
			 {
				score[i]=ts+firstball[i] +firstball[i+1]+secondball[i+1];
				ts=score[i];
				//Consecutive Strike Calc
				if(secondball[i]==0&&secondball[i+1]==0&&secondball[i+2]==0)
				{
					score[i]=ts+10;
					ts=score[i];
				}
				else if(secondball[i]==0 && secondball[i+1]==0)
				{
					score[i]=ts+firstball[i+2];
					ts=score[i];
				}
				
			 }
			else if(firstball[i]+secondball[i]==10)
			{
				score[i]=ts+firstball[i]+secondball[i]+firstball[i+1];
				ts=score[i];
						
			}
			else
			{
				score[i]=ts+firstball[i]+secondball[i];
				ts=score[i];
			}
		}
		//10th frame Calc
		for(int i=9;i<=9;i++)
		{
			if(firstball[i]==10)
			{
				score[i] =ts+firstball[i]+secondball[i]+secondball[i+1];
				ts=score[i];
			}
			else if(firstball[i]+secondball[i]==10)
			{
				score[i]=ts+firstball[i] +secondball[i]+secondball[i+1];
				ts=score[i];
			}
			else
			{
				score[i]=ts +firstball[i]+secondball[i]+secondball[i+1];
				ts=score[i];
			}
		}
		
		
		return ts;
	}

	
	

	}


