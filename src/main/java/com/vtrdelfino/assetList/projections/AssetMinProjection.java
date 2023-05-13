package com.vtrdelfino.assetList.projections;

public interface AssetMinProjection {
    Long getId();
    String getTitle();
    String getImgUrl();
    String getDescription();
    Integer getPosition();
}
