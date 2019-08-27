package com.example.kotlinproject.model;

import android.util.Patterns;

public class LoginModel
{
    private String phoneNumber;

    private String password;

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword()
    {
        if (password == null)
        {
            return "";
        }
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public boolean isPasswordLengthGreaterThan5()
    {
        return getPassword().length() > 5;
    }
}
