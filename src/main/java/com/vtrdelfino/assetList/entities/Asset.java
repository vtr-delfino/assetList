package com.vtrdelfino.assetList.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_assets")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Asset
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private Integer zipCode;
    private String address;
    private Integer addressNumber;
    private Double assetValue;
    private String imgUrl;
    private String description;
}
