package com.escalab.mediapp.service.impl;

import com.escalab.mediapp.entity.Examen;
import com.escalab.mediapp.repository.ExamenRepository;
import com.escalab.mediapp.service.ExamenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExamenServiceImpl implements ExamenService {
	
	@Autowired
	private ExamenRepository examenRepository;
	
	@Override
	public Examen save(Examen obj) {
		return examenRepository.save(obj);
	}
	
	@Override
	public Examen update(Examen obj) {
		return examenRepository.save(obj);
	}
	
	@Override
	public List<Examen> findAll() {
		return examenRepository.findAll();
	}
	
	@Override
	public Examen findById(Integer id)  {
		Optional<Examen> op = examenRepository.findById(id);
		/*if (!op.isPresent()) {
			throw new Exception("ID NO ENCONTRADO" + id);
		}*/
		return op.get();
	}
	
	@Override
	public boolean deleteById(Integer id) throws Exception {
		Optional<Examen> op = examenRepository.findById(id);
		if (!op.isPresent()) {
			throw new Exception("ID NO ENCONTRADO" + id);
		}
		examenRepository.deleteById(id);
		return true;
	}
}
