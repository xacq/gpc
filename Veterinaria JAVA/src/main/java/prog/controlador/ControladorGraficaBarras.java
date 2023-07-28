/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.controlador;

import java.awt.Color;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.BarRenderer;

public class ControladorGraficaBarras extends JPanel {

    private final double[] ingresos; // Aquí guarda los datos de ingresos en las 7 variables
    private Color[] colors = {Color.CYAN, Color.GREEN, Color.RED, Color.ORANGE, Color.MAGENTA, Color.CYAN, Color.YELLOW};

    public ControladorGraficaBarras(double[] ingresos) {
        this.ingresos = ingresos;
        JFreeChart barChart = createBarChart();
        ChartPanel chartPanel = new ChartPanel(barChart);
        add(chartPanel);
    }

    private CategoryDataset createDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        String[] labels = {"General", "Doctor", "Cliente", "Mascota", "Consulta", "Cursos", "MenuRemedio"};


        for (int i = 0; i < ingresos.length; i++) {
            dataset.addValue(ingresos[i], "Ingresos", labels[i]);
        }

        return dataset;
    }

    private JFreeChart createBarChart() {
        CategoryDataset dataset = createDataset();

        JFreeChart barChart = ChartFactory.createBarChart(
                "Gráfico de Ingresos", // Título del gráfico
                "Menus", // Etiqueta del eje X
                "Cantidad de Ingresos", // Etiqueta del eje Y
                dataset, // Datos para el gráfico
                PlotOrientation.VERTICAL, // Orientación del gráfico
                true, // Mostrar leyendas
                true, // Usar tooltips
                false // Usar URLs
        );

        CategoryPlot plot = barChart.getCategoryPlot();
        BarRenderer renderer = (BarRenderer) plot.getRenderer();
        
        for (int i = 0; i < ingresos.length; i++) {
            renderer.setSeriesPaint(i, colors[i]); // Establecer colores personalizados para las barras
        }   

        plot.setRenderer(renderer);
        return barChart;
    }

    // Puedes agregar aquí más métodos y personalización de la gráfica si lo deseas.
}
