package com.example.repo;

import java.util.List;
import org.springframework.stereotype.Repository;

import com.example.pojo.User;

@Repository
public interface UserRepository // extends JpaRepository<User, Integer> {
{

	void insertUser(User uObj); // C

	User selectUser(int uID); // R

	List<User> selectUsers(); // RA

	void updateUser(User uObj); // U

	void deleteUser(int uID); // D

	// -----------------------//

}
