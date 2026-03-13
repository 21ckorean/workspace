import { Route, Routes } from "react-router-dom"
import BasicLayout from "./components/layout/BasicLayout"
import Home from "./pages/main/Home"
import SalesReg from "./pages/salesManage/SalesReg"
import SalesList from "./pages/salesManage/SalesList"
import CarReg from "./pages/carManage/CarReg"
import './reset.css'

function App() {

  return (
    <>
      <Routes>
        
        {/* 차량판매정보시스템 */}
        <Route path="/" element={ <BasicLayout />}>

          {/* 홈화면 클릭시 보여지는 화면 */}
          <Route path='' element={ <Home /> }/>

          {/* 차량관리 클릭시 보여지는 화면 */}
          <Route path='carReg' element={ <CarReg />} />

          {/* 판매정보등록 클릭시 보여지는 화면 */}
          <Route path='salesReg' element={ <SalesReg />} />

          {/* 판매목록조회 클릭시 보여지는 화면 */}
          <Route path='salesList' element={ <SalesList />} />
        </Route>

      </Routes>
    </>
  )
}

export default App
