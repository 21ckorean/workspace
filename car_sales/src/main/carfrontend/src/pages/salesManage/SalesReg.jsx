import React, { useEffect, useState } from 'react'
import styles from './SalesReg.module.css'
import { useNavigate } from 'react-router-dom'
import { getCarList } from '../../api/carApi'
import { insertSales } from '../../api/SalesApi'
const SalesReg = () => {
  const nav = useNavigate()

  //셀렉트태그와 인풋태그에 입력한 정보를 저장할 state변수
  const [regSales, setRegSales] = useState({
    customerName : '',
    customerPhone : '',
    modelColor : '선택',
    modelNumber : '선택'
  });

  //입력할때마다 실행하는 함수
  const handleRegSalesData = (e) => {
    setRegSales((prev) => ({...prev, [e.target.name] : e.target.value}))
  }

  //조회한 등록된 차량목록 정보를 저장할 state변수
    const [carList, setCarList] = useState([])
  //마운트시 등록된 차량리스트 조회
    useEffect(() => {
      getList()
    }, []);
  //차량 리스트 조회 함수
  const getList = async() => {
    const response = await getCarList();
    setCarList(response.data);
  }

  //등록 버튼 클릭시 실행하는 함수(차량등록)
    const goRegCar = async() => {
      
    //구매자명, 색상, 모델 필수입력체크
    if(!regSales.customerName || regSales.modelColor == '선택' || !regSales.modelColor || !regSales.modelNumber ){
      alert('고객명, 색상, 모델명은 필수입니다.')
      return ;
    }

    // 전화번호 형식 체크 (입력했을 때만)
    if(regSales.customerPhone){
      const phoneRegex = /^010-\d{4}-\d{4}$/
      if(!phoneRegex.test(regSales.customerPhone)){
        alert('전화번호 형식이 올바르지 않습니다. (010-0000-0000)')
        return;
      }
    }

    //SALES_INFO 테이블에 데이터 INSERT
    await insertSales(regSales);

    }



  return (
    <div className={styles.container}>
      <div className={styles.salesReg}>
        <div>
          <p>구매자명</p>
          <input 
            type="text"
            name='customerName'
            value={regSales.customerName}
            onChange={(e) => {
              handleRegSalesData(e)
            }}
          />
        </div>
        <div>
          <p>색상</p>
          <select
            name='modelColor'
            value={regSales.modelColor}
            onChange={(e) => {
              handleRegSalesData(e);
            }}
          >
            <option value="선택">선택</option>
            <option value="화이트">화이트</option>
            <option value="블랙">블랙</option>
            <option value="레드">레드</option>
          </select>
          <p>모델</p>
          <select
            name='modelNumber'
            value={regSales.modelNumber}
            onChange={(e) => {
              handleRegSalesData(e);
            }}
          >
            <option value="선택">선택</option>
            {
              carList.map((car, i) => {
                return(
                  <option
                    key={i} 
                    value={car.modelNumber}
                    >{car.modelName}
                  </option>
                )
              })
            }       
          </select>
        </div>
        <div>
          <p>연락처</p>
          <input 
            type="text"
            placeholder='ex) 010-1111-2222'
            name='customerPhone'
            value={regSales.customerPhone}
            onChange={(e) => {
              handleRegSalesData(e)
            }} 
          />
        </div>
        <div>
          <button
            type='button'
            onClick={() => {
              goRegCar();
              nav('/salesList');
            }}         
          >등록
          </button>
        </div>
      </div>
      
    </div>
  )
}

export default SalesReg