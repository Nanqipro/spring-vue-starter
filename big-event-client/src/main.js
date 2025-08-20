import './assets/main.scss'
import { createApp } from 'vue'
import ElementPlus from 'element-plus'
import 'element-plus/dist/index.css'
import App from './App.vue'
import router from '@/router'
import { createPinia } from 'pinia'
import { createPersistedStatePlugin } from 'pinia-persistedstate-plugin'
const app = createApp(App)

app.use(ElementPlus)
app.use(createPinia())
app.use(router)
app.mount('#app')

const persistedStatePlugin = createPersistedStatePlugin()
pinia.use(persistedStatePlugin)
