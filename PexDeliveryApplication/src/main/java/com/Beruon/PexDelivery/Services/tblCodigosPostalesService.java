package com.Beruon.PexDelivery.Services;

import java.util.ArrayList;

import javax.ws.rs.core.Response;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Beruon.PexDelivery.Assembler.tblCodigosPostalesAssembler;
import com.Beruon.PexDelivery.Entities.tblCodigosPostalesEntity;
import com.Beruon.PexDelivery.Mapper.tblPymeMapper;
import com.Beruon.PexDelivery.Repositories.tblCodigosPostalesRepository;
import com.Beruon.PexDelivery.dto.tblCodigosPostalesDto;

import jersey.repackaged.com.google.common.collect.Lists;
@Component
public class tblCodigosPostalesService {

	private tblPymeMapper mapper =  Mappers.getMapper(tblPymeMapper.class);
	
	@Autowired
	private tblCodigosPostalesAssembler tblCodigosPostalesAssembler;
	
    @Autowired
    private tblCodigosPostalesRepository tblCodigosPostalesRepository;
	
    public Response getCodigosPostales() {
    	ArrayList<tblCodigosPostalesEntity> CodigosPostales = Lists.newArrayList(tblCodigosPostalesRepository.findAll());
    	return Response.ok(tblCodigosPostalesAssembler.toResources(CodigosPostales)).build();
    }
    
    public Response getCodigoPostalById(Integer idCodigoPostal) {
    	tblCodigosPostalesEntity CodigoPostal = tblCodigosPostalesRepository.findOne(idCodigoPostal);
    	return Response.ok(tblCodigosPostalesAssembler.toResource(CodigoPostal)).build();
    }
    
    public Response agregarCodigoPostal(tblCodigosPostalesDto Dto) {
    	tblCodigosPostalesEntity CodigoPostal = mapper.tblCodigosPostalesDtoTotblCodigosPostalesEntity(Dto);
    	tblCodigosPostalesRepository.save(CodigoPostal);
    	return Response.ok(tblCodigosPostalesAssembler.toResource(CodigoPostal)).build();
    }
    
}
