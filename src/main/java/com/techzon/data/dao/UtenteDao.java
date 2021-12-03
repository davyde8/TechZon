package com.techzon.data.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techzon.data.entities.Utente;

@Repository
public interface UtenteDao extends JpaRepository<Utente, Long>{

}
