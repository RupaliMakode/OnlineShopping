import React, { Component } from 'react';
import { connect } from 'react-redux';

class ProductFormComponent extends Component {
    render() {
        return (
            <>
              <h1>Product List</h1>  
              <table className={"table"}>
                  <thead>
                        <tr>
                        <th>Price</th>
                    <th>Image</th>
                    <th>Description</th>
                    <th>Brand</th>
                    <th>stockRemaining</th>
                            <th>Action</th>
                      </tr>
                  </thead>
                  <tbody>
                      {this.props.ProductList.map((product,index)=> {
                          return(
                                <tr key={index}>
                                    <td>{index+1}</td>
                                   <td>Price</td>
                                   <td>Image</td>
                                   <td>Description</td>
                                   <td>Brand</td>
                                   <td>stockRemaining</td>
                                    <td>
                                     <button className="btn btn-danger" onClick={()=> {
                                         this.props.deleteProductbyIndex(index)}}>Delete</button>
                                 </td>
                                </tr>
                          );
                      })}
                  </tbody>
              </table>
            </>
        );
    }
}
const mapStateStateToProps = (state) => {
    return {
        FlightList:  state.flightList,
    }
}
const mapDispatchToProps = (dispatch) => {
    return{
        deleteFlightbyIndex: (index) => dispatch ({type :"FLIGHT_DELETE",payload:index}),
    };
};
export default connect(mapStateStateToProps,mapDispatchToProps)(FlightFormComponent);