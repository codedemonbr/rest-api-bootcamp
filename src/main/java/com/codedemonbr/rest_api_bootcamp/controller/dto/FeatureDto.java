package com.codedemonbr.rest_api_bootcamp.controller.dto;

import com.codedemonbr.rest_api_bootcamp.domain.model.Feature;

public record FeatureDto(Long id, String icon, String description) {
    public FeatureDto(Feature model){
        this(model.getId(), model.getIcon(), model.getDescription());
    }

    public Feature toModel(){
        Feature model = new Feature();
        model.setId(this.id);
        model.setIcon(this.icon);
        model.setDescription(this.description);
        return model;
    }

}
