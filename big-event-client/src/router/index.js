import { createRouter, createWebHashHistory } from 'vue-router' 
import Login from '@/views/Login.vue'
import Layout from '@/views/Layout.vue'
import ArticleCategory from '@/views/article/ArticleCategory.vue'
import ArticleManage from '@/views/article/ArticleManage.vue'
import UserAvatar from '@/views/user/UserAvatar.vue'
import UserInfo from '@/views/user/UserInfo.vue'
import UserResetPassword from '@/views/user/UserResetPassword.vue'

// 定义路由关系
const routers =[
    {path: '/login', component: Login},
    {path: '/layout', component: Layout,
        redirect: '/article/manage', // 默认重定向到文章管理
        children: [
            {path: '/article/category', component: ArticleCategory},
            {path: '/article/manage', component: ArticleManage},
            {path: '/user/avatar', component: UserAvatar},
            {path: '/user/info', component: UserInfo},
            {path: '/user/reset-password', component: UserResetPassword}
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