package com.vtrdelfino.assetList.dto;

import com.vtrdelfino.assetList.entities.Asset;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@Getter
@Setter
@NoArgsConstructor
public class AssetDTO
{
    private Long id;
    private String title;
    private Integer zipCode;
    private String address;
    private Integer addressNumber;
    private Double assetValue;
    private String assetUse;
    private String imgUrl;
    private String description;

    public AssetDTO(Asset entity)
    {
        BeanUtils.copyProperties(entity, this);
    }
}
