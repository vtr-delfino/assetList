package com.vtrdelfino.assetList.repositories;

import com.vtrdelfino.assetList.entities.Asset;
import com.vtrdelfino.assetList.projections.AssetMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

@SuppressWarnings("SqlNoDataSourceInspection")
public interface AssetRepository extends JpaRepository<Asset, Long>
{
    @Query(nativeQuery = true, value = """
		SELECT tb_assets.id, tb_assets.title, tb_assets.img_url AS imgUrl, tb_assets.description, tb_belonging.position
		FROM tb_assets
		INNER JOIN tb_belonging ON tb_assets.id = tb_belonging.asset_id
		WHERE tb_belonging.list_id = :listId
		ORDER BY tb_belonging.position
			""")
	List<AssetMinProjection> searchByList(Long listId);
}
