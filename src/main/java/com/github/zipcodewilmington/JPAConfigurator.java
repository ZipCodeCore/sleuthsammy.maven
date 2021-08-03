package com.github.zipcodewilmington;

import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 8/3/21 3:57 PM
 */
public class JPAConfigurator {
    private final Connection connection;

    public JPAConfigurator() {
        try {// Attempt to register JDBC Driver
            DriverManager.registerDriver(Driver.class.newInstance());
            this.connection = getConnection("mysql");
        } catch (InstantiationException | IllegalAccessException | SQLException e1) {
            throw new RuntimeException(e1);
        }
    }

    public void init() {
        executeStatement("DROP DATABASE IF EXISTS testdb;");
        executeStatement("CREATE DATABASE IF NOT EXISTS testdb;");
    }

    void executeStatement(String sqlStatement) {
        try {
            Statement statement = getScrollableStatement();
            statement.execute(sqlStatement);
        } catch (SQLException e) {
            throw new Error(e);
        }
    }

    Statement getScrollableStatement() {
        int resultSetType = ResultSet.TYPE_SCROLL_INSENSITIVE;
        int resultSetConcurrency = ResultSet.CONCUR_READ_ONLY;
        try { // scrollable statements can be iterated more than once without closing
            return connection.createStatement(resultSetType, resultSetConcurrency);
        } catch (SQLException e) {
            throw new Error(e);
        }
    }

    Connection getConnection(String dbVendor) {
        String username = "root";
        String password = "";
        String url = new StringBuilder()
                .append("jdbc:")
                .append(dbVendor)
                .append("://127.0.0.1/")
                .append("?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC")
                .toString();
        try {
            return DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            throw new Error(e);
        }
    }
}
