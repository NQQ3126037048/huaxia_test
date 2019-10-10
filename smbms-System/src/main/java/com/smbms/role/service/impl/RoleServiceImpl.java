package com.smbms.role.service.impl;

import com.smbms.role.dao.RoleDao;
import com.smbms.role.entity.SmbmsRoleDTO;
import com.smbms.role.service.RoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName RoleServiceImpl
 * @description
 * @Author NieQiQiang
 * @Date 2019/6/10 16:37
 * @Version 1.0
 */
@Service("roleService")
public class RoleServiceImpl implements RoleService {

    @Resource
    RoleDao roleDao;

    @Override
    public List<SmbmsRoleDTO> getRoleList() {
        return roleDao.selectRoleList();
    }

}
