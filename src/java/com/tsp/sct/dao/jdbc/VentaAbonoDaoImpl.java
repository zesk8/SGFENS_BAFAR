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

public class VentaAbonoDaoImpl extends AbstractDAO implements VentaAbonoDao
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
	protected final String SQL_SELECT = "SELECT id_venta_abono, id_venta, monto_abono, fecha_abono, id_estatus_abono, id_venta_metodo_pago, id_operacion_bancaria, documento_numero, observaciones FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( id_venta_abono, id_venta, monto_abono, fecha_abono, id_estatus_abono, id_venta_metodo_pago, id_operacion_bancaria, documento_numero, observaciones ) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET id_venta_abono = ?, id_venta = ?, monto_abono = ?, fecha_abono = ?, id_estatus_abono = ?, id_venta_metodo_pago = ?, id_operacion_bancaria = ?, documento_numero = ?, observaciones = ? WHERE id_venta_abono = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE id_venta_abono = ?";

	/** 
	 * Index of column id_venta_abono
	 */
	protected static final int COLUMN_ID_VENTA_ABONO = 1;

	/** 
	 * Index of column id_venta
	 */
	protected static final int COLUMN_ID_VENTA = 2;

	/** 
	 * Index of column monto_abono
	 */
	protected static final int COLUMN_MONTO_ABONO = 3;

	/** 
	 * Index of column fecha_abono
	 */
	protected static final int COLUMN_FECHA_ABONO = 4;

	/** 
	 * Index of column id_estatus_abono
	 */
	protected static final int COLUMN_ID_ESTATUS_ABONO = 5;

	/** 
	 * Index of column id_venta_metodo_pago
	 */
	protected static final int COLUMN_ID_VENTA_METODO_PAGO = 6;

	/** 
	 * Index of column id_operacion_bancaria
	 */
	protected static final int COLUMN_ID_OPERACION_BANCARIA = 7;

	/** 
	 * Index of column documento_numero
	 */
	protected static final int COLUMN_DOCUMENTO_NUMERO = 8;

	/** 
	 * Index of column observaciones
	 */
	protected static final int COLUMN_OBSERVACIONES = 9;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 9;

	/** 
	 * Index of primary-key column id_venta_abono
	 */
	protected static final int PK_COLUMN_ID_VENTA_ABONO = 1;

	/** 
	 * Inserts a new row in the VENTA_ABONO table.
	 */
	public VentaAbonoPk insert(VentaAbono dto) throws VentaAbonoDaoException
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
			if (dto.isIdVentaAbonoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "id_venta_abono" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isIdVentaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "id_venta" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isMontoAbonoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "monto_abono" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isFechaAbonoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "fecha_abono" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isIdEstatusAbonoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "id_estatus_abono" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isIdVentaMetodoPagoModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "id_venta_metodo_pago" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isIdOperacionBancariaModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "id_operacion_bancaria" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isDocumentoNumeroModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "documento_numero" );
				values.append( "?" );
				modifiedCount++;
			}
		
			if (dto.isObservacionesModified()) {
				if (modifiedCount>0) {
					sql.append( ", " );
					values.append( ", " );
				}
		
				sql.append( "observaciones" );
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
			if (dto.isIdVentaAbonoModified()) {
				stmt.setInt( index++, dto.getIdVentaAbono() );
			}
		
			if (dto.isIdVentaModified()) {
				stmt.setInt( index++, dto.getIdVenta() );
			}
		
			if (dto.isMontoAbonoModified()) {
				stmt.setDouble( index++, dto.getMontoAbono() );
			}
		
			if (dto.isFechaAbonoModified()) {
				stmt.setTimestamp(index++, dto.getFechaAbono()==null ? null : new java.sql.Timestamp( dto.getFechaAbono().getTime() ) );
			}
		
			if (dto.isIdEstatusAbonoModified()) {
				stmt.setInt( index++, dto.getIdEstatusAbono() );
			}
		
			if (dto.isIdVentaMetodoPagoModified()) {
				stmt.setInt( index++, dto.getIdVentaMetodoPago() );
			}
		
			if (dto.isIdOperacionBancariaModified()) {
				if (dto.isIdOperacionBancariaNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdOperacionBancaria() );
				}
		
			}
		
			if (dto.isDocumentoNumeroModified()) {
				stmt.setString( index++, dto.getDocumentoNumero() );
			}
		
			if (dto.isObservacionesModified()) {
				stmt.setString( index++, dto.getObservaciones() );
			}
		
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		
			// retrieve values from auto-increment columns
			rs = stmt.getGeneratedKeys();
			if (rs != null && rs.next()) {
				dto.setIdVentaAbono( rs.getInt( 1 ) );
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new VentaAbonoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the VENTA_ABONO table.
	 */
	public void update(VentaAbonoPk pk, VentaAbono dto) throws VentaAbonoDaoException
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
			if (dto.isIdVentaAbonoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "id_venta_abono=?" );
				modified=true;
			}
		
			if (dto.isIdVentaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "id_venta=?" );
				modified=true;
			}
		
			if (dto.isMontoAbonoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "monto_abono=?" );
				modified=true;
			}
		
			if (dto.isFechaAbonoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "fecha_abono=?" );
				modified=true;
			}
		
			if (dto.isIdEstatusAbonoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "id_estatus_abono=?" );
				modified=true;
			}
		
			if (dto.isIdVentaMetodoPagoModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "id_venta_metodo_pago=?" );
				modified=true;
			}
		
			if (dto.isIdOperacionBancariaModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "id_operacion_bancaria=?" );
				modified=true;
			}
		
			if (dto.isDocumentoNumeroModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "documento_numero=?" );
				modified=true;
			}
		
			if (dto.isObservacionesModified()) {
				if (modified) {
					sql.append( ", " );
				}
		
				sql.append( "observaciones=?" );
				modified=true;
			}
		
			if (!modified) {
				// nothing to update
				return;
			}
		
			sql.append( " WHERE id_venta_abono=?" );
			System.out.println( "Executing " + sql.toString() + " with values: " + dto );
			stmt = conn.prepareStatement( sql.toString() );
			int index = 1;
			if (dto.isIdVentaAbonoModified()) {
				stmt.setInt( index++, dto.getIdVentaAbono() );
			}
		
			if (dto.isIdVentaModified()) {
				stmt.setInt( index++, dto.getIdVenta() );
			}
		
			if (dto.isMontoAbonoModified()) {
				stmt.setDouble( index++, dto.getMontoAbono() );
			}
		
			if (dto.isFechaAbonoModified()) {
				stmt.setTimestamp(index++, dto.getFechaAbono()==null ? null : new java.sql.Timestamp( dto.getFechaAbono().getTime() ) );
			}
		
			if (dto.isIdEstatusAbonoModified()) {
				stmt.setInt( index++, dto.getIdEstatusAbono() );
			}
		
			if (dto.isIdVentaMetodoPagoModified()) {
				stmt.setInt( index++, dto.getIdVentaMetodoPago() );
			}
		
			if (dto.isIdOperacionBancariaModified()) {
				if (dto.isIdOperacionBancariaNull()) {
					stmt.setNull( index++, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( index++, dto.getIdOperacionBancaria() );
				}
		
			}
		
			if (dto.isDocumentoNumeroModified()) {
				stmt.setString( index++, dto.getDocumentoNumero() );
			}
		
			if (dto.isObservacionesModified()) {
				stmt.setString( index++, dto.getObservaciones() );
			}
		
			stmt.setInt( index++, pk.getIdVentaAbono() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new VentaAbonoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the VENTA_ABONO table.
	 */
	public void delete(VentaAbonoPk pk) throws VentaAbonoDaoException
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
			stmt.setInt( 1, pk.getIdVentaAbono() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new VentaAbonoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the VENTA_ABONO table that matches the specified primary-key value.
	 */
	public VentaAbono findByPrimaryKey(VentaAbonoPk pk) throws VentaAbonoDaoException
	{
		return findByPrimaryKey( pk.getIdVentaAbono() );
	}

	/** 
	 * Returns all rows from the VENTA_ABONO table that match the criteria 'id_venta_abono = :idVentaAbono'.
	 */
	public VentaAbono findByPrimaryKey(int idVentaAbono) throws VentaAbonoDaoException
	{
		VentaAbono ret[] = findByDynamicSelect( SQL_SELECT + " WHERE id_venta_abono = ?", new Object[] {  new Integer(idVentaAbono) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the VENTA_ABONO table that match the criteria ''.
	 */
	public VentaAbono[] findAll() throws VentaAbonoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY id_venta_abono", null );
	}

	/** 
	 * Returns all rows from the VENTA_ABONO table that match the criteria 'id_venta_abono = :idVentaAbono'.
	 */
	public VentaAbono[] findWhereIdVentaAbonoEquals(int idVentaAbono) throws VentaAbonoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE id_venta_abono = ? ORDER BY id_venta_abono", new Object[] {  new Integer(idVentaAbono) } );
	}

	/** 
	 * Returns all rows from the VENTA_ABONO table that match the criteria 'id_venta = :idVenta'.
	 */
	public VentaAbono[] findWhereIdVentaEquals(int idVenta) throws VentaAbonoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE id_venta = ? ORDER BY id_venta", new Object[] {  new Integer(idVenta) } );
	}

	/** 
	 * Returns all rows from the VENTA_ABONO table that match the criteria 'monto_abono = :montoAbono'.
	 */
	public VentaAbono[] findWhereMontoAbonoEquals(double montoAbono) throws VentaAbonoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE monto_abono = ? ORDER BY monto_abono", new Object[] {  new Double(montoAbono) } );
	}

	/** 
	 * Returns all rows from the VENTA_ABONO table that match the criteria 'fecha_abono = :fechaAbono'.
	 */
	public VentaAbono[] findWhereFechaAbonoEquals(Date fechaAbono) throws VentaAbonoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE fecha_abono = ? ORDER BY fecha_abono", new Object[] { fechaAbono==null ? null : new java.sql.Timestamp( fechaAbono.getTime() ) } );
	}

	/** 
	 * Returns all rows from the VENTA_ABONO table that match the criteria 'id_estatus_abono = :idEstatusAbono'.
	 */
	public VentaAbono[] findWhereIdEstatusAbonoEquals(int idEstatusAbono) throws VentaAbonoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE id_estatus_abono = ? ORDER BY id_estatus_abono", new Object[] {  new Integer(idEstatusAbono) } );
	}

	/** 
	 * Returns all rows from the VENTA_ABONO table that match the criteria 'id_venta_metodo_pago = :idVentaMetodoPago'.
	 */
	public VentaAbono[] findWhereIdVentaMetodoPagoEquals(int idVentaMetodoPago) throws VentaAbonoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE id_venta_metodo_pago = ? ORDER BY id_venta_metodo_pago", new Object[] {  new Integer(idVentaMetodoPago) } );
	}

	/** 
	 * Returns all rows from the VENTA_ABONO table that match the criteria 'id_operacion_bancaria = :idOperacionBancaria'.
	 */
	public VentaAbono[] findWhereIdOperacionBancariaEquals(int idOperacionBancaria) throws VentaAbonoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE id_operacion_bancaria = ? ORDER BY id_operacion_bancaria", new Object[] {  new Integer(idOperacionBancaria) } );
	}

	/** 
	 * Returns all rows from the VENTA_ABONO table that match the criteria 'documento_numero = :documentoNumero'.
	 */
	public VentaAbono[] findWhereDocumentoNumeroEquals(String documentoNumero) throws VentaAbonoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE documento_numero = ? ORDER BY documento_numero", new Object[] { documentoNumero } );
	}

	/** 
	 * Returns all rows from the VENTA_ABONO table that match the criteria 'observaciones = :observaciones'.
	 */
	public VentaAbono[] findWhereObservacionesEquals(String observaciones) throws VentaAbonoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE observaciones = ? ORDER BY observaciones", new Object[] { observaciones } );
	}

	/**
	 * Method 'VentaAbonoDaoImpl'
	 * 
	 */
	public VentaAbonoDaoImpl()
	{
	}

	/**
	 * Method 'VentaAbonoDaoImpl'
	 * 
	 * @param userConn
	 */
	public VentaAbonoDaoImpl(final java.sql.Connection userConn)
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
		return "VENTA_ABONO";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected VentaAbono fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			VentaAbono dto = new VentaAbono();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected VentaAbono[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			VentaAbono dto = new VentaAbono();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		VentaAbono ret[] = new VentaAbono[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(VentaAbono dto, ResultSet rs) throws SQLException
	{
		dto.setIdVentaAbono( rs.getInt( COLUMN_ID_VENTA_ABONO ) );
		dto.setIdVenta( rs.getInt( COLUMN_ID_VENTA ) );
		dto.setMontoAbono( rs.getDouble( COLUMN_MONTO_ABONO ) );
		dto.setFechaAbono( rs.getTimestamp(COLUMN_FECHA_ABONO ) );
		dto.setIdEstatusAbono( rs.getInt( COLUMN_ID_ESTATUS_ABONO ) );
		dto.setIdVentaMetodoPago( rs.getInt( COLUMN_ID_VENTA_METODO_PAGO ) );
		dto.setIdOperacionBancaria( rs.getInt( COLUMN_ID_OPERACION_BANCARIA ) );
		if (rs.wasNull()) {
			dto.setIdOperacionBancariaNull( true );
		}
		
		dto.setDocumentoNumero( rs.getString( COLUMN_DOCUMENTO_NUMERO ) );
		dto.setObservaciones( rs.getString( COLUMN_OBSERVACIONES ) );
		reset(dto);
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(VentaAbono dto)
	{
		dto.setIdVentaAbonoModified( false );
		dto.setIdVentaModified( false );
		dto.setMontoAbonoModified( false );
		dto.setFechaAbonoModified( false );
		dto.setIdEstatusAbonoModified( false );
		dto.setIdVentaMetodoPagoModified( false );
		dto.setIdOperacionBancariaModified( false );
		dto.setDocumentoNumeroModified( false );
		dto.setObservacionesModified( false );
	}

	/** 
	 * Returns all rows from the VENTA_ABONO table that match the specified arbitrary SQL statement
	 */
	public VentaAbono[] findByDynamicSelect(String sql, Object[] sqlParams) throws VentaAbonoDaoException
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
			throw new VentaAbonoDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the VENTA_ABONO table that match the specified arbitrary SQL statement
	 */
	public VentaAbono[] findByDynamicWhere(String sql, Object[] sqlParams) throws VentaAbonoDaoException
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
			throw new VentaAbonoDaoException( "Exception: " + _e.getMessage(), _e );
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