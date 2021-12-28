import { createStore } from "redux";

const initialState = {
    productList:[],
};

const reducer =(state=initialState,action) => 
{
    const{type,payload}=action;
    const productListCopy=[...state.productList];
    switch (type) {
        case "PRODUCT_ADD":
            producttListCopy.push(payload);
            alert("Added");
            return{
                ...state,
                productList:productListCopy,
            };
        
            case "FLIGHT_DELETE":
                
                productListCopy.splice(payload,1);
                alert("Deleted");

                return {
                    ...state,
                    productList:productListCopy,
                };    

        default:
            return state;
    }
    // return state;
}

const store = createStore(reducer);

export default store;