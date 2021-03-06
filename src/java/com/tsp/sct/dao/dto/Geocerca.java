/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.tsp.sct.dao.dto;

import com.tsp.sct.dao.dao.*;
import com.tsp.sct.dao.factory.*;
import com.tsp.sct.dao.exceptions.*;
import java.io.Serializable;
import java.util.*;

public class Geocerca implements Serializable
{
	/** 
	 * This attribute maps to the column ID_GEOCERCA in the geocerca table.
	 */
	protected int idGeocerca;

	/** 
	 * This attribute represents whether the attribute idGeocerca has been modified since being read from the database.
	 */
	protected boolean idGeocercaModified = false;

	/** 
	 * This attribute maps to the column ID_EMPRESA in the geocerca table.
	 */
	protected int idEmpresa;

	/** 
	 * This attribute represents whether the attribute idEmpresa has been modified since being read from the database.
	 */
	protected boolean idEmpresaModified = false;

	/** 
	 * This attribute maps to the column TIPO_GEOCERCA in the geocerca table.
	 */
	protected int tipoGeocerca;

	/** 
	 * This attribute represents whether the primitive attribute tipoGeocerca is null.
	 */
	protected boolean tipoGeocercaNull = true;

	/** 
	 * This attribute represents whether the attribute tipoGeocerca has been modified since being read from the database.
	 */
	protected boolean tipoGeocercaModified = false;

	/** 
	 * This attribute maps to the column COORDENADAS in the geocerca table.
	 */
	protected String coordenadas;

	/** 
	 * This attribute represents whether the attribute coordenadas has been modified since being read from the database.
	 */
	protected boolean coordenadasModified = false;

	/** 
	 * This attribute maps to the column ID_ESTATUS in the geocerca table.
	 */
	protected int idEstatus;

	/** 
	 * This attribute represents whether the primitive attribute idEstatus is null.
	 */
	protected boolean idEstatusNull = true;

	/** 
	 * This attribute represents whether the attribute idEstatus has been modified since being read from the database.
	 */
	protected boolean idEstatusModified = false;

	/**
	 * Method 'Geocerca'
	 * 
	 */
	public Geocerca()
	{
	}

	/**
	 * Method 'getIdGeocerca'
	 * 
	 * @return int
	 */
	public int getIdGeocerca()
	{
		return idGeocerca;
	}

	/**
	 * Method 'setIdGeocerca'
	 * 
	 * @param idGeocerca
	 */
	public void setIdGeocerca(int idGeocerca)
	{
		this.idGeocerca = idGeocerca;
		this.idGeocercaModified = true;
	}

	/** 
	 * Sets the value of idGeocercaModified
	 */
	public void setIdGeocercaModified(boolean idGeocercaModified)
	{
		this.idGeocercaModified = idGeocercaModified;
	}

	/** 
	 * Gets the value of idGeocercaModified
	 */
	public boolean isIdGeocercaModified()
	{
		return idGeocercaModified;
	}

	/**
	 * Method 'getIdEmpresa'
	 * 
	 * @return int
	 */
	public int getIdEmpresa()
	{
		return idEmpresa;
	}

	/**
	 * Method 'setIdEmpresa'
	 * 
	 * @param idEmpresa
	 */
	public void setIdEmpresa(int idEmpresa)
	{
		this.idEmpresa = idEmpresa;
		this.idEmpresaModified = true;
	}

	/** 
	 * Sets the value of idEmpresaModified
	 */
	public void setIdEmpresaModified(boolean idEmpresaModified)
	{
		this.idEmpresaModified = idEmpresaModified;
	}

	/** 
	 * Gets the value of idEmpresaModified
	 */
	public boolean isIdEmpresaModified()
	{
		return idEmpresaModified;
	}

	/**
	 * Method 'getTipoGeocerca'
	 * 
	 * @return int
	 */
	public int getTipoGeocerca()
	{
		return tipoGeocerca;
	}

	/**
	 * Method 'setTipoGeocerca'
	 * 
	 * @param tipoGeocerca
	 */
	public void setTipoGeocerca(int tipoGeocerca)
	{
		this.tipoGeocerca = tipoGeocerca;
		this.tipoGeocercaNull = false;
		this.tipoGeocercaModified = true;
	}

	/**
	 * Method 'setTipoGeocercaNull'
	 * 
	 * @param value
	 */
	public void setTipoGeocercaNull(boolean value)
	{
		this.tipoGeocercaNull = value;
		this.tipoGeocercaModified = true;
	}

	/**
	 * Method 'isTipoGeocercaNull'
	 * 
	 * @return boolean
	 */
	public boolean isTipoGeocercaNull()
	{
		return tipoGeocercaNull;
	}

	/** 
	 * Sets the value of tipoGeocercaModified
	 */
	public void setTipoGeocercaModified(boolean tipoGeocercaModified)
	{
		this.tipoGeocercaModified = tipoGeocercaModified;
	}

	/** 
	 * Gets the value of tipoGeocercaModified
	 */
	public boolean isTipoGeocercaModified()
	{
		return tipoGeocercaModified;
	}

	/**
	 * Method 'getCoordenadas'
	 * 
	 * @return String
	 */
	public String getCoordenadas()
	{
		return coordenadas;
	}

	/**
	 * Method 'setCoordenadas'
	 * 
	 * @param coordenadas
	 */
	public void setCoordenadas(String coordenadas)
	{
		this.coordenadas = coordenadas;
		this.coordenadasModified = true;
	}

	/** 
	 * Sets the value of coordenadasModified
	 */
	public void setCoordenadasModified(boolean coordenadasModified)
	{
		this.coordenadasModified = coordenadasModified;
	}

	/** 
	 * Gets the value of coordenadasModified
	 */
	public boolean isCoordenadasModified()
	{
		return coordenadasModified;
	}

	/**
	 * Method 'getIdEstatus'
	 * 
	 * @return int
	 */
	public int getIdEstatus()
	{
		return idEstatus;
	}

	/**
	 * Method 'setIdEstatus'
	 * 
	 * @param idEstatus
	 */
	public void setIdEstatus(int idEstatus)
	{
		this.idEstatus = idEstatus;
		this.idEstatusNull = false;
		this.idEstatusModified = true;
	}

	/**
	 * Method 'setIdEstatusNull'
	 * 
	 * @param value
	 */
	public void setIdEstatusNull(boolean value)
	{
		this.idEstatusNull = value;
		this.idEstatusModified = true;
	}

	/**
	 * Method 'isIdEstatusNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdEstatusNull()
	{
		return idEstatusNull;
	}

	/** 
	 * Sets the value of idEstatusModified
	 */
	public void setIdEstatusModified(boolean idEstatusModified)
	{
		this.idEstatusModified = idEstatusModified;
	}

	/** 
	 * Gets the value of idEstatusModified
	 */
	public boolean isIdEstatusModified()
	{
		return idEstatusModified;
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
		
		if (!(_other instanceof Geocerca)) {
			return false;
		}
		
		final Geocerca _cast = (Geocerca) _other;
		if (idGeocerca != _cast.idGeocerca) {
			return false;
		}
		
		if (idGeocercaModified != _cast.idGeocercaModified) {
			return false;
		}
		
		if (idEmpresa != _cast.idEmpresa) {
			return false;
		}
		
		if (idEmpresaModified != _cast.idEmpresaModified) {
			return false;
		}
		
		if (tipoGeocerca != _cast.tipoGeocerca) {
			return false;
		}
		
		if (tipoGeocercaNull != _cast.tipoGeocercaNull) {
			return false;
		}
		
		if (tipoGeocercaModified != _cast.tipoGeocercaModified) {
			return false;
		}
		
		if (coordenadas == null ? _cast.coordenadas != coordenadas : !coordenadas.equals( _cast.coordenadas )) {
			return false;
		}
		
		if (coordenadasModified != _cast.coordenadasModified) {
			return false;
		}
		
		if (idEstatus != _cast.idEstatus) {
			return false;
		}
		
		if (idEstatusNull != _cast.idEstatusNull) {
			return false;
		}
		
		if (idEstatusModified != _cast.idEstatusModified) {
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
		_hashCode = 29 * _hashCode + idGeocerca;
		_hashCode = 29 * _hashCode + (idGeocercaModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idEmpresa;
		_hashCode = 29 * _hashCode + (idEmpresaModified ? 1 : 0);
		_hashCode = 29 * _hashCode + tipoGeocerca;
		_hashCode = 29 * _hashCode + (tipoGeocercaNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (tipoGeocercaModified ? 1 : 0);
		if (coordenadas != null) {
			_hashCode = 29 * _hashCode + coordenadas.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (coordenadasModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idEstatus;
		_hashCode = 29 * _hashCode + (idEstatusNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idEstatusModified ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return GeocercaPk
	 */
	public GeocercaPk createPk()
	{
		return new GeocercaPk(idGeocerca);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.tsp.sct.dao.dto.Geocerca: " );
		ret.append( "idGeocerca=" + idGeocerca );
		ret.append( ", idEmpresa=" + idEmpresa );
		ret.append( ", tipoGeocerca=" + tipoGeocerca );
		ret.append( ", coordenadas=" + coordenadas );
		ret.append( ", idEstatus=" + idEstatus );
		return ret.toString();
	}

}
