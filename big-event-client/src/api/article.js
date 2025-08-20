import request from '@/utils/request'
import { useTokenStore } from '@/store/token.js'

// 文章分类列表查询
export const articleCategoryListService = () => {
    // const tokenStore = useTokenStore()
    // // 从store中获取token
    // const token = tokenStore.token
    // return request({
    //     method:'GET',
    //     url:'/category',
    //     headers:{
    //         Authorization:token
    //     }
    // })
    return request({
        method:'GET',
        url:'/category'
    })
}


// 文章分类添加
export const articleCategoryAddService = (data) => {
    return request({
        method:'POST',
        url:'/category',
        data
    })
}

// 文章分类删除
export const articleCategoryDeleteService = (id) => {
    return request({
        method:'DELETE',
        url:`/category?id=${id}`
    })
}

// 文章分类编辑
export const articleCategoryUpdateService = (data) => {
    return request({
        method:'PUT',
        url:'/category',
        data
    })
}

// 文章列表查询
export const articleListService = (params) => {
    return request({
        method:'GET',
        url:'/article',
        params
    })
}

// 文章添加
export const articleAddService = (data) => {
    return request({
        method:'POST',
        url:'/article',
        data
    })
}
