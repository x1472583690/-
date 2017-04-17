import java.util.*;
import java.text.*;
import java.io.*;

 class BJtese{
	public static void main (String [] args){
		//
		SimpleDateFormat form = new SimpleDateFormat("yyyy/MM/dd EEE",Locale.ENGLISH);  
		Calendar cal = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		System.out.println("==================================");
		
		Date date1=cal.getTime();
		System.out.println(cal.getTime());
		
		cal2.set(1990,12,5);
		Date date2=cal2.getTime();
		System.out.println(form.format(cal2.getTime()));
		
		long day =date1.getTime() - date2.getTime();
		long time = 1000*24*3600;
		int result=(int)(day/time);
		
		System.out.println("DATE="+result);
		
		
		int [] A= new int[20];
		for(int i=0;i<20;i++){
			A[i]=(int)(Math.random()*3)+1;
		}
		for(int i:A){
			System.out.printf(" %d",i);
			//System.out.println();
		
		}

	}
}