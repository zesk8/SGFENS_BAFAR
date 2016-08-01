/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.tsp.sct.dao.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/** 
 * This class represents the primary key of the nomina_tipo_percepcion table.
 */
public class NominaTipoPercepcionPk implements Serializable
{
	protected int idTipoPrecepcion;

	/** 
	 * This attribute represents whether the primitive attribute idTipoPrecepcion is null.
	 */
	protected boolean idTipoPrecepcionNull;

	/** 
	 * Sets the value of idTipoPrecepcion
	 */
	public void setIdTipoPrecepcion(int idTipoPrecepcion)
	{
		this.idTipoPrecepcion = idTipoPrecepcion;
	}

	/** 
	 * Gets the value of idTipoPrecepcion
	 */
	public int getIdTipoPrecepcion()
	{
		return idTipoPrecepcion;
	}

	/**
	 * Method 'NominaTipoPercepcionPk'
	 * 
	 */
	public NominaTipoPercepcionPk()
	{
	}

	/**
	 * Method 'NominaTipoPercepcionPk'
	 * 
	 * @param idTipoPrecepcion
	 */
	public NominaTipoPercepcionPk(final int idTipoPrecepcion)
	{
		this.idTipoPrecepcion = idTipoPrecepcion;
	}

	/** 
	 * Sets the value of idTipoPrecepcionNull
	 */
	public void setIdTipoPrecepcionNull(boolean idTipoPrecepcionNull)
	{
		this.idTipoPrecepcionNull = idTipoPrecepcionNull;
	}

	/** 
	 * Gets the value of idTipoPrecepcionNull
	 */
	public boolean isIdTipoPrecepcionNull()
	{
		return idTipoPrecepcionNull;
	}

	/**
	 * Method 'equals'
	 * 
	 * @param _other
	 * @return boolean
	 */
	public boolean equals(Object _other)
	{
		if (_other == null) {
			return false;
		}
		
		if (_other == this) {
			return true;
		}
		
		if (!(_other instanceof NominaTipoPercepcionPk)) {
			return false;
		}
		
		final NominaTipoPercepcionPk _cast = (NominaTipoPercepcionPk) _other;
		if (idTipoPrecepcion != _cast.idTipoPrecepcion) {
			return false;
		}
		
		if (idTipoPrecepcionNull != _cast.idTipoPrecepcionNull) {
			return false;
		}
		
		return true;
	}

	/**
	 * Method 'hashCode'
	 * 
	 * @return int
	 */
	public int hashCode()
	{
		int _hashCode = 0;
		_hashCode = 29 * _hashCode + idTipoPrecepcion;
		_hashCode = 29 * _hashCode + (idTipoPrecepcionNull ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.tsp.sct.dao.dto.NominaTipoPercepcionPk: " );
		ret.append( "idTipoPrecepcion=" + idTipoPrecepcion );
		return ret.toString();
	}

}