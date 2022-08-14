package com.example.login;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyApplication {
    private static List<ApplicationForm> applicationFormList = new ArrayList<ApplicationForm>();
    private static int nextId = 4;
    public MyApplication(){
        fillCardFormList();
    }

    private void fillCardFormList() {
        ApplicationForm c0 = new ApplicationForm(0, "Saimoon", "19011519-150", "6th", "CS", "Morning", 2672022, "03123456789", "i cannot come because of fever.");
        ApplicationForm c1 = new ApplicationForm(1, "Saimoon", "19011519-150", "6th", "CS", "Morning", 2672022, "03123456789", "i cannot come because of fever.");
        ApplicationForm c2 = new ApplicationForm(2, "Saimoon", "19011519-150", "6th", "CS", "Morning", 2672022, "03123456789", "i cannot come because of fever.");
        ApplicationForm c3 = new ApplicationForm(3, "Saimoon", "19011519-150", "6th", "CS", "Morning", 2672022, "03123456789", "i cannot come because of fever.");
        applicationFormList.addAll(Arrays.asList(new ApplicationForm[] {c0, c1, c2, c3}));
    }

    public static List<ApplicationForm> getCardFormList() {
        return applicationFormList;
    }

    public static void setCardFormList(List<ApplicationForm> applicationFormList) {
        MyApplication.applicationFormList = applicationFormList;
    }

    public static int getNextId() {
        return nextId;
    }

}
