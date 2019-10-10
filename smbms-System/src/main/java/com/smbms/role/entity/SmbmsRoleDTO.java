/**
 * @description 超市管理系统-用户角色数据传输对象
 * @author NieQiQiang
 * @create 2019/4/30
 * @since 1.0.0
 */
package com.smbms.role.entity;

import com.smbms.util.PageUtil;

import java.util.Date;

public class SmbmsRoleDTO  extends PageUtil {
    /**
     * 角色ID
     */
    private Integer id;
    /**
     * 角色编码
    */
    private String roleCode;
    /**
     * 角色名称
     */
    private String roleName;
    /**
     * 创建者
     */
    private Integer createdBy;
    /**
     * 创建时间
     */
    private Date creationDate;
    /**
     * 更新者
     */
    private Integer modifyBy;
    /**
     * 更新时间
     */
    private Date modifyDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Integer getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(Integer modifyBy) {
        this.modifyBy = modifyBy;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    @Override
    public String toString() {
        return "SmbmsRoleDTO{" +
                "id=" + id +
                ", roleCode='" + roleCode + '\'' +
                ", roleName='" + roleName + '\'' +
                ", createdBy=" + createdBy +
                ", creationDate=" + creationDate +
                ", modifyBy=" + modifyBy +
                ", modifyDate=" + modifyDate +
                "} " + super.toString();
    }
}