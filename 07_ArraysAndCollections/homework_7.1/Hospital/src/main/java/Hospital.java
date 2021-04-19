import java.text.DecimalFormat;

public class Hospital {

    public static float[] generatePatientsTemperatures(int patientsCount) {



        //TODO: напишите метод генерации массива температур пациентов

        float[] f = new float[patientsCount];

        for (int i = 0;i<patientsCount;i++){
            f[i] = (float) (32 + Math.random() * (40 - 32));
        }

        return f;
    }

    public static String getReport(float[] temperatureData) {
        /*
        TODO: Напишите код, который выводит среднюю температуру по больнице,количество здоровых пациентов,
            а также температуры всех пациентов.
        */
        DecimalFormat df = new DecimalFormat("###.##");
        float sum = 0;
        int healthy = 1;

        for (int i=0; i<temperatureData.length; i++){

            if(temperatureData[i]>=36.2&&temperatureData[i]<=36.9){
                healthy=healthy+1;
            }

            sum = sum+temperatureData[i];

        }

        String string = "";

        for (int i=0; i<temperatureData.length; i++){

            string = string+temperatureData[i]+" ";


        }

        string = string.trim();



        float avg = sum/temperatureData.length;


        String report =
                "Температуры пациентов: " + string +
                        "\nСредняя температура: " + df.format(avg) +
                        "\nКоличество здоровых: " + (healthy);

        return report;
    }
}
