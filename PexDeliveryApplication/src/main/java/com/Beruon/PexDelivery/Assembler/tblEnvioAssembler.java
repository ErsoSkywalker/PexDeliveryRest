package com.Beruon.PexDelivery.Assembler;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Beruon.PexDelivery.Entities.tblEnvioEntity;
import com.Beruon.PexDelivery.Mapper.tblPymeMapper;
import com.Beruon.PexDelivery.Resources.tblEnvioResource;
import com.Beruon.PexDelivery.dto.tblDireccionEnvioDto;
import com.Beruon.PexDelivery.dto.tblEnvioDto;
import com.Beruon.PexDelivery.dto.tblMensajeroDto;
import com.Beruon.PexDelivery.dto.tblPersonaDto;
import com.Beruon.PexDelivery.dto.tblProductosDto;
import com.Beruon.PexDelivery.dto.tblPymeDto;
import com.Beruon.PexDelivery.dto.tblStatusDto;
import com.Beruon.PexDelivery.dto.tblTamanoDto;
@Component
public class tblEnvioAssembler extends JaxRsResourceAssemblerSupport<tblEnvioEntity, tblEnvioDto>{

	@Autowired
	private tblStatusAssembler StatusAssembler;
	@Autowired
	private tblPymeAssembler PymeAssembler;
	@Autowired
	private tblTamanoAssembler TamanoAssembler;
	@Autowired
	private tblPersonaAssembler PersonaAssembler;
	@Autowired
	private tblDireccionEnvioAssembler DireccionEnvioAssembler;
	@Autowired
	private tblProductosAssembler ProductoAssembler;
	@Autowired
	private tblMensajeroAssembler MensajeroAssembler;
	
	
	private tblPymeMapper mapper = Mappers.getMapper(tblPymeMapper.class);

	public tblEnvioAssembler() {
		super(tblEnvioResource.class, tblEnvioDto.class);
	}

	@Override
	public tblEnvioDto toResource(tblEnvioEntity entity) {
		tblEnvioDto Envio = createResourceWithId(entity.getIdEnvio(), entity);
		tblEnvioDto result = mapper.tblEnvioEntityTotblEnvioDto(entity);
        tblStatusDto Status = StatusAssembler.toResource(entity.getStatusEntity());
        tblPymeDto Pyme = PymeAssembler.toResource(entity.getPymeEntity());
        tblDireccionEnvioDto DireccionEnvio = DireccionEnvioAssembler.toResource(entity.getDireccionEnvioEntity());
        tblPersonaDto Persona  = PersonaAssembler.toResource(entity.getPersonaEntity());
        tblTamanoDto Tamano = TamanoAssembler.toResource(entity.getTamanoEntity());
        tblProductosDto Producto = ProductoAssembler.toResource(entity.getProductoEntity());
        tblMensajeroDto Mensajero = MensajeroAssembler.toResource(entity.getMensajeroEntity());
		result.add(Envio.getLinks());
		result.setStatusDto(Status);
		result.setPymeDto(Pyme);
		result.setDireccionEnvioDto(DireccionEnvio);
		result.setPersonaDto(Persona);
		result.setTamanoDto(Tamano);
		result.setProductoDto(Producto);
		result.setMensajeroDto(Mensajero);
		return result;
	}
	
}
