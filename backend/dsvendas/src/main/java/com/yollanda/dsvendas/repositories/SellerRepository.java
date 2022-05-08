package com.yollanda.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yollanda.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
