//定制请求的实例

//导入axios  npm install axios
import axios from 'axios';
import { ElMessage } from 'element-plus'
//定义一个变量,记录公共的前缀  ,  baseURL
const baseURL = '/api';

const instance = axios.create({baseURL})
import { useTokenStore } from '@/store/token.js'

// 添加请求拦截器
instance.interceptors.request.use(
    config=>{
        // 从store中获取token
        const tokenStore = useTokenStore()
        // 从store中获取token
        const token = tokenStore.token
        // 如果token存在,则添加到请求头
        if(token){
            config.headers.Authorization = token
        }
        return config
    },
    err=>{
        return Promise.reject(err)
    }
)
import router from '@/router'



//添加响应拦截器
instance.interceptors.response.use(
    result=>{
        //判断业务状态码
        if(result.data.code === 0){
            return result.data;
        }
        // 操作失败
        // alert(result.data.msg? result.data.msg :'服务异常');
        ElMessage.error(result.data.msg? result.data.msg :'服务异常')
        // 异步操作的状态转换为失败
        return Promise.reject(result.data);
    },
    err=>{
        // 判断响应状态码 如果为401 则证明未登录，并跳转到登录页面
        if(err.response.status === 401){
            ElMessage.error('未登录')
            router.push('/login')
        }else{
            ElMessage.error(err.response.data.msg? err.response.data.msg :'服务异常')

        }
        return Promise.reject(err);//异步的状态转化成失败的状态
    }
)

export default instance;