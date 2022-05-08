package com.yollanda.dsvendas.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yollanda.dsvendas.dto.SellerDTO;
import com.yollanda.dsvendas.entities.Seller;
import com.yollanda.dsvendas.repositories.SellerRepository;

@Service
public class SellerSevice {

	@Autowired
	private SellerRepository repository;

	public List<SellerDTO> findAll() {
		List<Seller> result = repository.findAll();
		return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
	}

}
