package coatapp.coat;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JsonHelper {

    public static JSONObject Parse(String jsonString) throws JSONException {

        jsonString = "{\"latitude\":53.4054054054054,\"longitude\":-2.236576822735733,\"timezone\":\"Europe/London\",\"currently\":{\"time\":1505164682,\"summary\":\"Drizzle\",\"icon\":\"rain\",\"nearestStormDistance\":0,\"precipIntensity\":0.013,\"precipIntensityError\":0.008,\"precipProbability\":0.37,\"precipType\":\"rain\",\"temperature\":54.21,\"apparentTemperature\":54.21,\"dewPoint\":49.76,\"humidity\":0.85,\"pressure\":997.61,\"windSpeed\":10.48,\"windGust\":23.37,\"windBearing\":288,\"cloudCover\":0,\"uvIndex\":0,\"visibility\":10,\"ozone\":324.46},\"hourly\":{\"summary\":\"Light rain until tomorrow morning, starting again tomorrow evening.\",\"icon\":\"rain\",\"data\":[{\"time\":1505163600,\"summary\":\"Drizzle\",\"icon\":\"rain\",\"precipIntensity\":0.0085,\"precipProbability\":0.13,\"precipType\":\"rain\",\"temperature\":54.21,\"apparentTemperature\":54.21,\"dewPoint\":49.89,\"humidity\":0.85,\"pressure\":997.41,\"windSpeed\":10.24,\"windGust\":23,\"windBearing\":288,\"cloudCover\":0,\"uvIndex\":0,\"visibility\":10,\"ozone\":324.64},{\"time\":1505167200,\"summary\":\"Light Rain\",\"icon\":\"rain\",\"precipIntensity\":0.0109,\"precipProbability\":0.17,\"precipType\":\"rain\",\"temperature\":53.53,\"apparentTemperature\":53.53,\"dewPoint\":48.79,\"humidity\":0.84,\"pressure\":998.07,\"windSpeed\":11.01,\"windGust\":24.22,\"windBearing\":288,\"cloudCover\":0,\"uvIndex\":0,\"visibility\":10,\"ozone\":324.02},{\"time\":1505170800,\"summary\":\"Light Rain\",\"icon\":\"rain\",\"precipIntensity\":0.0131,\"precipProbability\":0.2,\"precipType\":\"rain\",\"temperature\":52.62,\"apparentTemperature\":52.62,\"dewPoint\":47.8,\"humidity\":0.84,\"pressure\":998.59,\"windSpeed\":12.09,\"windGust\":25.46,\"windBearing\":287,\"cloudCover\":0.08,\"uvIndex\":0,\"visibility\":10,\"ozone\":323.09},{\"time\":1505174400,\"summary\":\"Light Rain\",\"icon\":\"rain\",\"precipIntensity\":0.0138,\"precipProbability\":0.21,\"precipType\":\"rain\",\"temperature\":51.92,\"apparentTemperature\":51.92,\"dewPoint\":47.37,\"humidity\":0.84,\"pressure\":999.1,\"windSpeed\":12.68,\"windGust\":25.87,\"windBearing\":287,\"cloudCover\":0.16,\"uvIndex\":0,\"visibility\":10,\"ozone\":323.12},{\"time\":1505178000,\"summary\":\"Light Rain\",\"icon\":\"rain\",\"precipIntensity\":0.0128,\"precipProbability\":0.2,\"precipType\":\"rain\",\"temperature\":51.82,\"apparentTemperature\":51.82,\"dewPoint\":47.45,\"humidity\":0.85,\"pressure\":999.63,\"windSpeed\":12.87,\"windGust\":25.71,\"windBearing\":284,\"cloudCover\":0.3,\"uvIndex\":0,\"visibility\":10,\"ozone\":325.47},{\"time\":1505181600,\"summary\":\"Light Rain\",\"icon\":\"rain\",\"precipIntensity\":0.0108,\"precipProbability\":0.17,\"precipType\":\"rain\",\"temperature\":52.01,\"apparentTemperature\":52.01,\"dewPoint\":47.54,\"humidity\":0.85,\"pressure\":1000.14,\"windSpeed\":13.15,\"windGust\":25.6,\"windBearing\":284,\"cloudCover\":0.48,\"uvIndex\":0,\"visibility\":10,\"ozone\":328.87},{\"time\":1505185200,\"summary\":\"Drizzle\",\"icon\":\"rain\",\"precipIntensity\":0.0083,\"precipProbability\":0.14,\"precipType\":\"rain\",\"temperature\":52.2,\"apparentTemperature\":52.2,\"dewPoint\":47.49,\"humidity\":0.84,\"pressure\":1000.65,\"windSpeed\":13.1,\"windGust\":25.31,\"windBearing\":285,\"cloudCover\":0.6,\"uvIndex\":0,\"visibility\":10,\"ozone\":330.19},{\"time\":1505188800,\"summary\":\"Mostly Cloudy\",\"icon\":\"partly-cloudy-night\",\"precipIntensity\":0.0049,\"precipProbability\":0.09,\"precipType\":\"rain\",\"temperature\":51.81,\"apparentTemperature\":51.81,\"dewPoint\":47.19,\"humidity\":0.84,\"pressure\":1001.16,\"windSpeed\":11.76,\"windGust\":24.79,\"windBearing\":287,\"cloudCover\":0.6,\"uvIndex\":0,\"visibility\":10,\"ozone\":327.86},{\"time\":1505192400,\"summary\":\"Partly Cloudy\",\"icon\":\"partly-cloudy-night\",\"precipIntensity\":0.0024,\"precipProbability\":0.06,\"precipType\":\"rain\",\"temperature\":50.99,\"apparentTemperature\":50.99,\"dewPoint\":46.81,\"humidity\":0.86,\"pressure\":1001.68,\"windSpeed\":10.46,\"windGust\":24.09,\"windBearing\":253,\"cloudCover\":0.52,\"uvIndex\":0,\"visibility\":10,\"ozone\":323.5},{\"time\":1505196000,\"summary\":\"Partly Cloudy\",\"icon\":\"partly-cloudy-day\",\"precipIntensity\":0.002,\"precipProbability\":0.05,\"precipType\":\"rain\",\"temperature\":50.43,\"apparentTemperature\":50.43,\"dewPoint\":46.64,\"humidity\":0.87,\"pressure\":1002.16,\"windSpeed\":10.66,\"windGust\":23.07,\"windBearing\":279,\"cloudCover\":0.44,\"uvIndex\":0,\"visibility\":10,\"ozone\":319.5},{\"time\":1505199600,\"summary\":\"Partly Cloudy\",\"icon\":\"partly-cloudy-day\",\"precipIntensity\":0.0019,\"precipProbability\":0.05,\"precipType\":\"rain\",\"temperature\":51.04,\"apparentTemperature\":51.04,\"dewPoint\":46.96,\"humidity\":0.86,\"pressure\":1002.65,\"windSpeed\":9.29,\"windGust\":21.42,\"windBearing\":359,\"cloudCover\":0.36,\"uvIndex\":0,\"visibility\":10,\"ozone\":316.66},{\"time\":1505203200,\"summary\":\"Partly Cloudy\",\"icon\":\"partly-cloudy-day\",\"precipIntensity\":0.0022,\"precipProbability\":0.06,\"precipType\":\"rain\",\"temperature\":52.43,\"apparentTemperature\":52.43,\"dewPoint\":47.51,\"humidity\":0.83,\"pressure\":1003.13,\"windSpeed\":9.78,\"windGust\":19.44,\"windBearing\":188,\"cloudCover\":0.27,\"uvIndex\":1,\"visibility\":10,\"ozone\":314.22},{\"time\":1505206800,\"summary\":\"Clear\",\"icon\":\"clear-day\",\"precipIntensity\":0.0027,\"precipProbability\":0.06,\"precipType\":\"rain\",\"temperature\":54.01,\"apparentTemperature\":54.01,\"dewPoint\":47.91,\"humidity\":0.8,\"pressure\":1003.42,\"windSpeed\":11.3,\"windGust\":18.04,\"windBearing\":269,\"cloudCover\":0.23,\"uvIndex\":1,\"visibility\":10,\"ozone\":312.41},{\"time\":1505210400,\"summary\":\"Partly Cloudy\",\"icon\":\"partly-cloudy-day\",\"precipIntensity\":0.0026,\"precipProbability\":0.06,\"precipType\":\"rain\",\"temperature\":55.15,\"apparentTemperature\":55.15,\"dewPoint\":48.04,\"humidity\":0.77,\"pressure\":1003.47,\"windSpeed\":11.18,\"windGust\":17.65,\"windBearing\":272,\"cloudCover\":0.32,\"uvIndex\":2,\"visibility\":10,\"ozone\":311.59},{\"time\":1505214000,\"summary\":\"Partly Cloudy\",\"icon\":\"partly-cloudy-day\",\"precipIntensity\":0.0025,\"precipProbability\":0.06,\"precipType\":\"rain\",\"temperature\":56.23,\"apparentTemperature\":56.23,\"dewPoint\":48.02,\"humidity\":0.74,\"pressure\":1003.36,\"windSpeed\":11.22,\"windGust\":17.83,\"windBearing\":264,\"cloudCover\":0.48,\"uvIndex\":2,\"visibility\":10,\"ozone\":311.27},{\"time\":1505217600,\"summary\":\"Partly Cloudy\",\"icon\":\"partly-cloudy-day\",\"precipIntensity\":0.0024,\"precipProbability\":0.07,\"precipType\":\"rain\",\"temperature\":57.28,\"apparentTemperature\":57.28,\"dewPoint\":47.86,\"humidity\":0.71,\"pressure\":1003.05,\"windSpeed\":11.53,\"windGust\":18.02,\"windBearing\":251,\"cloudCover\":0.55,\"uvIndex\":2,\"visibility\":10,\"ozone\":310.73},{\"time\":1505221200,\"summary\":\"Partly Cloudy\",\"icon\":\"partly-cloudy-day\",\"precipIntensity\":0.0019,\"precipProbability\":0.07,\"precipType\":\"rain\",\"temperature\":58.88,\"apparentTemperature\":58.88,\"dewPoint\":47.33,\"humidity\":0.65,\"pressure\":1002.57,\"windSpeed\":11.43,\"windGust\":17.99,\"windBearing\":244,\"cloudCover\":0.43,\"uvIndex\":2,\"visibility\":10,\"ozone\":309.48},{\"time\":1505224800,\"summary\":\"Clear\",\"icon\":\"clear-day\",\"precipIntensity\":0.0015,\"precipProbability\":0.08,\"precipType\":\"rain\",\"temperature\":60.48,\"apparentTemperature\":60.48,\"dewPoint\":46.62,\"humidity\":0.6,\"pressure\":1001.92,\"windSpeed\":11.3,\"windGust\":17.96,\"windBearing\":237,\"cloudCover\":0.23,\"uvIndex\":2,\"visibility\":10,\"ozone\":308.01},{\"time\":1505228400,\"summary\":\"Clear\",\"icon\":\"clear-day\",\"precipIntensity\":0.0018,\"precipProbability\":0.13,\"precipType\":\"rain\",\"temperature\":60.91,\"apparentTemperature\":60.91,\"dewPoint\":46.41,\"humidity\":0.59,\"pressure\":1001.01,\"windSpeed\":11.15,\"windGust\":18.23,\"windBearing\":228,\"cloudCover\":0.13,\"uvIndex\":2,\"visibility\":10,\"ozone\":307.11},{\"time\":1505232000,\"summary\":\"Drizzle\",\"icon\":\"rain\",\"precipIntensity\":0.0066,\"precipProbability\":0.39,\"precipType\":\"rain\",\"temperature\":59.4,\"apparentTemperature\":59.4,\"dewPoint\":47.08,\"humidity\":0.64,\"pressure\":999.9,\"windSpeed\":10.84,\"windGust\":18.59,\"windBearing\":216,\"cloudCover\":0.2,\"uvIndex\":1,\"visibility\":10,\"ozone\":307.2},{\"time\":1505235600,\"summary\":\"Light Rain\",\"icon\":\"rain\",\"precipIntensity\":0.0219,\"precipProbability\":0.68,\"precipType\":\"rain\",\"temperature\":56.32,\"apparentTemperature\":56.32,\"dewPoint\":48.2,\"humidity\":0.74,\"pressure\":998.56,\"windSpeed\":10.56,\"windGust\":19.26,\"windBearing\":202,\"cloudCover\":0.35,\"uvIndex\":0,\"visibility\":9.11,\"ozone\":308.03},{\"time\":1505239200,\"summary\":\"Light Rain\",\"icon\":\"rain\",\"precipIntensity\":0.0372,\"precipProbability\":0.79,\"precipType\":\"rain\",\"temperature\":53.94,\"apparentTemperature\":53.94,\"dewPoint\":49.13,\"humidity\":0.84,\"pressure\":996.79,\"windSpeed\":11.01,\"windGust\":21.13,\"windBearing\":190,\"cloudCover\":0.52,\"uvIndex\":0,\"visibility\":4.35,\"ozone\":309.22},{\"time\":1505242800,\"summary\":\"Light Rain\",\"icon\":\"rain\",\"precipIntensity\":0.0375,\"precipProbability\":0.8,\"precipType\":\"rain\",\"temperature\":53.3,\"apparentTemperature\":53.3,\"dewPoint\":49.7,\"humidity\":0.88,\"pressure\":994.31,\"windSpeed\":12.8,\"windGust\":25.41,\"windBearing\":179,\"cloudCover\":0.69,\"uvIndex\":0,\"visibility\":9.11,\"ozone\":310.95},{\"time\":1505246400,\"summary\":\"Light Rain\",\"icon\":\"rain\",\"precipIntensity\":0.034,\"precipProbability\":0.8,\"precipType\":\"rain\",\"temperature\":54.08,\"apparentTemperature\":54.08,\"dewPoint\":50.19,\"humidity\":0.87,\"pressure\":991.44,\"windSpeed\":15.26,\"windGust\":30.91,\"windBearing\":173,\"cloudCover\":0.87,\"uvIndex\":0,\"visibility\":10,\"ozone\":313.23},{\"time\":1505250000,\"summary\":\"Light Rain\",\"icon\":\"rain\",\"precipIntensity\":0.0331,\"precipProbability\":0.79,\"precipType\":\"rain\",\"temperature\":55.24,\"apparentTemperature\":55.24,\"dewPoint\":50.43,\"humidity\":0.84,\"pressure\":988.92,\"windSpeed\":17.56,\"windGust\":34.84,\"windBearing\":178,\"cloudCover\":0.98,\"uvIndex\":0,\"visibility\":10,\"ozone\":315.86},{\"time\":1505253600,\"summary\":\"Light Rain and Breezy\",\"icon\":\"rain\",\"precipIntensity\":0.0294,\"precipProbability\":0.76,\"precipType\":\"rain\",\"temperature\":56.35,\"apparentTemperature\":56.35,\"dewPoint\":50.27,\"humidity\":0.8,\"pressure\":986.88,\"windSpeed\":19.46,\"windGust\":35.27,\"windBearing\":201,\"cloudCover\":0.98,\"uvIndex\":0,\"visibility\":10,\"ozone\":319.42},{\"time\":1505257200,\"summary\":\"Light Rain and Breezy\",\"icon\":\"rain\",\"precipIntensity\":0.0233,\"precipProbability\":0.7,\"precipType\":\"rain\",\"temperature\":56.39,\"apparentTemperature\":56.39,\"dewPoint\":49.86,\"humidity\":0.79,\"pressure\":985.22,\"windSpeed\":21.01,\"windGust\":34.16,\"windBearing\":230,\"cloudCover\":0.92,\"uvIndex\":0,\"visibility\":10,\"ozone\":323.43},{\"time\":1505260800,\"summary\":\"Light Rain and Breezy\",\"icon\":\"rain\",\"precipIntensity\":0.018,\"precipProbability\":0.62,\"precipType\":\"rain\",\"temperature\":55.98,\"apparentTemperature\":55.98,\"dewPoint\":49.22,\"humidity\":0.78,\"pressure\":984.4,\"windSpeed\":23.05,\"windGust\":34.63,\"windBearing\":231,\"cloudCover\":0.89,\"uvIndex\":0,\"visibility\":10,\"ozone\":326.17},{\"time\":1505264400,\"summary\":\"Light Rain and Breezy\",\"icon\":\"rain\",\"precipIntensity\":0.0135,\"precipProbability\":0.52,\"precipType\":\"rain\",\"temperature\":54.83,\"apparentTemperature\":54.83,\"dewPoint\":48.15,\"humidity\":0.78,\"pressure\":984.85,\"windSpeed\":18.16,\"windGust\":39.29,\"windBearing\":179,\"cloudCover\":0.91,\"uvIndex\":0,\"visibility\":10,\"ozone\":326.69},{\"time\":1505268000,\"summary\":\"Light Rain and Breezy\",\"icon\":\"rain\",\"precipIntensity\":0.0097,\"precipProbability\":0.42,\"precipType\":\"rain\",\"temperature\":53.76,\"apparentTemperature\":53.76,\"dewPoint\":46.9,\"humidity\":0.78,\"pressure\":986.15,\"windSpeed\":20.67,\"windGust\":45.55,\"windBearing\":334,\"cloudCover\":0.96,\"uvIndex\":0,\"visibility\":10,\"ozone\":325.93},{\"time\":1505271600,\"summary\":\"Drizzle and Windy\",\"icon\":\"rain\",\"precipIntensity\":0.0072,\"precipProbability\":0.33,\"precipType\":\"rain\",\"temperature\":52.86,\"apparentTemperature\":52.86,\"dewPoint\":45.98,\"humidity\":0.77,\"pressure\":987.6,\"windSpeed\":29.88,\"windGust\":48.81,\"windBearing\":272,\"cloudCover\":0.99,\"uvIndex\":0,\"visibility\":9.32,\"ozone\":325.46},{\"time\":1505275200,\"summary\":\"Drizzle and Windy\",\"icon\":\"rain\",\"precipIntensity\":0.0056,\"precipProbability\":0.28,\"precipType\":\"rain\",\"temperature\":52.58,\"apparentTemperature\":52.58,\"dewPoint\":45.42,\"humidity\":0.77,\"pressure\":989.1,\"windSpeed\":27.51,\"windGust\":46.3,\"windBearing\":268,\"cloudCover\":1,\"uvIndex\":0,\"visibility\":9.32,\"ozone\":325.81},{\"time\":1505278800,\"summary\":\"Breezy and Overcast\",\"icon\":\"wind\",\"precipIntensity\":0.0046,\"precipProbability\":0.25,\"precipType\":\"rain\",\"temperature\":52.23,\"apparentTemperature\":52.23,\"dewPoint\":45.12,\"humidity\":0.77,\"pressure\":990.72,\"windSpeed\":24.8,\"windGust\":40.82,\"windBearing\":273,\"cloudCover\":1,\"uvIndex\":0,\"visibility\":9.32,\"ozone\":326.45},{\"time\":1505282400,\"summary\":\"Breezy and Overcast\",\"icon\":\"wind\",\"precipIntensity\":0.0044,\"precipProbability\":0.24,\"precipType\":\"rain\",\"temperature\":51.87,\"apparentTemperature\":51.87,\"dewPoint\":44.99,\"humidity\":0.77,\"pressure\":992.15,\"windSpeed\":22.97,\"windGust\":35.88,\"windBearing\":273,\"cloudCover\":0.99,\"uvIndex\":0,\"visibility\":9.32,\"ozone\":326.84},{\"time\":1505286000,\"summary\":\"Overcast\",\"icon\":\"cloudy\",\"precipIntensity\":0.0044,\"precipProbability\":0.23,\"precipType\":\"rain\",\"temperature\":51.9,\"apparentTemperature\":51.9,\"dewPoint\":45.07,\"humidity\":0.77,\"pressure\":993.28,\"windSpeed\":16.2,\"windGust\":32.61,\"windBearing\":242,\"cloudCover\":0.96,\"uvIndex\":0,\"visibility\":9.32,\"ozone\":326.79},{\"time\":1505289600,\"summary\":\"Mostly Cloudy\",\"icon\":\"partly-cloudy-day\",\"precipIntensity\":0.0047,\"precipProbability\":0.21,\"precipType\":\"rain\",\"temperature\":52.29,\"apparentTemperature\":52.29,\"dewPoint\":45.37,\"humidity\":0.77,\"pressure\":994.22,\"windSpeed\":15.39,\"windGust\":29.91,\"windBearing\":301,\"cloudCover\":0.91,\"uvIndex\":0,\"visibility\":9.32,\"ozone\":326.55},{\"time\":1505293200,\"summary\":\"Drizzle\",\"icon\":\"rain\",\"precipIntensity\":0.0057,\"precipProbability\":0.22,\"precipType\":\"rain\",\"temperature\":52.83,\"apparentTemperature\":52.83,\"dewPoint\":45.62,\"humidity\":0.76,\"pressure\":995.01,\"windSpeed\":18.18,\"windGust\":27.93,\"windBearing\":272,\"cloudCover\":0.87,\"uvIndex\":1,\"visibility\":9.32,\"ozone\":326.95},{\"time\":1505296800,\"summary\":\"Drizzle\",\"icon\":\"rain\",\"precipIntensity\":0.0082,\"precipProbability\":0.25,\"precipType\":\"rain\",\"temperature\":53.61,\"apparentTemperature\":53.61,\"dewPoint\":45.83,\"humidity\":0.75,\"pressure\":995.63,\"windSpeed\":17.45,\"windGust\":26.96,\"windBearing\":301,\"cloudCover\":0.87,\"uvIndex\":1,\"visibility\":10,\"ozone\":328.54},{\"time\":1505300400,\"summary\":\"Light Rain\",\"icon\":\"rain\",\"precipIntensity\":0.0121,\"precipProbability\":0.27,\"precipType\":\"rain\",\"temperature\":54.38,\"apparentTemperature\":54.38,\"dewPoint\":45.98,\"humidity\":0.73,\"pressure\":996.12,\"windSpeed\":17,\"windGust\":26.72,\"windBearing\":242,\"cloudCover\":0.87,\"uvIndex\":2,\"visibility\":10,\"ozone\":330.9},{\"time\":1505304000,\"summary\":\"Light Rain\",\"icon\":\"rain\",\"precipIntensity\":0.015,\"precipProbability\":0.28,\"precipType\":\"rain\",\"temperature\":55.56,\"apparentTemperature\":55.56,\"dewPoint\":45.93,\"humidity\":0.7,\"pressure\":996.52,\"windSpeed\":16.59,\"windGust\":26.45,\"windBearing\":271,\"cloudCover\":0.81,\"uvIndex\":2,\"visibility\":10,\"ozone\":333.24},{\"time\":1505307600,\"summary\":\"Light Rain\",\"icon\":\"rain\",\"precipIntensity\":0.016,\"precipProbability\":0.28,\"precipType\":\"rain\",\"temperature\":56.59,\"apparentTemperature\":56.59,\"dewPoint\":45.46,\"humidity\":0.66,\"pressure\":996.84,\"windSpeed\":4.7,\"windGust\":26.15,\"windBearing\":26,\"cloudCover\":0.64,\"uvIndex\":2,\"visibility\":10,\"ozone\":335.75},{\"time\":1505311200,\"summary\":\"Light Rain\",\"icon\":\"rain\",\"precipIntensity\":0.0159,\"precipProbability\":0.29,\"precipType\":\"rain\",\"temperature\":57.6,\"apparentTemperature\":57.6,\"dewPoint\":44.63,\"humidity\":0.62,\"pressure\":997.09,\"windSpeed\":13.43,\"windGust\":25.86,\"windBearing\":232,\"cloudCover\":0.4,\"uvIndex\":2,\"visibility\":10,\"ozone\":338.14},{\"time\":1505314800,\"summary\":\"Light Rain\",\"icon\":\"rain\",\"precipIntensity\":0.0133,\"precipProbability\":0.28,\"precipType\":\"rain\",\"temperature\":57.67,\"apparentTemperature\":57.67,\"dewPoint\":43.93,\"humidity\":0.6,\"pressure\":997.28,\"windSpeed\":14.77,\"windGust\":24.91,\"windBearing\":270,\"cloudCover\":0.23,\"uvIndex\":1,\"visibility\":10,\"ozone\":339.66},{\"time\":1505318400,\"summary\":\"Drizzle\",\"icon\":\"rain\",\"precipIntensity\":0.007,\"precipProbability\":0.24,\"precipType\":\"rain\",\"temperature\":56.75,\"apparentTemperature\":56.75,\"dewPoint\":43.68,\"humidity\":0.62,\"pressure\":997.31,\"windSpeed\":13.11,\"windGust\":22.97,\"windBearing\":274,\"cloudCover\":0.16,\"uvIndex\":1,\"visibility\":10,\"ozone\":339.55},{\"time\":1505322000,\"summary\":\"Clear\",\"icon\":\"clear-day\",\"precipIntensity\":0.002,\"precipProbability\":0.14,\"precipType\":\"rain\",\"temperature\":55.03,\"apparentTemperature\":55.03,\"dewPoint\":43.71,\"humidity\":0.66,\"pressure\":997.28,\"windSpeed\":2.82,\"windGust\":20.41,\"windBearing\":109,\"cloudCover\":0.14,\"uvIndex\":0,\"visibility\":10,\"ozone\":338.51},{\"time\":1505325600,\"summary\":\"Clear\",\"icon\":\"clear-day\",\"precipIntensity\":0.0007,\"precipProbability\":0.06,\"precipType\":\"rain\",\"temperature\":53.76,\"apparentTemperature\":53.76,\"dewPoint\":43.8,\"humidity\":0.69,\"pressure\":997.39,\"windSpeed\":9.2,\"windGust\":17.71,\"windBearing\":270,\"cloudCover\":0.19,\"uvIndex\":0,\"visibility\":10,\"ozone\":337.74},{\"time\":1505329200,\"summary\":\"Partly Cloudy\",\"icon\":\"partly-cloudy-night\",\"precipIntensity\":0.0003,\"precipProbability\":0.04,\"precipType\":\"rain\",\"temperature\":52.72,\"apparentTemperature\":52.72,\"dewPoint\":43.88,\"humidity\":0.72,\"pressure\":997.76,\"windSpeed\":7.77,\"windGust\":14.76,\"windBearing\":268,\"cloudCover\":0.36,\"uvIndex\":0,\"visibility\":10,\"ozone\":337.74},{\"time\":1505332800,\"summary\":\"Mostly Cloudy\",\"icon\":\"partly-cloudy-night\",\"precipIntensity\":0.0003,\"precipProbability\":0.06,\"precipType\":\"rain\",\"temperature\":51.95,\"apparentTemperature\":51.95,\"dewPoint\":44.03,\"humidity\":0.74,\"pressure\":998.28,\"windSpeed\":6.56,\"windGust\":11.69,\"windBearing\":268,\"cloudCover\":0.6,\"uvIndex\":0,\"visibility\":10,\"ozone\":337.97},{\"time\":1505336400,\"summary\":\"Mostly Cloudy\",\"icon\":\"partly-cloudy-night\",\"precipIntensity\":0.0007,\"precipProbability\":0.09,\"precipType\":\"rain\",\"temperature\":51.13,\"apparentTemperature\":51.13,\"dewPoint\":44.13,\"humidity\":0.77,\"pressure\":998.75,\"windSpeed\":5.72,\"windGust\":9.5,\"windBearing\":272,\"cloudCover\":0.78,\"uvIndex\":0,\"visibility\":9.8,\"ozone\":338.17}]},\"offset\":1}";

        JSONObject obj = new JSONObject(jsonString);
        return obj;
    }
}