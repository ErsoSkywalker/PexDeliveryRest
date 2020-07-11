package com.Beruon.PexDelivery.Assembler;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Beruon.PexDelivery.Entities.tblEmpleadosPymeEntity;
import com.Beruon.PexDelivery.Mapper.tblPymeMapper;
import com.Beruon.PexDelivery.Resources.tblEmpleadosPymeResource;
import com.Beruon.PexDelivery.dto.tblEmpleadosPymeDto;
import com.Beruon.PexDelivery.dto.tblPymeDto;
import com.Beruon.PexDelivery.dto.tblStatusDto;
@Component
public class tblEmpleadosPymeAssembler extends JaxRsResourceAssemblerSupport<tblEmpleadosPymeEntity, tblEmpleadosPymeDto>{

	@Autowired
	private tblStatusAssembler StatusAssembler;
	@Autowired
	private tblPymeAssembler PymeAssembler;
	
	private tblPymeMapper mapper = Mappers.getMapper(tblPymeMapper.class);

	public tblEmpleadosPymeAssembler() {
		super(tblEmpleadosPymeResource.class, tblEmpleadosPymeDto.class);
	}

	@Override
	public tblEmpleadosPymeDto toResource(tblEmpleadosPymeEntity entity) {
		tblEmpleadosPymeDto EmpleadosPyme = createResourceWithId(entity.getIdEmpleadosPyme(), entity);
		tblEmpleadosPymeDto result = mapper.tblEmpleadosPymeEntityTotblEmpleadosPymeDto(entity);
        tblStatusDto Status = StatusAssembler.toResource(entity.getStatusEntity());
        tblPymeDto Pyme = PymeAssembler.toResource(entity.getPymeEntity());
		result.add(EmpleadosPyme.getLinks());
		result.setStatusDto(Status);
		result.setPymeDto(Pyme);
		return result;
	}
	
	
	
	
}
