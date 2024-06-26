package dip1.model.util;

import dip1.model.PrintOut;
import dip1.model.ReportItem;

import java.util.List;

public class ReportConsole extends PrintOut {
    @Override
    public void output(List<ReportItem> items) {
        System.out.println("Output to CONSOLE");
        for (ReportItem item : items) {
            System.out.format("CONSOLE %s - %f \n\r", item.getDescription(), item.getAmount());
        }
    }
}
