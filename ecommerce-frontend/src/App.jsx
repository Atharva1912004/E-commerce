import { BrowserRouter, Routes,Route } from "react-router-dom";
import Homepage from "./pages/HomePage";
import ProductDetailPage from "./pages/ProductDetailPage"; 

function App() {
    return (
        <BrowserRouter>
        <Routes>
            <Route path="/" element={<Homepage/>}/>
            <Route path="/product/:id"element={<ProductDetailPage/>}/>
        </Routes>
        </BrowserRouter>
    )
}
export default App;