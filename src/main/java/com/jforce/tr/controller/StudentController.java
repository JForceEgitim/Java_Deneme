package com.jforce.tr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jforce.tr.model.Student;
import com.jforce.tr.service.StudentDaoImpl;

@RestController
public class StudentController {
	@Autowired
	private StudentDaoImpl studentDaoImpl;

//**********************TÜM ÖĞRENCİ LİSTESİ**********************
	@RequestMapping(path = "/students", method = RequestMethod.GET)
	public ResponseEntity<List<Student>> getStudent() {
		return ResponseEntity.ok(studentDaoImpl.getStudentList());
	}

//**********************İD YE GÖRE ÖĞRENCİ GETİRME**********************
	@RequestMapping(path = "/student/{id}", method = RequestMethod.GET)
	public Student getStudentId(@PathVariable Integer id) {

		Student student = studentDaoImpl.getStudentByID(id);
		return student;
	}

//********************** ÖĞRENCİ SİL**********************
	@RequestMapping(path = "/student/{id}", method = RequestMethod.DELETE)
	public String delete(@PathVariable Integer id) {
		studentDaoImpl.delete(id);
		return "öğrenci silinmiştir";
	}

//********************** ÖĞRENCİ EKLEME**********************
	@RequestMapping(path = "/student/add", method = RequestMethod.POST)
	public String add(@RequestBody Student student) {
		studentDaoImpl.add(student);
		return "öğrenci ekleme tamamdır";
	}

//********************** ÖĞRENCİ UPDATE**********************
	@RequestMapping(path = "/student/delete", method = RequestMethod.PUT)
	public String update(@RequestBody Student student) {
		studentDaoImpl.update(student);
		return "öğrenci güncelleme tamamdır";
	}

}
