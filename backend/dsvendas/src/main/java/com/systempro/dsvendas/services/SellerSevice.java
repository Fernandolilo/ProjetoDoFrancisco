package com.systempro.dsvendas.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.systempro.dsvendas.dto.SellerDTO;
import com.systempro.dsvendas.entities.Seller;
import com.systempro.dsvendas.repositories.SellerRepository;

@Service
public class SellerSevice {

	@Autowired
	private SellerRepository repository;
	
	public List<SellerDTO> findAll(){
		List<Seller> result = repository.findAll();
		return result .stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
	}
	
	
}
