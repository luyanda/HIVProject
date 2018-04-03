 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hrproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Group 3
 */
public class DAO
{

    private String driver = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3306/onlinesystemdb";
    private String username = "root";
    private String password = "csi3201";
//loading driver
    public DAO() throws ClassNotFoundException
    {
        Class.forName(driver);
    }
//connecting to database
    public Connection getConnection() throws SQLException
    {
        Connection conn = DriverManager.getConnection(this.url, this.username, this.password);
        return conn;
    }
//close connection
    public void closeDBResource(ResultSet rs, PreparedStatement st, Connection con) throws SQLException
    {
        if (rs != null)
        {
            rs.close();
            rs = null;
        }
        if (st != null)
        {
            st.close();
            st = null;
        }
        if (con != null)
        {
            con.close();
            con = null;
        }
    }
//adding user to patient table in the database
    public boolean addPatient(User patient) throws Exception
    {
        boolean isInserted = false;
        Connection conn = null;
        PreparedStatement ps = null;
        String sql = "INSERT INTO user(fname, sname, gender, age, id, address, cell, email, username,password, category) VALUES(?,?,?,?,?,?,?,?,?,?,?)";

        try
        {
            conn = this.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, patient.getFirstName());
            ps.setString(2, patient.getLastName());
            ps.setString(3, patient.getGender());
            ps.setInt(4, patient.getAge());
            ps.setString(5, patient.getIdNumber());
            ps.setString(6, patient.getAddress());
            ps.setInt(7, patient.getCellNumber());
            ps.setString(8, patient.getEmailAddress());
            ps.setString(9, patient.getUserName());
            ps.setString(10, patient.getPassword());
            ps.setString(11, "Patient");

            int status = ps.executeUpdate();
            if (status > 0)
            {
                isInserted = true;

            } else
            {
                isInserted = false;
            }

        } finally
        {
            closeDBResource(null, ps, conn);
        }
        return isInserted;
    }
//deleting user to user table in the database
    public boolean deleteStaff(String staffNo) throws Exception
    {
        if (staffNo == null || staffNo.length() == 0)
        {
            throw new IllegalArgumentException("nurse number cannot be null or blank");
        }
        boolean isDeleted = false;
        Connection conn = null;
        PreparedStatement ps = null;

        String sql = "DELETE FROM user WHERE uniquenumber=?";
        try
        {
            conn = this.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, staffNo);
            int rowStat = ps.executeUpdate();
            if (rowStat > 0)
            {
                isDeleted = true;
            } else
            {
                isDeleted = false;
            }
        } finally
        {
            closeDBResource(null, ps, conn);
        }
        return isDeleted;
    }
//adding user to patient table in the database
    public boolean deletePatientData(String patientNo) throws Exception
    {
        if (patientNo == null || patientNo.length() == 0)
        {
            throw new IllegalArgumentException("patient number cannot be null or blank");
        }
        boolean isDeleted = false;
        Connection conn = null;
        PreparedStatement ps = null;

        String sql = "DELETE FROM patient WHERE uniquenumber=?";
        try
        {
            conn = this.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, patientNo);
            int rowStat = ps.executeUpdate();
            if (rowStat > 0)
            {
                isDeleted = true;
            } else
            {
                isDeleted = false;
            }
        } finally
        {
            closeDBResource(null, ps, conn);
        }
        return isDeleted;
    }
 //adding Nurse to a table in the database
    public boolean addNurse(Nurse nurse) throws Exception
    {
        boolean isInserted = false;
        Connection conn = null;
        PreparedStatement ps = null;
        String sql = "INSERT INTO user( fname, sname, gender, age, id, address, cell, email, username,password, category) VALUES(?,?,?,?,?,?,?,?,?,?,?)";

        try
        {
            conn = this.getConnection();
            ps = conn.prepareStatement(sql);

            ps.setString(1, nurse.getFirstName());
            ps.setString(2, nurse.getLastName());
            ps.setString(3, nurse.getGender());
            ps.setInt(4, nurse.getAge());
            ps.setString(5, nurse.getIdNumber());
            ps.setString(6, nurse.getAddress());
            ps.setInt(7, nurse.getCellNumber());
            ps.setString(8, nurse.getEmailAddress());
            ps.setString(9, nurse.getUserName());
            ps.setString(10, nurse.getPassword());
            ps.setString(11, "Nurse");

            int status = ps.executeUpdate();
            if (status > 0)
            {
                isInserted = true;
            } else
            {
                isInserted = false;
            }

        } finally
        {
            closeDBResource(null, ps, conn);
        }
        return isInserted;
    }
//listing patients from the database
    public ArrayList<TestRegister> viewPatientsInfo() throws Exception
    {
        ArrayList<TestRegister> list = new ArrayList<TestRegister>();

        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        String sql = "SELECT uniquenumber,firstname_surname, clinic_nurse, first_ever_test, gender, referral, referred_from,"
                + "tested,sreening, confirmatory_test, results, elisa, post_test_counselled,on_going_couselling,refferrals_to, counselling_notes,date, age FROM patient";
        try
        {
            conn = getConnection();
            ps = conn.prepareCall(sql);
            rs = ps.executeQuery();
            while (rs.next())
            {
                TestRegister p = new TestRegister();
                p.setNumber(rs.getString(1));
                p.setFirstname_sname(rs.getString(2));
                p.setClinic_nr(rs.getString(3));
                p.setFirst_test(rs.getString(4));
                p.setGender(rs.getString(5));
                p.setReferral(rs.getString(6));
                p.setReferred_fro(rs.getString(7));
                p.setTested(rs.getString(8));
                p.setSreening(rs.getString(9));
                p.setConf_test(rs.getString(10));
                p.setResults(rs.getString(11));
                p.setElisa(rs.getString(12));
                p.setPost_test(rs.getString(13));
                p.setOngoing_test(rs.getString(14));
                p.setReferrals_to(rs.getString(15));
                p.setNotes(rs.getString(16));
                p.setDate(rs.getString(17));
                p.setAge(rs.getString(18));
                list.add(p);
            }
        } finally
        {
            closeDBResource(rs, ps, conn);

        }
        return list;
    }
//counting statistics for monthly report
    public int monthlyReport() throws Exception
    {

        int count = 0;
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        String sql = "SELECT * FROM patient";
        try
        {
            conn = getConnection();
            ps = conn.prepareCall(sql);
            rs = ps.executeQuery();
            while (rs.next())
            {
                TestRegister p = new TestRegister();
                p.setNumber(rs.getString(1));
                p.setFirstname_sname(rs.getString(2));
                p.setClinic_nr(rs.getString(3));
                p.setFirst_test(rs.getString(4));
                p.setGender(rs.getString(5));
                p.setReferral(rs.getString(6));
                p.setReferred_fro(rs.getString(7));
                p.setTested(rs.getString(8));
                p.setSreening(rs.getString(9));
                p.setConf_test(rs.getString(10));
                p.setResults(rs.getString(11));
                p.setElisa(rs.getString(12));
                p.setPost_test(rs.getString(13));
                p.setOngoing_test(rs.getString(14));
                p.setReferrals_to(rs.getString(15));
                p.setNotes(rs.getString(16));
                p.setDate(rs.getString(17));
                p.setAge(rs.getString(18));
                count++;
            }
        } finally
        {
            closeDBResource(rs, ps, conn);

        }
        return count;
    }
//calculating number of positive males
    public int postiveMale() throws Exception
    {

        int count = 0;
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        String sql = "SELECT * FROM patient WHERE gender='Male' and results='POSITIVE'";
        try
        {
            conn = getConnection();
            ps = conn.prepareCall(sql);
            rs = ps.executeQuery();
            while (rs.next())
            {
                TestRegister p = new TestRegister();
                p.setNumber(rs.getString(1));
                p.setFirstname_sname(rs.getString(2));
                p.setClinic_nr(rs.getString(3));
                p.setFirst_test(rs.getString(4));
                p.setGender(rs.getString(5));
                p.setReferral(rs.getString(6));
                p.setReferred_fro(rs.getString(7));
                p.setTested(rs.getString(8));
                p.setSreening(rs.getString(9));
                p.setConf_test(rs.getString(10));
                p.setResults(rs.getString(11));
                p.setElisa(rs.getString(12));
                p.setPost_test(rs.getString(13));
                p.setOngoing_test(rs.getString(14));
                p.setReferrals_to(rs.getString(15));
                p.setNotes(rs.getString(16));
                p.setDate(rs.getString(17));
                p.setAge(rs.getString(18));
                count++;
            }
        } finally
        {
            closeDBResource(rs, ps, conn);

        }
        return count;
    }
//calculating number of positive females
    public int postiveFemale() throws Exception
    {

        int count = 0;
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        String sql = "SELECT * FROM patient WHERE gender='Female' and results='POSITIVE'";
        try
        {
            conn = getConnection();
            ps = conn.prepareCall(sql);
            rs = ps.executeQuery();
            while (rs.next())
            {
                TestRegister p = new TestRegister();
                p.setNumber(rs.getString(1));
                p.setFirstname_sname(rs.getString(2));
                p.setClinic_nr(rs.getString(3));
                p.setFirst_test(rs.getString(4));
                p.setGender(rs.getString(5));
                p.setReferral(rs.getString(6));
                p.setReferred_fro(rs.getString(7));
                p.setTested(rs.getString(8));
                p.setSreening(rs.getString(9));
                p.setConf_test(rs.getString(10));
                p.setResults(rs.getString(11));
                p.setElisa(rs.getString(12));
                p.setPost_test(rs.getString(13));
                p.setOngoing_test(rs.getString(14));
                p.setReferrals_to(rs.getString(15));
                p.setNotes(rs.getString(16));
                p.setDate(rs.getString(17));
                p.setAge(rs.getString(18));
                count++;
            }
        } finally
        {
            closeDBResource(rs, ps, conn);

        }
        return count;
    }
//updating test register for patient
    public boolean testRegitserP(TestRegister p) throws Exception
    {
        boolean isInserted = false;
        Connection conn = null;
        PreparedStatement ps = null;
        String sql = "INSERT INTO patient( uniquenumber,firstname_surname, clinic_nurse, first_ever_test, gender, referral, referred_from,tested,sreening, confirmatory_test, results, elisa, post_test_counselled,on_going_couselling,refferrals_to, counselling_notes,date, age) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try
        {
            conn = this.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, p.getNumber());
            ps.setString(2, p.getFirstname_sname());
            ps.setString(3, p.getClinic_nr());
            ps.setString(4, p.getFirst_test());
            ps.setString(5, p.getGender());
            ps.setString(6, p.getReferral());
            ps.setString(7, p.getReferred_fro());
            ps.setString(8, p.getTested());
            ps.setString(9, p.getSreening());
            ps.setString(10, p.getConf_test());
            ps.setString(11, p.getResults());
            ps.setString(12, p.getElisa());
            ps.setString(13, p.getPost_test());
            ps.setString(14, p.getOngoing_test());
            ps.setString(15, p.getReferrals_to());
            ps.setString(16, p.getNotes());
            ps.setString(17, p.getDate());
            ps.setString(18, p.getAge());

            int status = ps.executeUpdate();
            if (status > 0)
            {
                isInserted = true;
            } else
            {
                isInserted = false;
            }

        } finally
        {

            closeDBResource(null, ps, conn);
        }
        return isInserted;
    }
//updating a patient details
    public boolean updatePatient(User patient) throws Exception
    {
        boolean isUpdated = false;
        Connection conn = null;
        PreparedStatement ps = null;
        String sql = "UPDATE user SET fname=?, sname=?, gender=?, age=?, id=?, address=?, cell=?, email=?, username=?,password=?, category=?  WHERE uniquenumber=?";
        try
        {
            conn = this.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, patient.getFirstName());
            ps.setString(2, patient.getLastName());
            ps.setString(3, patient.getGender());
            ps.setInt(4, patient.getAge());
            ps.setString(5, patient.getIdNumber());
            ps.setString(6, patient.getAddress());
            ps.setInt(7, patient.getCellNumber());
            ps.setString(8, patient.getEmailAddress());
            ps.setString(9, patient.getUserName());
            ps.setString(10, patient.getPassword());
            ps.setString(11, "Patient");
            ps.setInt(12, patient.getNumber());
            int status = ps.executeUpdate();

            if (status > 0)
            {
                isUpdated = true;
            } else
            {
                isUpdated = false;
            }
        } finally
        {
            closeDBResource(null, ps, conn);;
        }
        return isUpdated;
    }
//updating Nurses
    public boolean updateNurse(Nurse n) throws Exception
    {

        boolean isUpdated = false;
        Connection conn = null;
        PreparedStatement ps = null;
        String sql = "UPDATE user SET fname=?, sname=?, gender=?, age=?, id=?, address=?, cell=?, email=?, username=?,password=?, category=? WHERE uniquenumber=?";
        try
        {
            conn = this.getConnection();
            ps = conn.prepareStatement(sql);

            ps.setString(1, n.getFirstName());
            ps.setString(2, n.getLastName());
            ps.setString(3, n.getGender());
            ps.setInt(4, n.getAge());
            ps.setString(5, n.getIdNumber());
            ps.setString(6, n.getAddress());
            ps.setInt(7, n.getCellNumber());
            ps.setString(8, n.getEmailAddress());
            ps.setString(9, n.getUserName());
            ps.setString(10, n.getPassword());
            ps.setString(11, "Nurse");
            ps.setInt(12, n.getStaffNo());
            int status = ps.executeUpdate();

            int rowStat = ps.executeUpdate();
            if (rowStat > 0)
            {
                isUpdated = true;
            } else
            {
                isUpdated = false;
            }
        } finally
        {
            closeDBResource(null, ps, conn);
        }
        return isUpdated;
    }
//updating test register
    public boolean updateTestRegitserP(TestRegister p) throws Exception
    {
        boolean isUpdated = false;
        Connection conn = null;
        PreparedStatement ps = null;
        String sql = "UPDATE patient SET firstname_surname =?, clinic_nurse=?, first_ever_test=?, gender=?, referral=?, referred_from=?,tested=?,sreening=?,"
                + " confirmatory_test=?, results=?, elisa=?, post_test_counselled=?,on_going_couselling=?,refferrals_to=?, counselling_notes=?,date=?, age=? WHERE uniquenumber=?";

        try
        {
            conn = this.getConnection();
            ps = conn.prepareStatement(sql);

            ps.setString(1, p.getFirstname_sname());
            ps.setString(2, p.getClinic_nr());
            ps.setString(3, p.getFirst_test());
            ps.setString(4, p.getGender());
            ps.setString(5, p.getReferral());
            ps.setString(6, p.getReferred_fro());
            ps.setString(7, p.getTested());
            ps.setString(8, p.getSreening());
            ps.setString(9, p.getConf_test());
            ps.setString(10, p.getResults());
            ps.setString(11, p.getElisa());
            ps.setString(12, p.getPost_test());
            ps.setString(13, p.getOngoing_test());
            ps.setString(14, p.getReferrals_to());
            ps.setString(15, p.getNotes());
            ps.setString(16, p.getDate());
            ps.setString(17, p.getAge());
            ps.setString(18, p.getNumber());

            int status = ps.executeUpdate();
            if (status > 0)
            {
                isUpdated = true;
            } else
            {
                isUpdated = false;
            }

        } finally
        {

            closeDBResource(null, ps, conn);
        }
        return isUpdated;
    }
//loging the system 
    public User login(String user, String password) throws SQLException, ClassNotFoundException
    {
        User u = null;

        boolean state = false;
        String sql = "SELECT username, fname, sname, category, uniquenumber FROM user WHERE username=? And password=?";

        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try
        {
            if (user != null && password != null)
            {
                conn = this.getConnection();
                ps = conn.prepareStatement(sql);
                ps.setString(1, user);
                ps.setString(2, password);
                rs = ps.executeQuery();
                if (rs.next())
                {
                    u = new User();

                    u.setUserName(rs.getString(1));
                    u.setFirstName(rs.getString(2));
                    u.setLastName(rs.getString(3));
                    u.setCategory(rs.getString(4));
                    u.setNumber(rs.getInt(5));

                }

            }
            return u;
        } catch (SQLException ex)
        {
            return null;
        }

    }
//listing nurses
    public ArrayList<Nurse> listAllNurses() throws Exception
    {
        ArrayList<Nurse> list = new ArrayList<Nurse>();

        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        String sql = "SELECT fname,sname, gender, age, id, address, cell, email, username, password, uniquenumber FROM user WHERE category= 'Nurse'";
        try
        {
            conn = getConnection();
            ps = conn.prepareCall(sql);
            rs = ps.executeQuery();
            while (rs.next())
            {
                Nurse u = new Nurse();
                u.setFirstName(rs.getString(1));
                u.setLastName(rs.getString(2));
                u.setGender(rs.getString(3));
                u.setAge(rs.getInt(4));
                u.setIdNumber(rs.getString(5));
                u.setAddress(rs.getString(6));
                u.setCellNumber(rs.getInt(7));
                u.setEmailAddress(rs.getString(8));
                u.setUserName(rs.getString(9));
                u.setPassword(rs.getString(10));
                u.setStaffNo(rs.getInt(11));
                list.add(u);
            }
        } finally
        {
            closeDBResource(rs, ps, conn);

        }
        return list;
    }
//listing patient
    public ArrayList<User> listAllPatients() throws Exception
    {
        ArrayList<User> list = new ArrayList<User>();

        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        String sql = "SELECT fname,sname, gender, age, id, address, cell, email, username, password, uniquenumber FROM user WHERE category= 'Patient'";
        try
        {
            conn = getConnection();
            ps = conn.prepareCall(sql);
            rs = ps.executeQuery();
            while (rs.next())
            {
                User u = new User();
                u.setFirstName(rs.getString(1));
                u.setLastName(rs.getString(2));
                u.setGender(rs.getString(3));
                u.setAge(rs.getInt(4));
                u.setIdNumber(rs.getString(5));
                u.setAddress(rs.getString(6));
                u.setCellNumber(rs.getInt(7));
                u.setEmailAddress(rs.getString(8));
                u.setUserName(rs.getString(9));
                u.setPassword(rs.getString(10));
                u.setNumber(rs.getInt(11));
                list.add(u);
            }
        } finally
        {
            closeDBResource(rs, ps, conn);

        }
        return list;
    }
//searching for users by unique number
    public Nurse searchByNumber(String id) throws Exception
    {
        if (id == null || id.length() == 0)
        {
            throw new IllegalArgumentException("Number cannot be blank or null");
        }
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT fname,sname, gender, age, id, address, cell, email, username, password, uniquenumber  from user WHERE uniquenumber=?";
        Nurse u = new Nurse();
        try
        {
            conn = getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, id);
            rs = ps.executeQuery();
            if (rs.next())
            {
                u.setFirstName(rs.getString(1));
                u.setLastName(rs.getString(2));
                u.setGender(rs.getString(3));
                u.setAge(rs.getInt(4));
                u.setIdNumber(rs.getString(5));
                u.setAddress(rs.getString(6));
                u.setCellNumber(rs.getInt(7));
                u.setEmailAddress(rs.getString(8));
                u.setUserName(rs.getString(9));
                u.setPassword(rs.getString(10));
                u.setStaffNo(rs.getInt(11));
            }
        } finally
        {
            closeDBResource(rs, ps, conn);
        }
        return u;
    }
//searching for data by unique number
    public User searchDataByNumber(String id) throws Exception
    {
        if (id == null || id.length() == 0)
        {
            throw new IllegalArgumentException("Patient Number cannot be blank or null");
        }
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT fname,sname, gender, age, id, address, cell, email, username, password, uniquenumber  from user WHERE uniquenumber=?";
        User u = new User();
        try
        {
            conn = getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, id);
            rs = ps.executeQuery();
            if (rs.next())
            {
                u.setFirstName(rs.getString(1));
                u.setLastName(rs.getString(2));
                u.setGender(rs.getString(3));
                u.setAge(rs.getInt(4));
                u.setIdNumber(rs.getString(5));
                u.setAddress(rs.getString(6));
                u.setCellNumber(rs.getInt(7));
                u.setEmailAddress(rs.getString(8));
                u.setUserName(rs.getString(9));
                u.setPassword(rs.getString(10));
                u.setNumber(rs.getInt(11));
            }
        } finally
        {
            closeDBResource(rs, ps, conn);
        }
        return u;
    }
//searching by number
    public TestRegister searchByNo(String id) throws Exception
    {
        if (id == null || id.length() == 0)
        {
            throw new IllegalArgumentException("Patient number cannot be blank or null");
        }
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        TestRegister p = new TestRegister();
        String sql = "SELECT uniquenumber,firstname_surname, clinic_nurse, first_ever_test, gender, referral, referred_from,"
                + "tested,sreening, confirmatory_test, results, elisa, post_test_counselled,on_going_couselling,refferrals_to, counselling_notes,date, age FROM patient WHERE uniquenumber=?";
        try
        {
            conn = getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, id);
            rs = ps.executeQuery();
            while (rs.next())
            {

                p.setNumber(rs.getString(1));
                p.setFirstname_sname(rs.getString(2));
                p.setClinic_nr(rs.getString(3));
                p.setFirst_test(rs.getString(4));
                p.setGender(rs.getString(5));
                p.setReferral(rs.getString(6));
                p.setReferred_fro(rs.getString(7));
                p.setTested(rs.getString(8));
                p.setSreening(rs.getString(9));
                p.setConf_test(rs.getString(10));
                p.setResults(rs.getString(11));
                p.setElisa(rs.getString(12));
                p.setPost_test(rs.getString(13));
                p.setOngoing_test(rs.getString(14));
                p.setReferrals_to(rs.getString(15));
                p.setNotes(rs.getString(16));
                p.setDate(rs.getString(17));
                p.setAge(rs.getString(18));

            }
        } finally
        {
            closeDBResource(rs, ps, conn);

        }
        return p;
    }
//searching by patient number
    public TestRegister searchByPatientNo(String id) throws Exception
    {
        if (id == null || id.length() == 0)
        {
            throw new IllegalArgumentException("Nurse number cannot be blank or null");
        }

        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        TestRegister p = new TestRegister();
        String sql = "SELECT uniquenumber,firstname_surname, clinic_nurse, first_ever_test, gender, referral, referred_from,tested,sreening, confirmatory_test, results, elisa, post_test_counselled,on_going_couselling,refferrals_to, counselling_notes,date, age FROM patient WHERE uniquenumber=?";
        try
        {
            conn = getConnection();
            ps = conn.prepareCall(sql);
            ps.setString(1, id);
            rs = ps.executeQuery();
            if (rs.next())
            {

                p.setNumber(rs.getString(1));
                p.setFirstname_sname(rs.getString(2));
                p.setClinic_nr(rs.getString(3));
                p.setFirst_test(rs.getString(4));
                p.setGender(rs.getString(5));
                p.setReferral(rs.getString(6));
                p.setReferred_fro(rs.getString(7));
                p.setTested(rs.getString(8));
                p.setSreening(rs.getString(9));
                p.setConf_test(rs.getString(10));
                p.setResults(rs.getString(11));
                p.setElisa(rs.getString(12));
                p.setPost_test(rs.getString(13));
                p.setOngoing_test(rs.getString(14));
                p.setReferrals_to(rs.getString(15));
                p.setNotes(rs.getString(16));
                p.setDate(rs.getString(17));
                p.setAge(rs.getString(18));

            }
        } finally
        {
            closeDBResource(rs, ps, conn);

        }
        return p;
    }
//searching for patients details
    public User getPateint(String u, String p) throws Exception
    {
        User use = null;
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs;

        String sql = "select fname, sname, gender, age, id, address, cell, email, username ,password, category from user WHERE username=? and password=?";
        try
        {
            conn = this.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, u);
            ps.setString(1, p);
            rs = ps.executeQuery();
            if (rs.next())
            {
                use = new User();
                use.setFirstName(rs.getString(1));
                use.setLastName(rs.getString(2));
                use.setGender(rs.getString(3));
                use.setAge(rs.getInt(4));
                use.setIdNumber(rs.getString(5));
                use.setAddress(rs.getString(6));
                use.setCellNumber(rs.getInt(7));
                use.setEmailAddress(rs.getString(8));
                use.setUserName(rs.getString(9));
                use.setPassword(rs.getString(10));
                use.setCategory(rs.getString(11));
            }
        } finally
        {

            closeDBResource(null, ps, conn);
        }
        return use;
    }
//get patient details
    public User getpateint(String p) throws Exception
    {
        User use = null;
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs;

        String sql = "select fname, sname, gender, age, id, address, cell, email, username ,password, category,uniquenumber from user WHERE uniquenumber=?";
        try
        {
            conn = this.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, p);
            rs = ps.executeQuery();
            if (rs.next())
            {
                use = new User();
                use.setFirstName(rs.getString(1));
                use.setLastName(rs.getString(2));
                use.setGender(rs.getString(3));
                use.setAge(rs.getInt(4));
                use.setIdNumber(rs.getString(5));
                use.setAddress(rs.getString(6));
                use.setCellNumber(rs.getInt(7));
                use.setEmailAddress(rs.getString(8));
                use.setUserName(rs.getString(9));
                use.setPassword(rs.getString(10));
                use.setCategory(rs.getString(11));
                use.setNumber(rs.getInt(12));
            }
        } finally
        {

            closeDBResource(null, ps, conn);
        }
        return use;
    }
//list of users 
    public ArrayList<User> searchUser(String searchTerm) throws SQLException
    {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rst = null;
//to hold a list of staff from the db
        ArrayList<User> list = new ArrayList<User>();
//sql for searching the staff table
        String sql = "SELECT uniquenumber, fname ,sname , gender, age, id, address, cell, email, username, password,  category  from user WHERE uniquenumber LIKE ? OR fname LIKE ? OR sname LIKE ? OR gender LIKE ? OR age LIKE ? OR id LIKE ? OR address LIKE ? OR cell LIKE ? OR email LIKE ? OR username LIKE ? OR password LIKE ? OR category LIKE ?";

        try
        {
            conn = getConnection(); //connect to the database
            ps = conn.prepareCall(sql);
            //set the values
            ps.setString(1, "%" + searchTerm + "%");
            ps.setString(2, "%" + searchTerm + "%");
            ps.setString(3, "%" + searchTerm + "%");
            ps.setString(4, "%" + searchTerm + "%");
            ps.setString(5, "%" + searchTerm + "%");
            ps.setString(6, "%" + searchTerm + "%");
            ps.setString(7, "%" + searchTerm + "%");
            ps.setString(8, "%" + searchTerm + "%");
            ps.setString(9, "%" + searchTerm + "%");
            ps.setString(10, "%" + searchTerm + "%");
            ps.setString(11, "%" + searchTerm + "%");
            ps.setString(12, "%" + searchTerm + "%");
            //execute the sql
            rst = ps.executeQuery();
            //check if results are there
            while (rst.next())
            {
                User n = new User();
                n.setNumber(rst.getInt(1));
                n.setFirstName(rst.getString(2));
                n.setLastName(rst.getString(3));
                n.setGender(rst.getString(4));
                n.setAge(rst.getInt(5));
                n.setIdNumber(rst.getString(6));
                n.setAddress(rst.getString(7));
                n.setCellNumber(rst.getInt(8));
                n.setEmailAddress(rst.getString(9));
                n.setUserName(rst.getString(10));
                n.setPassword(rst.getString(11));
                n.setCategory(rst.getString(12));
                //add to the list
                list.add(n);
            }
//close db resources
            closeDBResource(rst, ps, conn);
        } finally
        {
            closeDBResource(rst, ps, conn); //close resources
        }
        return list; //return a list of staff
    } //end method
//searching Data
    public ArrayList<TestRegister> searchData(String searchTerm) throws SQLException
    {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
//to hold a list of staff from the db
        ArrayList<TestRegister> list = new ArrayList<TestRegister>();
//sql for searching the staff table

        String sql = "SELECT uniquenumber, firstname_surname, clinic_nurse, first_ever_test, gender, referral, referred_from,tested,sreening, confirmatory_test, results, elisa, post_test_counselled,on_going_couselling,refferrals_to, counselling_notes,date, age FROM patient WHERE uniquenumber LIKE ? OR firstname_surname LIKE ?";
        try
        {
            conn = getConnection(); //connect to the database
            ps = conn.prepareCall(sql);
            //set the values
            ps.setString(1, "%" + searchTerm + "%");
            ps.setString(2, "%" + searchTerm + "%");

            //execute the sql
            rs = ps.executeQuery();
            //check if results are there
            while (rs.next())
            {
                TestRegister p = new TestRegister();
                p.setNumber(rs.getString(1));
                p.setFirstname_sname(rs.getString(2));
                p.setClinic_nr(rs.getString(3));
                p.setFirst_test(rs.getString(4));
                p.setGender(rs.getString(5));
                p.setReferral(rs.getString(6));
                p.setReferred_fro(rs.getString(7));
                p.setTested(rs.getString(8));
                p.setSreening(rs.getString(9));
                p.setConf_test(rs.getString(10));
                p.setResults(rs.getString(11));
                p.setElisa(rs.getString(12));
                p.setPost_test(rs.getString(13));
                p.setOngoing_test(rs.getString(14));
                p.setReferrals_to(rs.getString(15));
                p.setNotes(rs.getString(16));
                p.setDate(rs.getString(17));
                p.setAge(rs.getString(18));
                list.add(p);
            }
//close db resources
            closeDBResource(rs, ps, conn);
        } finally
        {
            closeDBResource(rs, ps, conn); //close resources
        }
        return list; //return a list of staff
    } //end method

}