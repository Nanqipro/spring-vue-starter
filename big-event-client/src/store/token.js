// 定义store
import { defineStore } from 'pinia'
import { ref } from 'vue'

// 两个参数：1. 名称 2. 函数
export const useTokenStore =  defineStore('token',() => {
    // 定义数据
    const token = ref('')
    // 定义函数
    const setToken = (newToken) => {
        token.value = newToken
    }
    const removeToken = () => {
        token.value = ''
    }
    return {
        token,
        setToken,
        removeToken
    }
}, {
    persist: true // 持久化存储
});
