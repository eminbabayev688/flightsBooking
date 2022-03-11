package az.iktlab.dao.repo;

import az.iktlab.dao.JdbcConnection;
import az.iktlab.dao.PgSql;
import az.iktlab.util.SqlQuery;

import java.sql.SQLException;
import java.sql.Statement;

public class StartupLoaderDao {

    JdbcConnection jdbcConnection = new PgSql();

    public void createTables() throws SQLException {
        Statement statement = jdbcConnection.getStatement();
        statement.execute(SqlQuery.createFlightsTables());
        statement.execute(SqlQuery.createBookingsTables());
        statement.execute(SqlQuery.createUsersTables());
    }

}
