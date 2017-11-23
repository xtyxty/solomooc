package com.solomooc.pojo;

import java.util.Date;

public class Study {
    private Long studyId;

    private Long userId;

    private Long moduleId;

    private Long vieoId;

    private Date createdTime;

    private String column6;

    public Long getStudyId() {
        return studyId;
    }

    public void setStudyId(Long studyId) {
        this.studyId = studyId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getModuleId() {
        return moduleId;
    }

    public void setModuleId(Long moduleId) {
        this.moduleId = moduleId;
    }

    public Long getVieoId() {
        return vieoId;
    }

    public void setVieoId(Long vieoId) {
        this.vieoId = vieoId;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getColumn6() {
        return column6;
    }

    public void setColumn6(String column6) {
        this.column6 = column6 == null ? null : column6.trim();
    }
}