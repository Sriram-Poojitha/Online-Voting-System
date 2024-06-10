package com.voting;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/voting_system", "root", "password");

            PreparedStatement ps = con.prepareStatement("INSERT INTO users(username, password) VALUES(?, ?)");
            ps.setString(1, username);
            ps.setString(2, password);
            ps.executeUpdate();

            response.sendRedirect("index.html");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
