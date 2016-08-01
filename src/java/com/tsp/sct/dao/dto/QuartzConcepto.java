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

public class QuartzConcepto implements Serializable
{
	/** 
	 * This attribute maps to the column ID_QUARTZ in the quartz_concepto table.
	 */
	protected int idQuartz;

	/** 
	 * This attribute represents whether the attribute idQuartz has been modified since being read from the database.
	 */
	protected boolean idQuartzModified = false;

	/** 
	 * This attribute maps to the column ID_CONCEPTO_EVC in the quartz_concepto table.
	 */
	protected int idConceptoEvc;

	/** 
	 * This attribute represents whether the primitive attribute idConceptoEvc is null.
	 */
	protected boolean idConceptoEvcNull = true;

	/** 
	 * This attribute represents whether the attribute idConceptoEvc has been modified since being read from the database.
	 */
	protected boolean idConceptoEvcModified = false;

	/** 
	 * This attribute maps to the column ID_CONCEPTO_SISTEM_TERCERO in the quartz_concepto table.
	 */
	protected int idConceptoSistemTercero;

	/** 
	 * This attribute represents whether the primitive attribute idConceptoSistemTercero is null.
	 */
	protected boolean idConceptoSistemTerceroNull = true;

	/** 
	 * This attribute represents whether the attribute idConceptoSistemTercero has been modified since being read from the database.
	 */
	protected boolean idConceptoSistemTerceroModified = false;

	/** 
	 * This attribute maps to the column CLAVE in the quartz_concepto table.
	 */
	protected String clave;

	/** 
	 * This attribute represents whether the attribute clave has been modified since being read from the database.
	 */
	protected boolean claveModified = false;

	/** 
	 * This attribute maps to the column ID_SISTEMA_TERCERO in the quartz_concepto table.
	 */
	protected int idSistemaTercero;

	/** 
	 * This attribute represents whether the primitive attribute idSistemaTercero is null.
	 */
	protected boolean idSistemaTerceroNull = true;

	/** 
	 * This attribute represents whether the attribute idSistemaTercero has been modified since being read from the database.
	 */
	protected boolean idSistemaTerceroModified = false;

	/** 
	 * This attribute maps to the column ID_EMPRESA in the quartz_concepto table.
	 */
	protected int idEmpresa;

	/** 
	 * This attribute represents whether the attribute idEmpresa has been modified since being read from the database.
	 */
	protected boolean idEmpresaModified = false;

	/**
	 * Method 'QuartzConcepto'
	 * 
	 */
	public QuartzConcepto()
	{
	}

	/**
	 * Method 'getIdQuartz'
	 * 
	 * @return int
	 */
	public int getIdQuartz()
	{
		return idQuartz;
	}

	/**
	 * Method 'setIdQuartz'
	 * 
	 * @param idQuartz
	 */
	public void setIdQuartz(int idQuartz)
	{
		this.idQuartz = idQuartz;
		this.idQuartzModified = true;
	}

	/** 
	 * Sets the value of idQuartzModified
	 */
	public void setIdQuartzModified(boolean idQuartzModified)
	{
		this.idQuartzModified = idQuartzModified;
	}

	/** 
	 * Gets the value of idQuartzModified
	 */
	public boolean isIdQuartzModified()
	{
		return idQuartzModified;
	}

	/**
	 * Method 'getIdConceptoEvc'
	 * 
	 * @return int
	 */
	public int getIdConceptoEvc()
	{
		return idConceptoEvc;
	}

	/**
	 * Method 'setIdConceptoEvc'
	 * 
	 * @param idConceptoEvc
	 */
	public void setIdConceptoEvc(int idConceptoEvc)
	{
		this.idConceptoEvc = idConceptoEvc;
		this.idConceptoEvcNull = false;
		this.idConceptoEvcModified = true;
	}

	/**
	 * Method 'setIdConceptoEvcNull'
	 * 
	 * @param value
	 */
	public void setIdConceptoEvcNull(boolean value)
	{
		this.idConceptoEvcNull = value;
		this.idConceptoEvcModified = true;
	}

	/**
	 * Method 'isIdConceptoEvcNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdConceptoEvcNull()
	{
		return idConceptoEvcNull;
	}

	/** 
	 * Sets the value of idConceptoEvcModified
	 */
	public void setIdConceptoEvcModified(boolean idConceptoEvcModified)
	{
		this.idConceptoEvcModified = idConceptoEvcModified;
	}

	/** 
	 * Gets the value of idConceptoEvcModified
	 */
	public boolean isIdConceptoEvcModified()
	{
		return idConceptoEvcModified;
	}

	/**
	 * Method 'getIdConceptoSistemTercero'
	 * 
	 * @return int
	 */
	public int getIdConceptoSistemTercero()
	{
		return idConceptoSistemTercero;
	}

	/**
	 * Method 'setIdConceptoSistemTercero'
	 * 
	 * @param idConceptoSistemTercero
	 */
	public void setIdConceptoSistemTercero(int idConceptoSistemTercero)
	{
		this.idConceptoSistemTercero = idConceptoSistemTercero;
		this.idConceptoSistemTerceroNull = false;
		this.idConceptoSistemTerceroModified = true;
	}

	/**
	 * Method 'setIdConceptoSistemTerceroNull'
	 * 
	 * @param value
	 */
	public void setIdConceptoSistemTerceroNull(boolean value)
	{
		this.idConceptoSistemTerceroNull = value;
		this.idConceptoSistemTerceroModified = true;
	}

	/**
	 * Method 'isIdConceptoSistemTerceroNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdConceptoSistemTerceroNull()
	{
		return idConceptoSistemTerceroNull;
	}

	/** 
	 * Sets the value of idConceptoSistemTerceroModified
	 */
	public void setIdConceptoSistemTerceroModified(boolean idConceptoSistemTerceroModified)
	{
		this.idConceptoSistemTerceroModified = idConceptoSistemTerceroModified;
	}

	/** 
	 * Gets the value of idConceptoSistemTerceroModified
	 */
	public boolean isIdConceptoSistemTerceroModified()
	{
		return idConceptoSistemTerceroModified;
	}

	/**
	 * Method 'getClave'
	 * 
	 * @return String
	 */
	public String getClave()
	{
		return clave;
	}

	/**
	 * Method 'setClave'
	 * 
	 * @param clave
	 */
	public void setClave(String clave)
	{
		this.clave = clave;
		this.claveModified = true;
	}

	/** 
	 * Sets the value of claveModified
	 */
	public void setClaveModified(boolean claveModified)
	{
		this.claveModified = claveModified;
	}

	/** 
	 * Gets the value of claveModified
	 */
	public boolean isClaveModified()
	{
		return claveModified;
	}

	/**
	 * Method 'getIdSistemaTercero'
	 * 
	 * @return int
	 */
	public int getIdSistemaTercero()
	{
		return idSistemaTercero;
	}

	/**
	 * Method 'setIdSistemaTercero'
	 * 
	 * @param idSistemaTercero
	 */
	public void setIdSistemaTercero(int idSistemaTercero)
	{
		this.idSistemaTercero = idSistemaTercero;
		this.idSistemaTerceroNull = false;
		this.idSistemaTerceroModified = true;
	}

	/**
	 * Method 'setIdSistemaTerceroNull'
	 * 
	 * @param value
	 */
	public void setIdSistemaTerceroNull(boolean value)
	{
		this.idSistemaTerceroNull = value;
		this.idSistemaTerceroModified = true;
	}

	/**
	 * Method 'isIdSistemaTerceroNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdSistemaTerceroNull()
	{
		return idSistemaTerceroNull;
	}

	/** 
	 * Sets the value of idSistemaTerceroModified
	 */
	public void setIdSistemaTerceroModified(boolean idSistemaTerceroModified)
	{
		this.idSistemaTerceroModified = idSistemaTerceroModified;
	}

	/** 
	 * Gets the value of idSistemaTerceroModified
	 */
	public boolean isIdSistemaTerceroModified()
	{
		return idSistemaTerceroModified;
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
		
		if (!(_other instanceof QuartzConcepto)) {
			return false;
		}
		
		final QuartzConcepto _cast = (QuartzConcepto) _other;
		if (idQuartz != _cast.idQuartz) {
			return false;
		}
		
		if (idQuartzModified != _cast.idQuartzModified) {
			return false;
		}
		
		if (idConceptoEvc != _cast.idConceptoEvc) {
			return false;
		}
		
		if (idConceptoEvcNull != _cast.idConceptoEvcNull) {
			return false;
		}
		
		if (idConceptoEvcModified != _cast.idConceptoEvcModified) {
			return false;
		}
		
		if (idConceptoSistemTercero != _cast.idConceptoSistemTercero) {
			return false;
		}
		
		if (idConceptoSistemTerceroNull != _cast.idConceptoSistemTerceroNull) {
			return false;
		}
		
		if (idConceptoSistemTerceroModified != _cast.idConceptoSistemTerceroModified) {
			return false;
		}
		
		if (clave == null ? _cast.clave != clave : !clave.equals( _cast.clave )) {
			return false;
		}
		
		if (claveModified != _cast.claveModified) {
			return false;
		}
		
		if (idSistemaTercero != _cast.idSistemaTercero) {
			return false;
		}
		
		if (idSistemaTerceroNull != _cast.idSistemaTerceroNull) {
			return false;
		}
		
		if (idSistemaTerceroModified != _cast.idSistemaTerceroModified) {
			return false;
		}
		
		if (idEmpresa != _cast.idEmpresa) {
			return false;
		}
		
		if (idEmpresaModified != _cast.idEmpresaModified) {
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
		_hashCode = 29 * _hashCode + idQuartz;
		_hashCode = 29 * _hashCode + (idQuartzModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idConceptoEvc;
		_hashCode = 29 * _hashCode + (idConceptoEvcNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idConceptoEvcModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idConceptoSistemTercero;
		_hashCode = 29 * _hashCode + (idConceptoSistemTerceroNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idConceptoSistemTerceroModified ? 1 : 0);
		if (clave != null) {
			_hashCode = 29 * _hashCode + clave.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (claveModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idSistemaTercero;
		_hashCode = 29 * _hashCode + (idSistemaTerceroNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idSistemaTerceroModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idEmpresa;
		_hashCode = 29 * _hashCode + (idEmpresaModified ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return QuartzConceptoPk
	 */
	public QuartzConceptoPk createPk()
	{
		return new QuartzConceptoPk(idQuartz);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.tsp.sct.dao.dto.QuartzConcepto: " );
		ret.append( "idQuartz=" + idQuartz );
		ret.append( ", idConceptoEvc=" + idConceptoEvc );
		ret.append( ", idConceptoSistemTercero=" + idConceptoSistemTercero );
		ret.append( ", clave=" + clave );
		ret.append( ", idSistemaTercero=" + idSistemaTercero );
		ret.append( ", idEmpresa=" + idEmpresa );
		return ret.toString();
	}

}