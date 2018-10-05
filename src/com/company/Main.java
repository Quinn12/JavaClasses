package com.company;
import  com.company.utilities.Information;

public class Main
{

    public static void main(String[] args)
    {
        String EmpName[] = {"Frank West", "Jumping George", "Billy Bob"};
        int EmpNum[] ={112313, 124988, 895234} ;
        int Shift[] ={1, 2, 3};
        Information.main(EmpName[0], EmpNum[0], Shift[0]);
        Information.main(EmpName[1], EmpNum[1], Shift[1]);
        Information.main(EmpName[2], EmpNum[2], Shift[2]);

    }
}
