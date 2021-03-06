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

public interface TipoPuntoInteresDao
{
	/** 
	 * Inserts a new row in the tipo_punto_interes table.
	 */
	public TipoPuntoInteresPk insert(TipoPuntoInteres dto) throws TipoPuntoInteresDaoException;

	/** 
	 * Updates a single row in the tipo_punto_interes table.
	 */
	public void update(TipoPuntoInteresPk pk, TipoPuntoInteres dto) throws TipoPuntoInteresDaoException;

	/** 
	 * Deletes a single row in the tipo_punto_interes table.
	 */
	public void delete(TipoPuntoInteresPk pk) throws TipoPuntoInteresDaoException;

	/** 
	 * Returns the rows from the tipo_punto_interes table that matches the specified primary-key value.
	 */
	public TipoPuntoInteres findByPrimaryKey(TipoPuntoInteresPk pk) throws TipoPuntoInteresDaoException;

	/** 
	 * Returns all rows from the tipo_punto_interes table that match the criteria 'ID_TIPO_PUNTO = :idTipoPunto'.
	 */
	public TipoPuntoInteres findByPrimaryKey(int idTipoPunto) throws TipoPuntoInteresDaoException;

	/** 
	 * Returns all rows from the tipo_punto_interes table that match the criteria ''.
	 */
	public TipoPuntoInteres[] findAll() throws TipoPuntoInteresDaoException;

	/** 
	 * Returns all rows from the tipo_punto_interes table that match the criteria 'ID_TIPO_PUNTO = :idTipoPunto'.
	 */
	public TipoPuntoInteres[] findWhereIdTipoPuntoEquals(int idTipoPunto) throws TipoPuntoInteresDaoException;

	/** 
	 * Returns all rows from the tipo_punto_interes table that match the criteria 'NOMBRE_TIPO_PUNTO = :nombreTipoPunto'.
	 */
	public TipoPuntoInteres[] findWhereNombreTipoPuntoEquals(String nombreTipoPunto) throws TipoPuntoInteresDaoException;

	/** 
	 * Returns all rows from the tipo_punto_interes table that match the criteria 'SUFIJO_IMG_TIPO_PUNTO = :sufijoImgTipoPunto'.
	 */
	public TipoPuntoInteres[] findWhereSufijoImgTipoPuntoEquals(String sufijoImgTipoPunto) throws TipoPuntoInteresDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the tipo_punto_interes table that match the specified arbitrary SQL statement
	 */
	public TipoPuntoInteres[] findByDynamicSelect(String sql, Object[] sqlParams) throws TipoPuntoInteresDaoException;

	/** 
	 * Returns all rows from the tipo_punto_interes table that match the specified arbitrary SQL statement
	 */
	public TipoPuntoInteres[] findByDynamicWhere(String sql, Object[] sqlParams) throws TipoPuntoInteresDaoException;

}
