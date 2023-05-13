package com.vtrdelfino.assetList.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Embeddable
public class BelongingPk
{
    @ManyToOne
    @JoinColumn(name = "asset_id")
    private Asset asset;

    @ManyToOne
    @JoinColumn(name = "list_id")
    private AssetList list;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BelongingPk that = (BelongingPk) o;
        return Objects.equals(asset, that.asset) && Objects.equals(list, that.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(asset, list);
    }
}
