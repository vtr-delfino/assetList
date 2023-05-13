package com.vtrdelfino.assetList.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_asset_list")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class AssetList
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
}
