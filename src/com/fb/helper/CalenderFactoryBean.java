package com.fb.helper;

import java.util.Calendar;

import org.springframework.beans.factory.FactoryBean;

public class CalenderFactoryBean<Calender> implements FactoryBean<Calender>{

	private int day;
	private int month;
	private int year;
	
	public CalenderFactoryBean(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	@Override
	public Calender getObject() throws Exception {
		// TODO Auto-generated method stub
		Calendar cal=Calendar.getInstance();
		cal.set(2017, 10, 02);
		return (Calender) cal;
	}

	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return Calendar.class;
	}

	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return true;
	}
}
