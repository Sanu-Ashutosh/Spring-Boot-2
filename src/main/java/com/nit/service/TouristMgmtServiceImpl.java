package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.entity.Tourist;
import com.nit.repositary.ITouristRepositary;

@Service
public class TouristMgmtServiceImpl implements ITouristMgmtService {
	@Autowired
	ITouristRepositary repo;

	@Override
	public List<Tourist> getAllTourist() {
		// TODO Auto-generated method stub
		List<Tourist> all = repo.findAll();
		// for sorting
		all.sort((t1, t2) -> t1.gettId().compareTo(t2.gettId()));
		return all;
	}

	@Override
	public String addTourist(Tourist tourist) {
		// TODO Auto-generated method stub
		Integer gettId = repo.save(tourist).gettId();
		return "Tourist " + tourist.gettName() + " is Regisrter with TID : " + gettId;
	}

	@Override
	public String updateTourist(Integer no, Tourist utourist) {
		// TODO Auto-generated method stub
		System.out.println(utourist);
		if(repo.existsById(no)) {
			
			Tourist obj = repo.getById(no);
			obj.setBudget(utourist.getBudget());
			obj.setEdDate(utourist.getEdDate());
			obj.setPackageType(utourist.getPackageType());
			obj.setStDate(utourist.getStDate());
			obj.settAdd(utourist.gettAdd());
			obj.settName(utourist.gettName());
			repo.save(obj);
			return "Tourist ID: " + no + " name: " + obj.gettName() + " is Updated successfully.";
		} else {
			return "!!!!!!!!!Tourist ID " + no + " is not Found...!!!!!!!!";
		}

	}

	@Override
	public String deleteByID(Integer no) {
		// TODO Auto-generated method stub
		if (repo.existsById(no)) {
			repo.deleteById(no);
			return "Tourist ID: " + no + " is Deleted successfully.";
		} else {
			return "Tourist ID " + no + " is not Found...";
		}
	}

}
