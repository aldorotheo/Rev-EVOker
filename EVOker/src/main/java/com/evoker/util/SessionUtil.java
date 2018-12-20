package com.evoker.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class SessionUtil {
	private static SessionFactory sessFactory;

	static {
		try
		{
				System.out.println("Getting Ready to Build");
				StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml")
				.applySetting("hibernate.connection.username", System.getenv("1811_postgres_username"))
				.applySetting("hibernate.connection.password", System.getenv("1811_postgres_password")).build();
				System.out.println("SSR Built");
				Metadata metaData = new MetadataSources(standardRegistry).getMetadataBuilder().build();
				System.out.println("Metadata built");
				sessFactory = metaData.getSessionFactoryBuilder().build();
				System.out.println("SessionFactory built");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Memes");
		}
	}

	public static Session getSession() {
		return sessFactory.openSession();
	}
}