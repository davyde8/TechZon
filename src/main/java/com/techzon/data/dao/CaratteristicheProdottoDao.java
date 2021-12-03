package com.techzon.data.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techzon.data.entities.CaratteristicheProdotto;

@Repository
public interface CaratteristicheProdottoDao extends JpaRepository<CaratteristicheProdotto, Long>{

}
