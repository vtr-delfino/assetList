package com.vtrdelfino.assetList.services;

import com.vtrdelfino.assetList.dto.AssetDTO;
import com.vtrdelfino.assetList.entities.Asset;
import com.vtrdelfino.assetList.repositories.AssetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssetService
{
    @Autowired
    private AssetRepository assetRepository;
    public List<AssetDTO> findAll()
    {
        List<Asset> result = assetRepository.findAll();
        return result.stream().map(AssetDTO::new).toList();
    }
}
