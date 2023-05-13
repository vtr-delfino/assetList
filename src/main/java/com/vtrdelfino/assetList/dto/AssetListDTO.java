package com.vtrdelfino.assetList.dto;

import com.vtrdelfino.assetList.entities.AssetList;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class AssetListDTO
{
    private Long id;
    private String name;

    public AssetListDTO(AssetList entity)
    {
        id = entity.getId();
        name = entity.getName();
    }
}
