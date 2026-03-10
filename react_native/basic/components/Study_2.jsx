import { Pressable, StyleSheet, Text, TextInput, View } from 'react-native'
import React, { useEffect, useState } from 'react'

const Study_2 = () => {

  //입력한 아이디 및 비밀번호를 저장할 state 변수
  const [loginData, setLoginData] = useState({
    id : '',
    pw : ''
  });

  
  const [isShow, setIsShow] = useState('false')

  const handleLoginData = (name, text) => {
    setLoginData({
      ...loginData,
      [name] : text
    })
  }

  console.log(loginData)

  return (
    <View style={styles.study2_container}>
      <TextInput 
        style={styles.input}
        placeholder='Input Your ID'
        value={loginData.id}
        onChangeText={text => {
          handleLoginData('id', text)
        }}
        
      />

      <TextInput 
        style={styles.input}
        placeholder='Input Your Password'
        secureTextEntry={true}
        value={loginData.pw}
        onChangeText={text => {
          handleLoginData('pw', text)
        }}
        
      />
    <Pressable
      onPress={e => {setIsShow(true)}}
      style={styles.btnContainer}
    >
      <Text style={styles.btn}>로그인</Text>
    </Pressable>
    {
      isShow &&
      <View>
        <Text>입력한 정보</Text>
        <Text>아이디 : {loginData.id}</Text>
        <Text>비번 : {loginData.pw}</Text>
      </View>
    }
    </View>
  )
}

export default Study_2

const styles = StyleSheet.create({
  study2_container : {
    width : '100%',
    borderWidth : 1,
    gap : 20
  },
  input : {
    borderWidth : 1
  },
  btnContainer : {
    backgroundColor : 'blue',
    height : 34,
    justifyContent : 'center',
    alignItems : 'center',
    borderRadius : 6
  },
  btn : {
    color : 'white'
  }
})