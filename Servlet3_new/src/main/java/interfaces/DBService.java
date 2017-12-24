package interfaces;

import dbService.DBException;
import dbService.dataSets.UsersDataSet;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public interface DBService {

    String hibernate_show_sql = "true";
    String hibernate_hbm2ddl_auto = "update";

    Configuration getConfiguration();

    UsersDataSet getUser(long id) throws DBException;

    UsersDataSet getUserByName(String name) throws DBException;

    long addUser(String name, String password) throws DBException;

    void printConnectInfo();

    SessionFactory createSessionFactory(Configuration configuration);

}
