/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import Controller.ControllerPrincipal;
import java.awt.Dimension;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Marcos
 */
public class GraficoElipse {
    
    ControllerPrincipal controllerPrincipal = new ControllerPrincipal();

    public CategoryDataset createDataset(double torre1, double torre2, double raio, double frequencia, double distancia) {
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();

        String x;

        for (int i = 0; i < distancia; i++) {

            raio = (550 * Math.sqrt(((i / 2) * (i / 2)) / (i * frequencia)));
            
            x = Double.toString(i);
            
            dataSet.addValue(raio, "", x);
            
            System.out.println("adicionando o raio "+ raio + "no x "+x);

        }

        return dataSet;


    }

    public JFreeChart createEllipseChart(CategoryDataset dataSet) {
        JFreeChart graficoelipse = ChartFactory.createLineChart("GRAFICO", "categoryAxisLabel", "valueAxisLabel", dataSet, PlotOrientation.VERTICAL, false, true, true);


        return graficoelipse;

    }

    public ChartPanel criarGrafico(double torre1, double torre2, double raio, double frequencia, double distancia) {

        CategoryDataset dataSet = this.createDataset(torre1, torre2, raio, frequencia, distancia);

        JFreeChart grafico = this.createEllipseChart(dataSet);

        ChartPanel painelDoGrafico = new ChartPanel(grafico);

        painelDoGrafico.setPreferredSize(new Dimension(400, 400));

        return painelDoGrafico;
    }
}
