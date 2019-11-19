/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Beans.Usuario;
import Daos.UsuarioDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Gustavo_Meza
 */
@WebServlet(name = "MainServlet", urlPatterns = {"/MainServlet", "", "/LoginServlet"})
public class LoginServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String action = request.getParameter("action") == null ? "login" : request.getParameter("action");

        UsuarioDao uDao = new UsuarioDao();
        HttpSession session;
        RequestDispatcher view;

        switch (action) {
            case "login":
                view = request.getRequestDispatcher("index.jsp");
                view.forward(request, response);
                break;

            case "inicio":
                session = request.getSession();
                session.invalidate();
                response.sendRedirect("index.jsp");
                break;

            case "registrarse":
                view = request.getRequestDispatcher("register.jsp");
                view.forward(request, response);
                break;

            case "recuperar":
                view = request.getRequestDispatcher("forgot-password.jsp");
                view.forward(request, response);
                break;

            case "correoRecuperar":
                view = request.getRequestDispatcher("forgot-mail.jsp");
                view.forward(request, response);
                break;

            case "correoRegistrar":
                view = request.getRequestDispatcher("register-mail.jsp");
                view.forward(request, response);
                break;

            case "iniciarSesion":
                int codigo;
                String password;

                try {
                    codigo = Integer.parseInt(request.getParameter("usernameIniciarSesion"));
                    password = request.getParameter("passwordIniciarSesion");
                } catch (NumberFormatException e) {
                    break;
                }
                Usuario user = uDao.validarUsuario(codigo, password);
                if (user == null) {
                    response.sendRedirect(request.getContextPath() + "/index.jsp");
                } else {

                    session = request.getSession();
                    session.setAttribute("usuario", user);
                    switch (user.getRol().getId()) {
                        case 1: //Participante

                            break;
                        case 2: //Delegado de actividad

                            break;
                        case 3: //Delegado general
                            response.sendRedirect(request.getContextPath() + "/UsuarioServlet");
                            break;

                    }
                }
                break;

        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}