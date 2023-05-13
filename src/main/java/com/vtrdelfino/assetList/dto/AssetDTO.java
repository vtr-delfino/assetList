package com.vtrdelfino.assetList.dto;

import com.vtrdelfino.assetList.entities.Asset;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class AssetDTO
{
    private Long id;
    private String title;
    private Integer zipCode;
    private String address;
    private Integer addressNumber;
    private Double assetValue;
    private String imgUrl;
    private String description;

    public AssetDTO(Asset entity)
    {
        id = entity.getId();
        title = entity.getTitle();
        zipCode = entity.getZipCode();
        address = entity.getAddress();
        addressNumber = entity.getAddressNumber();
        assetValue = entity.getAssetValue();
        imgUrl = entity.getImgUrl();
        description = entity.getDescription();
    }
}
