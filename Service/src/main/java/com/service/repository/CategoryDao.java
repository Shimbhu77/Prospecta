package com.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.service.model.Category;

@Repository
public interface CategoryDao extends JpaRepository<Category, Integer> {

}
