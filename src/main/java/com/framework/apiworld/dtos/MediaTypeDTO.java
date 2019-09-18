package com.framework.apiworld.dtos;

import com.framework.apiworld.entity.media.MediaType;
import com.framework.apiworld.entity.media.Schema;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * MediaType
 *
 * #mediaTypeObject"
 */

public class MediaTypeDTO {

    private String name = null;
    private List<ComplexTypeDTO> requestBody=new ArrayList<>();

    public static MediaTypeDTO covert(String mediaTypeName, MediaType mediaType) {
        MediaTypeDTO mediaTypeDTO = new MediaTypeDTO();
        mediaTypeDTO.name = mediaTypeName;

        if (mediaType.getSchema() != null) {
            if (mediaType.getSchema().getProperties() != null) {
                for (String typeName :
                        (Set<String>) mediaType.getSchema().getProperties().keySet()) {
                    mediaTypeDTO.requestBody.add(
                            ComplexTypeDTO.convert(typeName, (Schema) (mediaType.getSchema().getProperties().get(typeName))));
                }
            }
//            else
//            {
//                if(mediaType.getSchema().get$ref()!=null)
//                {
//                    mediaTypeDTO.requestBody.add(mediaType.getSchema().get$ref());
//                }
//
//            }


        }

        return mediaTypeDTO;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ComplexTypeDTO> getRequestBody() {
        return requestBody;
    }

    public void setRequestBody(List<ComplexTypeDTO> requestBody) {
        this.requestBody = requestBody;
    }
}

