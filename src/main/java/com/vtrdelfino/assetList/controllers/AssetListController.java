package com.vtrdelfino.assetList.controllers;

import com.vtrdelfino.assetList.dto.AssetListDTO;
import com.vtrdelfino.assetList.dto.AssetMinDTO;
import com.vtrdelfino.assetList.services.AssetListService;
import com.vtrdelfino.assetList.services.AssetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class AssetListController
{
    @Autowired
    private AssetListService assetListService;

    @Autowired
    private AssetService assetService;

    @GetMapping
    public List<AssetListDTO> findAll()
    {
        return assetListService.findAll();
    }

    @GetMapping(value = "/{listId}/assets")
    public List<AssetMinDTO> findByList(@PathVariable Long listId)
    {
        return assetService.findByList(listId);
    }
}
