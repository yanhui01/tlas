package com.yanhui.pojo;

import java.time.LocalDateTime;

public class Emp {
    private Integer empId;
    private String userName;
    private String password;
    private String name;
    private Short gender;
    private String image;
    private Short job;
    private LocalDateTime entryDate;
    private Integer deptId;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;


    public Emp() {
    }

    public Emp(Integer empId, String userName, String password, String name, Short gender, String image, Short job, LocalDateTime entryDate, Integer deptId, LocalDateTime createTime, LocalDateTime updateTime) {
        this.empId = empId;
        this.userName = userName;
        this.password = password;
        this.name = name;
        this.gender = gender;
        this.image = image;
        this.job = job;
        this.entryDate = entryDate;
        this.deptId = deptId;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    /**
     * 获取
     * @return empId
     */
    public Integer getEmpId() {
        return empId;
    }

    /**
     * 设置
     * @param empId
     */
    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    /**
     * 获取
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return gender
     */
    public Short getGender() {
        return gender;
    }

    /**
     * 设置
     * @param gender
     */
    public void setGender(Short gender) {
        this.gender = gender;
    }

    /**
     * 获取
     * @return image
     */
    public String getImage() {
        return image;
    }

    /**
     * 设置
     * @param image
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * 获取
     * @return job
     */
    public Short getJob() {
        return job;
    }

    /**
     * 设置
     * @param job
     */
    public void setJob(Short job) {
        this.job = job;
    }

    /**
     * 获取
     * @return entryDate
     */
    public LocalDateTime getEntryDate() {
        return entryDate;
    }

    /**
     * 设置
     * @param entryDate
     */
    public void setEntryDate(LocalDateTime entryDate) {
        this.entryDate = entryDate;
    }

    /**
     * 获取
     * @return deptId
     */
    public Integer getDeptId() {
        return deptId;
    }

    /**
     * 设置
     * @param deptId
     */
    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    /**
     * 获取
     * @return createTime
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * 设置
     * @param createTime
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取
     * @return updateTime
     */
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置
     * @param updateTime
     */
    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public String toString() {
        return "Emp{empId = " + empId + ", userName = " + userName + ", password = " + password + ", name = " + name + ", gender = " + gender + ", image = " + image + ", job = " + job + ", entryDate = " + entryDate + ", deptId = " + deptId + ", createTime = " + createTime + ", updateTime = " + updateTime + "}";
    }
}
