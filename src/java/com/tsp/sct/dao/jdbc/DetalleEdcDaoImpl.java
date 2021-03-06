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

public class DetalleEdcDaoImpl extends AbstractDAO implements DetalleEdcDao
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
	protected final String SQL_SELECT = "SELECT ID_DETALLE_EDC, ID_EMPRESA, ID_TIPO_EDC, ID_FOLIO, ARCHIVO, EDC_GENERADOS, FOLIO_INICIAL, FOLIO_FINAL, FECHA FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( ID_DETALLE_EDC, ID_EMPRESA, ID_TIPO_EDC, ID_FOLIO, ARCHIVO, EDC_GENERADOS, FOLIO_INICIAL, FOLIO_FINAL, FECHA ) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET ID_DETALLE_EDC = ?, ID_EMPRESA = ?, ID_TIPO_EDC = ?, ID_FOLIO = ?, ARCHIVO = ?, EDC_GENERADOS = ?, FOLIO_INICIAL = ?, FOLIO_FINAL = ?, FECHA = ? WHERE ID_DETALLE_EDC = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE ID_DETALLE_EDC = ?";

	/** 
	 * Index of column ID_DETALLE_EDC
	 */
	protected static final int COLUMN_ID_DETALLE_EDC = 1;

	/** 
	 * Index of column ID_EMPRESA
	 */
	protected static final int COLUMN_ID_EMPRESA = 2;

	/** 
	 * Index of column ID_TIPO_EDC
	 */
	protected static final int COLUMN_ID_TIPO_EDC = 3;

	/** 
	 * Index of column ID_FOLIO
	 */
	protected static final int COLUMN_ID_FOLIO = 4;

	/** 
	 * Index of column ARCHIVO
	 */
	protected static final int COLUMN_ARCHIVO = 5;

	/** 
	 * Index of column EDC_GENERADOS
	 */
	protected static final int COLUMN_EDC_GENERADOS = 6;

	/** 
	 * Index of column FOLIO_INICIAL
	 */
	protected static final int COLUMN_FOLIO_INICIAL = 7;

	/** 
	 * Index of column FOLIO_FINAL
	 */
	protected static final int COLUMN_FOLIO_FINAL = 8;

	/** 
	 * Index of column FECHA
	 */
	protected static final int COLUMN_FECHA = 9;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 9;

	/** 
	 * Index of primary-key column ID_DETALLE_EDC
	 */
	protected static final int PK_COLUMN_ID_DETALLE_EDC = 1;

	/** 
	 * Inserts a new row in the detalle_edc table.
	 */
	public DetalleEdcPk insert(DetalleEdc dto) throws DetalleEdcDaoException
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
		
			stmt = conn.prepareStatement( SQL_INSERT );
			int index = 1;
			stmt.setInt( index++, dto.getIdDetalleEdc() );
			stmt.setInt( index++, dto.getIdEmpresa() );
			stmt.setInt( index++, dto.getIdTipoEdc() );
			stmt.setInt( index++, dto.getIdFolio() );
			stmt.setString( index++, dto.getArchivo() );
			stmt.setInt( index++, dto.getEdcGenerados() );
			stmt.setInt( index++, dto.getFolioInicial() );
			stmt.setInt( index++, dto.getFolioFinal() );
			stmt.setDate(index++, dto.getFecha()==null ? null : new java.sql.Date( dto.getFecha().getTime() ) );
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new DetalleEdcDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the detalle_edc table.
	 */
	public void update(DetalleEdcPk pk, DetalleEdc dto) throws DetalleEdcDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			System.out.println( "Executing " + SQL_UPDATE + " with DTO: " + dto );
			stmt = conn.prepareStatement( SQL_UPDATE );
			int index=1;
			stmt.setInt( index++, dto.getIdDetalleEdc() );
			stmt.setInt( index++, dto.getIdEmpresa() );
			stmt.setInt( index++, dto.getIdTipoEdc() );
			stmt.setInt( index++, dto.getIdFolio() );
			stmt.setString( index++, dto.getArchivo() );
			stmt.setInt( index++, dto.getEdcGenerados() );
			stmt.setInt( index++, dto.getFolioInicial() );
			stmt.setInt( index++, dto.getFolioFinal() );
			stmt.setDate(index++, dto.getFecha()==null ? null : new java.sql.Date( dto.getFecha().getTime() ) );
			stmt.setInt( 10, pk.getIdDetalleEdc() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new DetalleEdcDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the detalle_edc table.
	 */
	public void delete(DetalleEdcPk pk) throws DetalleEdcDaoException
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
			stmt.setInt( 1, pk.getIdDetalleEdc() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new DetalleEdcDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the detalle_edc table that matches the specified primary-key value.
	 */
	public DetalleEdc findByPrimaryKey(DetalleEdcPk pk) throws DetalleEdcDaoException
	{
		return findByPrimaryKey( pk.getIdDetalleEdc() );
	}

	/** 
	 * Returns all rows from the detalle_edc table that match the criteria 'ID_DETALLE_EDC = :idDetalleEdc'.
	 */
	public DetalleEdc findByPrimaryKey(int idDetalleEdc) throws DetalleEdcDaoException
	{
		DetalleEdc ret[] = findByDynamicSelect( SQL_SELECT + " WHERE ID_DETALLE_EDC = ?", new Object[] {  new Integer(idDetalleEdc) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the detalle_edc table that match the criteria ''.
	 */
	public DetalleEdc[] findAll() throws DetalleEdcDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY ID_DETALLE_EDC", null );
	}

	/** 
	 * Returns all rows from the detalle_edc table that match the criteria 'ID_DETALLE_EDC = :idDetalleEdc'.
	 */
	public DetalleEdc[] findWhereIdDetalleEdcEquals(int idDetalleEdc) throws DetalleEdcDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_DETALLE_EDC = ? ORDER BY ID_DETALLE_EDC", new Object[] {  new Integer(idDetalleEdc) } );
	}

	/** 
	 * Returns all rows from the detalle_edc table that match the criteria 'ID_EMPRESA = :idEmpresa'.
	 */
	public DetalleEdc[] findWhereIdEmpresaEquals(int idEmpresa) throws DetalleEdcDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_EMPRESA = ? ORDER BY ID_EMPRESA", new Object[] {  new Integer(idEmpresa) } );
	}

	/** 
	 * Returns all rows from the detalle_edc table that match the criteria 'ID_TIPO_EDC = :idTipoEdc'.
	 */
	public DetalleEdc[] findWhereIdTipoEdcEquals(int idTipoEdc) throws DetalleEdcDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_TIPO_EDC = ? ORDER BY ID_TIPO_EDC", new Object[] {  new Integer(idTipoEdc) } );
	}

	/** 
	 * Returns all rows from the detalle_edc table that match the criteria 'ID_FOLIO = :idFolio'.
	 */
	public DetalleEdc[] findWhereIdFolioEquals(int idFolio) throws DetalleEdcDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_FOLIO = ? ORDER BY ID_FOLIO", new Object[] {  new Integer(idFolio) } );
	}

	/** 
	 * Returns all rows from the detalle_edc table that match the criteria 'ARCHIVO = :archivo'.
	 */
	public DetalleEdc[] findWhereArchivoEquals(String archivo) throws DetalleEdcDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ARCHIVO = ? ORDER BY ARCHIVO", new Object[] { archivo } );
	}

	/** 
	 * Returns all rows from the detalle_edc table that match the criteria 'EDC_GENERADOS = :edcGenerados'.
	 */
	public DetalleEdc[] findWhereEdcGeneradosEquals(int edcGenerados) throws DetalleEdcDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE EDC_GENERADOS = ? ORDER BY EDC_GENERADOS", new Object[] {  new Integer(edcGenerados) } );
	}

	/** 
	 * Returns all rows from the detalle_edc table that match the criteria 'FOLIO_INICIAL = :folioInicial'.
	 */
	public DetalleEdc[] findWhereFolioInicialEquals(int folioInicial) throws DetalleEdcDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE FOLIO_INICIAL = ? ORDER BY FOLIO_INICIAL", new Object[] {  new Integer(folioInicial) } );
	}

	/** 
	 * Returns all rows from the detalle_edc table that match the criteria 'FOLIO_FINAL = :folioFinal'.
	 */
	public DetalleEdc[] findWhereFolioFinalEquals(int folioFinal) throws DetalleEdcDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE FOLIO_FINAL = ? ORDER BY FOLIO_FINAL", new Object[] {  new Integer(folioFinal) } );
	}

	/** 
	 * Returns all rows from the detalle_edc table that match the criteria 'FECHA = :fecha'.
	 */
	public DetalleEdc[] findWhereFechaEquals(Date fecha) throws DetalleEdcDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE FECHA = ? ORDER BY FECHA", new Object[] { fecha==null ? null : new java.sql.Date( fecha.getTime() ) } );
	}

	/**
	 * Method 'DetalleEdcDaoImpl'
	 * 
	 */
	public DetalleEdcDaoImpl()
	{
	}

	/**
	 * Method 'DetalleEdcDaoImpl'
	 * 
	 * @param userConn
	 */
	public DetalleEdcDaoImpl(final java.sql.Connection userConn)
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
		return "DETALLE_EDC";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected DetalleEdc fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			DetalleEdc dto = new DetalleEdc();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected DetalleEdc[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			DetalleEdc dto = new DetalleEdc();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		DetalleEdc ret[] = new DetalleEdc[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(DetalleEdc dto, ResultSet rs) throws SQLException
	{
		dto.setIdDetalleEdc( rs.getInt( COLUMN_ID_DETALLE_EDC ) );
		dto.setIdEmpresa( rs.getInt( COLUMN_ID_EMPRESA ) );
		dto.setIdTipoEdc( rs.getInt( COLUMN_ID_TIPO_EDC ) );
		dto.setIdFolio( rs.getInt( COLUMN_ID_FOLIO ) );
		dto.setArchivo( rs.getString( COLUMN_ARCHIVO ) );
		dto.setEdcGenerados( rs.getInt( COLUMN_EDC_GENERADOS ) );
		dto.setFolioInicial( rs.getInt( COLUMN_FOLIO_INICIAL ) );
		dto.setFolioFinal( rs.getInt( COLUMN_FOLIO_FINAL ) );
		dto.setFecha( rs.getDate(COLUMN_FECHA ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(DetalleEdc dto)
	{
	}

	/** 
	 * Returns all rows from the detalle_edc table that match the specified arbitrary SQL statement
	 */
	public DetalleEdc[] findByDynamicSelect(String sql, Object[] sqlParams) throws DetalleEdcDaoException
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
			throw new DetalleEdcDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the detalle_edc table that match the specified arbitrary SQL statement
	 */
	public DetalleEdc[] findByDynamicWhere(String sql, Object[] sqlParams) throws DetalleEdcDaoException
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
			throw new DetalleEdcDaoException( "Exception: " + _e.getMessage(), _e );
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
