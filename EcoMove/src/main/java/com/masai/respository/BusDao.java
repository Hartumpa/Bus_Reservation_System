package com.masai.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.entities.Bus;

@Repository
public interface BusDao extends JpaRepository<Bus, Integer>{

}
