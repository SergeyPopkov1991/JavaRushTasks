package com.javarush.task.task18.task1815;

import java.util.List;

/* 
Таблица
*/

public class Solution {
    public class TableInterfaceWrapper implements TableInterface {

        public TableInterfaceWrapper (TableInterface tableInterface) {

        }
        @Override
        public void setModel(List rows) {
            System.out.println(rows);
        }

        @Override
        public String getHeaderText() {
            return ;
        }
    }

    public interface TableInterface {
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) {
    }
}