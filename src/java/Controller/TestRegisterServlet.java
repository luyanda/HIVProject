/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import static com.sun.xml.bind.util.CalendarConv.formatter;
import hrproject.DAO;
import hrproject.TestRegister;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
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
@WebServlet(name = "TestRegister", urlPatterns =
{
    "/TestRegister"
})
public class TestRegisterServlet extends HttpServlet
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
        //Capturing data
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
        String dispatch = "testingRegister.jsp";
      
        ArrayList<String> errorList = new ArrayList<String>();

        try
        {   //Handling Errors
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
                //No errors
            if (errorList.isEmpty())
            {
                TestRegister p = new TestRegister();

                p.setNumber(number);
                p.setFirstname_sname(name);
                p.setClinic_nr(clinic_nr);
                p.setFirst_test(first_test);
                p.setGender(gender);
                p.setReferral(referral);
                p.setReferred_fro(referred_from);
                p.setTested(tested);
                p.setSreening(screen_test);
                p.setConf_test(confirm_test);
                p.setResults(results);
                p.setElisa(elisa);
                p.setPost_test(post_test_counsel);
                p.setOngoing_test(on_going_counsel);
                p.setReferrals_to(referrals_to);
                p.setNotes(counselling_notes);
                p.setAge(age);
                p.setDate(date);
                DAO d = new DAO();
                boolean isAdded = d.testRegitserP(p);

                if (isAdded)
                {
                    request.setAttribute("Successmsg", "Patient " + name + " Registered");
                    dispatch = "testingRegister.jsp";
                } else
                {
                    errorList.add("Patient not registered");
                    request.setAttribute("errorList", errorList);
                    dispatch = "testingRegister.jsp";
                }
            } else
            {
                request.setAttribute("errorList", errorList);
                dispatch = "testingRegister.jsp";
            }
        } catch (Exception ex)
        {
            errorList.add("ERROR: " + ex.getMessage());
            request.setAttribute("errorList", errorList);
            dispatch = "testingRegister.jsp";
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
