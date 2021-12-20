package com.example.user;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.pojo.Address;
import com.example.pojo.User;
import com.example.repo.UserRepositoryImpl;

@SpringBootTest
public class UserInsert {

	
	@Autowired
	UserRepositoryImpl userRepo;
	
	@Test 
	void insertUserTest()
	{
		User user = new User();
		
		user.setName("Ritika");
		user.setEmail("Ritika@neova.com");
		user.setPassword("Ritika123");
		user.setMobileNumber(9405405443l);
		
		
		userRepo.insertUser(user);
	}
	
	@Test 
	void selectUserTest()
	{
		User user ;
		user = userRepo.selectUser(41);
		System.out.println("User ID       :"+user.getUserId());
		System.out.println("User Name     :"+user.getName());
		System.out.println("User Email    :"+user.getEmail());
		System.out.println("User Password :"+user.getPassword());
		System.out.println("User Mobile   :"+user.getMobileNumber());
		
	}
	
	@Test
	void deleteUserTest()
	{
		User user = new User();
		user.getUserId();
		userRepo.deleteUser(45);
	}
	
	
	/*
	 
	@Test 
	void selectAllDeptTest()
	{
		List <Department> deptList;
		deptList = deptRepo.selectDepartments();
		for(Department dept : deptList)
		{
			System.out.println("Dept no   :"+dept.getDepartmentNumber());
			System.out.println("Dept name :"+dept.getDepartmentName());
			System.out.println("Dept loc  :"+dept.getDepartmentLocation());
		}
	}
	
	@Test 
	void updateDeptTest()
	{
		Department dept = new Department();
		dept.setDepartmentNumber(3);
		dept.setDepartmentName("QA");
		dept.setDepartmentLocation("Mumbai");
		
		deptRepo.updateDepartment(dept);
	}
	
	@Test
	void deleteDeptTest()
	{
		Department dept = new Department();
		dept.getDepartmentNumber();
		deptRepo.deleteDepartment(3);
	}
	
	/*
	@Test
	public void insertUserTest() {
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("MyJPA"); //persistence.xml is read here 

		System.out.println("Entity Manager Factory : "+entityManagerFactory);

		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		System.out.println("Entity Manager : "+entityManager);

		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();

			User user = new User();
			user.setName("AamirKhan");
			user.setEmail("Shubham@gmail.com");
			user.setPassword("Shubham123");
			user.setMobileNumber(9405405443l);

			entityManager.persist(user);
		
			transaction.commit();
	}
	
	@Test 
	void selectUserTest()
	{
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("MyJPA"); //persistence.xml is read here 

		System.out.println("Entity Manager Factory : "+entityManagerFactory);

		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		System.out.println("Entity Manager : "+entityManager);

		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();

//		User user = new User();
		Department dept ;
		dept = deptRepo.selectDepartment(2);
		System.out.println("Dept no   :"+dept.getDepartmentNumber());
		System.out.println("Dept name :"+dept.getDepartmentName());
		System.out.println("Dept loc  :"+dept.getDepartmentLocation());
	
		entityManager.persist(user);
		
		transaction.commit();
	}
	
	@Test 
	void selectAllUserTest()
	{
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("MyJPA"); //persistence.xml is read here 

		System.out.println("Entity Manager Factory : "+entityManagerFactory);

		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		System.out.println("Entity Manager : "+entityManager);

		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		
		List <Department> deptList;
		deptList = deptRepo.selectDepartments();
		for(Department dept : deptList)
		{
			System.out.println("Dept no   :"+dept.getDepartmentNumber());
			System.out.println("Dept name :"+dept.getDepartmentName());
			System.out.println("Dept loc  :"+dept.getDepartmentLocation());
		}
		
		entityManager.persist(user);
		
		transaction.commit();
	}
	
	@Test 
	void updateUserTest()
	{
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("MyJPA"); //persistence.xml is read here 

		System.out.println("Entity Manager Factory : "+entityManagerFactory);

		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		System.out.println("Entity Manager : "+entityManager);

		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		
		Department dept = new Department();
		dept.setDepartmentNumber(3);
		dept.setDepartmentName("QA");
		dept.setDepartmentLocation("Mumbai");
		
		deptRepo.updateDepartment(dept);
		
		entityManager.persist(user);
		
		transaction.commit();
	}
	
	@Test
	void deleteUserTest()
	{
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("MyJPA"); //persistence.xml is read here 

		System.out.println("Entity Manager Factory : "+entityManagerFactory);

		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		System.out.println("Entity Manager : "+entityManager);

		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		
		Department dept = new Department();
		dept.getDepartmentNumber();
		deptRepo.deleteDepartment(3);
		
		entityManager.persist(user);
		
		transaction.commit();
	}
	
	*/
}
