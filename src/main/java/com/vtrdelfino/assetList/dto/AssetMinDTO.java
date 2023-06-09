package com.vtrdelfino.assetList.dto;

import com.vtrdelfino.assetList.entities.Asset;
import com.vtrdelfino.assetList.projections.AssetMinProjection;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class AssetMinDTO
{
    private Long id;
    private String title;
    private Double assetValue;
    private String assetUse;
    private String imgUrl;

    public AssetMinDTO(Asset entity)
    {
        id = entity.getId();
        title = entity.getTitle();
        assetValue = entity.getAssetValue();
        assetUse = entity.getAssetUse();
        imgUrl = entity.getImgUrl();
    }

    public AssetMinDTO(AssetMinProjection projection)
    {
        id = projection.getId();
        title = projection.getTitle();
        imgUrl = projection.getImgUrl();
    }
}
