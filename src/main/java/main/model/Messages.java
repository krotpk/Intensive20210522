package main.model;

import javax.persistence.*;
import java.util.Date;

public class Messages {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int     id;
    private int     user_id;
    private Date    msg_time ;
    private String  message;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public Date getMsg_time() {
        return msg_time;
    }

    public void setMsg_time(Date msg_time) {
        this.msg_time = msg_time;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
