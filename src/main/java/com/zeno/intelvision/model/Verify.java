package com.zeno.intelvision.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by limit on 2015/12/15.
 */
public class Verify {

    private boolean same;
    private Float confidence;
    private String recognitionId;

    public boolean isSame() {
        return same;
    }

    public void setSame(boolean same) {
        this.same = same;
    }

    public Float getConfidence() {
        return confidence;
    }

    public void setConfidence(Float confidence) {
        this.confidence = confidence;
    }

    @JsonProperty("recognition_id")
    public String getRecognitionId() {
        return recognitionId;
    }

    public void setRecognitionId(String recognitionId) {
        this.recognitionId = recognitionId;
    }
}
