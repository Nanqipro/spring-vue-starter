import { createRouter, createWebHashHistory } from 'vue-router'

// 定义路由关系
const routers =[
    {path: '/login', component: () => import('@/views/Login.vue')},
    {path: '/layout', component: () => import('@/views/Layout.vue'),
        redirect: '/article/manage', // 默认重定向到文章管理
        children: [
            {path: '/article/category', component: () => import('@/views/article/ArticleCategory.vue')},
            {path: '/article/manage', component: () => import('@/views/article/ArticleManage.vue')},
            {path: '/user/avatar', component: () => import('@/views/user/UserAvatar.vue')},
            {path: '/user/info', component: () => import('@/views/user/UserInfo.vue')},
            {path: '/user/reset-password', component: () => import('@/views/user/UserResetPassword.vue')}
        ]
    },
    {path: '/', redirect: '/login'}
]

// 创建路由器
const router = createRouter({
    history: createWebHashHistory(),
    routes: routers
})

// 导出路由器
export default router