package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;

public class Main {
    public static void main(String[] args) {
        UserDaoJDBCImpl userDaoJDBC = new UserDaoJDBCImpl();
        userDaoJDBC.createUsersTable();
        userDaoJDBC.saveUser("John", "A", (byte) 25);
        userDaoJDBC.saveUser("Bob", "B", (byte) 26);
        userDaoJDBC.saveUser("Tom", "C", (byte) 27);
        userDaoJDBC.saveUser("Alex", "D", (byte) 28);
        userDaoJDBC.getAllUsers();
        userDaoJDBC.cleanUsersTable();
        userDaoJDBC.dropUsersTable();
    }
}
