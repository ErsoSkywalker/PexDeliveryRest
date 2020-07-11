package com.Beruon.PexDelivery.Services;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.jvnet.hk2.annotations.Service;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

import com.Beruon.PexDelivery.Entities.tblStatusEntity;
import com.Beruon.PexDelivery.Mapper.tblPymeMapper;
import com.Beruon.PexDelivery.dto.tblStatusDto;

@Component
public class tblStatusServices {

	private tblPymeMapper mapper = Mappers.getMapper(tblPymeMapper.class);
	
	@PostConstruct
	public void init() {
		
	}
	
	public ArrayList<tblStatusEntity> convertirDto(List<tblStatusDto> ListaStatusDto){
		ArrayList<tblStatusEntity> ListaStatusEntity = new ArrayList<>();
		for(tblStatusDto StatusDto : ListaStatusDto) {
			ListaStatusEntity.add(mapper.tblStatusDtoTotblStatusEntity(StatusDto));
		}
		return ListaStatusEntity;
	}
	
}
