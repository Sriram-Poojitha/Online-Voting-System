package com.voting;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class VoteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String candidate = request.getParameter("candidate");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/voting_system", "root", "password");

            PreparedStatement ps = con.prepareStatement("UPDATE candidates SET votes = votes + 1 WHERE name = ?");
            ps.setString(1, candidate);
            ps.executeUpdate();

            response.sendRedirect("results.html");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
