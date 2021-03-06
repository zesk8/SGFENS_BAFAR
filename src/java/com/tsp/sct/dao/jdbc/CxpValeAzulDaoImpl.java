/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.tsp.sct.dao.jdbc;

import com.tsp.sct.dao.dao.*;
import com.tsp.sct.dao.factory.*;
import java.util.Date;
import com.tsp.sct.dao.dto.*;
import com.tsp.sct.dao.exceptions.*;
import java.sql.Connection;
import java.util.Collection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class CxpValeAzulDaoImpl extends AbstractDAO implements CxpValeAzulDao
{
	/** 
	 * The factory class for this DAO has two versions of the create() method - one that
takes no arguments and one that takes a Connection argument. If the Connection version
is chosen then the connection will be stored in this attribute and will be used by all
calls to this DAO, otherwise a new Connection will be allocated for each operation.
	 */
	protected java.sql.Connection userConn;

	/** 
	 * All finder methods in this class use this SELECT constant to build their queries
	 */
	protected final String SQL_SELECT = "SELECT ID_CXP_VALE_AZUL, ID_EMPRESA, ID_FOLIO, FOLIO_GENERADO, IMPORTE, IMPORTE_PAGADO, CONCEPTO, FECHA_HORA_CAPTURA, FECHA_HORA_CONTROL, ID_ESTATUS, FECHA_TENTATIVA_PAGO FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( ID_CXP_VALE_AZUL, ID_EMPRESA, ID_FOLIO, FOLIO_GENERADO, IMPORTE, IMPORTE_PAGADO, CONCEPTO, FECHA_HORA_CAPTURA, FECHA_HORA_CONTROL, ID_ESTATUS, FECHA_TENTATIVA_PAGO ) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET ID_CXP_VALE_AZUL = ?, ID_EMPRESA = ?, ID_FOLIO = ?, FOLIO_GENERADO = ?, IMPORTE = ?, IMPORTE_PAGADO = ?, CONCEPTO = ?, FECHA_HORA_CAPTURA = ?, FECHA_HORA_CONTROL = ?, ID_ESTATUS = ?, FECHA_TENTATIVA_PAGO = ? WHERE ID_CXP_VALE_AZUL = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE ID_CXP_VALE_AZUL = ?";

	/** 
	 * Index of column ID_CXP_VALE_AZUL
	 */
	protected static final int COLUMN_ID_CXP_VALE_AZUL = 1;

	/** 
	 * Index of column ID_EMPRESA
	 */
	protected static final int COLUMN_ID_EMPRESA = 2;

	/** 
	 * Index of column ID_FOLIO
	 */
	protected static final int COLUMN_ID_FOLIO = 3;

	/** 
	 * Index of column FOLIO_GENERADO
	 */
	protected static final int COLUMN_FOLIO_GENERADO = 4;

	/** 
	 * Index of column IMPORTE
	 */
	protected static final int COLUMN_IMPORTE = 5;

	/** 
	 * Index of column IMPORTE_PAGADO
	 */
	protected static final int COLUMN_IMPORTE_PAGADO = 6;

	/** 
	 * Index of column CONCEPTO
	 */
	protected static final int COLUMN_CONCEPTO = 7;

	/** 
	 * Index of column FECHA_HORA_CAPTURA
	 */
	protected static final int COLUMN_FECHA_HORA_CAPTURA = 8;

	/** 
	 * Index of column FECHA_HORA_CONTROL
	 */
	protected static final int COLUMN_FECHA_HORA_CONTROL = 9;

	/** 
	 * Index of column ID_ESTATUS
	 */
	protected static final int COLUMN_ID_ESTATUS = 10;

	/** 
	 * Index of column FECHA_TENTATIVA_PAGO
	 */
	protected static final int COLUMN_FECHA_TENTATIVA_PAGO = 11;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 11;

	/** 
	 * Index of primary-key column ID_CXP_VALE_AZUL
	 */
	protected static final int PK_COLUMN_ID_CXP_VALE_AZUL = 1;

	/** 
	 * Inserts a new row in the cxp_vale_azul table.
	 */
	public CxpValeAzulPk insert(CxpValeAzul dto) throws CxpValeAzulDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			StringBuffer sql = new StringBuffer();
			StringBuffer values = new StringBuffer();
			sql.append( "INSERT INTO " + getTableName() + " (" );
			int modifiedCount = 0;
			if (dto.isIdCxpValeAzulModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_CXP_VALE_AZUL" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isIdEmpresaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_EMPRESA" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isIdFolioModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_FOLIO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isFolioGeneradoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "FOLIO_GENERADO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isImporteModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "IMPORTE" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isImportePagadoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "IMPORTE_PAGADO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isConceptoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "CONCEPTO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isFechaHoraCapturaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "FECHA_HORA_CAPTURA" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isFechaHoraControlModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "FECHA_HORA_CONTROL" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isIdEstatusModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_ESTATUS" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isFechaTentativaPagoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "FECHA_TENTATIVA_PAGO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (modifiedCount==0) {
				// nothing to insert
				throw new IllegalStateException( "Nothing to insert" );
			}
		
			sql.append( ") VALUES (" );
			sql.append( values );
			sql.append( ")" );
			stmt = conn.prepareStatement( sql.toString(), Statement.RETURN_GENERATED_KEYS );
			int index = 1;
			if (dto.isIdCxpValeAzulModified()) {
				stmt.setInt( index++, dto.getIdCxpValeAzul() );
			}
		
			if (dto.isIdEmpresaModified()) {
				stmt.setInt( index++, dto.getIdEmpresa() );
			}
		
			if (dto.isIdFolioModified()) {
				if (dto.isIdFolioNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdFolio() );
				}
		
			}
		
			if (dto.isFolioGeneradoModified()) {
				stmt.setString( index++, dto.getFolioGenerado() );
			}
		
			if (dto.isImporteModified()) {
				stmt.setDouble( index++, dto.getImporte() );
			}
		
			if (dto.isImportePagadoModified()) {
				stmt.setDouble( index++, dto.getImportePagado() );
			}
		
			if (dto.isConceptoModified()) {
				stmt.setString( index++, dto.getConcepto() );
			}
		
			if (dto.isFechaHoraCapturaModified()) {
				stmt.setTimestamp(index++, dto.getFechaHoraCaptura()==null ? null : new java.sql.Timestamp( dto.getFechaHoraCaptura().getTime() ) );
			}
		
			if (dto.isFechaHoraControlModified()) {
				stmt.setTimestamp(index++, dto.getFechaHoraControl()==null ? null : new java.sql.Timestamp( dto.getFechaHoraControl().getTime() ) );
			}
		
			if (dto.isIdEstatusModified()) {
				if (dto.isIdEstatusNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdEstatus() );
				}
		
			}
		
			if (dto.isFechaTentativaPagoModified()) {
				stmt.setTimestamp(index++, dto.getFechaTentativaPago()==null ? null : new java.sql.Timestamp( dto.getFechaTentativaPago().getTime() ) );
			}
		
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		
			// retrieve values from auto-increment columns
			rs = stmt.getGeneratedKeys();
			if (rs != null && rs.next()) {
				dto.setIdCxpValeAzul( rs.getInt( 1 ) );
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new CxpValeAzulDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the cxp_vale_azul table.
	 */
	public void update(CxpValeAzulPk pk, CxpValeAzul dto) throws CxpValeAzulDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			StringBuffer sql = new StringBuffer();
			sql.append( "UPDATE " + getTableName() + " SET " );
			boolean modified = false;
			if (dto.isIdCxpValeAzulModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_CXP_VALE_AZUL=?" );
				modified=true;
			}
		
			if (dto.isIdEmpresaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_EMPRESA=?" );
				modified=true;
			}
		
			if (dto.isIdFolioModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_FOLIO=?" );
				modified=true;
			}
		
			if (dto.isFolioGeneradoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "FOLIO_GENERADO=?" );
				modified=true;
			}
		
			if (dto.isImporteModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "IMPORTE=?" );
				modified=true;
			}
		
			if (dto.isImportePagadoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "IMPORTE_PAGADO=?" );
				modified=true;
			}
		
			if (dto.isConceptoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "CONCEPTO=?" );
				modified=true;
			}
		
			if (dto.isFechaHoraCapturaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "FECHA_HORA_CAPTURA=?" );
				modified=true;
			}
		
			if (dto.isFechaHoraControlModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "FECHA_HORA_CONTROL=?" );
				modified=true;
			}
		
			if (dto.isIdEstatusModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_ESTATUS=?" );
				modified=true;
			}
		
			if (dto.isFechaTentativaPagoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "FECHA_TENTATIVA_PAGO=?" );
				modified=true;
			}
		
			if (!modified) {
				// nothing to update
				return;
			}
		
			sql.append( " WHERE ID_CXP_VALE_AZUL=?" );
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isIdCxpValeAzulModified()) {
				stmt.setInt( index++, dto.getIdCxpValeAzul() );
			}
		
			if (dto.isIdEmpresaModified()) {
				stmt.setInt( index++, dto.getIdEmpresa() );
			}
		
			if (dto.isIdFolioModified()) {
				if (dto.isIdFolioNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdFolio() );
				}
		
			}
		
			if (dto.isFolioGeneradoModified()) {
				stmt.setString( index++, dto.getFolioGenerado() );
			}
		
			if (dto.isImporteModified()) {
				stmt.setDouble( index++, dto.getImporte() );
			}
		
			if (dto.isImportePagadoModified()) {
				stmt.setDouble( index++, dto.getImportePagado() );
			}
		
			if (dto.isConceptoModified()) {
				stmt.setString( index++, dto.getConcepto() );
			}
		
			if (dto.isFechaHoraCapturaModified()) {
				stmt.setTimestamp(index++, dto.getFechaHoraCaptura()==null ? null : new java.sql.Timestamp( dto.getFechaHoraCaptura().getTime() ) );
			}
		
			if (dto.isFechaHoraControlModified()) {
				stmt.setTimestamp(index++, dto.getFechaHoraControl()==null ? null : new java.sql.Timestamp( dto.getFechaHoraControl().getTime() ) );
			}
		
			if (dto.isIdEstatusModified()) {
				if (dto.isIdEstatusNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdEstatus() );
				}
		
			}
		
			if (dto.isFechaTentativaPagoModified()) {
				stmt.setTimestamp(index++, dto.getFechaTentativaPago()==null ? null : new java.sql.Timestamp( dto.getFechaTentativaPago().getTime() ) );
			}
		
			stmt.setInt( index++, pk.getIdCxpValeAzul() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new CxpValeAzulDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the cxp_vale_azul table.
	 */
	public void delete(CxpValeAzulPk pk) throws CxpValeAzulDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			System.out.println( "Executing " + SQL_DELETE + " with PK: " + pk );
			stmt = conn.prepareStatement( SQL_DELETE );
			stmt.setInt( 1, pk.getIdCxpValeAzul() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new CxpValeAzulDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the cxp_vale_azul table that matches the specified primary-key value.
	 */
	public CxpValeAzul findByPrimaryKey(CxpValeAzulPk pk) throws CxpValeAzulDaoException
	{
		return findByPrimaryKey( pk.getIdCxpValeAzul() );
	}

	/** 
	 * Returns all rows from the cxp_vale_azul table that match the criteria 'ID_CXP_VALE_AZUL = :idCxpValeAzul'.
	 */
	public CxpValeAzul findByPrimaryKey(int idCxpValeAzul) throws CxpValeAzulDaoException
	{
		CxpValeAzul ret[] = findByDynamicSelect( SQL_SELECT + " WHERE ID_CXP_VALE_AZUL = ?", new Object[] {  new Integer(idCxpValeAzul) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the cxp_vale_azul table that match the criteria ''.
	 */
	public CxpValeAzul[] findAll() throws CxpValeAzulDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY ID_CXP_VALE_AZUL", null );
	}

	/** 
	 * Returns all rows from the cxp_vale_azul table that match the criteria 'ID_CXP_VALE_AZUL = :idCxpValeAzul'.
	 */
	public CxpValeAzul[] findWhereIdCxpValeAzulEquals(int idCxpValeAzul) throws CxpValeAzulDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_CXP_VALE_AZUL = ? ORDER BY ID_CXP_VALE_AZUL", new Object[] {  new Integer(idCxpValeAzul) } );
	}

	/** 
	 * Returns all rows from the cxp_vale_azul table that match the criteria 'ID_EMPRESA = :idEmpresa'.
	 */
	public CxpValeAzul[] findWhereIdEmpresaEquals(int idEmpresa) throws CxpValeAzulDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_EMPRESA = ? ORDER BY ID_EMPRESA", new Object[] {  new Integer(idEmpresa) } );
	}

	/** 
	 * Returns all rows from the cxp_vale_azul table that match the criteria 'ID_FOLIO = :idFolio'.
	 */
	public CxpValeAzul[] findWhereIdFolioEquals(int idFolio) throws CxpValeAzulDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_FOLIO = ? ORDER BY ID_FOLIO", new Object[] {  new Integer(idFolio) } );
	}

	/** 
	 * Returns all rows from the cxp_vale_azul table that match the criteria 'FOLIO_GENERADO = :folioGenerado'.
	 */
	public CxpValeAzul[] findWhereFolioGeneradoEquals(String folioGenerado) throws CxpValeAzulDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE FOLIO_GENERADO = ? ORDER BY FOLIO_GENERADO", new Object[] { folioGenerado } );
	}

	/** 
	 * Returns all rows from the cxp_vale_azul table that match the criteria 'IMPORTE = :importe'.
	 */
	public CxpValeAzul[] findWhereImporteEquals(double importe) throws CxpValeAzulDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE IMPORTE = ? ORDER BY IMPORTE", new Object[] {  new Double(importe) } );
	}

	/** 
	 * Returns all rows from the cxp_vale_azul table that match the criteria 'IMPORTE_PAGADO = :importePagado'.
	 */
	public CxpValeAzul[] findWhereImportePagadoEquals(double importePagado) throws CxpValeAzulDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE IMPORTE_PAGADO = ? ORDER BY IMPORTE_PAGADO", new Object[] {  new Double(importePagado) } );
	}

	/** 
	 * Returns all rows from the cxp_vale_azul table that match the criteria 'CONCEPTO = :concepto'.
	 */
	public CxpValeAzul[] findWhereConceptoEquals(String concepto) throws CxpValeAzulDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE CONCEPTO = ? ORDER BY CONCEPTO", new Object[] { concepto } );
	}

	/** 
	 * Returns all rows from the cxp_vale_azul table that match the criteria 'FECHA_HORA_CAPTURA = :fechaHoraCaptura'.
	 */
	public CxpValeAzul[] findWhereFechaHoraCapturaEquals(Date fechaHoraCaptura) throws CxpValeAzulDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE FECHA_HORA_CAPTURA = ? ORDER BY FECHA_HORA_CAPTURA", new Object[] { fechaHoraCaptura==null ? null : new java.sql.Timestamp( fechaHoraCaptura.getTime() ) } );
	}

	/** 
	 * Returns all rows from the cxp_vale_azul table that match the criteria 'FECHA_HORA_CONTROL = :fechaHoraControl'.
	 */
	public CxpValeAzul[] findWhereFechaHoraControlEquals(Date fechaHoraControl) throws CxpValeAzulDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE FECHA_HORA_CONTROL = ? ORDER BY FECHA_HORA_CONTROL", new Object[] { fechaHoraControl==null ? null : new java.sql.Timestamp( fechaHoraControl.getTime() ) } );
	}

	/** 
	 * Returns all rows from the cxp_vale_azul table that match the criteria 'FECHA_TENTATIVA_PAGO = :fechaTentativaPago'.
	 */
	public CxpValeAzul[] findWhereFechaTentativaPagoEquals(Date fechaTentativaPago) throws CxpValeAzulDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE FECHA_TENTATIVA_PAGO = ? ORDER BY FECHA_TENTATIVA_PAGO", new Object[] { fechaTentativaPago==null ? null : new java.sql.Timestamp( fechaTentativaPago.getTime() ) } );
	}

	/** 
	 * Returns all rows from the cxp_vale_azul table that match the criteria 'ID_ESTATUS = :idEstatus'.
	 */
	public CxpValeAzul[] findWhereIdEstatusEquals(int idEstatus) throws CxpValeAzulDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_ESTATUS = ? ORDER BY ID_ESTATUS", new Object[] {  new Integer(idEstatus) } );
	}

	/**
	 * Method 'CxpValeAzulDaoImpl'
	 * 
	 */
	public CxpValeAzulDaoImpl()
	{
	}

	/**
	 * Method 'CxpValeAzulDaoImpl'
	 * 
	 * @param userConn
	 */
	public CxpValeAzulDaoImpl(final java.sql.Connection userConn)
	{
		this.userConn = userConn;
	}

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows)
	{
		this.maxRows = maxRows;
	}

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows()
	{
		return maxRows;
	}

	/**
	 * Method 'getTableName'
	 * 
	 * @return String
	 */
	public String getTableName()
	{
		return "cxp_vale_azul";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected CxpValeAzul fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			CxpValeAzul dto = new CxpValeAzul();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected CxpValeAzul[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			CxpValeAzul dto = new CxpValeAzul();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		CxpValeAzul ret[] = new CxpValeAzul[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(CxpValeAzul dto, ResultSet rs) throws SQLException
	{
		dto.setIdCxpValeAzul( rs.getInt( COLUMN_ID_CXP_VALE_AZUL ) );
		dto.setIdEmpresa( rs.getInt( COLUMN_ID_EMPRESA ) );
		dto.setIdFolio( rs.getInt( COLUMN_ID_FOLIO ) );
		if (rs.wasNull()) {
			dto.setIdFolioNull( true );
		}
		
		dto.setFolioGenerado( rs.getString( COLUMN_FOLIO_GENERADO ) );
		dto.setImporte( rs.getDouble( COLUMN_IMPORTE ) );
		dto.setImportePagado( rs.getDouble( COLUMN_IMPORTE_PAGADO ) );
		dto.setConcepto( rs.getString( COLUMN_CONCEPTO ) );
		dto.setFechaHoraCaptura( rs.getTimestamp(COLUMN_FECHA_HORA_CAPTURA ) );
		dto.setFechaHoraControl( rs.getTimestamp(COLUMN_FECHA_HORA_CONTROL ) );
		dto.setIdEstatus( rs.getInt( COLUMN_ID_ESTATUS ) );
		if (rs.wasNull()) {
			dto.setIdEstatusNull( true );
		}
		
		dto.setFechaTentativaPago( rs.getTimestamp(COLUMN_FECHA_TENTATIVA_PAGO ) );
		reset(dto);
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(CxpValeAzul dto)
	{
		dto.setIdCxpValeAzulModified( false );
		dto.setIdEmpresaModified( false );
		dto.setIdFolioModified( false );
		dto.setFolioGeneradoModified( false );
		dto.setImporteModified( false );
		dto.setImportePagadoModified( false );
		dto.setConceptoModified( false );
		dto.setFechaHoraCapturaModified( false );
		dto.setFechaHoraControlModified( false );
		dto.setIdEstatusModified( false );
		dto.setFechaTentativaPagoModified( false );
	}

	/** 
	 * Returns all rows from the cxp_vale_azul table that match the specified arbitrary SQL statement
	 */
	public CxpValeAzul[] findByDynamicSelect(String sql, Object[] sqlParams) throws CxpValeAzulDaoException
	{
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			// construct the SQL statement
			final String SQL = sql;
		
		
			System.out.println( "Executing " + SQL );
			// prepare statement
			stmt = conn.prepareStatement( SQL );
			stmt.setMaxRows( maxRows );
		
			// bind parameters
			for (int i=0; sqlParams!=null && i<sqlParams.length; i++ ) {
				stmt.setObject( i+1, sqlParams[i] );
			}
		
		
			rs = stmt.executeQuery();
		
			// fetch the results
			return fetchMultiResults(rs);
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new CxpValeAzulDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(rs);
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns all rows from the cxp_vale_azul table that match the specified arbitrary SQL statement
	 */
	public CxpValeAzul[] findByDynamicWhere(String sql, Object[] sqlParams) throws CxpValeAzulDaoException
	{
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			// construct the SQL statement
			final String SQL = SQL_SELECT + " WHERE " + sql;
		
		
			System.out.println( "Executing " + SQL );
			// prepare statement
			stmt = conn.prepareStatement( SQL );
			stmt.setMaxRows( maxRows );
		
			// bind parameters
			for (int i=0; sqlParams!=null && i<sqlParams.length; i++ ) {
				stmt.setObject( i+1, sqlParams[i] );
			}
		
		
			rs = stmt.executeQuery();
		
			// fetch the results
			return fetchMultiResults(rs);
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new CxpValeAzulDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(rs);
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

}
