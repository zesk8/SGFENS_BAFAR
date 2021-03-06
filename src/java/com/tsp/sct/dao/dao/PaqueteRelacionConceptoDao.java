/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.tsp.sct.dao.dao;

import com.tsp.sct.dao.dto.*;
import com.tsp.sct.dao.exceptions.*;

public interface PaqueteRelacionConceptoDao
{
	/** 
	 * Inserts a new row in the paquete_relacion_concepto table.
	 */
	public PaqueteRelacionConceptoPk insert(PaqueteRelacionConcepto dto) throws PaqueteRelacionConceptoDaoException;

	/** 
	 * Updates a single row in the paquete_relacion_concepto table.
	 */
	public void update(PaqueteRelacionConceptoPk pk, PaqueteRelacionConcepto dto) throws PaqueteRelacionConceptoDaoException;

	/** 
	 * Deletes a single row in the paquete_relacion_concepto table.
	 */
	public void delete(PaqueteRelacionConceptoPk pk) throws PaqueteRelacionConceptoDaoException;

	/** 
	 * Returns the rows from the paquete_relacion_concepto table that matches the specified primary-key value.
	 */
	public PaqueteRelacionConcepto findByPrimaryKey(PaqueteRelacionConceptoPk pk) throws PaqueteRelacionConceptoDaoException;

	/** 
	 * Returns all rows from the paquete_relacion_concepto table that match the criteria 'ID_PAQUETE_RELACION_CONCEPTO = :idPaqueteRelacionConcepto'.
	 */
	public PaqueteRelacionConcepto findByPrimaryKey(int idPaqueteRelacionConcepto) throws PaqueteRelacionConceptoDaoException;

	/** 
	 * Returns all rows from the paquete_relacion_concepto table that match the criteria ''.
	 */
	public PaqueteRelacionConcepto[] findAll() throws PaqueteRelacionConceptoDaoException;

	/** 
	 * Returns all rows from the paquete_relacion_concepto table that match the criteria 'ID_PAQUETE_RELACION_CONCEPTO = :idPaqueteRelacionConcepto'.
	 */
	public PaqueteRelacionConcepto[] findWhereIdPaqueteRelacionConceptoEquals(int idPaqueteRelacionConcepto) throws PaqueteRelacionConceptoDaoException;

	/** 
	 * Returns all rows from the paquete_relacion_concepto table that match the criteria 'ID_ESTATUS = :idEstatus'.
	 */
	public PaqueteRelacionConcepto[] findWhereIdEstatusEquals(int idEstatus) throws PaqueteRelacionConceptoDaoException;

	/** 
	 * Returns all rows from the paquete_relacion_concepto table that match the criteria 'ID_PAQUETE = :idPaquete'.
	 */
	public PaqueteRelacionConcepto[] findWhereIdPaqueteEquals(int idPaquete) throws PaqueteRelacionConceptoDaoException;

	/** 
	 * Returns all rows from the paquete_relacion_concepto table that match the criteria 'ID_CONCEPTO = :idConcepto'.
	 */
	public PaqueteRelacionConcepto[] findWhereIdConceptoEquals(int idConcepto) throws PaqueteRelacionConceptoDaoException;

	/** 
	 * Returns all rows from the paquete_relacion_concepto table that match the criteria 'CANTIDAD = :cantidad'.
	 */
	public PaqueteRelacionConcepto[] findWhereCantidadEquals(double cantidad) throws PaqueteRelacionConceptoDaoException;

	/** 
	 * Returns all rows from the paquete_relacion_concepto table that match the criteria 'PRECIO = :precio'.
	 */
	public PaqueteRelacionConcepto[] findWherePrecioEquals(double precio) throws PaqueteRelacionConceptoDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the paquete_relacion_concepto table that match the specified arbitrary SQL statement
	 */
	public PaqueteRelacionConcepto[] findByDynamicSelect(String sql, Object[] sqlParams) throws PaqueteRelacionConceptoDaoException;

	/** 
	 * Returns all rows from the paquete_relacion_concepto table that match the specified arbitrary SQL statement
	 */
	public PaqueteRelacionConcepto[] findByDynamicWhere(String sql, Object[] sqlParams) throws PaqueteRelacionConceptoDaoException;

}
