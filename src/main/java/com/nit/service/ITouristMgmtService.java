package com.nit.service;

import java.util.List;

import com.nit.entity.Tourist;

public interface ITouristMgmtService {
	public List<Tourist> getAllTourist();
	public String addTourist(Tourist tourist);
	public String updateTourist(Integer no,Tourist tourist);
	public String deleteByID(Integer no);
}
