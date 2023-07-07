package com.begin.service.Impl;

import com.begin.core.redis.RedisCache;
import com.begin.domain.SysConfig;
import com.begin.service.ISysConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysConfigServiceImpl implements ISysConfigService {

    @Override
    public SysConfig selectConfigById(Long configId) {
        return null;
    }

    @Override
    public String selectConfigByKey(String configKey) {
        return null;
    }

    @Override
    public boolean selectCaptchaEnabled() {
        return true;
    }

    @Override
    public List<SysConfig> selectConfigList(SysConfig config) {
        return null;
    }

    @Override
    public int insertConfig(SysConfig config) {
        return 0;
    }

    @Override
    public int updateConfig(SysConfig config) {
        return 0;
    }

    @Override
    public void deleteConfigByIds(Long[] configIds) {

    }

    @Override
    public void loadingConfigCache() {

    }

    @Override
    public void clearConfigCache() {

    }

    @Override
    public void resetConfigCache() {

    }

    @Override
    public boolean checkConfigKeyUnique(SysConfig config) {
        return false;
    }
}
