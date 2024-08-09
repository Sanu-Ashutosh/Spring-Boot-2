package com.nit.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.entity.Tourist;

public interface ITouristRepositary  extends JpaRepository<Tourist,Integer>{

}
