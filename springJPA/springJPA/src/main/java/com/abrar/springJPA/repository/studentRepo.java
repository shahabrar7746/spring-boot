package com.abrar.springJPA.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.abrar.springJPA.entities.student;

import jakarta.transaction.Transactional;

@Repository
public interface studentRepo extends JpaRepository<student,Integer>{
	public List<student> findByName(String name);
	public List<student> findByNameContaining(String ch);
	
	public List<student> findByNameNotNull();
	public List<student> findByIdLessThan(int id);
	
	@Query("select s from student s where s.id = ?1")
	public student getById(int id);
	@Query("select s.studentEmail from student s where s.id = ?1")
	public String getEmailById(int id);
	
	@Query(value = "SELECT * from student s where s.student_id = ?1",
			nativeQuery = true)
	public student getEmailByIdUsingNativeQueries(int id);
	
	//Native Named Param
	@Query(value = "SELECT * from student s where s.student_id = :id",
			nativeQuery = true)
	public student getEmailByIdUsingNativeQueriesNativeNamedParam(@Param("id") int id);
	
	@Modifying
	@Transactional
	@Query(value = "update student set student_email = :email where student_id = :id",
			nativeQuery = true)
	public void updateEmailById(@Param("id") int id, @Param("email") String email);
	
	
//	public List<student> findByGuardianname(String name);

}
