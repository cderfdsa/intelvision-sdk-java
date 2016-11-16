package cn.intelvision.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author lan
 * @since 2015-12-21
 */
public class Identify {

    private String personId;
    private Float confidence;
    private String personName;
    private String recognitionId;

    @JsonProperty("person_id")
    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public Float getConfidence() {
        return confidence;
    }

    public void setConfidence(Float confidence) {
        this.confidence = confidence;
    }

    @JsonProperty("person_name")
    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    @JsonProperty("recognition_id")
    public String getRecognitionId() {
        return recognitionId;
    }

    public void setRecognitionId(String recognitionId) {
        this.recognitionId = recognitionId;
    }
}
