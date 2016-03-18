package com.zeno.intelvision.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author lan
 * @since 2015-12-21
 */
public class Search {

    private List<Candidate> candidates;
    private String recognitionId;

    public List<Candidate> getCandidates() {
        return candidates;
    }

    public void setCandidates(List<Candidate> candidates) {
        this.candidates = candidates;
    }

    @JsonProperty("recognition_id")
    public String getRecognitionId() {
        return recognitionId;
    }

    public void setRecognitionId(String recognitionId) {
        this.recognitionId = recognitionId;
    }
}
