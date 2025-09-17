package com.marvellous.MarvellousPortal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MarvellousPortalApplication
{

	public static void main(String[] args)
	{
		SpringApplication.run(MarvellousPortalApplication.class, args);
	}

}

// run method does 2 tasks
// 1 : start the server
// 2 : initialise the IOC COntainer