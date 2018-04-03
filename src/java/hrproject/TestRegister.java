/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hrproject;

import java.sql.Date;

/**
 *
 * @author Group 3
 */
public class TestRegister
{

    private String firstname_sname;
    private String date;
    private String clinic_nr;
    private String age;
    private String first_test;
    private String gender;
    private String referral;
    private String referred_fro;
    private String tested;
    private String sreening;
    private String conf_test;
    private String results;
    private String post_test;
    private String ongoing_test;
    private String referrals_to;
    private String notes;
    private String elisa;
    private String number;

    public TestRegister()
    {
    }

    public TestRegister(String firstname_sname, String date, String clinic_nr, String age, String first_test, String gender, String referral, String referred_fro, String tested, String sreening, String conf_test, String results, String post_test, String ongoing_test, String referrals_to, String notes, String elisa, String number)
    {
        this.firstname_sname = firstname_sname;
        this.date = date;
        this.clinic_nr = clinic_nr;
        this.age = age;
        this.first_test = first_test;
        this.gender = gender;
        this.referral = referral;
        this.referred_fro = referred_fro;
        this.tested = tested;
        this.sreening = sreening;
        this.conf_test = conf_test;
        this.results = results;
        this.post_test = post_test;
        this.ongoing_test = ongoing_test;
        this.referrals_to = referrals_to;
        this.notes = notes;
        this.elisa = elisa;
        this.number = number;
    }

    public String getFirstname_sname()
    {
        return firstname_sname;
    }

    public void setFirstname_sname(String firstname_sname)
    {
        this.firstname_sname = firstname_sname;
    }

    public String getDate()
    {
        return date;
    }

    public void setDate(String date)
    {
        this.date = date;
    }

    public String getClinic_nr()
    {
        return clinic_nr;
    }

    public void setClinic_nr(String clinic_nr)
    {
        this.clinic_nr = clinic_nr;
    }

    public String getAge()
    {
        return age;
    }

    public void setAge(String age)
    {
        this.age = age;
    }

    public String getFirst_test()
    {
        return first_test;
    }

    public void setFirst_test(String first_test)
    {
        this.first_test = first_test;
    }

    public String getGender()
    {
        return gender;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public String getReferral()
    {
        return referral;
    }

    public void setReferral(String referral)
    {
        this.referral = referral;
    }

    public String getReferred_fro()
    {
        return referred_fro;
    }

    public void setReferred_fro(String referred_fro)
    {
        this.referred_fro = referred_fro;
    }

    public String getTested()
    {
        return tested;
    }

    public void setTested(String tested)
    {
        this.tested = tested;
    }

    public String getSreening()
    {
        return sreening;
    }

    public void setSreening(String sreening)
    {
        this.sreening = sreening;
    }

    public String getConf_test()
    {
        return conf_test;
    }

    public void setConf_test(String conf_test)
    {
        this.conf_test = conf_test;
    }

    public String getResults()
    {
        return results;
    }

    public void setResults(String results)
    {
        this.results = results;
    }

    public String getPost_test()
    {
        return post_test;
    }

    public void setPost_test(String post_test)
    {
        this.post_test = post_test;
    }

    public String getOngoing_test()
    {
        return ongoing_test;
    }

    public void setOngoing_test(String ongoing_test)
    {
        this.ongoing_test = ongoing_test;
    }

    public String getReferrals_to()
    {
        return referrals_to;
    }

    public void setReferrals_to(String referrals_to)
    {
        this.referrals_to = referrals_to;
    }

    public String getNotes()
    {
        return notes;
    }

    public void setNotes(String notes)
    {
        this.notes = notes;
    }

    public String getElisa()
    {
        return elisa;
    }

    public void setElisa(String elisa)
    {
        this.elisa = elisa;
    }

    public String getNumber()
    {
        return number;
    }

    public void setNumber(String number)
    {
        this.number = number;
    }

}
