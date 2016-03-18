package com.zeno.intelvision.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by pc on 2016/3/15.
 */
public class Compare {
    private Double similarity;
    private Double eyeSimilarity;
    private Double noseSimilarity;
    private Double mouthSimilarity;
    private Double eyebrowSimilarity;
    private String recognitionId;

    public Double getSimilarity() {
        return similarity;
    }

    public void setSimilarity(Double similarity) {
        this.similarity = similarity;
    }

    @JsonProperty("eye_similarity")
    public Double getEyeSimilarity() {
        return eyeSimilarity;
    }

    public void setEyeSimilarity(Double eyeSimilarity) {
        this.eyeSimilarity = eyeSimilarity;
    }

    @JsonProperty("nose_similarity")
    public Double getNoseSimilarity() {
        return noseSimilarity;
    }

    public void setNoseSimilarity(Double noseSimilarity) {
        this.noseSimilarity = noseSimilarity;
    }

    @JsonProperty("mouth_similarity")
    public Double getMouthSimilarity() {
        return mouthSimilarity;
    }

    public void setMouthSimilarity(Double mouthSimilarity) {
        this.mouthSimilarity = mouthSimilarity;
    }

    @JsonProperty("eyebrow_similarity")
    public Double getEyebrowSimilarity() {
        return eyebrowSimilarity;
    }

    public void setEyebrowSimilarity(Double eyebrowSimilarity) {
        this.eyebrowSimilarity = eyebrowSimilarity;
    }

    @JsonProperty("recognition_id")
    public String getRecognitionId() {
        return recognitionId;
    }

    public void setRecognitionId(String recognitionId) {
        this.recognitionId = recognitionId;
    }
}
