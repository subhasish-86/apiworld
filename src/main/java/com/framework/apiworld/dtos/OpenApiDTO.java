package com.framework.apiworld.dtos;

import com.framework.apiworld.entity.OpenAPI;
import com.framework.apiworld.entity.PathItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class OpenApiDTO extends EntityDTOBase {

    private OpenApiDTO() {
    }

    public String id;

    private List<PathItemDTO> paths = new ArrayList<>();

    public static OpenApiDTO convert(OpenAPI openAPI) {
        OpenApiDTO openApiDTO = new OpenApiDTO();

        openApiDTO.id = openAPI.getId();

        for ( String pathUri : openAPI.getPaths().keySet()) {
            openApiDTO.paths.add(PathItemDTO.convert(pathUri, openAPI.getPaths().get(pathUri)));
        }
        return openApiDTO;

    }

    public List<PathItemDTO> getPaths() {
        return paths;
    }

//    public void setPaths(List<PathItemDTO> paths) {
//        this.paths = paths;
//    }

    public String getId() {
        return id;
    }

//    public void setId(String id) {
//        this.id = id;
//    }
}

