package com.hig.cm.entity;

import jakarta.validation.constraints.*;

import java.util.Date;

public class Case {
    @NotNull
    @Size(min=8, max=8)
    @Pattern(regexp = "^[A-Z0-9]{8}$")
    private String id;

    @NotNull
    @Size(min=8, max=8)
    @Pattern(regexp = "^[A-Z0-9]{8}$")
    private String clientId;

    @NotNull
    @Min(0)
    @Max(9999999)
    private int employeeCount;

    @Min(0)
    @Max(9999)
    private int SLSOFFCCD;

    @Min(0)
    @Max(9999)
    private int STTSCD;

    @NotNull
    private Date coverageEffectiveDate;

    @Pattern(regexp = "^[A-Z0-9]{8}$")
    private String pendingCaseId;

    private Client client;
    private Sponsor sponsor;
    private SaveRestart saveRestart;

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Sponsor getSponsor() {
        return sponsor;
    }

    public void setSponsor(Sponsor sponsor) {
        this.sponsor = sponsor;
    }

    public SaveRestart getSaveRestart() {
        return saveRestart;
    }

    public void setSaveRestart(SaveRestart saveRestart) {
        this.saveRestart = saveRestart;
    }

    public Case() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public int getEmployeeCount() {
        return employeeCount;
    }

    public void setEmployeeCount(int employeeCount) {
        this.employeeCount = employeeCount;
    }

    public int getSLSOFFCCD() {
        return SLSOFFCCD;
    }

    public void setSLSOFFCCD(int SLSOFFCCD) {
        this.SLSOFFCCD = SLSOFFCCD;
    }

    public int getSTTSCD() {
        return STTSCD;
    }

    public void setSTTSCD(int STTSCD) {
        this.STTSCD = STTSCD;
    }

    public Date getCoverageEffectiveDate() {
        return coverageEffectiveDate;
    }

    public void setCoverageEffectiveDate(Date coverageEffectiveDate) {
        this.coverageEffectiveDate = coverageEffectiveDate;
    }

    public String getPendingCaseId() {
        return pendingCaseId;
    }

    public void setPendingCaseId(String pendingCaseId) {
        this.pendingCaseId = pendingCaseId;
    }
}
