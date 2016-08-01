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

public class VistaPedidosConAdeudosDaoImpl extends AbstractDAO implements VistaPedidosConAdeudosDao
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
	protected final String SQL_SELECT = "SELECT ID_EMPRESA, ID_PEDIDO, ID_ESTATUS_PEDIDO, ID_CLIENTE, ID_USUARIO_VENDEDOR, FECHA_PEDIDO, FECHA_ULTIMO_ABONO FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * Index of column ID_EMPRESA
	 */
	protected static final int COLUMN_ID_EMPRESA = 1;

	/** 
	 * Index of column ID_PEDIDO
	 */
	protected static final int COLUMN_ID_PEDIDO = 2;

	/** 
	 * Index of column ID_ESTATUS_PEDIDO
	 */
	protected static final int COLUMN_ID_ESTATUS_PEDIDO = 3;

	/** 
	 * Index of column ID_CLIENTE
	 */
	protected static final int COLUMN_ID_CLIENTE = 4;

	/** 
	 * Index of column ID_USUARIO_VENDEDOR
	 */
	protected static final int COLUMN_ID_USUARIO_VENDEDOR = 5;

	/** 
	 * Index of column FECHA_PEDIDO
	 */
	protected static final int COLUMN_FECHA_PEDIDO = 6;

	/** 
	 * Index of column FECHA_ULTIMO_ABONO
	 */
	protected static final int COLUMN_FECHA_ULTIMO_ABONO = 7;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 7;

	/** 
	 * Returns all rows from the vista_pedidos_con_adeudos table that match the criteria ''.
	 */
	public VistaPedidosConAdeudos[] findAll() throws VistaPedidosConAdeudosDaoException
	{
		return findByDynamicSelect( SQL_SELECT, null );
	}

	/** 
	 * Returns all rows from the vista_pedidos_con_adeudos table that match the criteria 'ID_EMPRESA = :idEmpresa'.
	 */
	public VistaPedidosConAdeudos[] findWhereIdEmpresaEquals(int idEmpresa) throws VistaPedidosConAdeudosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_EMPRESA = ? ORDER BY ID_EMPRESA", new Object[] {  new Integer(idEmpresa) } );
	}

	/** 
	 * Returns all rows from the vista_pedidos_con_adeudos table that match the criteria 'ID_PEDIDO = :idPedido'.
	 */
	public VistaPedidosConAdeudos[] findWhereIdPedidoEquals(int idPedido) throws VistaPedidosConAdeudosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_PEDIDO = ? ORDER BY ID_PEDIDO", new Object[] {  new Integer(idPedido) } );
	}

	/** 
	 * Returns all rows from the vista_pedidos_con_adeudos table that match the criteria 'ID_ESTATUS_PEDIDO = :idEstatusPedido'.
	 */
	public VistaPedidosConAdeudos[] findWhereIdEstatusPedidoEquals(short idEstatusPedido) throws VistaPedidosConAdeudosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_ESTATUS_PEDIDO = ? ORDER BY ID_ESTATUS_PEDIDO", new Object[] {  new Short(idEstatusPedido) } );
	}

	/** 
	 * Returns all rows from the vista_pedidos_con_adeudos table that match the criteria 'ID_CLIENTE = :idCliente'.
	 */
	public VistaPedidosConAdeudos[] findWhereIdClienteEquals(int idCliente) throws VistaPedidosConAdeudosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_CLIENTE = ? ORDER BY ID_CLIENTE", new Object[] {  new Integer(idCliente) } );
	}

	/** 
	 * Returns all rows from the vista_pedidos_con_adeudos table that match the criteria 'ID_USUARIO_VENDEDOR = :idUsuarioVendedor'.
	 */
	public VistaPedidosConAdeudos[] findWhereIdUsuarioVendedorEquals(int idUsuarioVendedor) throws VistaPedidosConAdeudosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_USUARIO_VENDEDOR = ? ORDER BY ID_USUARIO_VENDEDOR", new Object[] {  new Integer(idUsuarioVendedor) } );
	}

	/** 
	 * Returns all rows from the vista_pedidos_con_adeudos table that match the criteria 'FECHA_PEDIDO = :fechaPedido'.
	 */
	public VistaPedidosConAdeudos[] findWhereFechaPedidoEquals(Date fechaPedido) throws VistaPedidosConAdeudosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE FECHA_PEDIDO = ? ORDER BY FECHA_PEDIDO", new Object[] { fechaPedido==null ? null : new java.sql.Timestamp( fechaPedido.getTime() ) } );
	}

	/** 
	 * Returns all rows from the vista_pedidos_con_adeudos table that match the criteria 'FECHA_ULTIMO_ABONO = :fechaUltimoAbono'.
	 */
	public VistaPedidosConAdeudos[] findWhereFechaUltimoAbonoEquals(Date fechaUltimoAbono) throws VistaPedidosConAdeudosDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE FECHA_ULTIMO_ABONO = ? ORDER BY FECHA_ULTIMO_ABONO", new Object[] { fechaUltimoAbono==null ? null : new java.sql.Timestamp( fechaUltimoAbono.getTime() ) } );
	}

	/**
	 * Method 'VistaPedidosConAdeudosDaoImpl'
	 * 
	 */
	public VistaPedidosConAdeudosDaoImpl()
	{
	}

	/**
	 * Method 'VistaPedidosConAdeudosDaoImpl'
	 * 
	 * @param userConn
	 */
	public VistaPedidosConAdeudosDaoImpl(final java.sql.Connection userConn)
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
		return "vista_pedidos_con_adeudos";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected VistaPedidosConAdeudos fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			VistaPedidosConAdeudos dto = new VistaPedidosConAdeudos();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected VistaPedidosConAdeudos[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			VistaPedidosConAdeudos dto = new VistaPedidosConAdeudos();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		VistaPedidosConAdeudos ret[] = new VistaPedidosConAdeudos[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(VistaPedidosConAdeudos dto, ResultSet rs) throws SQLException
	{
		dto.setIdEmpresa( rs.getInt( COLUMN_ID_EMPRESA ) );
		dto.setIdPedido( rs.getInt( COLUMN_ID_PEDIDO ) );
		dto.setIdEstatusPedido( rs.getShort( COLUMN_ID_ESTATUS_PEDIDO ) );
		if (rs.wasNull()) {
			dto.setIdEstatusPedidoNull( true );
		}
		
		dto.setIdCliente( rs.getInt( COLUMN_ID_CLIENTE ) );
		dto.setIdUsuarioVendedor( rs.getInt( COLUMN_ID_USUARIO_VENDEDOR ) );
		dto.setFechaPedido( rs.getTimestamp(COLUMN_FECHA_PEDIDO ) );
		dto.setFechaUltimoAbono( rs.getTimestamp(COLUMN_FECHA_ULTIMO_ABONO ) );
		reset(dto);
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(VistaPedidosConAdeudos dto)
	{
		dto.setIdEmpresaModified( false );
		dto.setIdPedidoModified( false );
		dto.setIdEstatusPedidoModified( false );
		dto.setIdClienteModified( false );
		dto.setIdUsuarioVendedorModified( false );
		dto.setFechaPedidoModified( false );
		dto.setFechaUltimoAbonoModified( false );
	}

	/** 
	 * Returns all rows from the vista_pedidos_con_adeudos table that match the specified arbitrary SQL statement
	 */
	public VistaPedidosConAdeudos[] findByDynamicSelect(String sql, Object[] sqlParams) throws VistaPedidosConAdeudosDaoException
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
		
		
			//System.out.println( "Executing " + SQL );
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
			throw new VistaPedidosConAdeudosDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the vista_pedidos_con_adeudos table that match the specified arbitrary SQL statement
	 */
	public VistaPedidosConAdeudos[] findByDynamicWhere(String sql, Object[] sqlParams) throws VistaPedidosConAdeudosDaoException
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
		
		
			//System.out.println( "Executing " + SQL );
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
			throw new VistaPedidosConAdeudosDaoException( "Exception: " + _e.getMessage(), _e );
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