package com.rays.Until_Date;

import java.time.LocalDate;
import java.time.Period;

public class Age {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate dob  = LocalDate.of(2000,07,22);
		Period diff = Period.between(today, dob);
		System.out.println(diff);

	}

}
