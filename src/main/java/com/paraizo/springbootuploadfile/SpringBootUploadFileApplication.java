package com.paraizo.springbootuploadfile;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.paraizo.springbootuploadfile.service.FilesStorageService;

@SpringBootApplication
public class SpringBootUploadFileApplication implements CommandLineRunner {
	@Resource
	FilesStorageService storageService;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootUploadFileApplication.class, args);
	}

	public void run(String... arg) throws Exception {
		// storageService.deleteAll();
		storageService.init();
	}

}
