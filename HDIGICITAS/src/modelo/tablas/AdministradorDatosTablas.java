package modelo.tablas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;

//import eshop.beans.Book;
//import eshop.beans.CartItem;
//import eshop.beans.Category;
//import eshop.beans.Customer;
//import eshop.model.BookPeer;
//import eshop.model.CategoryPeer;
//import eshop.model.OrderDetailsPeer;
//import eshop.model.OrderPeer;

public class AdministradorDatosTablas {

	private String bdDirec = "";
	private String bdNomUsu = "";
	private String bdContra = "";

	public String getBdDirec() {
		return bdDirec;
	}

	public void setBdDirec(String bdDirec) {
		this.bdDirec = bdDirec;
	}

	public String getBdNomUsu() {
		return bdNomUsu;
	}

	public void setBdNomUsu(String bdNomUsu) {
		this.bdNomUsu = bdNomUsu;
	}

	public String getBdContra() {
		return bdContra;
	}

	public void setBdContra(String bdContra) {
		this.bdContra = bdContra;
	}

	public Connection getConexion() {
		Connection conex = null;
		try {
			conex = DriverManager.getConnection(getBdDirec(), getBdNomUsu(), getBdContra());
		} catch (SQLException e) {
			System.out.println("No se ha podido conectarse a la BD: " + e.getMessage());
		}
		return conex;
	}

	public void putConnection(Connection conex) {
		if (conex != null) {
			try {
				conex.close();
			} catch (SQLException e) {
			}
		}
	}

	// ---------- Operaciones Datos ------------

	

	/*// ---------- Category operations ----------
	public String getCategoryName(String categoryID) {
		Category category = CategoryPeer.getCategoryById(this, categoryID);
		return (category == null) ? null : category.getName();
	}

	public Hashtable<String, String> getCategories() {
		return CategoryPeer.getAllCategories(this);
	}

	public Enumeration<String> getCatIDs() {
		return CategoryPeer.getAllCategories(this).keys();
	}

	// ---------- Book operations ----------
	public ArrayList<Book> getSearchResults(String keyword) {
		return BookPeer.searchBooks(this, keyword);
	}

	public ArrayList<Book> getBooksInCategory(String categoryID) {
		return BookPeer.getBooksByCategory(this, categoryID);
	}

	public Book getBookDetails(String bookID) {
		return BookPeer.getBookById(this, bookID);
	}

	// ---------- Order operations ----------
	public long insertOrder(Customer customer, HashMap<String, CartItem> shoppingCart) {
		long returnValue = 0L;
		long orderId = System.currentTimeMillis();
		Connection connection = getConnection();
		if (connection != null) {
			Statement stmt = null;
			try {
				connection.setAutoCommit(false);
				stmt = connection.createStatement();
				try {
					OrderPeer.insertOrder(stmt, orderId, customer);
					OrderDetailsPeer.insertOrderDetails(stmt, orderId, shoppingCart);
					
					 * OrderDetailsPeer.insertOrderDetails1(stmt, orderId,
					 * shoppingCart);el hashtable
					 
					try {
						stmt.close();
					} finally {
						stmt = null;
					}
					connection.commit();
					returnValue = orderId;
				} catch (SQLException e) {
					System.out.println("Could not insert order: " + e.getMessage());
					try {
						connection.rollback();
					} catch (SQLException ee) {
					}
				}
			} catch (SQLException e) {
				System.out.println("Could not insert order: " + e.getMessage());
			} finally {
				if (stmt != null) {
					try {
						stmt.close();
					} catch (SQLException e) {
					}
				}
				putConnection(connection);
			}
		}
		return returnValue;
	}*/

}
