import {useState,useEffect} from "react";
// import axios from "axios";

export default () => {
    const[price,setPrice]=useState(0);
    const[image,setImage]=useState("");
    const[description,setDescription]=useState("");
    const[brand,setBrand]=useState("");
    const[stockRemaining,setStockRemaining]=useState(0
        );

  const onPrice =(event) => {
    setPrice(event.target.value);
}

  const onImage =(event)=>{
    setImage(event.target.value)
  }

  const onDescription =(event)=>{
      setDescription(event.target.value);
  }

  const onBrand =(event) =>{
      setBrand(event.target.value);
  }

  const onstockRemaining =(event) =>{
      setStockRemaining(event.target.value);
  }
    
    return (<>
        <h1>Product Form</h1>
        <br/>
        <form>
        <div  className="mb-3">
        <label className="form-label" >Price</label>
        <input name="price" value={price} placeholder="Enter The Price" onChange={setPrice}/>
        <br/>
        <br/>
        </div>

        <div  className="mb-3">
        <label className="form-label">Image</label>
        <input name="image" value={image} placeholder="Enter The Image" onChange={setImage}/>
        <br/>
        <br/>
        </div>
      
        <div className="mb-3">
        <label className="form-label">Description</label>
        <input type="description" value={description} onChange={setDescription}/>
        <br/>
        <br/>
        </div>

        <div className="mb-3">
        <label className="form-label" >Brand</label>
        <input type="brand" value={brand} placeholder="Product Brand" onChange={setBrand}/>
        <br/>
        <br/>
        </div>


        <div className="mb-3">
        <label className="form-label" >Stock Remaining </label>
        <input name="stockRemaining " value={stockRemaining } placeholder="Enter the Remaining Stock"
         onChange={setStockRemaining}/>
        <br/>
        <br/>
        </div>
       
        <button type="submit" className="btn btn-success">Submit</button>
    </form>     
        
    </>
        );
    }