package com.vtrdelfino.assetList.services;

import com.vtrdelfino.assetList.dto.AssetDTO;
import com.vtrdelfino.assetList.dto.AssetListDTO;
import com.vtrdelfino.assetList.entities.Asset;
import com.vtrdelfino.assetList.entities.AssetList;
import com.vtrdelfino.assetList.repositories.AssetListRepository;
import com.vtrdelfino.assetList.repositories.AssetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AssetListService
{
    @Autowired
    private AssetListRepository assetListRepository;

    @Transactional(readOnly = true)
    public List<AssetListDTO> findAll()
    {
        List<AssetList> result = assetListRepository.findAll();
        return result.stream().map(AssetListDTO::new).toList();
    }
}
