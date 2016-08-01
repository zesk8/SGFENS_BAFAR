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

public class QuartzCobranzaAbonoDaoImpl extends AbstractDAO implements QuartzCobranzaAbonoDao
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
	protected final String SQL_SELECT = "SELECT ID_QUARTZ, ID_COBRANZA_EVC, ID_COBRANZA_SISTEM_TERCERO, CLAVE, ID_SISTEMA_TERCERO, ID_EMPRESA FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( ID_QUARTZ, ID_COBRANZA_EVC, ID_COBRANZA_SISTEM_TERCERO, CLAVE, ID_SISTEMA_TERCERO, ID_EMPRESA ) VALUES ( ?, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET ID_QUARTZ = ?, ID_COBRANZA_EVC = ?, ID_COBRANZA_SISTEM_TERCERO = ?, CLAVE = ?, ID_SISTEMA_TERCERO = ?, ID_EMPRESA = ? WHERE ID_QUARTZ = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE ID_QUARTZ = ?";

	/** 
	 * Index of column ID_QUARTZ
	 */
	protected static final int COLUMN_ID_QUARTZ = 1;

	/** 
	 * Index of column ID_COBRANZA_EVC
	 */
	protected static final int COLUMN_ID_COBRANZA_EVC = 2;

	/** 
	 * Index of column ID_COBRANZA_SISTEM_TERCERO
	 */
	protected static final int COLUMN_ID_COBRANZA_SISTEM_TERCERO = 3;

	/** 
	 * Index of column CLAVE
	 */
	protected static final int COLUMN_CLAVE = 4;

	/** 
	 * Index of column ID_SISTEMA_TERCERO
	 */
	protected static final int COLUMN_ID_SISTEMA_TERCERO = 5;

	/** 
	 * Index of column ID_EMPRESA
	 */
	protected static final int COLUMN_ID_EMPRESA = 6;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 6;

	/** 
	 * Index of primary-key column ID_QUARTZ
	 */
	protected static final int PK_COLUMN_ID_QUARTZ = 1;

	/** 
	 * Inserts a new row in the quartz_cobranza_abono table.
	 */
	public QuartzCobranzaAbonoPk insert(QuartzCobranzaAbono dto) throws QuartzCobranzaAbonoDaoException
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
			if (dto.isIdQuartzModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_QUARTZ" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isIdCobranzaEvcModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_COBRANZA_EVC" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isIdCobranzaSistemTerceroModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_COBRANZA_SISTEM_TERCERO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isClaveModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "CLAVE" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isIdSistemaTerceroModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_SISTEMA_TERCERO" );
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
		
			if (modifiedCount==0) {
				// nothing to insert
				throw new IllegalStateException( "Nothing to insert" );
			}
		
			sql.append( ") VALUES (" );
			sql.append( values );
			sql.append( ")" );
			stmt = conn.prepareStatement( sql.toString(), Statement.RETURN_GENERATED_KEYS );
			int index = 1;
			if (dto.isIdQuartzModified()) {
				stmt.setInt( index++, dto.getIdQuartz() );
			}
		
			if (dto.isIdCobranzaEvcModified()) {
				if (dto.isIdCobranzaEvcNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdCobranzaEvc() );
				}
		
			}
		
			if (dto.isIdCobranzaSistemTerceroModified()) {
				if (dto.isIdCobranzaSistemTerceroNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdCobranzaSistemTercero() );
				}
		
			}
		
			if (dto.isClaveModified()) {
				stmt.setString( index++, dto.getClave() );
			}
		
			if (dto.isIdSistemaTerceroModified()) {
				if (dto.isIdSistemaTerceroNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdSistemaTercero() );
				}
		
			}
		
			if (dto.isIdEmpresaModified()) {
				stmt.setInt( index++, dto.getIdEmpresa() );
			}
		
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		
			// retrieve values from auto-increment columns
			rs = stmt.getGeneratedKeys();
			if (rs != null && rs.next()) {
				dto.setIdQuartz( rs.getInt( 1 ) );
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new QuartzCobranzaAbonoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the quartz_cobranza_abono table.
	 */
	public void update(QuartzCobranzaAbonoPk pk, QuartzCobranzaAbono dto) throws QuartzCobranzaAbonoDaoException
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
			if (dto.isIdQuartzModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_QUARTZ=?" );
				modified=true;
			}
		
			if (dto.isIdCobranzaEvcModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_COBRANZA_EVC=?" );
				modified=true;
			}
		
			if (dto.isIdCobranzaSistemTerceroModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_COBRANZA_SISTEM_TERCERO=?" );
				modified=true;
			}
		
			if (dto.isClaveModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "CLAVE=?" );
				modified=true;
			}
		
			if (dto.isIdSistemaTerceroModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_SISTEMA_TERCERO=?" );
				modified=true;
			}
		
			if (dto.isIdEmpresaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_EMPRESA=?" );
				modified=true;
			}
		
			if (!modified) {
				// nothing to update
				return;
			}
		
			sql.append( " WHERE ID_QUARTZ=?" );
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isIdQuartzModified()) {
				stmt.setInt( index++, dto.getIdQuartz() );
			}
		
			if (dto.isIdCobranzaEvcModified()) {
				if (dto.isIdCobranzaEvcNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdCobranzaEvc() );
				}
		
			}
		
			if (dto.isIdCobranzaSistemTerceroModified()) {
				if (dto.isIdCobranzaSistemTerceroNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdCobranzaSistemTercero() );
				}
		
			}
		
			if (dto.isClaveModified()) {
				stmt.setString( index++, dto.getClave() );
			}
		
			if (dto.isIdSistemaTerceroModified()) {
				if (dto.isIdSistemaTerceroNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdSistemaTercero() );
				}
		
			}
		
			if (dto.isIdEmpresaModified()) {
				stmt.setInt( index++, dto.getIdEmpresa() );
			}
		
			stmt.setInt( index++, pk.getIdQuartz() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new QuartzCobranzaAbonoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the quartz_cobranza_abono table.
	 */
	public void delete(QuartzCobranzaAbonoPk pk) throws QuartzCobranzaAbonoDaoException
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
			stmt.setInt( 1, pk.getIdQuartz() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new QuartzCobranzaAbonoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the quartz_cobranza_abono table that matches the specified primary-key value.
	 */
	public QuartzCobranzaAbono findByPrimaryKey(QuartzCobranzaAbonoPk pk) throws QuartzCobranzaAbonoDaoException
	{
		return findByPrimaryKey( pk.getIdQuartz() );
	}

	/** 
	 * Returns all rows from the quartz_cobranza_abono table that match the criteria 'ID_QUARTZ = :idQuartz'.
	 */
	public QuartzCobranzaAbono findByPrimaryKey(int idQuartz) throws QuartzCobranzaAbonoDaoException
	{
		QuartzCobranzaAbono ret[] = findByDynamicSelect( SQL_SELECT + " WHERE ID_QUARTZ = ?", new Object[] {  new Integer(idQuartz) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the quartz_cobranza_abono table that match the criteria ''.
	 */
	public QuartzCobranzaAbono[] findAll() throws QuartzCobranzaAbonoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY ID_QUARTZ", null );
	}

	/** 
	 * Returns all rows from the quartz_cobranza_abono table that match the criteria 'ID_QUARTZ = :idQuartz'.
	 */
	public QuartzCobranzaAbono[] findWhereIdQuartzEquals(int idQuartz) throws QuartzCobranzaAbonoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_QUARTZ = ? ORDER BY ID_QUARTZ", new Object[] {  new Integer(idQuartz) } );
	}

	/** 
	 * Returns all rows from the quartz_cobranza_abono table that match the criteria 'ID_COBRANZA_EVC = :idCobranzaEvc'.
	 */
	public QuartzCobranzaAbono[] findWhereIdCobranzaEvcEquals(int idCobranzaEvc) throws QuartzCobranzaAbonoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_COBRANZA_EVC = ? ORDER BY ID_COBRANZA_EVC", new Object[] {  new Integer(idCobranzaEvc) } );
	}

	/** 
	 * Returns all rows from the quartz_cobranza_abono table that match the criteria 'ID_COBRANZA_SISTEM_TERCERO = :idCobranzaSistemTercero'.
	 */
	public QuartzCobranzaAbono[] findWhereIdCobranzaSistemTerceroEquals(int idCobranzaSistemTercero) throws QuartzCobranzaAbonoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_COBRANZA_SISTEM_TERCERO = ? ORDER BY ID_COBRANZA_SISTEM_TERCERO", new Object[] {  new Integer(idCobranzaSistemTercero) } );
	}

	/** 
	 * Returns all rows from the quartz_cobranza_abono table that match the criteria 'CLAVE = :clave'.
	 */
	public QuartzCobranzaAbono[] findWhereClaveEquals(String clave) throws QuartzCobranzaAbonoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE CLAVE = ? ORDER BY CLAVE", new Object[] { clave } );
	}

	/** 
	 * Returns all rows from the quartz_cobranza_abono table that match the criteria 'ID_SISTEMA_TERCERO = :idSistemaTercero'.
	 */
	public QuartzCobranzaAbono[] findWhereIdSistemaTerceroEquals(int idSistemaTercero) throws QuartzCobranzaAbonoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_SISTEMA_TERCERO = ? ORDER BY ID_SISTEMA_TERCERO", new Object[] {  new Integer(idSistemaTercero) } );
	}

	/** 
	 * Returns all rows from the quartz_cobranza_abono table that match the criteria 'ID_EMPRESA = :idEmpresa'.
	 */
	public QuartzCobranzaAbono[] findWhereIdEmpresaEquals(int idEmpresa) throws QuartzCobranzaAbonoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_EMPRESA = ? ORDER BY ID_EMPRESA", new Object[] {  new Integer(idEmpresa) } );
	}

	/**
	 * Method 'QuartzCobranzaAbonoDaoImpl'
	 * 
	 */
	public QuartzCobranzaAbonoDaoImpl()
	{
	}

	/**
	 * Method 'QuartzCobranzaAbonoDaoImpl'
	 * 
	 * @param userConn
	 */
	public QuartzCobranzaAbonoDaoImpl(final java.sql.Connection userConn)
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
		return "quartz_cobranza_abono";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected QuartzCobranzaAbono fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			QuartzCobranzaAbono dto = new QuartzCobranzaAbono();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected QuartzCobranzaAbono[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			QuartzCobranzaAbono dto = new QuartzCobranzaAbono();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		QuartzCobranzaAbono ret[] = new QuartzCobranzaAbono[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(QuartzCobranzaAbono dto, ResultSet rs) throws SQLException
	{
		dto.setIdQuartz( rs.getInt( COLUMN_ID_QUARTZ ) );
		dto.setIdCobranzaEvc( rs.getInt( COLUMN_ID_COBRANZA_EVC ) );
		if (rs.wasNull()) {
			dto.setIdCobranzaEvcNull( true );
		}
		
		dto.setIdCobranzaSistemTercero( rs.getInt( COLUMN_ID_COBRANZA_SISTEM_TERCERO ) );
		if (rs.wasNull()) {
			dto.setIdCobranzaSistemTerceroNull( true );
		}
		
		dto.setClave( rs.getString( COLUMN_CLAVE ) );
		dto.setIdSistemaTercero( rs.getInt( COLUMN_ID_SISTEMA_TERCERO ) );
		if (rs.wasNull()) {
			dto.setIdSistemaTerceroNull( true );
		}
		
		dto.setIdEmpresa( rs.getInt( COLUMN_ID_EMPRESA ) );
		reset(dto);
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(QuartzCobranzaAbono dto)
	{
		dto.setIdQuartzModified( false );
		dto.setIdCobranzaEvcModified( false );
		dto.setIdCobranzaSistemTerceroModified( false );
		dto.setClaveModified( false );
		dto.setIdSistemaTerceroModified( false );
		dto.setIdEmpresaModified( false );
	}

	/** 
	 * Returns all rows from the quartz_cobranza_abono table that match the specified arbitrary SQL statement
	 */
	public QuartzCobranzaAbono[] findByDynamicSelect(String sql, Object[] sqlParams) throws QuartzCobranzaAbonoDaoException
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
			throw new QuartzCobranzaAbonoDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the quartz_cobranza_abono table that match the specified arbitrary SQL statement
	 */
	public QuartzCobranzaAbono[] findByDynamicWhere(String sql, Object[] sqlParams) throws QuartzCobranzaAbonoDaoException
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
			throw new QuartzCobranzaAbonoDaoException( "Exception: " + _e.getMessage(), _e );
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