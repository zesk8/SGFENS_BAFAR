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
 * This class represents the primary key of the movimiento table.
 */
public class MovimientoPk implements Serializable
{
	protected int idMovimiento;

	/** 
	 * This attribute represents whether the primitive attribute idMovimiento is null.
	 */
	protected boolean idMovimientoNull;

	/** 
	 * Sets the value of idMovimiento
	 */
	public void setIdMovimiento(int idMovimiento)
	{
		this.idMovimiento = idMovimiento;
	}

	/** 
	 * Gets the value of idMovimiento
	 */
	public int getIdMovimiento()
	{
		return idMovimiento;
	}

	/**
	 * Method 'MovimientoPk'
	 * 
	 */
	public MovimientoPk()
	{
	}

	/**
	 * Method 'MovimientoPk'
	 * 
	 * @param idMovimiento
	 */
	public MovimientoPk(final int idMovimiento)
	{
		this.idMovimiento = idMovimiento;
	}

	/** 
	 * Sets the value of idMovimientoNull
	 */
	public void setIdMovimientoNull(boolean idMovimientoNull)
	{
		this.idMovimientoNull = idMovimientoNull;
	}

	/** 
	 * Gets the value of idMovimientoNull
	 */
	public boolean isIdMovimientoNull()
	{
		return idMovimientoNull;
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
		
		if (!(_other instanceof MovimientoPk)) {
			return false;
		}
		
		final MovimientoPk _cast = (MovimientoPk) _other;
		if (idMovimiento != _cast.idMovimiento) {
			return false;
		}
		
		if (idMovimientoNull != _cast.idMovimientoNull) {
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
		_hashCode = 29 * _hashCode + idMovimiento;
		_hashCode = 29 * _hashCode + (idMovimientoNull ? 1 : 0);
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
		ret.append( "com.tsp.sct.dao.dto.MovimientoPk: " );
		ret.append( "idMovimiento=" + idMovimiento );
		return ret.toString();
	}

}