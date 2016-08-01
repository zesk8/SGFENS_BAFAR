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

public class PublicacionesDaoImpl extends AbstractDAO implements PublicacionesDao
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
	protected final String SQL_SELECT = "SELECT ID_PUBLICACIONES, FECHA, NOMBRE, DESCRIPCION, FECHA_PUBLICACION, FECHA_VENCIMIENTO FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( ID_PUBLICACIONES, FECHA, NOMBRE, DESCRIPCION, FECHA_PUBLICACION, FECHA_VENCIMIENTO ) VALUES ( ?, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET ID_PUBLICACIONES = ?, FECHA = ?, NOMBRE = ?, DESCRIPCION = ?, FECHA_PUBLICACION = ?, FECHA_VENCIMIENTO = ? WHERE ID_PUBLICACIONES = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE ID_PUBLICACIONES = ?";

	/** 
	 * Index of column ID_PUBLICACIONES
	 */
	protected static final int COLUMN_ID_PUBLICACIONES = 1;

	/** 
	 * Index of column FECHA
	 */
	protected static final int COLUMN_FECHA = 2;

	/** 
	 * Index of column NOMBRE
	 */
	protected static final int COLUMN_NOMBRE = 3;

	/** 
	 * Index of column DESCRIPCION
	 */
	protected static final int COLUMN_DESCRIPCION = 4;

	/** 
	 * Index of column FECHA_PUBLICACION
	 */
	protected static final int COLUMN_FECHA_PUBLICACION = 5;

	/** 
	 * Index of column FECHA_VENCIMIENTO
	 */
	protected static final int COLUMN_FECHA_VENCIMIENTO = 6;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 6;

	/** 
	 * Index of primary-key column ID_PUBLICACIONES
	 */
	protected static final int PK_COLUMN_ID_PUBLICACIONES = 1;

	/** 
	 * Inserts a new row in the publicaciones table.
	 */
	public PublicacionesPk insert(Publicaciones dto) throws PublicacionesDaoException
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
			stmt.setInt( index++, dto.getIdPublicaciones() );
			stmt.setString( index++, dto.getFecha() );
			stmt.setString( index++, dto.getNombre() );
			stmt.setString( index++, dto.getDescripcion() );
			stmt.setDate(index++, dto.getFechaPublicacion()==null ? null : new java.sql.Date( dto.getFechaPublicacion().getTime() ) );
			stmt.setDate(index++, dto.getFechaVencimiento()==null ? null : new java.sql.Date( dto.getFechaVencimiento().getTime() ) );
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new PublicacionesDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the publicaciones table.
	 */
	public void update(PublicacionesPk pk, Publicaciones dto) throws PublicacionesDaoException
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
			stmt.setInt( index++, dto.getIdPublicaciones() );
			stmt.setString( index++, dto.getFecha() );
			stmt.setString( index++, dto.getNombre() );
			stmt.setString( index++, dto.getDescripcion() );
			stmt.setDate(index++, dto.getFechaPublicacion()==null ? null : new java.sql.Date( dto.getFechaPublicacion().getTime() ) );
			stmt.setDate(index++, dto.getFechaVencimiento()==null ? null : new java.sql.Date( dto.getFechaVencimiento().getTime() ) );
			stmt.setInt( 7, pk.getIdPublicaciones() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new PublicacionesDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the publicaciones table.
	 */
	public void delete(PublicacionesPk pk) throws PublicacionesDaoException
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
			stmt.setInt( 1, pk.getIdPublicaciones() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new PublicacionesDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the publicaciones table that matches the specified primary-key value.
	 */
	public Publicaciones findByPrimaryKey(PublicacionesPk pk) throws PublicacionesDaoException
	{
		return findByPrimaryKey( pk.getIdPublicaciones() );
	}

	/** 
	 * Returns all rows from the publicaciones table that match the criteria 'ID_PUBLICACIONES = :idPublicaciones'.
	 */
	public Publicaciones findByPrimaryKey(int idPublicaciones) throws PublicacionesDaoException
	{
		Publicaciones ret[] = findByDynamicSelect( SQL_SELECT + " WHERE ID_PUBLICACIONES = ?", new Object[] {  new Integer(idPublicaciones) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the publicaciones table that match the criteria ''.
	 */
	public Publicaciones[] findAll() throws PublicacionesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY ID_PUBLICACIONES", null );
	}

	/** 
	 * Returns all rows from the publicaciones table that match the criteria 'ID_PUBLICACIONES = :idPublicaciones'.
	 */
	public Publicaciones[] findWhereIdPublicacionesEquals(int idPublicaciones) throws PublicacionesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_PUBLICACIONES = ? ORDER BY ID_PUBLICACIONES", new Object[] {  new Integer(idPublicaciones) } );
	}

	/** 
	 * Returns all rows from the publicaciones table that match the criteria 'FECHA = :fecha'.
	 */
	public Publicaciones[] findWhereFechaEquals(String fecha) throws PublicacionesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE FECHA = ? ORDER BY FECHA", new Object[] { fecha } );
	}

	/** 
	 * Returns all rows from the publicaciones table that match the criteria 'NOMBRE = :nombre'.
	 */
	public Publicaciones[] findWhereNombreEquals(String nombre) throws PublicacionesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE NOMBRE = ? ORDER BY NOMBRE", new Object[] { nombre } );
	}

	/** 
	 * Returns all rows from the publicaciones table that match the criteria 'DESCRIPCION = :descripcion'.
	 */
	public Publicaciones[] findWhereDescripcionEquals(String descripcion) throws PublicacionesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE DESCRIPCION = ? ORDER BY DESCRIPCION", new Object[] { descripcion } );
	}

	/** 
	 * Returns all rows from the publicaciones table that match the criteria 'FECHA_PUBLICACION = :fechaPublicacion'.
	 */
	public Publicaciones[] findWhereFechaPublicacionEquals(Date fechaPublicacion) throws PublicacionesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE FECHA_PUBLICACION = ? ORDER BY FECHA_PUBLICACION", new Object[] { fechaPublicacion==null ? null : new java.sql.Date( fechaPublicacion.getTime() ) } );
	}

	/** 
	 * Returns all rows from the publicaciones table that match the criteria 'FECHA_VENCIMIENTO = :fechaVencimiento'.
	 */
	public Publicaciones[] findWhereFechaVencimientoEquals(Date fechaVencimiento) throws PublicacionesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE FECHA_VENCIMIENTO = ? ORDER BY FECHA_VENCIMIENTO", new Object[] { fechaVencimiento==null ? null : new java.sql.Date( fechaVencimiento.getTime() ) } );
	}

	/**
	 * Method 'PublicacionesDaoImpl'
	 * 
	 */
	public PublicacionesDaoImpl()
	{
	}

	/**
	 * Method 'PublicacionesDaoImpl'
	 * 
	 * @param userConn
	 */
	public PublicacionesDaoImpl(final java.sql.Connection userConn)
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
		return "PUBLICACIONES";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected Publicaciones fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			Publicaciones dto = new Publicaciones();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected Publicaciones[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			Publicaciones dto = new Publicaciones();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		Publicaciones ret[] = new Publicaciones[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(Publicaciones dto, ResultSet rs) throws SQLException
	{
		dto.setIdPublicaciones( rs.getInt( COLUMN_ID_PUBLICACIONES ) );
		dto.setFecha( rs.getString( COLUMN_FECHA ) );
		dto.setNombre( rs.getString( COLUMN_NOMBRE ) );
		dto.setDescripcion( rs.getString( COLUMN_DESCRIPCION ) );
		dto.setFechaPublicacion( rs.getDate(COLUMN_FECHA_PUBLICACION ) );
		dto.setFechaVencimiento( rs.getDate(COLUMN_FECHA_VENCIMIENTO ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(Publicaciones dto)
	{
	}

	/** 
	 * Returns all rows from the publicaciones table that match the specified arbitrary SQL statement
	 */
	public Publicaciones[] findByDynamicSelect(String sql, Object[] sqlParams) throws PublicacionesDaoException
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
			throw new PublicacionesDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the publicaciones table that match the specified arbitrary SQL statement
	 */
	public Publicaciones[] findByDynamicWhere(String sql, Object[] sqlParams) throws PublicacionesDaoException
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
			throw new PublicacionesDaoException( "Exception: " + _e.getMessage(), _e );
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