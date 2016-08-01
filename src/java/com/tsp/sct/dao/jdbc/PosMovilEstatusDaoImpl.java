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

public class PosMovilEstatusDaoImpl extends AbstractDAO implements PosMovilEstatusDao
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
	protected final String SQL_SELECT = "SELECT id_movil_estatus, id_empresa, id_empleado, fecha_estatus, mensaje_estatus, latitud, longitud, nombre_imagen FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( id_movil_estatus, id_empresa, id_empleado, fecha_estatus, mensaje_estatus, latitud, longitud, nombre_imagen ) VALUES ( ?, ?, ?, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET id_movil_estatus = ?, id_empresa = ?, id_empleado = ?, fecha_estatus = ?, mensaje_estatus = ?, latitud = ?, longitud = ?, nombre_imagen = ? WHERE id_movil_estatus = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE id_movil_estatus = ?";

	/** 
	 * Index of column id_movil_estatus
	 */
	protected static final int COLUMN_ID_MOVIL_ESTATUS = 1;

	/** 
	 * Index of column id_empresa
	 */
	protected static final int COLUMN_ID_EMPRESA = 2;

	/** 
	 * Index of column id_empleado
	 */
	protected static final int COLUMN_ID_EMPLEADO = 3;

	/** 
	 * Index of column fecha_estatus
	 */
	protected static final int COLUMN_FECHA_ESTATUS = 4;

	/** 
	 * Index of column mensaje_estatus
	 */
	protected static final int COLUMN_MENSAJE_ESTATUS = 5;

	/** 
	 * Index of column latitud
	 */
	protected static final int COLUMN_LATITUD = 6;

	/** 
	 * Index of column longitud
	 */
	protected static final int COLUMN_LONGITUD = 7;

	/** 
	 * Index of column nombre_imagen
	 */
	protected static final int COLUMN_NOMBRE_IMAGEN = 8;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 8;

	/** 
	 * Index of primary-key column id_movil_estatus
	 */
	protected static final int PK_COLUMN_ID_MOVIL_ESTATUS = 1;

	/** 
	 * Inserts a new row in the pos_movil_estatus table.
	 */
	public PosMovilEstatusPk insert(PosMovilEstatus dto) throws PosMovilEstatusDaoException
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
			if (dto.isIdMovilEstatusModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "id_movil_estatus" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isIdEmpresaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "id_empresa" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isIdEmpleadoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "id_empleado" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isFechaEstatusModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "fecha_estatus" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isMensajeEstatusModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "mensaje_estatus" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isLatitudModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "latitud" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isLongitudModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "longitud" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isNombreImagenModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "nombre_imagen" );
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
			if (dto.isIdMovilEstatusModified()) {
				stmt.setInt( index++, dto.getIdMovilEstatus() );
			}
		
			if (dto.isIdEmpresaModified()) {
				stmt.setInt( index++, dto.getIdEmpresa() );
			}
		
			if (dto.isIdEmpleadoModified()) {
				stmt.setInt( index++, dto.getIdEmpleado() );
			}
		
			if (dto.isFechaEstatusModified()) {
				stmt.setTimestamp(index++, dto.getFechaEstatus()==null ? null : new java.sql.Timestamp( dto.getFechaEstatus().getTime() ) );
			}
		
			if (dto.isMensajeEstatusModified()) {
				stmt.setString( index++, dto.getMensajeEstatus() );
			}
		
			if (dto.isLatitudModified()) {
				stmt.setDouble( index++, dto.getLatitud() );
			}
		
			if (dto.isLongitudModified()) {
				stmt.setDouble( index++, dto.getLongitud() );
			}
		
			if (dto.isNombreImagenModified()) {
				stmt.setString( index++, dto.getNombreImagen() );
			}
		
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		
			// retrieve values from auto-increment columns
			rs = stmt.getGeneratedKeys();
			if (rs != null && rs.next()) {
				dto.setIdMovilEstatus( rs.getInt( 1 ) );
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new PosMovilEstatusDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the pos_movil_estatus table.
	 */
	public void update(PosMovilEstatusPk pk, PosMovilEstatus dto) throws PosMovilEstatusDaoException
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
			if (dto.isIdMovilEstatusModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "id_movil_estatus=?" );
				modified=true;
			}
		
			if (dto.isIdEmpresaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "id_empresa=?" );
				modified=true;
			}
		
			if (dto.isIdEmpleadoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "id_empleado=?" );
				modified=true;
			}
		
			if (dto.isFechaEstatusModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "fecha_estatus=?" );
				modified=true;
			}
		
			if (dto.isMensajeEstatusModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "mensaje_estatus=?" );
				modified=true;
			}
		
			if (dto.isLatitudModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "latitud=?" );
				modified=true;
			}
		
			if (dto.isLongitudModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "longitud=?" );
				modified=true;
			}
		
			if (dto.isNombreImagenModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "nombre_imagen=?" );
				modified=true;
			}
		
			if (!modified) {
				// nothing to update
				return;
			}
		
			sql.append( " WHERE id_movil_estatus=?" );
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isIdMovilEstatusModified()) {
				stmt.setInt( index++, dto.getIdMovilEstatus() );
			}
		
			if (dto.isIdEmpresaModified()) {
				stmt.setInt( index++, dto.getIdEmpresa() );
			}
		
			if (dto.isIdEmpleadoModified()) {
				stmt.setInt( index++, dto.getIdEmpleado() );
			}
		
			if (dto.isFechaEstatusModified()) {
				stmt.setTimestamp(index++, dto.getFechaEstatus()==null ? null : new java.sql.Timestamp( dto.getFechaEstatus().getTime() ) );
			}
		
			if (dto.isMensajeEstatusModified()) {
				stmt.setString( index++, dto.getMensajeEstatus() );
			}
		
			if (dto.isLatitudModified()) {
				stmt.setDouble( index++, dto.getLatitud() );
			}
		
			if (dto.isLongitudModified()) {
				stmt.setDouble( index++, dto.getLongitud() );
			}
		
			if (dto.isNombreImagenModified()) {
				stmt.setString( index++, dto.getNombreImagen() );
			}
		
			stmt.setInt( index++, pk.getIdMovilEstatus() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new PosMovilEstatusDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the pos_movil_estatus table.
	 */
	public void delete(PosMovilEstatusPk pk) throws PosMovilEstatusDaoException
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
			stmt.setInt( 1, pk.getIdMovilEstatus() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new PosMovilEstatusDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the pos_movil_estatus table that matches the specified primary-key value.
	 */
	public PosMovilEstatus findByPrimaryKey(PosMovilEstatusPk pk) throws PosMovilEstatusDaoException
	{
		return findByPrimaryKey( pk.getIdMovilEstatus() );
	}

	/** 
	 * Returns all rows from the pos_movil_estatus table that match the criteria 'id_movil_estatus = :idMovilEstatus'.
	 */
	public PosMovilEstatus findByPrimaryKey(int idMovilEstatus) throws PosMovilEstatusDaoException
	{
		PosMovilEstatus ret[] = findByDynamicSelect( SQL_SELECT + " WHERE id_movil_estatus = ?", new Object[] {  new Integer(idMovilEstatus) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the pos_movil_estatus table that match the criteria ''.
	 */
	public PosMovilEstatus[] findAll() throws PosMovilEstatusDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY id_movil_estatus", null );
	}

	/** 
	 * Returns all rows from the pos_movil_estatus table that match the criteria 'id_movil_estatus = :idMovilEstatus'.
	 */
	public PosMovilEstatus[] findWhereIdMovilEstatusEquals(int idMovilEstatus) throws PosMovilEstatusDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE id_movil_estatus = ? ORDER BY id_movil_estatus", new Object[] {  new Integer(idMovilEstatus) } );
	}

	/** 
	 * Returns all rows from the pos_movil_estatus table that match the criteria 'id_empresa = :idEmpresa'.
	 */
	public PosMovilEstatus[] findWhereIdEmpresaEquals(int idEmpresa) throws PosMovilEstatusDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE id_empresa = ? ORDER BY id_empresa", new Object[] {  new Integer(idEmpresa) } );
	}

	/** 
	 * Returns all rows from the pos_movil_estatus table that match the criteria 'id_empleado = :idEmpleado'.
	 */
	public PosMovilEstatus[] findWhereIdEmpleadoEquals(int idEmpleado) throws PosMovilEstatusDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE id_empleado = ? ORDER BY id_empleado", new Object[] {  new Integer(idEmpleado) } );
	}

	/** 
	 * Returns all rows from the pos_movil_estatus table that match the criteria 'fecha_estatus = :fechaEstatus'.
	 */
	public PosMovilEstatus[] findWhereFechaEstatusEquals(Date fechaEstatus) throws PosMovilEstatusDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE fecha_estatus = ? ORDER BY fecha_estatus", new Object[] { fechaEstatus==null ? null : new java.sql.Timestamp( fechaEstatus.getTime() ) } );
	}

	/** 
	 * Returns all rows from the pos_movil_estatus table that match the criteria 'mensaje_estatus = :mensajeEstatus'.
	 */
	public PosMovilEstatus[] findWhereMensajeEstatusEquals(String mensajeEstatus) throws PosMovilEstatusDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE mensaje_estatus = ? ORDER BY mensaje_estatus", new Object[] { mensajeEstatus } );
	}

	/** 
	 * Returns all rows from the pos_movil_estatus table that match the criteria 'latitud = :latitud'.
	 */
	public PosMovilEstatus[] findWhereLatitudEquals(double latitud) throws PosMovilEstatusDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE latitud = ? ORDER BY latitud", new Object[] {  new Double(latitud) } );
	}

	/** 
	 * Returns all rows from the pos_movil_estatus table that match the criteria 'longitud = :longitud'.
	 */
	public PosMovilEstatus[] findWhereLongitudEquals(double longitud) throws PosMovilEstatusDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE longitud = ? ORDER BY longitud", new Object[] {  new Double(longitud) } );
	}

	/** 
	 * Returns all rows from the pos_movil_estatus table that match the criteria 'nombre_imagen = :nombreImagen'.
	 */
	public PosMovilEstatus[] findWhereNombreImagenEquals(String nombreImagen) throws PosMovilEstatusDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE nombre_imagen = ? ORDER BY nombre_imagen", new Object[] { nombreImagen } );
	}

	/**
	 * Method 'PosMovilEstatusDaoImpl'
	 * 
	 */
	public PosMovilEstatusDaoImpl()
	{
	}

	/**
	 * Method 'PosMovilEstatusDaoImpl'
	 * 
	 * @param userConn
	 */
	public PosMovilEstatusDaoImpl(final java.sql.Connection userConn)
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
		return "pos_movil_estatus";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected PosMovilEstatus fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			PosMovilEstatus dto = new PosMovilEstatus();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected PosMovilEstatus[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			PosMovilEstatus dto = new PosMovilEstatus();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		PosMovilEstatus ret[] = new PosMovilEstatus[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(PosMovilEstatus dto, ResultSet rs) throws SQLException
	{
		dto.setIdMovilEstatus( rs.getInt( COLUMN_ID_MOVIL_ESTATUS ) );
		dto.setIdEmpresa( rs.getInt( COLUMN_ID_EMPRESA ) );
		dto.setIdEmpleado( rs.getInt( COLUMN_ID_EMPLEADO ) );
		dto.setFechaEstatus( rs.getTimestamp(COLUMN_FECHA_ESTATUS ) );
		dto.setMensajeEstatus( rs.getString( COLUMN_MENSAJE_ESTATUS ) );
		dto.setLatitud( rs.getDouble( COLUMN_LATITUD ) );
		dto.setLongitud( rs.getDouble( COLUMN_LONGITUD ) );
		dto.setNombreImagen( rs.getString( COLUMN_NOMBRE_IMAGEN ) );
		reset(dto);
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(PosMovilEstatus dto)
	{
		dto.setIdMovilEstatusModified( false );
		dto.setIdEmpresaModified( false );
		dto.setIdEmpleadoModified( false );
		dto.setFechaEstatusModified( false );
		dto.setMensajeEstatusModified( false );
		dto.setLatitudModified( false );
		dto.setLongitudModified( false );
		dto.setNombreImagenModified( false );
	}

	/** 
	 * Returns all rows from the pos_movil_estatus table that match the specified arbitrary SQL statement
	 */
	public PosMovilEstatus[] findByDynamicSelect(String sql, Object[] sqlParams) throws PosMovilEstatusDaoException
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
			throw new PosMovilEstatusDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the pos_movil_estatus table that match the specified arbitrary SQL statement
	 */
	public PosMovilEstatus[] findByDynamicWhere(String sql, Object[] sqlParams) throws PosMovilEstatusDaoException
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
			throw new PosMovilEstatusDaoException( "Exception: " + _e.getMessage(), _e );
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