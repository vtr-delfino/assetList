package com.vtrdelfino.assetList.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "tb_belonging")
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Belonging
{
    @EmbeddedId
    private BelongingPk id = new BelongingPk();

    private Integer position;

    public Belonging(Asset asset, AssetList list, Integer position)
    {
        id.setAsset(asset);
        id.setList(list);
        this.position = position;
    }
}
