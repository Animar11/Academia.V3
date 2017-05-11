package com.service;

import com.Entities.Feature;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.repository.FeatureRepository;


@Service
@Transactional
public class FeatureService {

    private FeatureRepository FeatureRepository;

    public Feature createFeature(Feature Feature){

        return FeatureRepository.save(Feature);
    }

    public Feature updateFeature(Feature Feature){

        return FeatureRepository.findOneById(Feature.getId());
    }

    public void deleteFeature(Feature Feature){

        FeatureRepository.delete(Feature);
    }
}
