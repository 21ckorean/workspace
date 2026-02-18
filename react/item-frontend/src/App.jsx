import { Route, Routes } from "react-router-dom"
import ItemDetail from "./ItemDetail"
import ItemForm from "./ItemForm"
import ItemList from "./ItemList"


function App() {


  return (
    <Routes>
      {/* 상품목록페이지 */}
      <Route path="/" element={<ItemList />}/>

      {/* 상품등록페이지 */}
      <Route path="/reg" element={ <ItemForm />}/>

      {/* 상품상세정보페이지 */}
      <Route path="/detail/:itemNum" element={<ItemDetail />}/>
      
    </Routes>
  )
}

export default App
