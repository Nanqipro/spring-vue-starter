import { ref, reactive } from 'vue'

// 用户状态管理
const token = ref('')
const userInfo = ref({})

// 用户模块
export const useUserStore = () => {
    // 定义函数相关的内容
    const setToken = (newToken) => {
        token.value = newToken
    }
    
    const removeToken = () => {
        token.value = ''
    }
    
    const setUserInfo = (newInfo) => {
        userInfo.value = newInfo
    }
    
    const removeUserInfo = () => {
        userInfo.value = {}
    }
    
    return {
        token,
        userInfo,
        setToken,
        removeToken,
        setUserInfo,
        removeUserInfo
    }
}