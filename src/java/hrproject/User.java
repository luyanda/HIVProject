/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hrproject;

/**
 *
 * @author Group 3
 */
public class User
{

    private String firstName;
    private String lastName;
    private String gender;
    private int age;
    private String idNumber;
    private String address;
    private int cellNumber;
    private String emailAddress;
    private String userName;
    private String password;
    private String category;
    private int number;

    public User()
    {
    }

    public User(String userName, String password)
    {
        this.userName = userName;
        this.password = password;
    }

    public User(String firstName, String lastName, String gender, int age, String idNumber, String address, int cellNumber, String emailAddress, String userName, String password)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.idNumber = idNumber;
        this.address = address;
        this.cellNumber = cellNumber;
        this.emailAddress = emailAddress;
        this.userName = userName;
        this.password = password;
    }

    public User(String firstName, String lastName, String gender, int age, String idNumber, String address, int cellNumber, String emailAddress, String userName, String password, int number)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.idNumber = idNumber;
        this.address = address;
        this.cellNumber = cellNumber;
        this.emailAddress = emailAddress;
        this.userName = userName;
        this.password = password;
        this.number = number;
    }

    public User(String firstName, String lastName, String gender, int age, String idNumber, String address, int cellNumber, String emailAddress, String userName, String password, String category, int number)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.idNumber = idNumber;
        this.address = address;
        this.cellNumber = cellNumber;
        this.emailAddress = emailAddress;
        this.userName = userName;
        this.password = password;
        this.category = category;
        this.number = number;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getGender()
    {
        return gender;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getIdNumber()
    {
        return idNumber;
    }

    public void setIdNumber(String idNumber)
    {
        this.idNumber = idNumber;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public int getCellNumber()
    {
        return cellNumber;
    }

    public void setCellNumber(int cellNumber)
    {
        this.cellNumber = cellNumber;
    }

    public String getEmailAddress()
    {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress)
    {
        this.emailAddress = emailAddress;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getCategory()
    {
        return category;
    }

    public void setCategory(String category)
    {
        this.category = category;
    }

    public int getNumber()
    {
        return number;
    }

    public void setNumber(int number)
    {
        this.number = number;
    }

}
