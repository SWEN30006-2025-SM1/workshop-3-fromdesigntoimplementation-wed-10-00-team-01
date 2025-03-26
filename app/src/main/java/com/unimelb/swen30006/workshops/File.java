package com.unimelb.swen30006.workshops;

// Sample private file class to be replaced by your implementaiton
class File {
    String fileData = "hhiuagblgw";
    String fileName = "ass 1";

    public String fileType(){
        double num = Math.random();
        if(num<0.5){
            return "pdf";
        } else {
            return "docx";
        }
    }

    public int fileSize(){
        return 400;
    }

    public String content(){
        return "smd assignment content xxx";
    }
}