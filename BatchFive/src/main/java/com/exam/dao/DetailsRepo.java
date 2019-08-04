package com.exam.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exam.model.SecurityDetails;

@Repository
public interface DetailsRepo extends JpaRepository<SecurityDetails, Integer> {

}
