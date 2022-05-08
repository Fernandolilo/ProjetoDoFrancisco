package com.systempro.dsvendas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.systempro.dsvendas.dto.SaleDTO;
import com.systempro.dsvendas.dto.SaleSuccessDTO;
import com.systempro.dsvendas.dto.SaleSumDTO;
import com.systempro.dsvendas.entities.Sale;
import com.systempro.dsvendas.repositories.SaleRepository;
import com.systempro.dsvendas.repositories.SellerRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository repository;
	
	
	@Autowired
	private SellerRepository sellerRepositoy;
	
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageabe){
		sellerRepositoy.findAll();
		Page<Sale> result = repository.findAll(pageabe);
		return result.map(x -> new SaleDTO(x));
	}
	
	@Transactional(readOnly = true)
	public  List<SaleSumDTO> amountGroupedBySeller(){		
		return repository.amountGroupedBySeller();		
	}
	
	@Transactional(readOnly = true)
	public  List<SaleSuccessDTO> successGroupedBySeller(){		
		return repository.successGroupedBySeller();		
	}
	
}
