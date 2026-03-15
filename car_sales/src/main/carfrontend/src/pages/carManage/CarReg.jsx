import React, { useEffect, useState } from 'react'
import styles from './CarReg.module.css'
import Button from '../../components/common/Button'
import Select from '../../components/common/Select'
import Input from '../../components/common/Input'
import Table from '../../components/common/Table'
import { getCarList, insertCar } from '../../api/carApi'

const CarReg = () => {
  
  //셀렉트태그와 인풋태그에 입력한 정보를 저장할 state변수
  const [regCar, setRegCar] = useState({
    manufacturer : '선택',
    modelName : '',
    modelPrice : ''
  });

  //조회한 등록된 차량목록 정보를 저장할 state변수
  const [carList, setCarList] = useState([])


  //입력할때마다 실행하는 함수
  const handleRegCarData = (e) => {
    setRegCar((prev) => ({...prev, [e.target.name] : e.target.value}))
  }

  //등록 버튼 클릭시 실행하는 함수(차량등록)
  const goRegCar = async() => {
    
    //제조사, 모델명, 가격 필수입력체크
    //빈문자열도 null이 아닌데 초기값이 ''라서
    // regCar.manufacturer == null || 로 작성하면 버튼등록이되어버리기때문에
    //!를사용해야함.
    if(regCar.manufacturer == '선택' || !regCar.manufacturer || !regCar.modelName || !regCar.modelPrice){
      alert('제조사, 모델명, 차량가격은 필수입니다.')
      return ;
    }

    //CAR_INFO 테이블에 데이터 INSERT
    await insertCar(regCar);
    await getList();
    setRegCar({
      manufacturer : '선택',
      modelName : '',
      modelPrice : ''
    })
  }

 

  //마운트시 등록된 차량리스트 조회
  useEffect(() => {
    getList()
  }, []);

  //차량 리스트 조회 함수
  const getList = async() => {
    const response = await getCarList();
    setCarList(response.data);
  }


  return (
    <div className={styles.car}>
      <div className={styles.reg}>
        <div>
          <h2>차량 등록</h2>
        </div>
        <div>
          <div>
            <p>제조사</p>
            <select
              name='manufacturer'
              value={regCar.manufacturer}
              onChange={e => handleRegCarData(e)}
            >
              <option value="선택">선택</option>
              <option value="현대">현대</option>
              <option value="기아">기아</option>
            </select>
          </div>
          <div>
            <p>모델명</p>
            <input 
              name='modelName'
              value={regCar.modelName}
              onChange={e => handleRegCarData(e)}
            />
          </div>
          <div>
            <p>차량가격</p>
            <input 
              name='modelPrice'
              value={regCar.modelPrice}
              onChange={e => handleRegCarData(e)}
            />
          </div>
        </div>
        <div>
          <button
            className={styles.btn}
            type='button'
            onClick={(e) => {
              goRegCar(e)

            }}
          >
          등록 
          </button>
        </div>
      </div>

      <div className={styles.regList}>
        <Table>
          <colgroup>
            <col width='25%'/>
            <col width='25%'/>
            <col width='25%'/>
            <col width='25%'/>
          </colgroup>
          <thead>
            <tr>
              <td>NO</td>
              <td>모델번호</td>
              <td>모델명</td>
              <td>제조사</td>
            </tr>
          </thead>
          <tbody>
            {
              carList.length === 0 
              ?
              <tr>
                <td colSpan={4}>등록된 차량이 없습니다.</td>
              </tr>
              :
              carList.map((car, i) => {
                return(
                  <tr key={i}>
                    <td>{carList.length - i}</td>
                    <td>{car.modelNumber}</td>
                    <td>{car.modelName}</td>
                    <td>{car.manufacturer}</td>
                  </tr>
                )
              })            
            }
          </tbody>
        </Table>
      </div>
    </div>
  )
}

export default CarReg