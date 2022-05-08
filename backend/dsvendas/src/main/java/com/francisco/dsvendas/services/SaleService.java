package com.francisco.dsvendas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.francisco.dsvendas.dto.SaleDTO;
import com.francisco.dsvendas.dto.SaleSuccessDTO;
import com.francisco.dsvendas.dto.SaleSumDTO;
import com.francisco.dsvendas.entities.Sale;
import com.francisco.dsvendas.repositories.SaleRepository;
import com.francisco.dsvendas.repositories.SellerRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository repository;

	@Autowired
	private SellerRepository sellerRepositoy;

	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageabe) {
		sellerRepositoy.findAll();
		Page<Sale> result = repository.findAll(pageabe);
		return result.map(x -> new SaleDTO(x));
	}

	@Transactional(readOnly = true)
	public List<SaleSumDTO> amountGroupedBySeller() {
		return repository.amountGroupedBySeller();
	}

	@Transactional(readOnly = true)
	public List<SaleSuccessDTO> successGroupedBySeller() {
		return repository.successGroupedBySeller();
	}

}
