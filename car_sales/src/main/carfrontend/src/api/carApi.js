import axios from "axios"

//차량 등록 api
export const insertCar = async (data) => {
  try{
    const response = await axios.post('http://localhost:8080/car', data)
    return response;
  }catch(e){
    console.log('차량 등록 axios 오류', e)
  }
}

//차량 목록 조회 api
export const getCarList = async () => {
  try{
    const response = await axios.get('http://localhost:8080/car')
    return response;
  }catch(e){
    console.log('차량 목록 조회 axios 오류',e)
  }
}