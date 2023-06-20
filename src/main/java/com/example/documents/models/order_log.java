package com.example.documents.models;

import java.time.LocalDate;

public class order_log {
    private LocalDate dop;
    private LocalDate dor;
    private String Full_name;
    private String job_title;
    private String type;
    private Integer serial_numb;
    public order_log (LocalDate dop,
                      LocalDate dor,
                      String Full_name,
                      String job_title,
                      String type,
                      Integer serial_numb)
    {
        this.dop = dop;
        this.dor = dor;
        this.Full_name = Full_name;
        this.job_title = job_title;
        this.type = type;
        this.serial_numb = serial_numb;
    }

    public LocalDate getDop() {
        return dop;
    }

    public void setDop(LocalDate dop) {
        this.dop = dop;
    }

    public LocalDate getDor() {
        return dor;
    }

    public void setDor(LocalDate dor) {
        this.dor = dor;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getSerial_numb() {
        return serial_numb;
    }

    public void setSerial_numb(Integer serial_numb) {
        this.serial_numb = serial_numb;
    }
}
