package pl.coderslab;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();

        //testowanie create
//        User user = new User();
//        user.setUserName("Jan Nowak");
//        user.setEmail("jan.nowak@wp.pl");
//        user.setPassword("pass");
//        userDao.create(user);
//
//        User user2 = new User();
//        user2.setUserName("Maja");
//        user2.setEmail("maja.zalewska@gmail.com");
//        user2.setPassword("domek123");
//        userDao.create(user2);

        //testowanie read
//        User userReadFromRow = userDao.read(5);
//        System.out.println(userReadFromRow);

        //testowanie update
        User userToUpdate = userDao.read(7);
        System.out.println(userToUpdate);

        userToUpdate.setUserName("Maja Zalewska");
        userToUpdate.setEmail("maja.zalewska@gmail.com");
        userToUpdate.setPassword("liczba123");

        userDao.update(userToUpdate);

        //testowanie delete
//
//        userDao.delete(1);

        //testowanie findAll
        User[] users = userDao.findAll();
        System.out.println("liczba obiektow tablicy to: " + users.length);
        System.out.println(users[1]);
        System.out.println(Arrays.toString(users));

    }
}



