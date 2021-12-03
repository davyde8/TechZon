package com.techzon.data.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techzon.data.entities.Premio;

@Repository
public interface PremioDao extends JpaRepository<Premio, Long> {

}
