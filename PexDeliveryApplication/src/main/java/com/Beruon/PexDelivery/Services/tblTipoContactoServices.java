package com.Beruon.PexDelivery.Services;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

import com.Beruon.PexDelivery.dto.tblTipoContactoDto;
import com.Beruon.PexDelivery.Entities.tblTipoContactoEntity;
import com.Beruon.PexDelivery.Mapper.tblPymeMapper;

@Component
public class tblTipoContactoServices {

	private tblPymeMapper mapper = Mappers.getMapper(tblPymeMapper.class);
	
	@PostConstruct
	public void init() {
		
	}
	
	public ArrayList<tblTipoContactoEntity> convertirListaTipoContactoDto(List<tblTipoContactoDto> ListaTipos){
		ArrayList<tblTipoContactoEntity> TipoContactoEntities = new ArrayList<>();
		for(tblTipoContactoDto Iteraciones : ListaTipos) {
			TipoContactoEntities.add(mapper.tblTipoContactoDtoTotblTipoContactoEntity(Iteraciones));
		}
		return TipoContactoEntities;
	}
	
}
