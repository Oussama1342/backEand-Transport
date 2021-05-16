package com.express.transport.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.express.transport.entity.Colis;

@Repository
public interface ColisRepository extends JpaRepository<Colis, Integer> {

}
