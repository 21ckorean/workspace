import React from 'react'

//js 파일의 변수 및 함수 import 방식 1
import { age,test1 } from '../util/myMath'

//js 파일의 변수 및 함수 import 방식 2
import * as fun from '../util/myMath'


const Export1 = () => {
  const data1 = age;
  test1;
  console.log(fun.name);
  fun.test2();

  return (
    <div>Export1</div>
  )
}

export default Export1