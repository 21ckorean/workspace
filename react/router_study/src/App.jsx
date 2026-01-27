import { Link, Route, Routes } from "react-router-dom"
import First from "./First"
import Home from "./Home"

function App() {

  return (
    <>
      <h2>라우팅 연습</h2>

      <div>
        {/* to 속성에는 route 컴포넌트에 작성한 path와 동일한 정보를 작성 */}
        <Link to={''}>home</Link>   
        <Link to={'/first'}>first</Link>   
        second
      </div>
      <Routes>
        <Route 
        path="" 
        element={ <Home /> }
        />   
        <Route 
        path="/first/:age" 
        element={ <First/> }
        />   
        <Route 
        path="/second" 
        element={<div>두번째 페이지</div>}
        />
        <Route 
        path="/third" 
        element={<div>세번째 페이지</div>}
        />
        <Route 
        path="*" //*에스테리스크 = 모든, 전체.. 대충이런뜻 
        element={<div>없는 페이지 입니다.</div>}
        />
      </Routes>
    </>
  )
}


//



export default App
