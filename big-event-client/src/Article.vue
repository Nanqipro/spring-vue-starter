<script lang="ts" setup>
import { reactive } from 'vue'

const formInline = reactive({
  user: '',
  region: '',
  date: '',
})

const onSubmit = () => {
  console.log('submit!')
}
import { ref } from 'vue'

import type { ComponentSize } from 'element-plus'

    const currentPage1 = ref(5)
    const currentPage2 = ref(5)
    const currentPage3 = ref(5)
    const currentPage4 = ref(4)
    const pageSize2 = ref(100)
    const pageSize3 = ref(100)
    const pageSize4 = ref(5)
    const size = ref<ComponentSize>('default')
    const background = ref(false)
    const disabled = ref(false)
    const total = ref(100)

    const handleSizeChange = (val: number) => {
      console.log(`${val} items per page`)
    }
    const handleCurrentChange = (val: number) => {
      console.log(`current page: ${val}`)
    }
import {
  Check,
  Delete,
  Edit,
  Message,
  Search,
  Star,
} from '@element-plus/icons-vue'
const tableData = [
  {
    title: '文章标题',
    category: '分类',
    createTime: '2023-01-01',
    status: '已发布',
  },
  {
    title: '文章标题',
    category: '分类',
    createTime: '2023-01-01',
    status: '已发布',
  },
  {
    title: '文章标题',
    category: '分类',
    createTime: '2023-01-01',
    status: '已发布',
  },
  {
    title: '文章标题',
    category: '分类',
    createTime: '2023-01-01',
    status: '已发布',
  },
  {
    title: '文章标题',
    category: '分类',
    createTime: '2023-01-01',
    status: '已发布',
  }
]
</script>
<template>
    <el-card style="max-width: 480px">

        <div class="card-header">
            <span>Card name</span>
        </div>
        <p v-for="o in 4" :key="o" class="text item">{{ 'List item ' + o }}</p>
        <template #footer>Footer content</template>
    </el-card>


    <el-form :inline="true" :model="formInline" class="demo-form-inline">
        <!-- <el-form-item label="Approved by">
            <el-input v-model="formInline.user" placeholder="Approved by" clearable />
        </el-form-item> -->
        <el-form-item label="文章分类">
            <el-select
                v-model="formInline.category"
                placeholder="文章分类"
                clearable
            >
                <el-option label="分类一" value="分类一" />
                <el-option label="分类二" value="分类二" />
            </el-select>
        </el-form-item>
        <el-form-item label="发布状态">
            <el-select
                v-model="formInline.status"
                placeholder="发布状态"
                clearable
            >
                <el-option label="已发布" value="已发布" />
                <el-option label="草稿" value="草稿" />
            </el-select>
        </el-form-item>
        <el-form-item>
            <el-button type="primary" @click="onSubmit">搜索</el-button>
        </el-form-item>
    </el-form>
    <el-table :data="tableData" style="width: 100%">
        <el-table-column prop="title" label="文章标题" width="180" />
        <el-table-column prop="category" label="分类" width="180" />
        <el-table-column prop="createTime" label="发表时间" />
        <el-table-column prop="status" label="状态" />
        <el-table-column label="操作"  width="180">
        <template #default="scope">
            <div>
            <el-button type="primary" :icon="Edit" circle />
            <el-button type="danger" :icon="Delete" circle />
            </div>
        </template>
        </el-table-column>
  </el-table>
  <el-pagination
      class="pagination"
      v-model:current-page="currentPage4"
      v-model:page-size="pageSize4"
      :page-sizes="[5, 10, 20, 30]"
      :size="size"
      :disabled="disabled"
      :background="background"
      layout="jumper,total, sizes, prev, pager, next"
      :total="total"
      @size-change="handleSizeChange"
      @current-change="handleCurrentChange"
    />
</template>
<style scoped>
    .el-pagination {
        margin-top: 20px;
        display: flex;
        justify-content: flex-end;
    }
</style>
