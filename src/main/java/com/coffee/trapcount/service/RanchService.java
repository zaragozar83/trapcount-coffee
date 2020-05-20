package com.coffee.trapcount.service;

import com.coffee.trapcount.repository.model.RanchEntity;

import java.util.List;

public interface RanchService {

    RanchEntity getRanchByName(String ranchName);
    List<RanchEntity> findRanchesLikeDescription(String description);
    List<RanchEntity> findRanchesLikeName(String name);
}
