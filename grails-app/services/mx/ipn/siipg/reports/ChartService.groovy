package mx.ipn.siipg.reports

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart
import org.jfree.chart.encoders.EncoderUtil
import org.jfree.chart.encoders.ImageFormat;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset
import sun.misc.BASE64Encoder;

class ChartService {

    final int IMAGE_WIDTH = 500
    final int IMAGE_HEIGHT = 300

    BASE64Encoder base64Enconder = new BASE64Encoder()

    String generateBase64ImageURI(JFreeChart chart) {
        byte[] buf = EncoderUtil.encode(
                chart.createBufferedImage(IMAGE_WIDTH, IMAGE_HEIGHT),
                ImageFormat.PNG);
        String encodedImage = "data:image/png;base64," + base64Enconder.encode(buf);
        return encodedImage;
    }

    JFreeChart generateDummyChart() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(212, "Ejemplo", "1");
        dataset.addValue(504, "Ejemplo", "2");
        dataset.addValue(1520, "Ejemplo", "3");
        dataset.addValue(1842, "Ejemplo", "4");
        dataset.addValue(2991, "Ejemplo", "5");
        JFreeChart barChart = ChartFactory.createBarChart(
                "Título",
                "Categoria", "Puntaje",
                dataset, PlotOrientation.VERTICAL,
                true, true, false);
        return barChart
    }

    JFreeChart genereteBarChart() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(212, "Classes", "JDK 1.0");
        dataset.addValue(504, "Classes", "JDK 1.1");
        dataset.addValue(1520, "Classes", "SDK 1.2");
        dataset.addValue(1842, "Classes", "SDK 1.3");
        dataset.addValue(2991, "Classes", "SDK 1.4");
        JFreeChart barChart = ChartFactory.createBarChart(
                "CAR USAGE STATIStICS",
                "Category", "Score",
                dataset, PlotOrientation.VERTICAL,
                true, true, false);
        return barChart
    }
}
