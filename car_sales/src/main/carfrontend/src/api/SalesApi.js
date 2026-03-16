import axios from "axios"

//차량판매정보 등록 api
export const insertSales = async(data) => {
  try{
    const response = await axios.post('http://localhost:8080/sales', data)
    return response;
  }catch(e){
    console.log('차량판매정보 등록 axios 오류', e)
  }
}

//차량판매정보 목록 조회 api
export const getSalesList = async() => {
  try{
    const response = await axios.get('http://localhost:8080/sales')
    return response;

  }catch(e){
    console.log('차량판매정보 목록 조회 axios 오류', e)
  }
}