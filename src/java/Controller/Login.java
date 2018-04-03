/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import hrproject.DAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import hrproject.User;
import java.sql.SQLException;

/**
 *
 * @author Group 3
 */
@WebServlet(name = "Login", urlPatterns =
{
    "/Login"
})
public class Login extends HttpServlet
{

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
            throws ServletException, IOException, ClassNotFoundException, SQLException, Exception
    {//getting parameter username and password
        String str_userName = request.getParameter("user_name");
        String str_password = request.getParameter("password");
        String target = "index.jsp";
        RequestDispatcher rd;
        DAO dao = new DAO();
        User user = null;
        int patientNo = 0;
        String text = "error";
        ArrayList<String> errorList = new ArrayList<String>();
        try
        {//handling errors
            if (str_userName == null || str_userName.trim().length() == 0)
            {
                errorList.add("Username is missing/required");
            }
            if (str_password == null || str_password.trim().length() == 0)
            {
                errorList.add("Password is missing/required");
            }

            if (errorList.isEmpty())
            {//settin gusername and password in user
                user = dao.login(str_userName, str_password);

                if (user != null)
                {//if user available
                    HttpSession session = request.getSession(true);
                    session.setAttribute("LoggedIn", user);

                    if (user.getCategory().equals("admin"))
                    {
                        target = "view.jsp";
                        text = "Welcome  " + str_userName + " my Administrator";
                    } else if (user.getCategory().equals("Patient"))
                    {
                        target = "patientHome.jsp";
                        text = "Welcome " + user.getFirstName() + " your patient number is " + user.getNumber() + " you will have to produce this to the nurse.";
                    } else if (user.getCategory().equals("Nurse"))
                    {

                        target = ("nurseHome.jsp");
                        text = "Welcome  " + str_userName;
                    }
                } else
                {
                    errorList.add("Invalid Username/Passowrd. Please try again");
                    target = "index.jsp";
                }

            }
        } finally
        {

        }

        request.setAttribute("errors", errorList);
        request.setAttribute("result", text);
        request.setAttribute("pas", str_password);
        request.setAttribute("id", str_userName);
        rd = request.getRequestDispatcher(target);
        rd.forward(request, response);

    }  // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">

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
            throws ServletException, IOException
    {
        try
        {
            processRequest(request, response);
        } catch (ClassNotFoundException ex)
        {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex)
        {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex)
        {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
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
            throws ServletException, IOException
    {
        try
        {
            processRequest(request, response);
        } catch (ClassNotFoundException ex)
        {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex)
        {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex)
        {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo()
    {
        return "Short description";
    }// </editor-fold>
}
