import axios from "axios";
import { useState } from "react"
import { useEffect } from "react";

export default  () =>
 {
     const[productList,setProductList]=useState([]);
     
    const[priceEditMode,setPriceEditMode]=useState(0);
    const[imageEditMode,setImageEditMode]=useState("");
    const[descriptionEditMode,setDescriptionEditMode]=useState("");
    const[brandEditMode,setBrandEditMode]=useState("");
    const[stockRemainingEditMode,setStockRemainingEditMode]=useState(0);

     const[isEditMode,setEditMode]=useState(false);
     const[productID,setProductID]=useState(0);

     const[selectedProductId,setSelectedProductId]=useState(-1);
     const[editObject,setEditObject]=useState({});

     const [productObject,setproductObject]=useState({
         price:0,
         image:"",
        description:"",
        brand:"",
         stockRemaining:0,
    
     });

    const FetchData =() =>{ 
        axios.get("http://localhost:8080/product/getAll").then((response) => {
        console.log(response.data);
        if(response && response.data)
        {
             setProductList(response.data);
        }
     });
    }
    
     useEffect(() => {
     },[])

      const onFromSubmit =(event) =>{
         event.preventDefault();
        if(!isEditMode){
        axios.post("http:// localhost:8080/product/add",{
            ...productObject,
        }).then((response) =>{
            console.log(response);
            alert("Added");
          
            setproductObject({
                price:0,
                image:"",
               description:"",
               brand:"",
                stockRemaining:0,
            
            });
            FetchData();
        });
    
    }
}

      const onDeleteHandler =(productId)=>{
        
            axios.delete("http:// localhost:8080/product//delete/"+productId).then((response)=>{
            console.log(response);
            alert("Deleted");
            FetchData();
        })
    }

      const onEdit =(productObject) =>{
          console.log(productObject);
          setPriceEditMode(productObject.price);
          setImageEditMode(productObject.image);
          setDescriptionEditMode(productObject.description);
          setBrandEditMode(productObject.brand);
          setStockRemainingEditMode(productObject.stockRemaining);
    
        setProductID(productObject.productId);
        setSelectedProductId(productObject.productId);
        setEditObject({
            ...productObject
        })
      };

    const onEditObjectChangeHandler = (event) =>
     {
        if(event) {
            const {name,value}=event.target;
            setEditObject ({
                ...editObject,
                [name]:value,
            })
        }

      };
      const onProductObjectChangeHandler = (event) => {
        if(event)
        {
            const {name,value}=event.target;
            setproductObject ({
                ...productObject,
                [name]:value,
            })

        }
      };
     

      const onResetRowHandler = () => {
        setSelectedProductId(-1);
          setEditObject({
            price:0,
            image:"",
           description:"",
           brand:"",
            stockRemaining:0,
          });
      }
    const onUpdateRow = () =>
    {
        if(productID >0){
            axios.put("http://localhost:8080/product//update/"+productID,{
                productId:productID,
                
                ...editObject,
            }).then((response) =>{
                if(response){
                    FetchData();
                    alert("updated");
                    onResetRowHandler();
                }
                });
            }
    }

    return(
        <>
        <h1 className="text-center">Product form</h1>
            <form className="container" onSubmit={onFromSubmit}>
                <div className="col-md-5">
                     <label htmlFor="name" className="form-label"> Price </label>
                    <input 
                            id="price"
                            className="form-control"
                            name="prc" 
                            value={productObject.prc} 
                        onChange={onProductObjectChangeHandler}
                        placeholder="Please Enter The Price"
                    />
                </div>

                <div className="col-md-5">
                    <label htmlFor="image"className="form-label"> Image </label>
                    <input
                            id="image"
                            className="form-control"
                            name="img"
                            value={productObject.img}
                        onChange={onProductObjectChangeHandler}
                        placeholder="Please Enter Image"
                    />
                </div>

                <div className="col-md-5">
                    <label htmlFor="description" className="form-label"> Description </label>
                    <input 
                            id="description"
                            className="form-control"
                            name="descriptn" 
                            value={productObject.descriptn} 
                        onChange={onProductObjectChangeHandler}
                        placeholder="Please Enter Description "
                    />
                </div>

                <div className="col-md-5">
                    <label htmlFor="brand" className="form-label"> Brand </label>
                    <input
                        id="brand"
                         className="form-control"

                         name="brnd"
                         value={productObject.brnd}
                        onChange={onProductObjectChangeHandler}
                    />
                </div>

                <div className="col-md-5">
                     <label htmlFor="stockRemaining" className="form-label"> Stock Remaining</label>
                    <input
                             id="stockRemaining"
                             className="form-control"
                             name="stockRem"
                             value={productObject.stockRem}
                             onChange={onProductObjectChangeHandler} />
                </div>
                <br/>
                <div className="col-md-5">
                     <button type="submit" className="btn btn-success">{isEditMode ? "update" : "submit"}</button>
                    {isEditMode && <button>Rest:</button>}
                 </div>
            </form>
            <div className="text-center">
                <h1>Product List</h1>
            </div>
            <table  className="table table-bordered border border-info">
                <thead>
                <tr className="table-dark">
                    <th>Price</th>
                    <th>Image</th>
                    <th>Description</th>
                    <th>Brand</th>
                    <th>stockRemaining</th>
                    <th>Option</th>
                </tr>
                </thead>
                <tbody>
                    {productList.map((product)=>{
                        return(
                            <tr key={product.productId}>
                                <td>{product.productId}</td>
                                <td>
                                    {selectedProductId === product.productId ?
                                     (<input 
                                     name="prc" 
                                     value={editObject.prc} 
                                     onChange={onEditObjectChangeHandler}/>)
                                     :(product.prc)}
                                </td>

                                <td>
                                    {selectedProductId ===  product.productId 
                                    ? (<input
                                     name="img" 
                                     value={editObject.img} 
                                     onChange={onEditObjectChangeHandler}/>)
                                     :(flight.img)}
                                </td>

                                <td>
                                    {selectedProductId === product.productId ?
                                     (<input 
                                     name="descriptn" 
                                     value={editObject.descriptn} 
                                     onChange={onEditObjectChangeHandler}/>)
                                     :(product.descriptn)}
                                </td>

                               
                                <td>
                                    {selectedProductId === product.productId  ? 
                                    (<input
                                            name="brnd"
                                            value={editObject.brnd}
                                            onChange={onEditObjectChangeHandler} />)
                                        : (product.brnd)}
                                </td>
                               
                                <td>
                                    {selectedProductId ===  product.productId ? 
                                    (<input 
                                    name="stockRem"
                                     value={editObject.stockRem} 
                                     onChange={onEditObjectChangeHandler}/>)
                                     : (product.stockRem)}
                                     </td>
                              
                                 <td>{selectedProductId === product.productId ? (<>
                                <button className="btn btn-info" onClick={onUpdateRow}>Update</button>
                                <button onClick={onResetRowHandler}> Reset</button>
                             </>) : (<>
                                <button className="btn btn-danger"
                                    onClick={() =>{
                                        onDeleteHandler(product.productId);
                                    }}
                                >Delete
                                </button>
                                <button className="btn-btn-secondary" onClick={()=>{ onEdit(product)}}>Edit:</button>
                             </>)}
                             </td>
                            </tr>
                        );
                    })}
                    </tbody>
            </table>
        </>
    )
}