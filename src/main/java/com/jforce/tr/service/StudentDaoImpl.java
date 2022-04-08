package com.jforce.tr.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import com.jforce.tr.model.Student;

@Repository
public class StudentDaoImpl implements StudentDao {
	
	private Map<Integer, Student> studentMap = new HashMap<>();
	//spring conteinerda bu classtan nesne oluşurken ilk çağırılmasını istediğim method.
	@PostConstruct
	public void doldur() {
		Student student1 = new Student();
		student1.setId(1);
		student1.setFirstName("derya");
		student1.setLastName("bektaş");
		//---------------------------------
		Student student2 = new Student();
		student2.setId(2);
		student2.setFirstName("adem");
		student2.setLastName("güngen");
		//---------------------------------
		Student student3 = new Student();
		student3.setId(3);
		student3.setFirstName("serhat");
		student3.setLastName("yurdan");
		//---------------------------------
		Student student4 = new Student();
		student4.setId(4);
		student4.setFirstName("aysenur");
		student4.setLastName("aydogdu");
		//---------------------------------
		Student student5 = new Student();
		student5.setId(5);
		student5.setFirstName("mert");
		student5.setLastName("yiğit");
		//koleksiyona öğrencileri ekledim. ---------
		studentMap.put(student1.getId(), student1);
		//------------------------------------------
		studentMap.put(student2.getId(), student2);
		//------------------------------------------
		studentMap.put(student3.getId(), student3);
		//------------------------------------------
		studentMap.put(student4.getId(), student4);
		//------------------------------------------
		studentMap.put(student5.getId(), student5);
	}
	
	@Override
	public List<Student> getStudentList() {
		return new ArrayList<>(studentMap.values());
	}

	@Override
	public Student getStudentByID(Integer id) {
		return studentMap.get(id);
	}

	@Override
	public void add(Student student) {
		studentMap.put(student.getId(), student);
		System.out.println("öğrenci eklendi");
	}

	@Override
	public void update(Student student) {
		studentMap.replace(student.getId(), student);
		System.out.println("öğrenci güncellendi");
		
	}

	@Override
	public void delete(Integer id) {
		studentMap.remove(id);
		System.out.println("öğrenci silindi");
	}
	

}
