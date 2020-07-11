package com.Beruon.PexDelivery.Assembler;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Beruon.PexDelivery.Entities.tblContactosPymeEntity;
import com.Beruon.PexDelivery.Mapper.tblPymeMapper;
import com.Beruon.PexDelivery.Resources.tblContactosPymeResource;
import com.Beruon.PexDelivery.dto.tblContactosPymeDto;
import com.Beruon.PexDelivery.dto.tblPymeDto;
import com.Beruon.PexDelivery.dto.tblStatusDto;
import com.Beruon.PexDelivery.dto.tblTipoContactoDto;
@Component
public class tblContactosPymeAssembler extends JaxRsResourceAssemblerSupport<tblContactosPymeEntity, tblContactosPymeDto> {

	@Autowired
	private tblStatusAssembler StatusAssembler;
	@Autowired
	private tblTipoContactoAssembler TipoContactoAssembler;
	@Autowired
	private tblPymeAssembler PymeAssembler;
	
	
	
	private tblPymeMapper mapper = Mappers.getMapper(tblPymeMapper.class);

	
	public tblContactosPymeAssembler() {
		super(tblContactosPymeResource.class, tblContactosPymeDto.class);
	}
	
	@Override
	public tblContactosPymeDto toResource(tblContactosPymeEntity entity) {
		tblContactosPymeDto ContactosPyme = createResourceWithId(entity.getIdContactoPyme(), entity);
		tblContactosPymeDto result = mapper.tblContactosPymeEntityTotblContactosPymeDto(entity);
        tblStatusDto Status = StatusAssembler.toResource(entity.getStatusEntity());
        tblPymeDto Pyme = PymeAssembler.toResource(entity.getPymeEntity());
        tblTipoContactoDto TipoContacto = TipoContactoAssembler.toResource(entity.getTipoContactoEntity());
		result.add(ContactosPyme.getLinks());
		result.setStatusDto(Status);
		result.setPymeDto(Pyme);
		result.setTipoContactoDto(TipoContacto);
		return result;
	}

	

}
