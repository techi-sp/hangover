package org.hangover.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.transaction.Transactional;
import org.hangover.dao.UserDao;
import org.hangover.model.User;
import org.springframework.stereotype.Repository;

@Transactional
@Repository
public class UserDaoImpl implements UserDao{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<User> getUsersList() {
		CriteriaQuery<User> criteriaQuery = entityManager.getCriteriaBuilder().createQuery(User.class);
		criteriaQuery.select(criteriaQuery.from(User.class));
		return entityManager.createQuery(criteriaQuery).getResultList();
	}

	@Override
	public List<User> getUsersFromCity(String cityName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getUsersOfAge(Integer age) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserOfId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveUserList(List<User> users) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUsersOfCity(String cityName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUsersOfAge(Integer age) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUserOfId(List<Integer> idList) {
		// TODO Auto-generated method stub
		
	}

}
