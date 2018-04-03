/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import hrproject.DAO;
import hrproject.Nurse;
import hrproject.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Group 3
 */
@WebServlet(name = "UpdatePatientProfile", urlPatterns =
{
    "/UpdatePatientProfile"
})
public class UpdatePatientProfile extends HttpServlet
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
            throws ServletException, IOException
    {//getting parameters
        String Id = request.getParameter("id");
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        String gender = request.getParameter("gender");
        String age = request.getParameter("age");
        String id = request.getParameter("national_id");
        String address = request.getParameter("address");
        String cell = request.getParameter("cellNumber");
        String email = request.getParameter("email");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        int pnum;
        int num;
        int user_age;
        int cell_num;
        ArrayList<String> errorlist = new ArrayList<String>();
        DAO dao = null;
        String dispatch = null;
        //int staffNum = 0;
        try
        { //handling errors
            if (name == null || name.length() == 0)
            {
                errorlist.add("Name is required");
            }
            if (surname == null || surname.length() == 0)
            {
                errorlist.add("Lastname is required");
            }
            if (gender == null || gender.length() == 0)
            {
                errorlist.add("gender is required");
            }
            if (age == null || age.length() == 0)
            {
                errorlist.add("Age is required");
            }
            if (id == null || id.length() == 0)
            {
                errorlist.add("ID is required");
            }
            if (address == null || address.length() == 0)
            {
                errorlist.add("Address is required");
            }
            if (cell == null || cell.length() == 0)
            {
                errorlist.add("Cellphone number is required");
            }
            if (email == null || email.length() == 0)
            {
                errorlist.add("Email Address is required");
            }
            if (username == null || username.length() == 0)
            {
                errorlist.add("Username is required");
            }
            if (password == null || password.length() == 0)
            {
                errorlist.add("Password is required");
            }

            pnum = Integer.parseInt(Id);
            user_age = Integer.parseInt(age);
            cell_num = Integer.parseInt(cell);

            if (errorlist.isEmpty())
            {//setting parameters to user
                User n = new User(name, surname, gender, user_age, id, address, cell_num, email, username, password, pnum);
                dao = new DAO();
                //updating patient  
                boolean isAdded = dao.updatePatient(n);
                if (isAdded)
                {//go to home 
                    request.setAttribute("Successmsg", "Profile " + name + " " + surname + " updated");
                    dispatch = "patientHome.jsp";
                } else
                {//remain in edit page
                    errorlist.add("Profile not updated");
                    request.setAttribute("errorList", errorlist);
                    dispatch = "editPatient.jsp";
                }
            } else
            {
                request.setAttribute("errorList", errorlist);
                dispatch = "editPatient.jsp";
            }
        } catch (Exception ex)
        {
            errorlist.add("ERROR: " + ex.getMessage());
            request.setAttribute("errorList", errorlist);
            dispatch = "editPatient.jsp";
        } finally
        {

        }
        RequestDispatcher rd = request.getRequestDispatcher(dispatch);
        rd.forward(request, response);
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
            throws ServletException, IOException
    {
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
            throws ServletException, IOException
    {
        processRequest(request, response);
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
