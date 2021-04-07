package lesson6;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        final String TOKEN = "33b139af-127a-4ce2-b64b-ccefc500bd7f";
        OkHttpClient okHttpClient = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://api.weather.yandex.ru/v2/forecast?lat=59.57&lon=30.19&limit=5&hours=false")
                .addHeader("X-Yandex-API-Key", TOKEN)
                .build();
        Response response = okHttpClient.newCall(request).execute();
        String body = response.body().string();
        System.out.println(body);
    }
}
