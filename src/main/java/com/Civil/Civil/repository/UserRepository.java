package com.Civil.Civil.repository;

import com.Civil.Civil.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


import java.util.List;


@Repository
public interface UserRepository extends JpaRepository<User,Long > {


    List<User> findAll();



}
