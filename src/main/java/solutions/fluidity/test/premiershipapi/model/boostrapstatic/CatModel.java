package solutions.fluidity.test.premiershipapi.model.boostrapstatic;

import com.google.gson.annotations.SerializedName;

public class CatModel {
    @SerializedName("length") private String length;
    @SerializedName("fact") String fact;

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getFact() {
        return fact;
    }

    public void setFact(String fact) {
        this.fact = fact;
    }
}