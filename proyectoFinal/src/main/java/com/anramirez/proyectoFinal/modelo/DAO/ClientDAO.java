package com.anramirez.proyectoFinal.modelo.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.anramirez.proyectoFinal.Utils.SingletonBBDD;
import com.anramirez.proyectoFinal.modelo.Artwork;
import com.anramirez.proyectoFinal.modelo.Client;

public class ClientDAO {


		private  SingletonBBDD con;
		private  Connection connection;
		
		
	 
		public ClientDAO(String url, String usuario, String password) throws SQLException {
			System.out.println(url);
			con = new SingletonBBDD();
		}
	 
		// insertar cliente
		@SuppressWarnings("static-access")
		public boolean addClient(Client client) throws SQLException {
			String sql = "INSERT INTO cliente (id, nombre, edad, telefono, pais) "
					+ "VALUES (?, ?, ?,?,?,?)";
			System.out.println(client.get_idClient());
			con.getConnection();
			connection = con.getConnection();
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, null);
			statement.setString(2, client.getName());
			statement.setInt(3, client.getAge());
			statement.setInt(4, client.getPhone());
			statement.setString(5, client.getCountry());

	 
			boolean rowInserted = statement.executeUpdate() > 0;
			statement.close();
			con.cerrarConexion();
			return rowInserted;
		}
	 
		// listar todos los clientes
		@SuppressWarnings("static-access")
		public List<Client> listarClients() throws SQLException {
	 
			List<Client> listaClientes = new ArrayList<Client>();
			String sql = "SELECT * FROM clientes";
			con.getConnection();
			connection = con.getConnection();
			Statement statement = connection.createStatement();
			ResultSet resulSet = statement.executeQuery(sql);
	 
			while (resulSet.next()) {
				int id = resulSet.getInt("id");
				String nombre = resulSet.getString("nombre");
				int edad = resulSet.getInt("edad");
				int telefono = resulSet.getInt("telefono");
				String pais = resulSet.getString("pais");
				String dni = resulSet.getString("dni");
				ArrayList<Artwork> = (ArrayList<Artwork>) resulSet.getArray(2);
				Client cliente = new Client(id, nombre, dni , edad, telefono, pais, null);
				listaClientes.add(cliente);
			}
			con.cerrarConexion();
			return listaClientes;
		}
	 
		// obtener por id
		@SuppressWarnings("static-access")
		public Client obtenerPorId(int _id) throws SQLException {
			Client client = null;
	 
			String sql = "SELECT * FROM clientes WHERE _id= ? ";
			con.getConnection();
			connection = con.getConnection();
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setInt(1, _id);
	 
			ResultSet res = statement.executeQuery();
			if (res.next()) {
				client = new Client(res.getInt("id"), res.getString("nombre"),
						res.getString("dni"), res.getInt("edad"), res.getInt("telefono"), res.getString("pais"),((Artwork) res).getArrayList());
			}
			res.close();
			con.cerrarConexion();
	 
			return client;
		}
		
		// obtener por Nombre
		@SuppressWarnings("static-access")
		public Client obtenerPorNombre(String name) throws SQLException {
			Client client = null;
	 
			String sql = "SELECT * FROM clientes WHERE id= ? ";
			con.getConnection();
			connection = con.getConnection();
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(2, "nombre");
	 
			ResultSet res = statement.executeQuery();
			if (res.next()) {
				client = new Client(res.getInt("id"), res.getString("nombre"),
						res.getString("dni"), res.getInt("edad"), res.getInt("telefono"), 
						res.getString("pais"), ((Artwork) res).getArrayList());
			}
			res.close();
			con.cerrarConexion();
	 
			return client;
		}
	 
		// actualizar
		@SuppressWarnings("static-access")
		public boolean actualizar(Client client) throws SQLException {
			boolean rowActualizar = false;
			String sql = "UPDATE clientes SET nombre=?,edad=?,telefono=?,pais=? WHERE _id=?";
			con.getConnection();
			connection = con.getConnection();
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setInt(1, client.get_idClient());
			statement.setString(2, client.getName());
			statement.setInt(3, client.getAge());
			statement.setInt(4, client.getPhone());
			statement.setString(5, client.getCountry());

	 
			rowActualizar = statement.executeUpdate() > 0;
			statement.close();
			con.cerrarConexion();
			return rowActualizar;
		}
		
		//eliminar
		@SuppressWarnings("static-access")
		public boolean eliminar(Client client) throws SQLException {
			boolean rowEliminar = false;
			String sql = "DELETE FROM cliente WHERE _id=?";
			con.getConnection();
			connection = con.getConnection();
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setInt(1, client.get_idClient());
	 
			rowEliminar = statement.executeUpdate() > 0;
			statement.close();
			con.cerrarConexion();
	 
			return rowEliminar;
		}
	
}
