package com.zeno.intelvision.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author lan
 * @since 2015-01-21
 */
public class Candidate {

    private String faceId;
    private String tag;
    private Float similarity;

    @JsonProperty("face_id")
    public String getFaceId() {
        return faceId;
    }

    public void setFaceId(String faceId) {
        this.faceId = faceId;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Float getSimilarity() {
        return similarity;
    }

    public void setSimilarity(Float similarity) {
        this.similarity = similarity;
    }
}
