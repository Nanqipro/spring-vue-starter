import './assets/main.scss'
import { createApp } from 'vue'
import ElementPlus from 'element-plus'
import 'element-plus/dist/index.css'
import App from './App.vue'
import router from '@/router'
import { createPinia } from 'pinia'
const app = createApp(App)

// 创建 Pinia 实例
const pinia = createPinia()

app.use(ElementPlus)
app.use(pinia)
app.use(router)
app.mount('#app')
