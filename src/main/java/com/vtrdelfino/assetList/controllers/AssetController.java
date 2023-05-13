package com.vtrdelfino.assetList.controllers;

import com.vtrdelfino.assetList.dto.AssetDTO;
import com.vtrdelfino.assetList.services.AssetService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/assets")
public class AssetController
{
    private final AssetService assetService;

    public AssetController(AssetService assetService) {
        this.assetService = assetService;
    }

    @GetMapping
    public List<AssetDTO> findAll()
    {
        return assetService.findAll();
    }
}
