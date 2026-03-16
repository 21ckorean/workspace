import { Pressable, StyleSheet, Text, TextInput, View } from 'react-native'
import React, { useState } from 'react'
import MaterialIcons from '@expo/vector-icons/MaterialIcons';

const CartItem = ({item}) => {
  //현재 수정중인지 상태를 파악하기 위한 state 변수
  const [isEditing, setIsEditing] = useState(false);


  return (
    <View style={styles.itemContainer}>
      {
        isEditing 
        ? 
        <>
          <TextInput 
            style={styles.input}
            value={item.item}
            //TextInput에 자동으로 커서가 위치함.
            autoFocus={true}
            //포커스를 잃어버릴때실행되는 이벤트
            onBlur={() => setIsEditing(false)}
          />
        </>
        :
        <>
          <Text style={styles.title}>{item.item}</Text>   
          <Pressable 
            onPress={() => setIsEditing(true)}
            style={styles.iconContainer}
          >
            <MaterialIcons 
              name="edit" 
              size={24} 
              color="black"
              style={styles.icon} 
            />
          </Pressable>
          <Pressable 
            style={styles.iconContainer}
          >
            <MaterialIcons 
              name="delete-forever" 
              size={24} 
              color="black" 
              style={styles.icon}
            />
          </Pressable>
        </>
      }
    </View>
  )
}

export default CartItem

const styles = StyleSheet.create({
  itemContainer:{
    backgroundColor : '#eeeeee', 
    flexDirection : 'row',
    paddingVertical : 10,
    paddingHorizontal : 12,
    alignItems : 'center',
  },
  title : {
    width :'80%',
    fontSize : 20
  },
  icon :{
    
  },
  iconContainer : {
    borderWidth : 1,
    width : '10%',
    justifyContent : 'center',
    alignItems : 'center'
  },
  input : {
    borderWidth : 1,
    width : '100%'
  }
})