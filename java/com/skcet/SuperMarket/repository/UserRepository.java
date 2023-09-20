package com.skcet.SuperMarket.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.skcet.SuperMarket.model.User;



public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);

	

	void save(org.apache.catalina.User user);
    
}
