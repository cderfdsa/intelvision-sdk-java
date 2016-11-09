package com.zeno.intelvision.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by pc on 2016/3/15.
 */
public class Compare {

    private String recognitionId;
    private Float similarity;

    @JsonProperty("recognition_id")
    public String getRecognitionId() {
        return recognitionId;
    }

    public void setRecognitionId(String recognitionId) {
        this.recognitionId = recognitionId;
    }

    public Float getSimilarity() {
        return similarity;
    }

    public void setSimilarity(Float similarity) {
        this.similarity = similarity;
    }

}
