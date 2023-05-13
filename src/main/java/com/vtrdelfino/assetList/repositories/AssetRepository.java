package com.vtrdelfino.assetList.repositories;

import com.vtrdelfino.assetList.entities.Asset;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssetRepository extends JpaRepository<Asset, Long>
{

}
