package com.eryansky.codegen.db;

import java.sql.Connection;

import com.eryansky.codegen.util.Resources;

/**
 * 根据驱动获取数据库操作实例。
 * @author 尔演&Eryan eryanwcp@gmail.com
 * @date 2013-7-15 下午4:12:09 
 * @version 1.0
 */
public class DbFactory {

	/**
	 * 创建数据库实例
	 * 
	 * @param dialect
	 *            mysql,sqlserver,db2,oracle
	 * @return
	 * @throws Exception
	 */
	public static DataSource create(Connection conn) throws Exception {
		DataSource db = null;
		String dialect = Resources.DRIVER;
		if (dialect == null || "".equals(dialect))
			throw new Exception(DbFactory.class.getName() + ":>>>请指定数据库dialect......");
		if ("org.gjt.mm.mysql.Driver".equals(dialect))
			db = new MysqlDataSource(conn,Resources.CATALOG,Resources.SCHEMA);
		else if ("com.ibm.db2.jcc.DB2Driver".equals(dialect))
			db = new MysqlDataSource(conn,Resources.CATALOG,Resources.SCHEMA);
		else if("oracle.jdbc.driver.OracleDriver".equals(dialect))
			db = new OracleDataSource(conn,Resources.CATALOG,Resources.SCHEMA);
		return db;
	}

}
