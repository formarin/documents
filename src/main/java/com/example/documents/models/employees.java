package com.example.documents.models;

public class employees {
    private String Full_name;
    private String job_title;
    private String password;
    public employees (String Full_name,
                      String job_title,
                      String password)
    {
        this.Full_name = Full_name;
        this.job_title = job_title;
        this.password = password;
    }

    public String getFull_name() {
        return Full_name;
    }

    public void setFull_name(String full_name) {
        Full_name = full_name;
    }

    public String getJob_title() {
        return job_title;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
