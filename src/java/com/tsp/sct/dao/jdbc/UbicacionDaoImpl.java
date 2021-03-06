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

public class UbicacionDaoImpl extends AbstractDAO implements UbicacionDao
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
	protected final String SQL_SELECT = "SELECT ID_UBICACION, CALLE, NUM_INT, NUM_EXT, COLONIA, CODIGO_POSTAL, PAIS, ESTADO, MUNICIPIO FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( ID_UBICACION, CALLE, NUM_INT, NUM_EXT, COLONIA, CODIGO_POSTAL, PAIS, ESTADO, MUNICIPIO ) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET ID_UBICACION = ?, CALLE = ?, NUM_INT = ?, NUM_EXT = ?, COLONIA = ?, CODIGO_POSTAL = ?, PAIS = ?, ESTADO = ?, MUNICIPIO = ? WHERE ID_UBICACION = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE ID_UBICACION = ?";

	/** 
	 * Index of column ID_UBICACION
	 */
	protected static final int COLUMN_ID_UBICACION = 1;

	/** 
	 * Index of column CALLE
	 */
	protected static final int COLUMN_CALLE = 2;

	/** 
	 * Index of column NUM_INT
	 */
	protected static final int COLUMN_NUM_INT = 3;

	/** 
	 * Index of column NUM_EXT
	 */
	protected static final int COLUMN_NUM_EXT = 4;

	/** 
	 * Index of column COLONIA
	 */
	protected static final int COLUMN_COLONIA = 5;

	/** 
	 * Index of column CODIGO_POSTAL
	 */
	protected static final int COLUMN_CODIGO_POSTAL = 6;

	/** 
	 * Index of column PAIS
	 */
	protected static final int COLUMN_PAIS = 7;

	/** 
	 * Index of column ESTADO
	 */
	protected static final int COLUMN_ESTADO = 8;

	/** 
	 * Index of column MUNICIPIO
	 */
	protected static final int COLUMN_MUNICIPIO = 9;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 9;

	/** 
	 * Index of primary-key column ID_UBICACION
	 */
	protected static final int PK_COLUMN_ID_UBICACION = 1;

	/** 
	 * Inserts a new row in the ubicacion table.
	 */
	public UbicacionPk insert(Ubicacion dto) throws UbicacionDaoException
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
			stmt.setInt( index++, dto.getIdUbicacion() );
			stmt.setString( index++, dto.getCalle() );
			stmt.setString( index++, dto.getNumInt() );
			stmt.setString( index++, dto.getNumExt() );
			stmt.setString( index++, dto.getColonia() );
			stmt.setString( index++, dto.getCodigoPostal() );
			stmt.setString( index++, dto.getPais() );
			stmt.setString( index++, dto.getEstado() );
			stmt.setString( index++, dto.getMunicipio() );
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new UbicacionDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the ubicacion table.
	 */
	public void update(UbicacionPk pk, Ubicacion dto) throws UbicacionDaoException
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
			stmt.setInt( index++, dto.getIdUbicacion() );
			stmt.setString( index++, dto.getCalle() );
			stmt.setString( index++, dto.getNumInt() );
			stmt.setString( index++, dto.getNumExt() );
			stmt.setString( index++, dto.getColonia() );
			stmt.setString( index++, dto.getCodigoPostal() );
			stmt.setString( index++, dto.getPais() );
			stmt.setString( index++, dto.getEstado() );
			stmt.setString( index++, dto.getMunicipio() );
			stmt.setInt( 10, pk.getIdUbicacion() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new UbicacionDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the ubicacion table.
	 */
	public void delete(UbicacionPk pk) throws UbicacionDaoException
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
			stmt.setInt( 1, pk.getIdUbicacion() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new UbicacionDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the ubicacion table that matches the specified primary-key value.
	 */
	public Ubicacion findByPrimaryKey(UbicacionPk pk) throws UbicacionDaoException
	{
		return findByPrimaryKey( pk.getIdUbicacion() );
	}

	/** 
	 * Returns all rows from the ubicacion table that match the criteria 'ID_UBICACION = :idUbicacion'.
	 */
	public Ubicacion findByPrimaryKey(int idUbicacion) throws UbicacionDaoException
	{
		Ubicacion ret[] = findByDynamicSelect( SQL_SELECT + " WHERE ID_UBICACION = ?", new Object[] {  new Integer(idUbicacion) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the ubicacion table that match the criteria ''.
	 */
	public Ubicacion[] findAll() throws UbicacionDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY ID_UBICACION", null );
	}

	/** 
	 * Returns all rows from the ubicacion table that match the criteria 'ID_UBICACION = :idUbicacion'.
	 */
	public Ubicacion[] findWhereIdUbicacionEquals(int idUbicacion) throws UbicacionDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_UBICACION = ? ORDER BY ID_UBICACION", new Object[] {  new Integer(idUbicacion) } );
	}

	/** 
	 * Returns all rows from the ubicacion table that match the criteria 'CALLE = :calle'.
	 */
	public Ubicacion[] findWhereCalleEquals(String calle) throws UbicacionDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE CALLE = ? ORDER BY CALLE", new Object[] { calle } );
	}

	/** 
	 * Returns all rows from the ubicacion table that match the criteria 'NUM_INT = :numInt'.
	 */
	public Ubicacion[] findWhereNumIntEquals(String numInt) throws UbicacionDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE NUM_INT = ? ORDER BY NUM_INT", new Object[] { numInt } );
	}

	/** 
	 * Returns all rows from the ubicacion table that match the criteria 'NUM_EXT = :numExt'.
	 */
	public Ubicacion[] findWhereNumExtEquals(String numExt) throws UbicacionDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE NUM_EXT = ? ORDER BY NUM_EXT", new Object[] { numExt } );
	}

	/** 
	 * Returns all rows from the ubicacion table that match the criteria 'COLONIA = :colonia'.
	 */
	public Ubicacion[] findWhereColoniaEquals(String colonia) throws UbicacionDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE COLONIA = ? ORDER BY COLONIA", new Object[] { colonia } );
	}

	/** 
	 * Returns all rows from the ubicacion table that match the criteria 'CODIGO_POSTAL = :codigoPostal'.
	 */
	public Ubicacion[] findWhereCodigoPostalEquals(String codigoPostal) throws UbicacionDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE CODIGO_POSTAL = ? ORDER BY CODIGO_POSTAL", new Object[] { codigoPostal } );
	}

	/** 
	 * Returns all rows from the ubicacion table that match the criteria 'PAIS = :pais'.
	 */
	public Ubicacion[] findWherePaisEquals(String pais) throws UbicacionDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE PAIS = ? ORDER BY PAIS", new Object[] { pais } );
	}

	/** 
	 * Returns all rows from the ubicacion table that match the criteria 'ESTADO = :estado'.
	 */
	public Ubicacion[] findWhereEstadoEquals(String estado) throws UbicacionDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ESTADO = ? ORDER BY ESTADO", new Object[] { estado } );
	}

	/** 
	 * Returns all rows from the ubicacion table that match the criteria 'MUNICIPIO = :municipio'.
	 */
	public Ubicacion[] findWhereMunicipioEquals(String municipio) throws UbicacionDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE MUNICIPIO = ? ORDER BY MUNICIPIO", new Object[] { municipio } );
	}

	/**
	 * Method 'UbicacionDaoImpl'
	 * 
	 */
	public UbicacionDaoImpl()
	{
	}

	/**
	 * Method 'UbicacionDaoImpl'
	 * 
	 * @param userConn
	 */
	public UbicacionDaoImpl(final java.sql.Connection userConn)
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
		return "UBICACION";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected Ubicacion fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			Ubicacion dto = new Ubicacion();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected Ubicacion[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			Ubicacion dto = new Ubicacion();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		Ubicacion ret[] = new Ubicacion[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(Ubicacion dto, ResultSet rs) throws SQLException
	{
		dto.setIdUbicacion( rs.getInt( COLUMN_ID_UBICACION ) );
		dto.setCalle( rs.getString( COLUMN_CALLE ) );
		dto.setNumInt( rs.getString( COLUMN_NUM_INT ) );
		dto.setNumExt( rs.getString( COLUMN_NUM_EXT ) );
		dto.setColonia( rs.getString( COLUMN_COLONIA ) );
		dto.setCodigoPostal( rs.getString( COLUMN_CODIGO_POSTAL ) );
		dto.setPais( rs.getString( COLUMN_PAIS ) );
		dto.setEstado( rs.getString( COLUMN_ESTADO ) );
		dto.setMunicipio( rs.getString( COLUMN_MUNICIPIO ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(Ubicacion dto)
	{
	}

	/** 
	 * Returns all rows from the ubicacion table that match the specified arbitrary SQL statement
	 */
	public Ubicacion[] findByDynamicSelect(String sql, Object[] sqlParams) throws UbicacionDaoException
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
			throw new UbicacionDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the ubicacion table that match the specified arbitrary SQL statement
	 */
	public Ubicacion[] findByDynamicWhere(String sql, Object[] sqlParams) throws UbicacionDaoException
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
			throw new UbicacionDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(rs);
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}
        
         protected final String SQL_SELECT_MAX = "SELECT ID_UBICACION, CALLE, NUM_INT, NUM_EXT, COLONIA, CODIGO_POSTAL, PAIS, ESTADO, MUNICIPIO FROM " + getTableName() + " ORDER BY ID_UBICACION DESC LIMIT 1 ";
                
        public Ubicacion findLast() throws UbicacionDaoException
	{
		Ubicacion ret[] = findByDynamicSelect( SQL_SELECT_MAX , new Object[0] );
		return ret.length==0 ? null : ret[0];
	}

}
