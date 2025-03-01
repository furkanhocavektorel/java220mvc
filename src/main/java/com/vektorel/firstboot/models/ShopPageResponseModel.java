package com.vektorel.firstboot.models;

import com.vektorel.firstboot.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ShopPageResponseModel {

    private List<Product> productList;
    private String tel;
    private String email;
}
