package com.joydeep;

import org.springframework.batch.item.ItemProcessor;

import com.joydeep.model.Report;

public class CustomItemProcessor implements ItemProcessor<Report, Report> {

	public Report process(Report item) throws Exception {

		System.out.println("Processing..." + item);
		return item;
	}

}
