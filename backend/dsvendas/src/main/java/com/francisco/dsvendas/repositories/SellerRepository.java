package com.francisco.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.francisco.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
