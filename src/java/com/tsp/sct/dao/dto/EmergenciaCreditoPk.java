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
 * This class represents the primary key of the emergencia_credito table.
 */
public class EmergenciaCreditoPk implements Serializable
{
	protected int idEmergencia;

	/** 
	 * This attribute represents whether the primitive attribute idEmergencia is null.
	 */
	protected boolean idEmergenciaNull;

	/** 
	 * Sets the value of idEmergencia
	 */
	public void setIdEmergencia(int idEmergencia)
	{
		this.idEmergencia = idEmergencia;
	}

	/** 
	 * Gets the value of idEmergencia
	 */
	public int getIdEmergencia()
	{
		return idEmergencia;
	}

	/**
	 * Method 'EmergenciaCreditoPk'
	 * 
	 */
	public EmergenciaCreditoPk()
	{
	}

	/**
	 * Method 'EmergenciaCreditoPk'
	 * 
	 * @param idEmergencia
	 */
	public EmergenciaCreditoPk(final int idEmergencia)
	{
		this.idEmergencia = idEmergencia;
	}

	/** 
	 * Sets the value of idEmergenciaNull
	 */
	public void setIdEmergenciaNull(boolean idEmergenciaNull)
	{
		this.idEmergenciaNull = idEmergenciaNull;
	}

	/** 
	 * Gets the value of idEmergenciaNull
	 */
	public boolean isIdEmergenciaNull()
	{
		return idEmergenciaNull;
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
		
		if (!(_other instanceof EmergenciaCreditoPk)) {
			return false;
		}
		
		final EmergenciaCreditoPk _cast = (EmergenciaCreditoPk) _other;
		if (idEmergencia != _cast.idEmergencia) {
			return false;
		}
		
		if (idEmergenciaNull != _cast.idEmergenciaNull) {
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
		_hashCode = 29 * _hashCode + idEmergencia;
		_hashCode = 29 * _hashCode + (idEmergenciaNull ? 1 : 0);
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
		ret.append( "com.tsp.sct.dao.dto.EmergenciaCreditoPk: " );
		ret.append( "idEmergencia=" + idEmergencia );
		return ret.toString();
	}

}
