/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Marcos
 */
public class GraficoElipse {

    public CategoryDataset createDataset(double torre1, double torre2, double raio) {
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();

        dataSet.addValue(raio, "", "");

        return dataSet;

    }

//    public JFreeChart createEllipseChart(CategoryDataset dataSet) {
//        JFreeChart graficoelipse = ChartFactory.create
//
//    }
//
//    public ChartPanel criarGrafico() {
//
//    }
}
