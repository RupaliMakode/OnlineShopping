import React, { Component } from 'react';

import ProductListComponent from './ProductListComponent';
class ProductComponent extends Component {
    render() {
        return (
            <>
              <h1>Product Component</h1>  
              <br/>
              <div className="row">
                  <div className= "col-md-4">
                    <ProductFromComponent/>
                  </div>
                  <div className= "col-md-8">
                   <ProductListComponent/>
                  </div>
            </div>
            </>
        );
    }
}

export default ProductComponent;