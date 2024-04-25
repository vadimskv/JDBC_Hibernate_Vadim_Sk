package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("John", "A", (byte) 24);
        userService.saveUser("Jane", "B", (byte) 26);
        userService.saveUser("Jack", "C", (byte) 27);
        userService.saveUser("Alex", "D", (byte) 28);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
