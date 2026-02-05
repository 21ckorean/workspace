
export const age = 30;
export const name = 'kim';

export function test1(){
  console.log(1);
}

export const text2 = () => {
  console.log(2);
}
 //axios 사용방법2
    try{
      const response = await axios.get(`http://localhost:8080/students/1001`);//post();, delete();, put(); 가능
      console.log(response.data);
      console.log(2);
    }catch(e){
      console.log(e)
    }