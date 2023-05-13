package com.vtrdelfino.assetList.services;

import com.vtrdelfino.assetList.dto.AssetDTO;
import com.vtrdelfino.assetList.dto.AssetMinDTO;
import com.vtrdelfino.assetList.entities.Asset;
import com.vtrdelfino.assetList.repositories.AssetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AssetService
{
    @Autowired
    private AssetRepository assetRepository;

    @Transactional(readOnly = true)
    public AssetDTO findById(Long id)
    {
        Asset result = assetRepository.findById(id).get();
        return new AssetDTO(result);
    }

    @Transactional(readOnly = true)
    public List<AssetMinDTO> findAll()
    {
        List<Asset> result = assetRepository.findAll();
        return result.stream().map(AssetMinDTO::new).toList();
    }
}
