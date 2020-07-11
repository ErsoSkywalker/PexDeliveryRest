package com.Beruon.PexDelivery.Services;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Beruon.PexDelivery.Assembler.tblDireccionesPymeAssembler;
import com.Beruon.PexDelivery.Mapper.tblPymeMapper;
import com.Beruon.PexDelivery.Repositories.tblDireccionesPymeRepository;
import com.Beruon.PexDelivery.Repositories.tblPymeRepository;
import com.Beruon.PexDelivery.Repositories.tblStatusRepository;
import com.Beruon.PexDelivery.dao.MensajeDao;
import com.Beruon.PexDelivery.dto.MensajeDto;
import com.Beruon.PexDelivery.dto.tblDireccionesPymeDto;

import jersey.repackaged.com.google.common.collect.Lists;

import com.Beruon.PexDelivery.Entities.tblDireccionesPymeEntity;
@Component
public class tblDireccionesPymeServices {

	private tblPymeMapper mapper = Mappers.getMapper(tblPymeMapper.class);
	@Autowired
	private tblDireccionesPymeAssembler tblDireccionesPymeAssembler;
	
    @Autowired
    private tblDireccionesPymeRepository tblDireccionesPymeRepository;
    
    @Autowired
    private tblPymeRepository tblPymeRepository;
    
    @Autowired
    private tblStatusRepository tblStatusRepository;
    
    @Autowired 
    private MensajeDao MensajeDao;
    
    @PostConstruct
    public void init() {
    	
    }
    
    public tblDireccionesPymeDto createDireccionPyme(tblDireccionesPymeDto DireccionesPymeDto, Integer idPyme) {
    	tblDireccionesPymeEntity Entidad = mapper.tblDireccionesPymeDtoTotblDireccionesPymeEntity(DireccionesPymeDto);
    	Entidad.setStatusEntity(tblStatusRepository.findByEstatus("activo"));
    	Entidad.setPymeEntity(tblPymeRepository.findOne(idPyme));
    	tblDireccionesPymeRepository.save(Entidad);
    	return tblDireccionesPymeAssembler.toResource(Entidad);
    }
    
    public List<tblDireccionesPymeDto> getPymeAddressByidPyme(Integer idPyme) {
    	ArrayList<tblDireccionesPymeEntity> Direcciones = Lists.newArrayList(tblDireccionesPymeRepository.findByPymeEntity(tblPymeRepository.findOne(idPyme)));
    	return tblDireccionesPymeAssembler.toResources(Direcciones);
    }
    
    public List<tblDireccionesPymeDto> getAllPymes(){
    	List<tblDireccionesPymeEntity> Direcciones = Lists.newArrayList(tblDireccionesPymeRepository.findAll());
    	return tblDireccionesPymeAssembler.toResources(Direcciones);
    }
	
    public tblDireccionesPymeDto getPymeById(Integer idDireccionPyme) {
    	tblDireccionesPymeEntity Direccion = tblDireccionesPymeRepository.findOne(idDireccionPyme);
    	return tblDireccionesPymeAssembler.toResource(Direccion);
    }
    
    public Response cambiarStatusDireccionPyme(tblDireccionesPymeDto Dto) {
    	return (MensajeDao.cambiarStatusDireccionesPyme(Dto.getIdDireccionesPyme()).getMensaje().equalsIgnoreCase("0"))? Response.status(Status.NOT_MODIFIED.getStatusCode()).build() : Response.ok(tblDireccionesPymeRepository.findOne(Dto.getIdDireccionesPyme())).build();
    }
    
    public Response editarDireccionPyme(tblDireccionesPymeDto Dto) {
    	return (MensajeDao.editarDireccionesPyme(Dto).getMensaje().equalsIgnoreCase("0"))?Response.status(Status.NOT_FOUND.getStatusCode()).build():Response.ok(tblDireccionesPymeRepository.findOne(Dto.getIdDireccionesPyme())).build();
    }
    
}
