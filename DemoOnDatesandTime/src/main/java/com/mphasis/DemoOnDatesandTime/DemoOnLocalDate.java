package com.mphasis.DemoOnDatesandTime;

import java.time.LocalDate;

public class DemoOnLocalDate {

	public static void main(String[] args) {
		LocalDate today=LocalDate.now();
		System.out.println(today);
		System.out.println(today.getYear());
		System.out.println(today.getMonth());
		System.out.println(today.getMonthValue());
		System.out.println(today.getDayOfWeek());
		
		LocalDate mydate=LocalDate.of(2025, 6, 23);
		System.out.println(mydate);
		
		System.out.println("3 days ahead date is "+ today.plusDays(3));
		System.out.println("5 days before today is "+today.minusDays(5));
		
		LocalDate date1=LocalDate.of(2023, 5, 15);
		LocalDate date2=LocalDate.of(2020, 7, 24);
		System.out.println(date1.isBefore(date2));
		
		
		
	}
}
