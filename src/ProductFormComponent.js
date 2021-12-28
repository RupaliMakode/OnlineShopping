import React, { Component } from 'react';
import {connect} from 'react-redux';

class ProductFormComponent extends Component 
{
    state = {
        price:0,
                image:"",
               description:"",
               brand:"",
                stockRemaining:0,
    };

    onValueChangeHandler = (event) =>{
        const{name,value} =event.target;
        this.setState({[name]:value});
    };

    onSubmitFormHandler = (event) => {
        event.preventDefault();
        console.log(this.state);
        this.props.addproduct(this.state);
    }


    render() {
        return (
            <>
                <h1>roduct Form</h1>
        <br/>
        <form onSubmit={this.onSubmitFormHandler}>
        <div  className="mb-3">
        <label className="form-label" >Price</label>
        <input className= "form-control"
         name="price" 
         value={this.state.price} 
         onChange={this.onValueChangeHandler}/>
        <br/>
        <br/>
        </div>

        <div  className="mb-3">
        <label className="form-label">Image</label>
        <input 
        className= "form-control"
         name="image"
          value={this.state.image} 
          onChange={this.onValueChangeHandler}/>
        <br/>
        <br/>
        </div>

        <div  className="mb-3">
        <label className="form-label">Description</label>
        <input className= "form-control"
         name="description" 
         value={this.state.description} 
         onChange={this.onValueChangeHandler}/>
        <br/>
        <br/>
        </div>

        <div className="mb-3">
        <label className="form-label">Brand</label>
        <input className= "form-control"
         name="brande" 
         value={this.state.brand} 
         onChange={this.onValueChangeHandler}/>
        <br/>
        <br/>
        </div>

        <div className="mb-3">
        <label className="form-label" >stockRemaining</label>
        <input  
        className= "form-control"
        name=" StockRemaining" 
        value={this.state.arrivalDateTime} 
        onChange={this.onValueChangeHandler}/>
        <br/>
        <br/>
        </div>
    
        <button type="submit" className="btn btn-success">Submit</button>
    </form>
        
            </>
        );
    }
}

const onMapStateToProps = () => {
    return {};
}

const onMapDispatchToProps = (dispatch) => {
    return {
        addproduct: (payload) => dispatch({type : "Product_ADD",payload:payload}),
    };
}

export default connect(onMapStateToProps,onMapDispatchToProps)(ProductFormComponent)