package com.Beruon.PexDelivery.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Beruon.PexDelivery.Assembler.tblPymeAssembler;
import com.Beruon.PexDelivery.Entities.tblPymeEntity;
import com.Beruon.PexDelivery.Mapper.tblPymeMapper;
import com.Beruon.PexDelivery.Repositories.tblPymeRepository;
import com.Beruon.PexDelivery.Repositories.tblStatusRepository;
import com.Beruon.PexDelivery.dao.MensajeDao;
import com.Beruon.PexDelivery.dto.tblPymeDto;
import com.Beruon.PexDelivery.dto.MensajeDto;

import jersey.repackaged.com.google.common.collect.Lists;

@Component
public class tblPymeServices {

	private tblPymeMapper mapper = Mappers.getMapper(tblPymeMapper.class);

	@Autowired
	private tblPymeAssembler tblPymeAssembler;
	
    @Autowired
    private tblPymeRepository tblPymeRepository;
    
    @Autowired
    private tblStatusRepository tblStatusRepository;
	
    @Autowired
    private MensajeDao MensajeDao;
    
	@PostConstruct
	public void init() {

	}

	public tblPymeDto crearPyme(tblPymeDto PymeDto) {
		tblPymeEntity Pyme = mapper.tblPymeDtoTotblPymeEntity(PymeDto);
    	Pyme.setStatusEntity(tblStatusRepository.findByEstatus("activo"));
    	tblPymeRepository.save(Pyme);
		return tblPymeAssembler.toResource(Pyme);
	}
	
	public List<tblPymeDto> getPymeByStatus(Integer idStatus) {
		ArrayList<tblPymeEntity> Pyme = Lists.newArrayList(tblPymeRepository.findByStatusEntity(tblStatusRepository.findOne(idStatus)));
    	return tblPymeAssembler.toResources(Pyme);
	}
	
	public tblPymeDto getPymeById(Integer idPyme) {
		tblPymeEntity Pyme = tblPymeRepository.findOne(idPyme);
		return tblPymeAssembler.toResource(Pyme);
	}
	
	public List<tblPymeDto> getListaPymes(){
		return tblPymeAssembler.toResources(Lists.newArrayList(tblPymeRepository.findAll()));
	}
	
	public MensajeDto cambiarStatusPyme(Integer idPyme) {
		return MensajeDao.cambiarStatusPyme(idPyme);
	}
	
	public MensajeDto editarPyme(Integer idPyme, String nombrePyme) {
		return MensajeDao.editarNombrePyme(idPyme, nombrePyme);
	}
	
}
