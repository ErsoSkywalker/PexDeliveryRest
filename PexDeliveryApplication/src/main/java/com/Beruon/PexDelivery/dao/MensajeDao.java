package com.Beruon.PexDelivery.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Component;

import com.Beruon.PexDelivery.dto.MensajeDto;
import com.Beruon.PexDelivery.dto.tblDireccionesPymeDto;

@Component
public class MensajeDao {

	int validar = 0;

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public MensajeDto ImprimirMensaje() {
		MensajeDto Mensaje = jdbcTemplate.query(new PreparedStatementCreator() {

			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {

				/*
				 * PreparedStatement ps =
				 * con.prepareStatement("select * from user where username=?"); ps.setString(1,
				 * username);
				 */

				PreparedStatement ps = con.prepareStatement("Select 'Ya tengo jdbc Pupper r w r' as Mensaje");
				return ps;
			}

		}, new ResultSetExtractor<MensajeDto>() {

			@Override
			public MensajeDto extractData(ResultSet rs) throws SQLException, DataAccessException {
				if (rs.next()) {
					MensajeDto Mensaje = new MensajeDto(rs.getString("Mensaje"));
					return Mensaje;
				} else {
					return null;
				}
			}

		});

		return Mensaje;
	}

	public MensajeDto cambiarStatusPyme(Integer idPyme) {
		validar = 0;
		MensajeDto Mensaje = jdbcTemplate.query(new PreparedStatementCreator() {

			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {

				/*
				 * PreparedStatement ps =
				 * con.prepareStatement("select * from user where username=?"); ps.setString(1,
				 * username);
				 */

				PreparedStatement ps = con.prepareStatement("call spCambiarStatusPyme(?)");
				ps.setString(1, Integer.toString(idPyme));
				return ps;
			}

		}, new ResultSetExtractor<MensajeDto>() {

			@Override
			public MensajeDto extractData(ResultSet rs) throws SQLException, DataAccessException {
				if (rs.next()) {
					MensajeDto Mensaje = new MensajeDto(rs.getString("Mensaje"));
					return Mensaje;
				} else {
					return null;
				}
			}

		});

		return Mensaje;
	}
	
	
	//Metodo para Editar el nombre de Una Pyme
	
	public MensajeDto editarNombrePyme(Integer idPyme, String nombrePyme) {
		MensajeDto Mensaje = jdbcTemplate.query(new PreparedStatementCreator() {

			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {

				/*
				 * PreparedStatement ps =
				 * con.prepareStatement("select * from user where username=?"); ps.setString(1,
				 * username);
				 */

				PreparedStatement ps = con.prepareStatement("call spEditarPyme(?,?)");
				ps.setString(1,Integer.toString(idPyme));
				ps.setString(2, nombrePyme);
				return ps;
			}

		}, new ResultSetExtractor<MensajeDto>() {

			@Override
			public MensajeDto extractData(ResultSet rs) throws SQLException, DataAccessException {
				if (rs.next()) {
					MensajeDto Mensaje = new MensajeDto(rs.getString("Mensaje"));
					return Mensaje;
				} else {
					return null;
				}
			}

		});

		return Mensaje;
	}
	
	//Cambiar Status Direcciones Pyme
	public MensajeDto cambiarStatusDireccionesPyme(Integer idDireccionPyme) {
		
		MensajeDto Mensaje = jdbcTemplate.query(new PreparedStatementCreator() {

			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {

				/*
				 * PreparedStatement ps =
				 * con.prepareStatement("select * from user where username=?"); ps.setString(1,
				 * username);
				 */

				PreparedStatement ps = con.prepareStatement("call spCambiarStatusDireccionPyme(?)");
				ps.setString(1, Integer.toString(idDireccionPyme));
				return ps;
			}

		}, new ResultSetExtractor<MensajeDto>() {

			@Override
			public MensajeDto extractData(ResultSet rs) throws SQLException, DataAccessException {
				if (rs.next()) {
					MensajeDto Mensaje = new MensajeDto(rs.getString("Mensaje"));
					return Mensaje;
				} else {
					return null;
				}
			}

		});

		return Mensaje;
	}
	
	//Metodo para Editar el nombre de Una Pyme
	
		public MensajeDto editarDireccionesPyme(tblDireccionesPymeDto Dto) {
			MensajeDto Mensaje = jdbcTemplate.query(new PreparedStatementCreator() {

				@Override
				public PreparedStatement createPreparedStatement(Connection con) throws SQLException {

					/*
					 * PreparedStatement ps =
					 * con.prepareStatement("select * from user where username=?"); ps.setString(1,
					 * username);
					 */

					PreparedStatement ps = con.prepareStatement("call spEditarDireccionesPyme(?,?,?,?,?,?,?,?,?)");
					ps.setInt(1, Dto.getIdDireccionesPyme());
					ps.setString(2, Dto.getCalle());
					ps.setString(3, Dto.getColonia());
					ps.setString(4, Dto.getDelegacion());
					ps.setInt(5, Dto.getCodigoPostal());
					ps.setString(6, Dto.getEstado());
					ps.setString(7, Dto.getPais());
					ps.setInt(8, Dto.getNumeroExterior());
					ps.setInt(9, Dto.getNumeroInterior());
					return ps;
				}

			}, new ResultSetExtractor<MensajeDto>() {

				@Override
				public MensajeDto extractData(ResultSet rs) throws SQLException, DataAccessException {
					if (rs.next()) {
						MensajeDto Mensaje = new MensajeDto(rs.getString("Mensaje"));
						return Mensaje;
					} else {
						return null;
					}
				}

			});

			return Mensaje;
		}
	
}
