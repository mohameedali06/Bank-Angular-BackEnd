package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.demo.model.User;

@Repository
public interface Userrepo extends JpaRepository<User,Integer>{

	public User findByEmailid(String emailid);
	public User findByEmailidAndPassword(String emailid,String password);

}
