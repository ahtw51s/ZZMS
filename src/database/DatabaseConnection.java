package database;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import constants.ServerConfig;
import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Collection;
import java.util.LinkedList;

/**
 * All servers maintain a Database Connection. This class therefore
 * "singletonices" the connection per process.
 *
 *
 * @author Frz
 */
public class DatabaseConnection {

    private static final ThreadLocal<Connection> con = new DatabaseConnection.ThreadLocalConnection();
    private static final ComboPooledDataSource dataSource = new ComboPooledDataSource();
    public static final int CLOSE_CURRENT_RESULT = 1;
    /**
     * The constant indicating that the current <code>ResultSet</code> object
     * should not be closed when calling <code>getMoreResults</code>.
     *
     * @since 1.4
     */
    public static final int KEEP_CURRENT_RESULT = 2;
    /**
     * The constant indicating that all <code>ResultSet</code> objects that have
     * previously been kept open should be closed when calling
     * <code>getMoreResults</code>.
     *
     * @since 1.4
     */
    public static final int CLOSE_ALL_RESULTS = 3;
    /**
     * The constant indicating that a batch statement executed successfully but
     * that no count of the number of rows it affected is available.
     *
     * @since 1.4
     */
    public static final int SUCCESS_NO_INFO = -2;
    /**
     * The constant indicating that an error occured while executing a batch
     * statement.
     *
     * @since 1.4
     */
    public static final int EXECUTE_FAILED = -3;
    /**
     * The constant indicating that generated keys should be made available for
     * retrieval.
     *
     * @since 1.4
     */
    public static final int RETURN_GENERATED_KEYS = 1;
    /**
     * The constant indicating that generated keys should not be made available
     * for retrieval.
     *
     * @since 1.4
     */
    public static final int NO_GENERATED_KEYS = 2;

    public static Connection getConnection() {
        return con.get();
    }

    public static void closeAll() throws SQLException {
        for (final Connection connection : DatabaseConnection.ThreadLocalConnection.allConnections) {
            if (connection != null) {
                connection.close();
            }
        }
    }

    private static final class ThreadLocalConnection extends ThreadLocal<Connection> {

        public static final Collection<Connection> allConnections = new LinkedList<>();

        @Override
        protected final Connection initialValue() {
//            try {
//                Class.forName("com.mysql.jdbc.Driver"); // touch the mysql driver
//            } catch (final ClassNotFoundException e) {
//                System.err.println("ERROR" + e);
//            }

            try {
//                final Connection con = DriverManager.getConnection("jdbc:mysql://" + ServerConstants.SQL_IP + ":" + ServerConstants.SQL_PORT + "/" + ServerConstants.SQL_DATABASE + "?autoReconnect=true&characterEncoding=UTF8", ServerConstants.SQL_USER, ServerConstants.SQL_PASSWORD);
                final Connection con = dataSource.getConnection();
                allConnections.add(con);
                return con;
            } catch (SQLException e) {
                System.err.println("ERROR" + e);
                return null;
            }
        }
    }

    static {
        try {
            dataSource.setDriverClass("com.mysql.jdbc.Driver");
            dataSource.setJdbcUrl("jdbc:mysql://" + ServerConfig.SQL_IP + ":" + ServerConfig.SQL_PORT + "/" + ServerConfig.SQL_DATABASE + "?autoReconnect=true&characterEncoding=UTF8");
            dataSource.setUser(ServerConfig.SQL_USER);
            dataSource.setPassword(ServerConfig.SQL_PASSWORD);
            dataSource.setMinPoolSize(20);
            dataSource.setInitialPoolSize(30);
            dataSource.setMaxPoolSize(400);
            dataSource.setAcquireIncrement(10);
            dataSource.setCheckoutTimeout(300);
            dataSource.setAutoCommitOnClose(true);
//            dataSource.setMaxIdleTime(120);
//            dataSource.setIdleConnectionTestPeriod(120);
            dataSource.setAutomaticTestTable("c3p0testtable");
            dataSource.setTestConnectionOnCheckin(true);
            dataSource.setTestConnectionOnCheckout(true);
//            dataSource.setUnreturnedConnectionTimeout(1800);
            dataSource.setMaxStatementsPerConnection(100);
//            dataSource.setNumHelperThreads(3);
        } catch (PropertyVetoException e) {
            System.out.println("[數據庫訊息] 找不到JDBC驅動.");
            System.exit(0);
        }
    }
}
