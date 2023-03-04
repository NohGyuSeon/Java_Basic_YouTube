using System;

public class WhatdayIf {
    static int[] daysInMonth  = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    static string[] monthNames = {"January", "Feburary", "March", "April", "May", "June", "July", "August", "Sepetember", "October", "November", "December"};
    
    public static void Main(string[] args) {
        Console.Write("Enter a day number beteen 1 and 365: ");
        string? line = Console.ReadLine();
        int dayNum = 0;
        if (line != null) {
            dayNum = Int32.Parse(line);
        }

        int monthNum = 0; 

        if (dayNum <= 31) {     // January
            goto End;
        } 
        else {
            monthNum++;
            dayNum -= 31;
        }

        if (dayNum <= 28) {     // Feburary
            goto End;
        } 
        else {
            monthNum++;
            dayNum -= 28;
        }

        if (dayNum <= 31) {     // March
            goto End;
        } 
        else {
            monthNum++;
            dayNum -= 31;
        }

        if (dayNum <= 30) {     // April
            goto End;
        } 
        else {
            monthNum++;
            dayNum -= 30;
        }

        if (dayNum <= 31) {     // May
            goto End;
        } 
        else {
            monthNum++;
            dayNum -= 31;
        }

        if (dayNum <= 30) {     // June
            goto End;
        } 
        else {
            monthNum++;
            dayNum -= 30;
        }

        if (dayNum <= 31) {     // July
            goto End;
        } 
        else {
            monthNum++;
            dayNum -= 31;
        }

        if (dayNum <= 31) {     // August
            goto End;
        } 
        else {
            monthNum++;
            dayNum -= 31;
        }

        if (dayNum <= 30) {     // September
            goto End;
        } 
        else {
            monthNum++;
            dayNum -= 30;
        }

        if (dayNum >= 31) {     // October
            goto End;
        } 
        else {
            monthNum++;
            dayNum -= 31;
        }

        if (dayNum <= 30) {     // November
            goto End;
        } 
        else {
            monthNum++;
            dayNum -= 30;
        }

        if (dayNum <= 31) {     // December
            goto End;
        } 
        else {
            monthNum++;
            dayNum -= 31;
        }

        End:
        string monthName = monthNames[monthNum];

        Console.WriteLine("{0}, {1}", monthName, dayNum);
    }
}