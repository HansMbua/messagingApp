package io.javabrains;

import io.javabrains.inbox.Folder;
import io.javabrains.repository.FolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@SpringBootApplication
@RestController
public class InboxApp {

	@Autowired
	FolderRepository folderRepository;


	public static void main(String[] args) {
		SpringApplication.run(InboxApp.class, args);
	}

	@PostConstruct
	public void init(){
		Folder folder = new Folder("Iv1.c3e45e5991da6530","inbox","red");
		Folder folder1= new Folder("Iv1.c3e45e5991da6530","sent","gray");
		Folder folder2 = new Folder("Iv1.c3e45e5991da6530","important","blue");

		folderRepository.save(folder);
		folderRepository.save(folder1);
		folderRepository.save(folder2);

	}




}
