package org.hangover.dao;

import java.util.List;

import org.hangover.model.User;

public interface UserDao {
	
	public List<User> getUsersList();
	
	public List<User> getUsersFromCity(String cityName);
	
	public List<User> getUsersOfAge(Integer age);
	
	public User getUserOfId(Integer id);
	
	public void saveUser(User user);
	
	public void saveUserList(List<User> users);
	
	public void deleteUser(Integer id);
	
	public void deleteUsersOfCity(String cityName);
	
	public void deleteUsersOfAge(Integer age);
	
	public void deleteUserOfId(List<Integer> idList);

}
