package com.tt.pp.core.managers;

import com.tt.pp.core.model.process.store.productmeans.general.ProductAddInput;
import com.tt.pp.core.model.process.store.productmeans.general.ProductAddOutput;

/**
 * Created by bellag on 2/2/16.
 */
public interface StoreManager {
    ProductAddOutput addProduct(ProductAddInput input);
}
