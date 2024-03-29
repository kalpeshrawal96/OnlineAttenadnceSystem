/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin.controllers;

import entities.*;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import utility.Controller;

import javax.persistence.criteria.JoinType;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;
import java.util.List;

/**
 * @author sukhvir
 */
@WebServlet(urlPatterns = "/admin/students/deactivated")
public class AdminDeactivatedStudents extends Controller {

    @Override
    public void process(HttpServletRequest req, HttpServletResponse resp, Session session, HttpSession httpSession, PrintWriter out) throws Exception {

        req.getRequestDispatcher("/WEB-INF/admin/deactivated-students.jsp")
                .include(req, resp);
    }
}
