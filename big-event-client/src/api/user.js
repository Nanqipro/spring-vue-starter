// 导入 request
import request from '@/utils/request'   
// 提供调用注册接口的函数
export const userRegisterService = (registerData) => {
    const params = new URLSearchParams()
    params.append('username', registerData.username)
    params.append('password', registerData.password)
    return request({
        method:'POST',
        url:'/user/register',
        data:params
    })
}
// 提供调用登录接口的函数
export const userLoginService = (loginData) => {
    const params = new URLSearchParams()
    params.append('username', loginData.username)
    params.append('password', loginData.password)
    return request({
        method:'POST',
        url:'/user/login',
        data:params
    })
}
// 提供调用获取用户信息接口的函数
