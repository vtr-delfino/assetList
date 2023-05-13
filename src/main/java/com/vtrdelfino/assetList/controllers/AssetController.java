package com.vtrdelfino.assetList.controllers;

import com.vtrdelfino.assetList.dto.AssetDTO;
import com.vtrdelfino.assetList.dto.AssetMinDTO;
import com.vtrdelfino.assetList.services.AssetService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping(value = "/{id}")
    public AssetDTO findById(@PathVariable Long id)
    {
        return assetService.findById(id);
    }

    @GetMapping
    public List<AssetMinDTO> findAll()
    {
        return assetService.findAll();
    }
}
