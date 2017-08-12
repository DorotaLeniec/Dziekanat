package main.java.aplikacja_webowa;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by RENT on 2017-08-12.
 */
public class DataBase {
    private static DataBase instance = new DataBase();
    private DataBase(){}

    public static DataBase getInstance(){
        return instance;
    }

    public void saveRequest(DB_TYPE type, Object obj){
        saveRequest(type.getFileName(),obj);

    }
    public void saveRequest(DB_TYPE type,Request request){
      saveRequest(type.getFileName(),request);
    }

    public void saveRequest(String dbName,Object obj){
        try {
            FileOutputStream fos = new FileOutputStream(dbName);
            PrintWriter writer = new PrintWriter(fos,true) ;
            writer.println(obj);
        } catch (FileNotFoundException fnfe){

        }
    }






}
