/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import hrproject.DAO;
import hrproject.TestRegister;
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
@WebServlet(name = "UpdateTestRegister", urlPatterns =
{
    "/UpdateTestRegister"
})
public class UpdateTestRegister extends HttpServlet
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
    {
        String date = request.getParameter("date");
        String number = request.getParameter("number");
        String name = request.getParameter("name");
        String clinic_nr = request.getParameter("clinic_nr");
        String age = request.getParameter("age");
        String first_test = request.getParameter("first_test");
        String gender = request.getParameter("gender");
        String referral = request.getParameter("referral");
        String referred_from = request.getParameter("referred_from");
        String tested = request.getParameter("tested");
        String screen_test = request.getParameter("screen_test");
        String confirm_test = request.getParameter("confirm_test");
        String results = request.getParameter("results");
        String elisa = request.getParameter("elisa");
        String post_test_counsel = request.getParameter("post_test_counsel");
        String on_going_counsel = request.getParameter("on_going_counsel");
        String referrals_to = request.getParameter("referrals_to");
        String counselling_notes = request.getParameter("counselling_notes");
        String dispatch = "editPatientData.jsp";
        //SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        //Date date= null;
        ArrayList<String> errorList = new ArrayList<String>();

        try
        {
            if (number == null || number.trim().length() == 0)
            {
                errorList.add(" is required");
            }
            if (name == null || name.trim().length() == 0)
            {
                errorList.add(" is required");
            }
            if (clinic_nr == null || clinic_nr.trim().length() == 0)
            {
                errorList.add(" is required");
            }
            if (age == null || age.trim().length() == 0)
            {
                errorList.add(" is required");
            }
            if (gender == null || gender.trim().length() == 0)
            {
                errorList.add(" is required");
            }
            if (referral == null || referral.trim().length() == 0)
            {
                errorList.add(" is required");
            }
            if (referred_from == null || referred_from.trim().length() == 0)
            {
                errorList.add(" is required");
            }
            if (tested == null || tested.trim().length() == 0)
            {
                errorList.add(" is required");
            }
            if (screen_test == null || screen_test.trim().length() == 0)
            {
                errorList.add(" is required");
            }
            if (confirm_test == null || confirm_test.trim().length() == 0)
            {
                errorList.add(" is required");
            }
            if (results == null || results.trim().length() == 0)
            {
                errorList.add(" is required");
            }
            if (elisa == null || elisa.trim().length() == 0)
            {
                errorList.add(" is required");
            }
            if (post_test_counsel == null || post_test_counsel.trim().length() == 0)
            {
                errorList.add(" is required");
            }
            if (on_going_counsel == null || on_going_counsel.trim().length() == 0)
            {
                errorList.add(" is required");
            }
            if (referrals_to == null || referrals_to.trim().length() == 0)
            {
                errorList.add(" is required");
            }
            if (counselling_notes == null || counselling_notes.trim().length() == 0)
            {
                errorList.add(" is required");
            }

            if (date == null || date.trim().length() == 0)
            {

                errorList.add(" is required");
            }

            if (errorList.isEmpty())
            {//  TestRegister p = new TestRegister();
                TestRegister p = new TestRegister(name, date, clinic_nr, age, first_test, gender, referral, referred_from, tested, screen_test, confirm_test, results, post_test_counsel, on_going_counsel, referrals_to, counselling_notes, elisa, number);
                DAO d = new DAO();
                //updating patient test      
                boolean isAdded = d.updateTestRegitserP(p);
                if (isAdded)
                {//go nurse home
                    request.setAttribute("Successmsg", "Patient  " + name + " data updated");
                    dispatch = "nurseHome.jsp";
                } else
                {//remain in edit page
                    errorList.add("Patient data not updated");
                    request.setAttribute("errorList", errorList);
                    dispatch = "editPatientData.jsp";
                }
            } else
            {
                request.setAttribute("errorList", errorList);
                dispatch = "editPatientData.jsp";
            }
        } catch (Exception ex)
        {
            errorList.add("ERROR: " + ex.getMessage());
            request.setAttribute("errorList", errorList);
            dispatch = "editPatientData.jsp";
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
