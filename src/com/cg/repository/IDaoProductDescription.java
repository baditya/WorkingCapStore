package com.cg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.domain.ProductDescription;
@Repository
public interface IDaoProductDescription extends JpaRepository<ProductDescription,Long>{

}