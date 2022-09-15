package solutions.fluidity.test.premiershipapi;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.stereotype.Component;
import solutions.fluidity.test.premiershipapi.model.fixtures.FixtureModel;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

@Component
public class Fixtures {

    public String fixturesLookup() throws IOException {

        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url("https://fantasy.premierleague.com/api/fixtures/")
            .header("Accept", "application/json")
            .header("User-Agent", "Mozilla/5.0").build();

        Response response = client.newCall(request).execute();
        String responseBody = response.body().string();

        if (response.code() >= 400) {
            System.out.println("error");
            System.out.println("ok2");

//        val typeToken = object : TypeToken<List>() {}.type
//        val authors = Gson().fromJson<List>(json, typeToken)
//        val responseMap = GsonJsonParser().parseMap(responseBody)
        }
        return responseBody;
    }

    public List<FixtureModel> parseResponse(String responseBody) {
        Gson gson = new GsonBuilder().create();
        // java.lang.reflect.Type
        Type listType  =  new TypeToken<List<FixtureModel>>() {}.getType();
        return gson.fromJson(responseBody, listType);
//        val fixtures: List<FixtureModel> = gson.fromJson<List<FixtureModel>>(responseBody, listType)
//        return fixtures
    }

}