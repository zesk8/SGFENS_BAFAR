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

public class SgfensProveedor implements Serializable
{
	/** 
	 * This attribute maps to the column ID_PROVEEDOR in the sgfens_proveedor table.
	 */
	protected int idProveedor;

	/** 
	 * This attribute represents whether the attribute idProveedor has been modified since being read from the database.
	 */
	protected boolean idProveedorModified = false;

	/** 
	 * This attribute maps to the column ID_EMPRESA in the sgfens_proveedor table.
	 */
	protected int idEmpresa;

	/** 
	 * This attribute represents whether the attribute idEmpresa has been modified since being read from the database.
	 */
	protected boolean idEmpresaModified = false;

	/** 
	 * This attribute maps to the column NUMERO_PROVEEDOR in the sgfens_proveedor table.
	 */
	protected String numeroProveedor;

	/** 
	 * This attribute represents whether the attribute numeroProveedor has been modified since being read from the database.
	 */
	protected boolean numeroProveedorModified = false;

	/** 
	 * This attribute maps to the column RFC in the sgfens_proveedor table.
	 */
	protected String rfc;

	/** 
	 * This attribute represents whether the attribute rfc has been modified since being read from the database.
	 */
	protected boolean rfcModified = false;

	/** 
	 * This attribute maps to the column RAZON_SOCIAL in the sgfens_proveedor table.
	 */
	protected String razonSocial;

	/** 
	 * This attribute represents whether the attribute razonSocial has been modified since being read from the database.
	 */
	protected boolean razonSocialModified = false;

	/** 
	 * This attribute maps to the column CALLE in the sgfens_proveedor table.
	 */
	protected String calle;

	/** 
	 * This attribute represents whether the attribute calle has been modified since being read from the database.
	 */
	protected boolean calleModified = false;

	/** 
	 * This attribute maps to the column NUMERO in the sgfens_proveedor table.
	 */
	protected String numero;

	/** 
	 * This attribute represents whether the attribute numero has been modified since being read from the database.
	 */
	protected boolean numeroModified = false;

	/** 
	 * This attribute maps to the column NUMERO_INTERIOR in the sgfens_proveedor table.
	 */
	protected String numeroInterior;

	/** 
	 * This attribute represents whether the attribute numeroInterior has been modified since being read from the database.
	 */
	protected boolean numeroInteriorModified = false;

	/** 
	 * This attribute maps to the column COLONIA in the sgfens_proveedor table.
	 */
	protected String colonia;

	/** 
	 * This attribute represents whether the attribute colonia has been modified since being read from the database.
	 */
	protected boolean coloniaModified = false;

	/** 
	 * This attribute maps to the column CODIGO_POSTAL in the sgfens_proveedor table.
	 */
	protected String codigoPostal;

	/** 
	 * This attribute represents whether the attribute codigoPostal has been modified since being read from the database.
	 */
	protected boolean codigoPostalModified = false;

	/** 
	 * This attribute maps to the column PAIS in the sgfens_proveedor table.
	 */
	protected String pais;

	/** 
	 * This attribute represents whether the attribute pais has been modified since being read from the database.
	 */
	protected boolean paisModified = false;

	/** 
	 * This attribute maps to the column ESTADO in the sgfens_proveedor table.
	 */
	protected String estado;

	/** 
	 * This attribute represents whether the attribute estado has been modified since being read from the database.
	 */
	protected boolean estadoModified = false;

	/** 
	 * This attribute maps to the column MUNICIPIO in the sgfens_proveedor table.
	 */
	protected String municipio;

	/** 
	 * This attribute represents whether the attribute municipio has been modified since being read from the database.
	 */
	protected boolean municipioModified = false;

	/** 
	 * This attribute maps to the column LADA in the sgfens_proveedor table.
	 */
	protected String lada;

	/** 
	 * This attribute represents whether the attribute lada has been modified since being read from the database.
	 */
	protected boolean ladaModified = false;

	/** 
	 * This attribute maps to the column TELEFONO in the sgfens_proveedor table.
	 */
	protected String telefono;

	/** 
	 * This attribute represents whether the attribute telefono has been modified since being read from the database.
	 */
	protected boolean telefonoModified = false;

	/** 
	 * This attribute maps to the column EXTENSION in the sgfens_proveedor table.
	 */
	protected String extension;

	/** 
	 * This attribute represents whether the attribute extension has been modified since being read from the database.
	 */
	protected boolean extensionModified = false;

	/** 
	 * This attribute maps to the column CELULAR in the sgfens_proveedor table.
	 */
	protected String celular;

	/** 
	 * This attribute represents whether the attribute celular has been modified since being read from the database.
	 */
	protected boolean celularModified = false;

	/** 
	 * This attribute maps to the column CORREO in the sgfens_proveedor table.
	 */
	protected String correo;

	/** 
	 * This attribute represents whether the attribute correo has been modified since being read from the database.
	 */
	protected boolean correoModified = false;

	/** 
	 * This attribute maps to the column CONTACTO in the sgfens_proveedor table.
	 */
	protected String contacto;

	/** 
	 * This attribute represents whether the attribute contacto has been modified since being read from the database.
	 */
	protected boolean contactoModified = false;

	/** 
	 * This attribute maps to the column ID_ESTATUS in the sgfens_proveedor table.
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
	 * This attribute maps to the column DESCRIPCION in the sgfens_proveedor table.
	 */
	protected String descripcion;

	/** 
	 * This attribute represents whether the attribute descripcion has been modified since being read from the database.
	 */
	protected boolean descripcionModified = false;

	/** 
	 * This attribute maps to the column NOMBRE_EMPRESA in the sgfens_proveedor table.
	 */
	protected String nombreEmpresa;

	/** 
	 * This attribute represents whether the attribute nombreEmpresa has been modified since being read from the database.
	 */
	protected boolean nombreEmpresaModified = false;

	/** 
	 * This attribute maps to the column LATITUD in the sgfens_proveedor table.
	 */
	protected String latitud;

	/** 
	 * This attribute represents whether the attribute latitud has been modified since being read from the database.
	 */
	protected boolean latitudModified = false;

	/** 
	 * This attribute maps to the column LONGITUD in the sgfens_proveedor table.
	 */
	protected String longitud;

	/** 
	 * This attribute represents whether the attribute longitud has been modified since being read from the database.
	 */
	protected boolean longitudModified = false;

	/** 
	 * This attribute maps to the column ID_CATEGORIA_PROVEEDOR in the sgfens_proveedor table.
	 */
	protected int idCategoriaProveedor;

	/** 
	 * This attribute represents whether the primitive attribute idCategoriaProveedor is null.
	 */
	protected boolean idCategoriaProveedorNull = true;

	/** 
	 * This attribute represents whether the attribute idCategoriaProveedor has been modified since being read from the database.
	 */
	protected boolean idCategoriaProveedorModified = false;

	/** 
	 * This attribute maps to the column NOMBRE_IMAGEN_PROVEEDOR in the sgfens_proveedor table.
	 */
	protected String nombreImagenProveedor;

	/** 
	 * This attribute represents whether the attribute nombreImagenProveedor has been modified since being read from the database.
	 */
	protected boolean nombreImagenProveedorModified = false;

	/**
	 * Method 'SgfensProveedor'
	 * 
	 */
	public SgfensProveedor()
	{
	}

	/**
	 * Method 'getIdProveedor'
	 * 
	 * @return int
	 */
	public int getIdProveedor()
	{
		return idProveedor;
	}

	/**
	 * Method 'setIdProveedor'
	 * 
	 * @param idProveedor
	 */
	public void setIdProveedor(int idProveedor)
	{
		this.idProveedor = idProveedor;
		this.idProveedorModified = true;
	}

	/** 
	 * Sets the value of idProveedorModified
	 */
	public void setIdProveedorModified(boolean idProveedorModified)
	{
		this.idProveedorModified = idProveedorModified;
	}

	/** 
	 * Gets the value of idProveedorModified
	 */
	public boolean isIdProveedorModified()
	{
		return idProveedorModified;
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
	 * Method 'getNumeroProveedor'
	 * 
	 * @return String
	 */
	public String getNumeroProveedor()
	{
		return numeroProveedor;
	}

	/**
	 * Method 'setNumeroProveedor'
	 * 
	 * @param numeroProveedor
	 */
	public void setNumeroProveedor(String numeroProveedor)
	{
		this.numeroProveedor = numeroProveedor;
		this.numeroProveedorModified = true;
	}

	/** 
	 * Sets the value of numeroProveedorModified
	 */
	public void setNumeroProveedorModified(boolean numeroProveedorModified)
	{
		this.numeroProveedorModified = numeroProveedorModified;
	}

	/** 
	 * Gets the value of numeroProveedorModified
	 */
	public boolean isNumeroProveedorModified()
	{
		return numeroProveedorModified;
	}

	/**
	 * Method 'getRfc'
	 * 
	 * @return String
	 */
	public String getRfc()
	{
		return rfc;
	}

	/**
	 * Method 'setRfc'
	 * 
	 * @param rfc
	 */
	public void setRfc(String rfc)
	{
		this.rfc = rfc;
		this.rfcModified = true;
	}

	/** 
	 * Sets the value of rfcModified
	 */
	public void setRfcModified(boolean rfcModified)
	{
		this.rfcModified = rfcModified;
	}

	/** 
	 * Gets the value of rfcModified
	 */
	public boolean isRfcModified()
	{
		return rfcModified;
	}

	/**
	 * Method 'getRazonSocial'
	 * 
	 * @return String
	 */
	public String getRazonSocial()
	{
		return razonSocial;
	}

	/**
	 * Method 'setRazonSocial'
	 * 
	 * @param razonSocial
	 */
	public void setRazonSocial(String razonSocial)
	{
		this.razonSocial = razonSocial;
		this.razonSocialModified = true;
	}

	/** 
	 * Sets the value of razonSocialModified
	 */
	public void setRazonSocialModified(boolean razonSocialModified)
	{
		this.razonSocialModified = razonSocialModified;
	}

	/** 
	 * Gets the value of razonSocialModified
	 */
	public boolean isRazonSocialModified()
	{
		return razonSocialModified;
	}

	/**
	 * Method 'getCalle'
	 * 
	 * @return String
	 */
	public String getCalle()
	{
		return calle;
	}

	/**
	 * Method 'setCalle'
	 * 
	 * @param calle
	 */
	public void setCalle(String calle)
	{
		this.calle = calle;
		this.calleModified = true;
	}

	/** 
	 * Sets the value of calleModified
	 */
	public void setCalleModified(boolean calleModified)
	{
		this.calleModified = calleModified;
	}

	/** 
	 * Gets the value of calleModified
	 */
	public boolean isCalleModified()
	{
		return calleModified;
	}

	/**
	 * Method 'getNumero'
	 * 
	 * @return String
	 */
	public String getNumero()
	{
		return numero;
	}

	/**
	 * Method 'setNumero'
	 * 
	 * @param numero
	 */
	public void setNumero(String numero)
	{
		this.numero = numero;
		this.numeroModified = true;
	}

	/** 
	 * Sets the value of numeroModified
	 */
	public void setNumeroModified(boolean numeroModified)
	{
		this.numeroModified = numeroModified;
	}

	/** 
	 * Gets the value of numeroModified
	 */
	public boolean isNumeroModified()
	{
		return numeroModified;
	}

	/**
	 * Method 'getNumeroInterior'
	 * 
	 * @return String
	 */
	public String getNumeroInterior()
	{
		return numeroInterior;
	}

	/**
	 * Method 'setNumeroInterior'
	 * 
	 * @param numeroInterior
	 */
	public void setNumeroInterior(String numeroInterior)
	{
		this.numeroInterior = numeroInterior;
		this.numeroInteriorModified = true;
	}

	/** 
	 * Sets the value of numeroInteriorModified
	 */
	public void setNumeroInteriorModified(boolean numeroInteriorModified)
	{
		this.numeroInteriorModified = numeroInteriorModified;
	}

	/** 
	 * Gets the value of numeroInteriorModified
	 */
	public boolean isNumeroInteriorModified()
	{
		return numeroInteriorModified;
	}

	/**
	 * Method 'getColonia'
	 * 
	 * @return String
	 */
	public String getColonia()
	{
		return colonia;
	}

	/**
	 * Method 'setColonia'
	 * 
	 * @param colonia
	 */
	public void setColonia(String colonia)
	{
		this.colonia = colonia;
		this.coloniaModified = true;
	}

	/** 
	 * Sets the value of coloniaModified
	 */
	public void setColoniaModified(boolean coloniaModified)
	{
		this.coloniaModified = coloniaModified;
	}

	/** 
	 * Gets the value of coloniaModified
	 */
	public boolean isColoniaModified()
	{
		return coloniaModified;
	}

	/**
	 * Method 'getCodigoPostal'
	 * 
	 * @return String
	 */
	public String getCodigoPostal()
	{
		return codigoPostal;
	}

	/**
	 * Method 'setCodigoPostal'
	 * 
	 * @param codigoPostal
	 */
	public void setCodigoPostal(String codigoPostal)
	{
		this.codigoPostal = codigoPostal;
		this.codigoPostalModified = true;
	}

	/** 
	 * Sets the value of codigoPostalModified
	 */
	public void setCodigoPostalModified(boolean codigoPostalModified)
	{
		this.codigoPostalModified = codigoPostalModified;
	}

	/** 
	 * Gets the value of codigoPostalModified
	 */
	public boolean isCodigoPostalModified()
	{
		return codigoPostalModified;
	}

	/**
	 * Method 'getPais'
	 * 
	 * @return String
	 */
	public String getPais()
	{
		return pais;
	}

	/**
	 * Method 'setPais'
	 * 
	 * @param pais
	 */
	public void setPais(String pais)
	{
		this.pais = pais;
		this.paisModified = true;
	}

	/** 
	 * Sets the value of paisModified
	 */
	public void setPaisModified(boolean paisModified)
	{
		this.paisModified = paisModified;
	}

	/** 
	 * Gets the value of paisModified
	 */
	public boolean isPaisModified()
	{
		return paisModified;
	}

	/**
	 * Method 'getEstado'
	 * 
	 * @return String
	 */
	public String getEstado()
	{
		return estado;
	}

	/**
	 * Method 'setEstado'
	 * 
	 * @param estado
	 */
	public void setEstado(String estado)
	{
		this.estado = estado;
		this.estadoModified = true;
	}

	/** 
	 * Sets the value of estadoModified
	 */
	public void setEstadoModified(boolean estadoModified)
	{
		this.estadoModified = estadoModified;
	}

	/** 
	 * Gets the value of estadoModified
	 */
	public boolean isEstadoModified()
	{
		return estadoModified;
	}

	/**
	 * Method 'getMunicipio'
	 * 
	 * @return String
	 */
	public String getMunicipio()
	{
		return municipio;
	}

	/**
	 * Method 'setMunicipio'
	 * 
	 * @param municipio
	 */
	public void setMunicipio(String municipio)
	{
		this.municipio = municipio;
		this.municipioModified = true;
	}

	/** 
	 * Sets the value of municipioModified
	 */
	public void setMunicipioModified(boolean municipioModified)
	{
		this.municipioModified = municipioModified;
	}

	/** 
	 * Gets the value of municipioModified
	 */
	public boolean isMunicipioModified()
	{
		return municipioModified;
	}

	/**
	 * Method 'getLada'
	 * 
	 * @return String
	 */
	public String getLada()
	{
		return lada;
	}

	/**
	 * Method 'setLada'
	 * 
	 * @param lada
	 */
	public void setLada(String lada)
	{
		this.lada = lada;
		this.ladaModified = true;
	}

	/** 
	 * Sets the value of ladaModified
	 */
	public void setLadaModified(boolean ladaModified)
	{
		this.ladaModified = ladaModified;
	}

	/** 
	 * Gets the value of ladaModified
	 */
	public boolean isLadaModified()
	{
		return ladaModified;
	}

	/**
	 * Method 'getTelefono'
	 * 
	 * @return String
	 */
	public String getTelefono()
	{
		return telefono;
	}

	/**
	 * Method 'setTelefono'
	 * 
	 * @param telefono
	 */
	public void setTelefono(String telefono)
	{
		this.telefono = telefono;
		this.telefonoModified = true;
	}

	/** 
	 * Sets the value of telefonoModified
	 */
	public void setTelefonoModified(boolean telefonoModified)
	{
		this.telefonoModified = telefonoModified;
	}

	/** 
	 * Gets the value of telefonoModified
	 */
	public boolean isTelefonoModified()
	{
		return telefonoModified;
	}

	/**
	 * Method 'getExtension'
	 * 
	 * @return String
	 */
	public String getExtension()
	{
		return extension;
	}

	/**
	 * Method 'setExtension'
	 * 
	 * @param extension
	 */
	public void setExtension(String extension)
	{
		this.extension = extension;
		this.extensionModified = true;
	}

	/** 
	 * Sets the value of extensionModified
	 */
	public void setExtensionModified(boolean extensionModified)
	{
		this.extensionModified = extensionModified;
	}

	/** 
	 * Gets the value of extensionModified
	 */
	public boolean isExtensionModified()
	{
		return extensionModified;
	}

	/**
	 * Method 'getCelular'
	 * 
	 * @return String
	 */
	public String getCelular()
	{
		return celular;
	}

	/**
	 * Method 'setCelular'
	 * 
	 * @param celular
	 */
	public void setCelular(String celular)
	{
		this.celular = celular;
		this.celularModified = true;
	}

	/** 
	 * Sets the value of celularModified
	 */
	public void setCelularModified(boolean celularModified)
	{
		this.celularModified = celularModified;
	}

	/** 
	 * Gets the value of celularModified
	 */
	public boolean isCelularModified()
	{
		return celularModified;
	}

	/**
	 * Method 'getCorreo'
	 * 
	 * @return String
	 */
	public String getCorreo()
	{
		return correo;
	}

	/**
	 * Method 'setCorreo'
	 * 
	 * @param correo
	 */
	public void setCorreo(String correo)
	{
		this.correo = correo;
		this.correoModified = true;
	}

	/** 
	 * Sets the value of correoModified
	 */
	public void setCorreoModified(boolean correoModified)
	{
		this.correoModified = correoModified;
	}

	/** 
	 * Gets the value of correoModified
	 */
	public boolean isCorreoModified()
	{
		return correoModified;
	}

	/**
	 * Method 'getContacto'
	 * 
	 * @return String
	 */
	public String getContacto()
	{
		return contacto;
	}

	/**
	 * Method 'setContacto'
	 * 
	 * @param contacto
	 */
	public void setContacto(String contacto)
	{
		this.contacto = contacto;
		this.contactoModified = true;
	}

	/** 
	 * Sets the value of contactoModified
	 */
	public void setContactoModified(boolean contactoModified)
	{
		this.contactoModified = contactoModified;
	}

	/** 
	 * Gets the value of contactoModified
	 */
	public boolean isContactoModified()
	{
		return contactoModified;
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
	 * Method 'getDescripcion'
	 * 
	 * @return String
	 */
	public String getDescripcion()
	{
		return descripcion;
	}

	/**
	 * Method 'setDescripcion'
	 * 
	 * @param descripcion
	 */
	public void setDescripcion(String descripcion)
	{
		this.descripcion = descripcion;
		this.descripcionModified = true;
	}

	/** 
	 * Sets the value of descripcionModified
	 */
	public void setDescripcionModified(boolean descripcionModified)
	{
		this.descripcionModified = descripcionModified;
	}

	/** 
	 * Gets the value of descripcionModified
	 */
	public boolean isDescripcionModified()
	{
		return descripcionModified;
	}

	/**
	 * Method 'getNombreEmpresa'
	 * 
	 * @return String
	 */
	public String getNombreEmpresa()
	{
		return nombreEmpresa;
	}

	/**
	 * Method 'setNombreEmpresa'
	 * 
	 * @param nombreEmpresa
	 */
	public void setNombreEmpresa(String nombreEmpresa)
	{
		this.nombreEmpresa = nombreEmpresa;
		this.nombreEmpresaModified = true;
	}

	/** 
	 * Sets the value of nombreEmpresaModified
	 */
	public void setNombreEmpresaModified(boolean nombreEmpresaModified)
	{
		this.nombreEmpresaModified = nombreEmpresaModified;
	}

	/** 
	 * Gets the value of nombreEmpresaModified
	 */
	public boolean isNombreEmpresaModified()
	{
		return nombreEmpresaModified;
	}

	/**
	 * Method 'getLatitud'
	 * 
	 * @return String
	 */
	public String getLatitud()
	{
		return latitud;
	}

	/**
	 * Method 'setLatitud'
	 * 
	 * @param latitud
	 */
	public void setLatitud(String latitud)
	{
		this.latitud = latitud;
		this.latitudModified = true;
	}

	/** 
	 * Sets the value of latitudModified
	 */
	public void setLatitudModified(boolean latitudModified)
	{
		this.latitudModified = latitudModified;
	}

	/** 
	 * Gets the value of latitudModified
	 */
	public boolean isLatitudModified()
	{
		return latitudModified;
	}

	/**
	 * Method 'getLongitud'
	 * 
	 * @return String
	 */
	public String getLongitud()
	{
		return longitud;
	}

	/**
	 * Method 'setLongitud'
	 * 
	 * @param longitud
	 */
	public void setLongitud(String longitud)
	{
		this.longitud = longitud;
		this.longitudModified = true;
	}

	/** 
	 * Sets the value of longitudModified
	 */
	public void setLongitudModified(boolean longitudModified)
	{
		this.longitudModified = longitudModified;
	}

	/** 
	 * Gets the value of longitudModified
	 */
	public boolean isLongitudModified()
	{
		return longitudModified;
	}

	/**
	 * Method 'getIdCategoriaProveedor'
	 * 
	 * @return int
	 */
	public int getIdCategoriaProveedor()
	{
		return idCategoriaProveedor;
	}

	/**
	 * Method 'setIdCategoriaProveedor'
	 * 
	 * @param idCategoriaProveedor
	 */
	public void setIdCategoriaProveedor(int idCategoriaProveedor)
	{
		this.idCategoriaProveedor = idCategoriaProveedor;
		this.idCategoriaProveedorNull = false;
		this.idCategoriaProveedorModified = true;
	}

	/**
	 * Method 'setIdCategoriaProveedorNull'
	 * 
	 * @param value
	 */
	public void setIdCategoriaProveedorNull(boolean value)
	{
		this.idCategoriaProveedorNull = value;
		this.idCategoriaProveedorModified = true;
	}

	/**
	 * Method 'isIdCategoriaProveedorNull'
	 * 
	 * @return boolean
	 */
	public boolean isIdCategoriaProveedorNull()
	{
		return idCategoriaProveedorNull;
	}

	/** 
	 * Sets the value of idCategoriaProveedorModified
	 */
	public void setIdCategoriaProveedorModified(boolean idCategoriaProveedorModified)
	{
		this.idCategoriaProveedorModified = idCategoriaProveedorModified;
	}

	/** 
	 * Gets the value of idCategoriaProveedorModified
	 */
	public boolean isIdCategoriaProveedorModified()
	{
		return idCategoriaProveedorModified;
	}

	/**
	 * Method 'getNombreImagenProveedor'
	 * 
	 * @return String
	 */
	public String getNombreImagenProveedor()
	{
		return nombreImagenProveedor;
	}

	/**
	 * Method 'setNombreImagenProveedor'
	 * 
	 * @param nombreImagenProveedor
	 */
	public void setNombreImagenProveedor(String nombreImagenProveedor)
	{
		this.nombreImagenProveedor = nombreImagenProveedor;
		this.nombreImagenProveedorModified = true;
	}

	/** 
	 * Sets the value of nombreImagenProveedorModified
	 */
	public void setNombreImagenProveedorModified(boolean nombreImagenProveedorModified)
	{
		this.nombreImagenProveedorModified = nombreImagenProveedorModified;
	}

	/** 
	 * Gets the value of nombreImagenProveedorModified
	 */
	public boolean isNombreImagenProveedorModified()
	{
		return nombreImagenProveedorModified;
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
		
		if (!(_other instanceof SgfensProveedor)) {
			return false;
		}
		
		final SgfensProveedor _cast = (SgfensProveedor) _other;
		if (idProveedor != _cast.idProveedor) {
			return false;
		}
		
		if (idProveedorModified != _cast.idProveedorModified) {
			return false;
		}
		
		if (idEmpresa != _cast.idEmpresa) {
			return false;
		}
		
		if (idEmpresaModified != _cast.idEmpresaModified) {
			return false;
		}
		
		if (numeroProveedor == null ? _cast.numeroProveedor != numeroProveedor : !numeroProveedor.equals( _cast.numeroProveedor )) {
			return false;
		}
		
		if (numeroProveedorModified != _cast.numeroProveedorModified) {
			return false;
		}
		
		if (rfc == null ? _cast.rfc != rfc : !rfc.equals( _cast.rfc )) {
			return false;
		}
		
		if (rfcModified != _cast.rfcModified) {
			return false;
		}
		
		if (razonSocial == null ? _cast.razonSocial != razonSocial : !razonSocial.equals( _cast.razonSocial )) {
			return false;
		}
		
		if (razonSocialModified != _cast.razonSocialModified) {
			return false;
		}
		
		if (calle == null ? _cast.calle != calle : !calle.equals( _cast.calle )) {
			return false;
		}
		
		if (calleModified != _cast.calleModified) {
			return false;
		}
		
		if (numero == null ? _cast.numero != numero : !numero.equals( _cast.numero )) {
			return false;
		}
		
		if (numeroModified != _cast.numeroModified) {
			return false;
		}
		
		if (numeroInterior == null ? _cast.numeroInterior != numeroInterior : !numeroInterior.equals( _cast.numeroInterior )) {
			return false;
		}
		
		if (numeroInteriorModified != _cast.numeroInteriorModified) {
			return false;
		}
		
		if (colonia == null ? _cast.colonia != colonia : !colonia.equals( _cast.colonia )) {
			return false;
		}
		
		if (coloniaModified != _cast.coloniaModified) {
			return false;
		}
		
		if (codigoPostal == null ? _cast.codigoPostal != codigoPostal : !codigoPostal.equals( _cast.codigoPostal )) {
			return false;
		}
		
		if (codigoPostalModified != _cast.codigoPostalModified) {
			return false;
		}
		
		if (pais == null ? _cast.pais != pais : !pais.equals( _cast.pais )) {
			return false;
		}
		
		if (paisModified != _cast.paisModified) {
			return false;
		}
		
		if (estado == null ? _cast.estado != estado : !estado.equals( _cast.estado )) {
			return false;
		}
		
		if (estadoModified != _cast.estadoModified) {
			return false;
		}
		
		if (municipio == null ? _cast.municipio != municipio : !municipio.equals( _cast.municipio )) {
			return false;
		}
		
		if (municipioModified != _cast.municipioModified) {
			return false;
		}
		
		if (lada == null ? _cast.lada != lada : !lada.equals( _cast.lada )) {
			return false;
		}
		
		if (ladaModified != _cast.ladaModified) {
			return false;
		}
		
		if (telefono == null ? _cast.telefono != telefono : !telefono.equals( _cast.telefono )) {
			return false;
		}
		
		if (telefonoModified != _cast.telefonoModified) {
			return false;
		}
		
		if (extension == null ? _cast.extension != extension : !extension.equals( _cast.extension )) {
			return false;
		}
		
		if (extensionModified != _cast.extensionModified) {
			return false;
		}
		
		if (celular == null ? _cast.celular != celular : !celular.equals( _cast.celular )) {
			return false;
		}
		
		if (celularModified != _cast.celularModified) {
			return false;
		}
		
		if (correo == null ? _cast.correo != correo : !correo.equals( _cast.correo )) {
			return false;
		}
		
		if (correoModified != _cast.correoModified) {
			return false;
		}
		
		if (contacto == null ? _cast.contacto != contacto : !contacto.equals( _cast.contacto )) {
			return false;
		}
		
		if (contactoModified != _cast.contactoModified) {
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
		
		if (descripcion == null ? _cast.descripcion != descripcion : !descripcion.equals( _cast.descripcion )) {
			return false;
		}
		
		if (descripcionModified != _cast.descripcionModified) {
			return false;
		}
		
		if (nombreEmpresa == null ? _cast.nombreEmpresa != nombreEmpresa : !nombreEmpresa.equals( _cast.nombreEmpresa )) {
			return false;
		}
		
		if (nombreEmpresaModified != _cast.nombreEmpresaModified) {
			return false;
		}
		
		if (latitud == null ? _cast.latitud != latitud : !latitud.equals( _cast.latitud )) {
			return false;
		}
		
		if (latitudModified != _cast.latitudModified) {
			return false;
		}
		
		if (longitud == null ? _cast.longitud != longitud : !longitud.equals( _cast.longitud )) {
			return false;
		}
		
		if (longitudModified != _cast.longitudModified) {
			return false;
		}
		
		if (idCategoriaProveedor != _cast.idCategoriaProveedor) {
			return false;
		}
		
		if (idCategoriaProveedorNull != _cast.idCategoriaProveedorNull) {
			return false;
		}
		
		if (idCategoriaProveedorModified != _cast.idCategoriaProveedorModified) {
			return false;
		}
		
		if (nombreImagenProveedor == null ? _cast.nombreImagenProveedor != nombreImagenProveedor : !nombreImagenProveedor.equals( _cast.nombreImagenProveedor )) {
			return false;
		}
		
		if (nombreImagenProveedorModified != _cast.nombreImagenProveedorModified) {
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
		_hashCode = 29 * _hashCode + idProveedor;
		_hashCode = 29 * _hashCode + (idProveedorModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idEmpresa;
		_hashCode = 29 * _hashCode + (idEmpresaModified ? 1 : 0);
		if (numeroProveedor != null) {
			_hashCode = 29 * _hashCode + numeroProveedor.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (numeroProveedorModified ? 1 : 0);
		if (rfc != null) {
			_hashCode = 29 * _hashCode + rfc.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (rfcModified ? 1 : 0);
		if (razonSocial != null) {
			_hashCode = 29 * _hashCode + razonSocial.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (razonSocialModified ? 1 : 0);
		if (calle != null) {
			_hashCode = 29 * _hashCode + calle.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (calleModified ? 1 : 0);
		if (numero != null) {
			_hashCode = 29 * _hashCode + numero.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (numeroModified ? 1 : 0);
		if (numeroInterior != null) {
			_hashCode = 29 * _hashCode + numeroInterior.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (numeroInteriorModified ? 1 : 0);
		if (colonia != null) {
			_hashCode = 29 * _hashCode + colonia.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (coloniaModified ? 1 : 0);
		if (codigoPostal != null) {
			_hashCode = 29 * _hashCode + codigoPostal.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (codigoPostalModified ? 1 : 0);
		if (pais != null) {
			_hashCode = 29 * _hashCode + pais.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (paisModified ? 1 : 0);
		if (estado != null) {
			_hashCode = 29 * _hashCode + estado.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (estadoModified ? 1 : 0);
		if (municipio != null) {
			_hashCode = 29 * _hashCode + municipio.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (municipioModified ? 1 : 0);
		if (lada != null) {
			_hashCode = 29 * _hashCode + lada.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (ladaModified ? 1 : 0);
		if (telefono != null) {
			_hashCode = 29 * _hashCode + telefono.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (telefonoModified ? 1 : 0);
		if (extension != null) {
			_hashCode = 29 * _hashCode + extension.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (extensionModified ? 1 : 0);
		if (celular != null) {
			_hashCode = 29 * _hashCode + celular.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (celularModified ? 1 : 0);
		if (correo != null) {
			_hashCode = 29 * _hashCode + correo.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (correoModified ? 1 : 0);
		if (contacto != null) {
			_hashCode = 29 * _hashCode + contacto.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (contactoModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idEstatus;
		_hashCode = 29 * _hashCode + (idEstatusNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idEstatusModified ? 1 : 0);
		if (descripcion != null) {
			_hashCode = 29 * _hashCode + descripcion.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (descripcionModified ? 1 : 0);
		if (nombreEmpresa != null) {
			_hashCode = 29 * _hashCode + nombreEmpresa.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (nombreEmpresaModified ? 1 : 0);
		if (latitud != null) {
			_hashCode = 29 * _hashCode + latitud.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (latitudModified ? 1 : 0);
		if (longitud != null) {
			_hashCode = 29 * _hashCode + longitud.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (longitudModified ? 1 : 0);
		_hashCode = 29 * _hashCode + idCategoriaProveedor;
		_hashCode = 29 * _hashCode + (idCategoriaProveedorNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idCategoriaProveedorModified ? 1 : 0);
		if (nombreImagenProveedor != null) {
			_hashCode = 29 * _hashCode + nombreImagenProveedor.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (nombreImagenProveedorModified ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return SgfensProveedorPk
	 */
	public SgfensProveedorPk createPk()
	{
		return new SgfensProveedorPk(idProveedor);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.tsp.sct.dao.dto.SgfensProveedor: " );
		ret.append( "idProveedor=" + idProveedor );
		ret.append( ", idEmpresa=" + idEmpresa );
		ret.append( ", numeroProveedor=" + numeroProveedor );
		ret.append( ", rfc=" + rfc );
		ret.append( ", razonSocial=" + razonSocial );
		ret.append( ", calle=" + calle );
		ret.append( ", numero=" + numero );
		ret.append( ", numeroInterior=" + numeroInterior );
		ret.append( ", colonia=" + colonia );
		ret.append( ", codigoPostal=" + codigoPostal );
		ret.append( ", pais=" + pais );
		ret.append( ", estado=" + estado );
		ret.append( ", municipio=" + municipio );
		ret.append( ", lada=" + lada );
		ret.append( ", telefono=" + telefono );
		ret.append( ", extension=" + extension );
		ret.append( ", celular=" + celular );
		ret.append( ", correo=" + correo );
		ret.append( ", contacto=" + contacto );
		ret.append( ", idEstatus=" + idEstatus );
		ret.append( ", descripcion=" + descripcion );
		ret.append( ", nombreEmpresa=" + nombreEmpresa );
		ret.append( ", latitud=" + latitud );
		ret.append( ", longitud=" + longitud );
		ret.append( ", idCategoriaProveedor=" + idCategoriaProveedor );
		ret.append( ", nombreImagenProveedor=" + nombreImagenProveedor );
		return ret.toString();
	}

}
