import { defineStore } from 'pinia'
import { ref } from 'vue'


const useUserInfoStore = defineStore('userInfo',()=>{
    // 定义状态相关的内容

    const info = ref({
        name: '',
        avatar: ''
    })
    // 定义修改状态的函数
    const setInfo = (newInfo) => {
        info.value = newInfo
    }
    // 定义清空状态的函数
    const clearInfo = () => {
        info.value = {
            name: '',
            avatar: ''
        }
    }
    return {
        info,
        setInfo,
        clearInfo
    }
},
{
    persist: true
})

export default useUserInfoStore