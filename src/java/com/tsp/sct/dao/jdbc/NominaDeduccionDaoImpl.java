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

public class NominaDeduccionDaoImpl extends AbstractDAO implements NominaDeduccionDao
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
	protected final String SQL_SELECT = "SELECT ID_NOMINA_DEDUCCION, ID_EMPRESA, ID_ESTATUS, ID_NOMINA_TIPO_DEDUCCION, CLAVE, CONCEPTO, IMPORTE_GRAVADO, IMPORTE_EXCEPTO FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( ID_NOMINA_DEDUCCION, ID_EMPRESA, ID_ESTATUS, ID_NOMINA_TIPO_DEDUCCION, CLAVE, CONCEPTO, IMPORTE_GRAVADO, IMPORTE_EXCEPTO ) VALUES ( ?, ?, ?, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET ID_NOMINA_DEDUCCION = ?, ID_EMPRESA = ?, ID_ESTATUS = ?, ID_NOMINA_TIPO_DEDUCCION = ?, CLAVE = ?, CONCEPTO = ?, IMPORTE_GRAVADO = ?, IMPORTE_EXCEPTO = ? WHERE ID_NOMINA_DEDUCCION = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE ID_NOMINA_DEDUCCION = ?";

	/** 
	 * Index of column ID_NOMINA_DEDUCCION
	 */
	protected static final int COLUMN_ID_NOMINA_DEDUCCION = 1;

	/** 
	 * Index of column ID_EMPRESA
	 */
	protected static final int COLUMN_ID_EMPRESA = 2;

	/** 
	 * Index of column ID_ESTATUS
	 */
	protected static final int COLUMN_ID_ESTATUS = 3;

	/** 
	 * Index of column ID_NOMINA_TIPO_DEDUCCION
	 */
	protected static final int COLUMN_ID_NOMINA_TIPO_DEDUCCION = 4;

	/** 
	 * Index of column CLAVE
	 */
	protected static final int COLUMN_CLAVE = 5;

	/** 
	 * Index of column CONCEPTO
	 */
	protected static final int COLUMN_CONCEPTO = 6;

	/** 
	 * Index of column IMPORTE_GRAVADO
	 */
	protected static final int COLUMN_IMPORTE_GRAVADO = 7;

	/** 
	 * Index of column IMPORTE_EXCEPTO
	 */
	protected static final int COLUMN_IMPORTE_EXCEPTO = 8;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 8;

	/** 
	 * Index of primary-key column ID_NOMINA_DEDUCCION
	 */
	protected static final int PK_COLUMN_ID_NOMINA_DEDUCCION = 1;

	/** 
	 * Inserts a new row in the nomina_deduccion table.
	 */
	public NominaDeduccionPk insert(NominaDeduccion dto) throws NominaDeduccionDaoException
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
			if (dto.isIdNominaDeduccionModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_NOMINA_DEDUCCION" );
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
		
			if (dto.isIdEstatusModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_ESTATUS" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isIdNominaTipoDeduccionModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "ID_NOMINA_TIPO_DEDUCCION" );
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
		
			if (dto.isConceptoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "CONCEPTO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isImporteGravadoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "IMPORTE_GRAVADO" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isImporteExceptoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "IMPORTE_EXCEPTO" );
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
			if (dto.isIdNominaDeduccionModified()) {
				stmt.setInt( index++, dto.getIdNominaDeduccion() );
			}
		
			if (dto.isIdEmpresaModified()) {
				stmt.setInt( index++, dto.getIdEmpresa() );
			}
		
			if (dto.isIdEstatusModified()) {
				if (dto.isIdEstatusNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdEstatus() );
				}
		
			}
		
			if (dto.isIdNominaTipoDeduccionModified()) {
				if (dto.isIdNominaTipoDeduccionNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdNominaTipoDeduccion() );
				}
		
			}
		
			if (dto.isClaveModified()) {
				stmt.setString( index++, dto.getClave() );
			}
		
			if (dto.isConceptoModified()) {
				stmt.setString( index++, dto.getConcepto() );
			}
		
			if (dto.isImporteGravadoModified()) {
				if (dto.isImporteGravadoNull()) {
					stmt.setNull( index++, java.sql.Types.DOUBLE );
				} else {
					stmt.setDouble( index++, dto.getImporteGravado() );
				}
		
			}
		
			if (dto.isImporteExceptoModified()) {
				if (dto.isImporteExceptoNull()) {
					stmt.setNull( index++, java.sql.Types.DOUBLE );
				} else {
					stmt.setDouble( index++, dto.getImporteExcepto() );
				}
		
			}
		
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		
			// retrieve values from auto-increment columns
			rs = stmt.getGeneratedKeys();
			if (rs != null && rs.next()) {
				dto.setIdNominaDeduccion( rs.getInt( 1 ) );
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new NominaDeduccionDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the nomina_deduccion table.
	 */
	public void update(NominaDeduccionPk pk, NominaDeduccion dto) throws NominaDeduccionDaoException
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
			if (dto.isIdNominaDeduccionModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_NOMINA_DEDUCCION=?" );
				modified=true;
			}
		
			if (dto.isIdEmpresaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_EMPRESA=?" );
				modified=true;
			}
		
			if (dto.isIdEstatusModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_ESTATUS=?" );
				modified=true;
			}
		
			if (dto.isIdNominaTipoDeduccionModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "ID_NOMINA_TIPO_DEDUCCION=?" );
				modified=true;
			}
		
			if (dto.isClaveModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "CLAVE=?" );
				modified=true;
			}
		
			if (dto.isConceptoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "CONCEPTO=?" );
				modified=true;
			}
		
			if (dto.isImporteGravadoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "IMPORTE_GRAVADO=?" );
				modified=true;
			}
		
			if (dto.isImporteExceptoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "IMPORTE_EXCEPTO=?" );
				modified=true;
			}
		
			if (!modified) {
				// nothing to update
				return;
			}
		
			sql.append( " WHERE ID_NOMINA_DEDUCCION=?" );
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isIdNominaDeduccionModified()) {
				stmt.setInt( index++, dto.getIdNominaDeduccion() );
			}
		
			if (dto.isIdEmpresaModified()) {
				stmt.setInt( index++, dto.getIdEmpresa() );
			}
		
			if (dto.isIdEstatusModified()) {
				if (dto.isIdEstatusNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdEstatus() );
				}
		
			}
		
			if (dto.isIdNominaTipoDeduccionModified()) {
				if (dto.isIdNominaTipoDeduccionNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdNominaTipoDeduccion() );
				}
		
			}
		
			if (dto.isClaveModified()) {
				stmt.setString( index++, dto.getClave() );
			}
		
			if (dto.isConceptoModified()) {
				stmt.setString( index++, dto.getConcepto() );
			}
		
			if (dto.isImporteGravadoModified()) {
				if (dto.isImporteGravadoNull()) {
					stmt.setNull( index++, java.sql.Types.DOUBLE );
				} else {
					stmt.setDouble( index++, dto.getImporteGravado() );
				}
		
			}
		
			if (dto.isImporteExceptoModified()) {
				if (dto.isImporteExceptoNull()) {
					stmt.setNull( index++, java.sql.Types.DOUBLE );
				} else {
					stmt.setDouble( index++, dto.getImporteExcepto() );
				}
		
			}
		
			stmt.setInt( index++, pk.getIdNominaDeduccion() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new NominaDeduccionDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the nomina_deduccion table.
	 */
	public void delete(NominaDeduccionPk pk) throws NominaDeduccionDaoException
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
			stmt.setInt( 1, pk.getIdNominaDeduccion() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new NominaDeduccionDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the nomina_deduccion table that matches the specified primary-key value.
	 */
	public NominaDeduccion findByPrimaryKey(NominaDeduccionPk pk) throws NominaDeduccionDaoException
	{
		return findByPrimaryKey( pk.getIdNominaDeduccion() );
	}

	/** 
	 * Returns all rows from the nomina_deduccion table that match the criteria 'ID_NOMINA_DEDUCCION = :idNominaDeduccion'.
	 */
	public NominaDeduccion findByPrimaryKey(int idNominaDeduccion) throws NominaDeduccionDaoException
	{
		NominaDeduccion ret[] = findByDynamicSelect( SQL_SELECT + " WHERE ID_NOMINA_DEDUCCION = ?", new Object[] {  new Integer(idNominaDeduccion) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the nomina_deduccion table that match the criteria ''.
	 */
	public NominaDeduccion[] findAll() throws NominaDeduccionDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY ID_NOMINA_DEDUCCION", null );
	}

	/** 
	 * Returns all rows from the nomina_deduccion table that match the criteria 'ID_NOMINA_DEDUCCION = :idNominaDeduccion'.
	 */
	public NominaDeduccion[] findWhereIdNominaDeduccionEquals(int idNominaDeduccion) throws NominaDeduccionDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_NOMINA_DEDUCCION = ? ORDER BY ID_NOMINA_DEDUCCION", new Object[] {  new Integer(idNominaDeduccion) } );
	}

	/** 
	 * Returns all rows from the nomina_deduccion table that match the criteria 'ID_EMPRESA = :idEmpresa'.
	 */
	public NominaDeduccion[] findWhereIdEmpresaEquals(int idEmpresa) throws NominaDeduccionDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_EMPRESA = ? ORDER BY ID_EMPRESA", new Object[] {  new Integer(idEmpresa) } );
	}

	/** 
	 * Returns all rows from the nomina_deduccion table that match the criteria 'ID_ESTATUS = :idEstatus'.
	 */
	public NominaDeduccion[] findWhereIdEstatusEquals(int idEstatus) throws NominaDeduccionDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_ESTATUS = ? ORDER BY ID_ESTATUS", new Object[] {  new Integer(idEstatus) } );
	}

	/** 
	 * Returns all rows from the nomina_deduccion table that match the criteria 'ID_NOMINA_TIPO_DEDUCCION = :idNominaTipoDeduccion'.
	 */
	public NominaDeduccion[] findWhereIdNominaTipoDeduccionEquals(int idNominaTipoDeduccion) throws NominaDeduccionDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_NOMINA_TIPO_DEDUCCION = ? ORDER BY ID_NOMINA_TIPO_DEDUCCION", new Object[] {  new Integer(idNominaTipoDeduccion) } );
	}

	/** 
	 * Returns all rows from the nomina_deduccion table that match the criteria 'CLAVE = :clave'.
	 */
	public NominaDeduccion[] findWhereClaveEquals(String clave) throws NominaDeduccionDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE CLAVE = ? ORDER BY CLAVE", new Object[] { clave } );
	}

	/** 
	 * Returns all rows from the nomina_deduccion table that match the criteria 'CONCEPTO = :concepto'.
	 */
	public NominaDeduccion[] findWhereConceptoEquals(String concepto) throws NominaDeduccionDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE CONCEPTO = ? ORDER BY CONCEPTO", new Object[] { concepto } );
	}

	/** 
	 * Returns all rows from the nomina_deduccion table that match the criteria 'IMPORTE_GRAVADO = :importeGravado'.
	 */
	public NominaDeduccion[] findWhereImporteGravadoEquals(double importeGravado) throws NominaDeduccionDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE IMPORTE_GRAVADO = ? ORDER BY IMPORTE_GRAVADO", new Object[] {  new Double(importeGravado) } );
	}

	/** 
	 * Returns all rows from the nomina_deduccion table that match the criteria 'IMPORTE_EXCEPTO = :importeExcepto'.
	 */
	public NominaDeduccion[] findWhereImporteExceptoEquals(double importeExcepto) throws NominaDeduccionDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE IMPORTE_EXCEPTO = ? ORDER BY IMPORTE_EXCEPTO", new Object[] {  new Double(importeExcepto) } );
	}

	/**
	 * Method 'NominaDeduccionDaoImpl'
	 * 
	 */
	public NominaDeduccionDaoImpl()
	{
	}

	/**
	 * Method 'NominaDeduccionDaoImpl'
	 * 
	 * @param userConn
	 */
	public NominaDeduccionDaoImpl(final java.sql.Connection userConn)
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
		return "nomina_deduccion";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected NominaDeduccion fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			NominaDeduccion dto = new NominaDeduccion();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected NominaDeduccion[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			NominaDeduccion dto = new NominaDeduccion();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		NominaDeduccion ret[] = new NominaDeduccion[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(NominaDeduccion dto, ResultSet rs) throws SQLException
	{
		dto.setIdNominaDeduccion( rs.getInt( COLUMN_ID_NOMINA_DEDUCCION ) );
		dto.setIdEmpresa( rs.getInt( COLUMN_ID_EMPRESA ) );
		dto.setIdEstatus( rs.getInt( COLUMN_ID_ESTATUS ) );
		if (rs.wasNull()) {
			dto.setIdEstatusNull( true );
		}
		
		dto.setIdNominaTipoDeduccion( rs.getInt( COLUMN_ID_NOMINA_TIPO_DEDUCCION ) );
		if (rs.wasNull()) {
			dto.setIdNominaTipoDeduccionNull( true );
		}
		
		dto.setClave( rs.getString( COLUMN_CLAVE ) );
		dto.setConcepto( rs.getString( COLUMN_CONCEPTO ) );
		dto.setImporteGravado( rs.getDouble( COLUMN_IMPORTE_GRAVADO ) );
		if (rs.wasNull()) {
			dto.setImporteGravadoNull( true );
		}
		
		dto.setImporteExcepto( rs.getDouble( COLUMN_IMPORTE_EXCEPTO ) );
		if (rs.wasNull()) {
			dto.setImporteExceptoNull( true );
		}
		
		reset(dto);
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(NominaDeduccion dto)
	{
		dto.setIdNominaDeduccionModified( false );
		dto.setIdEmpresaModified( false );
		dto.setIdEstatusModified( false );
		dto.setIdNominaTipoDeduccionModified( false );
		dto.setClaveModified( false );
		dto.setConceptoModified( false );
		dto.setImporteGravadoModified( false );
		dto.setImporteExceptoModified( false );
	}

	/** 
	 * Returns all rows from the nomina_deduccion table that match the specified arbitrary SQL statement
	 */
	public NominaDeduccion[] findByDynamicSelect(String sql, Object[] sqlParams) throws NominaDeduccionDaoException
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
			throw new NominaDeduccionDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the nomina_deduccion table that match the specified arbitrary SQL statement
	 */
	public NominaDeduccion[] findByDynamicWhere(String sql, Object[] sqlParams) throws NominaDeduccionDaoException
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
			throw new NominaDeduccionDaoException( "Exception: " + _e.getMessage(), _e );
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