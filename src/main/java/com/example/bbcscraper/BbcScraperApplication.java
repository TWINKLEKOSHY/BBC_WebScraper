package com.example.bbcscraper;

import com.example.bbcscraper.service.BBCScraperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BbcScraperApplication implements CommandLineRunner {

	@Autowired
	private BBCScraperService bbcScraperService;

	public static void main(String[] args) {
		SpringApplication.run(BbcScraperApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		bbcScraperService.scrapeAndSaveNews();
	}
}
