package com.springhibinteg.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springhibinteg.dao.AddressDao;
import com.springhibinteg.dto.AddressDto;
import com.springhibinteg.entities.Address;

@Service
public class AddressService {
	@Autowired
	private AddressDao addressDao;

	@Transactional(readOnly = false)
	public int addAddress(AddressDto addressDto) {
		Address address = null;
		address = new Address();
		BeanUtils.copyProperties(addressDto, address);
		return addressDao.saveAddress(address);
	}

	@Transactional(readOnly = true)
	public AddressDto findAddress(int addressNo) {
		Address address = null;
		AddressDto addressDto = null;

		address = addressDao.getAddress(addressNo);
		addressDto = new AddressDto();
		BeanUtils.copyProperties(address, addressDto);
		return addressDto;
	}

	@Transactional(readOnly = true)
	public List<AddressDto> findAddressByCity(String city) {
		List<Address> addresses = null;
		List<AddressDto> addressDtos = null;

		addresses = addressDao.findAddressByCity(city);

		addressDtos = addresses.stream().map(address -> {
			AddressDto addressDto = new AddressDto();
			BeanUtils.copyProperties(address, addressDto);
			return addressDto;
		}).toList();
		return addressDtos;
	}
}
